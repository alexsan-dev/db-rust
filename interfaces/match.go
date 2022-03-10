package interfaces

import "fmt"

// LLAMADA A MATCH BASE
type MatchControl struct {
	Instruction
	Value
	MatchExp    Expression
	Cases       []interface{}  // []CaseMatchControl
	DefaultCase *[]interface{} // []Instruction
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
	// VERIFICAR SI EXISTE CONDICION
	evValue := mth.MatchExp.GetValue(scope)
	evValueType := evValue.GetType(scope)

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
					for _, caseBody := range *caseExp.(CaseMatchControl).Body {
						caseBody.(IInstruction).Execute(scope)
					}

					// SALIR
					return
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
				Errors = append(Errors, Error{"A default condition \"_\" was not provided.", mth.Line, mth.GetColumn()})
			}
		}
	}
}
