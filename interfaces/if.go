package interfaces

// LLAMADA A FUNCION BASE
type IfControl struct {
	Instruction
	Value
	TrueCondition Expression
	TrueBody      []interface{} // []Instruction
	Fallbacks     []interface{} // []IfControlFallBack
	ElseBody      []interface{} // []Instruction
}

type IfControlFallBack struct {
	Token
	TrueCondition Expression
	Body          []interface{} // []Instruction
}

// *VALUE -> OBTENER NOMBRE DE TOKEN
func (ctrl IfControl) GetTokenName() string {
	return ctrl.Name
}

// *VALUE -> OBTENER LINEA
func (ctrl IfControl) GetLine() int {
	return ctrl.Line
}

// *VALUE -> OBTENER COLUMNA
func (ctrl IfControl) GetColumn() int {
	return ctrl.Column
}

// *INTRUCTION -> EJECUTAR FUNCION
func (ctrl IfControl) Execute(scope Scope) {
	trueValue := ctrl.TrueCondition.GetValue(scope)
	if trueValue.GetType(scope) == BOOL {
		if trueValue.GetValue(scope) == true {
			for _, trueIns := range ctrl.TrueBody {
				trueIns.(IInstruction).Execute(scope)
			}
		} else {
			if len(ctrl.Fallbacks) > 0 {
				for _, fallback := range ctrl.Fallbacks {
					fallbackValue := fallback.(IfControlFallBack).TrueCondition.GetValue(scope)
					if fallbackValue.GetType(scope) == BOOL {
						if fallbackValue.GetValue(scope) == true {
							for _, fallbackIns := range fallback.(IfControlFallBack).Body {
								fallbackIns.(IInstruction).Execute(scope)
							}
							break
						}
					} else {
						Errors = append(Errors, Error{"The expression must be of type bool", fallback.(IfControlFallBack).Line, fallback.(IfControlFallBack).Column})
					}
				}
			} else {
				if len(ctrl.ElseBody) > 0 {
					for _, elseIns := range ctrl.ElseBody {
						elseIns.(IInstruction).Execute(scope)
					}
				}
			}
		}
	} else {
		Errors = append(Errors, Error{"The expression must be of type bool", ctrl.GetLine(), ctrl.GetColumn()})
	}
}

// *VALUE -> OBTENER VALOR
func (ctrl IfControl) GetValue(scope Scope) interface{} {
	return nil
}

// *VALUE -> OBTENER TIPO
func (ctrl IfControl) GetType(scope Scope) ValueType {
	return UNDEF
}
