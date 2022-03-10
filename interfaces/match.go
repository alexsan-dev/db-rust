package interfaces

import "fmt"

// LLAMADA A MATCH BASE
type MatchControl struct {
	Instruction
	Value
	MatchExp    Expression
	Cases       []interface{}  // []CaseMatchControl
	DefaultCase *[]interface{} // []Instruction
	DefExp      *Expression
}

// CASE DE MATCH
type CaseMatchControl struct {
	Token
	Condition Expression
	Body      *[]interface{} // []Instruction
	LastExp   *Expression
}

// *INSTRUCTION -> Ejecutar
func (mth MatchControl) Execute(scope Scope) {
	mth.GetExecute(scope)
}

// Obtener valor de ejecucion
func (mth MatchControl) GetExecute(scope Scope) IValue {

	// VERIFICAR SI EXISTE CONDICION
	evValue := mth.MatchExp.GetValue(scope)
	evValueType := evValue.GetType(scope)
	defValue := Value{Token{"UNDEF", 0, 0}, "UNDEF", VOID}

	if evValueType != UNDEF {
		evValueVal := evValue.GetValue(scope)

		// DOS CASES PARA BOOLS
		if evValueType == BOOL {
			if len(mth.Cases) != 2 {
				Errors = append(Errors, Error{"Not all values have been covered for a BOOL", mth.Line, mth.GetColumn()})
			}
		}

		// RECORRER CASES
		for _, caseExp := range mth.Cases {
			expValue := caseExp.(CaseMatchControl).Condition.GetValue(scope)
			if evValueType == expValue.GetType(scope) {
				if evValueVal == expValue.GetValue(scope) {
					if caseExp.(CaseMatchControl).Body != nil {
						caseScope := Scope{&scope, "MatchCase", make(map[string]IValue), make(map[string]IInstruction)}
						for _, caseBody := range *caseExp.(CaseMatchControl).Body {
							caseBody.(IInstruction).Execute(caseScope)
						}

						// SALIR
						return defValue
					} else {
						if caseExp.(CaseMatchControl).LastExp != nil {
							return caseExp.(CaseMatchControl).LastExp.GetValue(scope)
						}
					}
				}
			} else {
				Errors = append(Errors, Error{fmt.Sprintf("The condition to be evaluated must be of the type %s", evValueType), caseExp.(CaseMatchControl).Line, caseExp.(CaseMatchControl).Column})
			}
		}

		// EJECUTAR DEFAULT
		if evValueType != BOOL {
			if mth.DefaultCase != nil {
				for _, caseBody := range *mth.DefaultCase {
					caseBody.(IInstruction).Execute(scope)
				}
			} else {
				if mth.DefExp != nil {
					return mth.DefExp.GetValue(scope)
				} else {
					Errors = append(Errors, Error{"A default condition \"_\" was not provided.", mth.Line, mth.GetColumn()})
				}
			}
		}
	}

	// VALOR POR DEFECTO
	return defValue
}

// *VALUE -> OBTENER NOMBRE DE TOKEN
func (mth MatchControl) GetTokenName() string {
	return mth.Name
}

// *VALUE -> OBTENER LINEA
func (mth MatchControl) GetLine() int {
	return mth.Line
}

// *VALUE -> OBTENER COLUMNA
func (mth MatchControl) GetColumn() int {
	return mth.Column
}

// *VALUE -> OBTENER VALOR FINAL
func (mth MatchControl) GetValue(scope Scope) interface{} {
	return mth.GetExecute(scope).GetValue(scope)
}

// *VALUE -> OBTENER TIPO
func (mth MatchControl) GetType(scope Scope) ValueType {
	// VERIFICAR QUE TODOS LOS TIPOS SEAN IGUALES
	expectedType := mth.Cases[0].(CaseMatchControl).Condition.GetValue(scope).GetType(scope)
	for _, caseExp := range mth.Cases {
		if caseExp.(CaseMatchControl).Condition.GetValue(scope).GetType(scope) != expectedType {
			Errors = append(Errors, Error{fmt.Sprintf("The expression must be of type %s", expectedType), caseExp.(CaseMatchControl).Line, caseExp.(CaseMatchControl).Column})
			return UNDEF
		}
	}

	// VERIFICAR DEFAULT
	if mth.DefExp != nil {
		if mth.DefExp.GetValue(scope).GetType(scope) != expectedType {
			Errors = append(Errors, Error{fmt.Sprintf("The expression must be of type %s", expectedType), mth.Line, mth.Column})
			return UNDEF
		}
	}
	return expectedType
}
