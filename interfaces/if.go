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

type IfTernaryControl struct {
	IfControl
	TrueExp *Expression
	ElseExp *Expression
}

type IfControlFallBack struct {
	Token
	TrueCondition Expression
	Body          []interface{} // []Instruction
	LastExp       *Expression
}

// *VALUE -> OBTENER NOMBRE DE TOKEN
func (ctrl IfControl) GetTokenName() string {
	return ctrl.Name
}

// *VALUE -> OBTENER LINEA
func (ctrl IfTernaryControl) GetLine() int {
	return ctrl.Line
}

// *VALUE -> OBTENER COLUMNA
func (ctrl IfTernaryControl) GetColumn() int {
	return ctrl.Column
}

// *VALUE -> OBTENER VALOR
func (ctrl IfTernaryControl) GetValue(scope Scope) interface{} {
	return ctrl.GetExecute(scope, ctrl.TrueExp, ctrl.ElseExp).GetValue(scope)
}

// *VALUE -> OBTENER TIPO
func (ctrl IfTernaryControl) GetType(scope Scope) ValueType {
	if ctrl.TrueExp != nil {
		trueExpType := ctrl.TrueExp.GetValue(scope).GetType(scope)

		// VERIFICAR TIPOS DE ELSE IF
		if len(ctrl.Fallbacks) > 0 {
			for _, fallback := range ctrl.Fallbacks {
				if fallback.(IfControlFallBack).LastExp != nil {
					fallbackType := fallback.(IfControlFallBack).LastExp.GetValue(scope).GetType(scope)

					// SINO COINCIDEN CON EL IF ENTONCES MARCAR ERROR
					if fallbackType != trueExpType {
						return fallbackType
					}
				}
			}
		}

		// VERIFICAR TIPOS DEL ELSE
		if ctrl.ElseExp != nil {
			elseExpType := ctrl.ElseExp.GetValue(scope).GetType(scope)

			// SINO COINCIDEN CON EL IF ENTONCES MARCAR ERROR
			if elseExpType != trueExpType {
				return elseExpType
			}
		}

		// SI NO HAY PROBLEMAS RETORNAR EL TIPO DEL IF
		return trueExpType
	} else {
		return UNDEF
	}
}

// *INTRUCTION -> EJECUTAR FUNCION
func (ctrl IfControl) Execute(scope Scope) {
	ctrl.GetExecute(scope, nil, nil)
}

// OBTENER VALOR FINAL
func (ctrl IfControl) GetExecute(scope Scope, trueExp *Expression, elseExp *Expression) IValue {
	defaultValue := Value{Token{"", 0, 0}, "", UNDEF}
	trueValue := ctrl.TrueCondition.GetValue(scope)

	if trueValue.GetType(scope) == BOOL {
		// EJECUTAR IF
		if trueValue.GetValue(scope) == true {
			for _, trueIns := range ctrl.TrueBody {
				trueIns.(IInstruction).Execute(scope)
			}

			// VALOR TERNARIO
			if trueExp != nil {
				return trueExp.GetValue(scope)
			} else {
				return defaultValue
			}
		} else {
			if len(ctrl.Fallbacks) > 0 {
				// RECORRER ELSE IF
				for _, fallback := range ctrl.Fallbacks {
					fallbackValue := fallback.(IfControlFallBack).TrueCondition.GetValue(scope)

					if fallbackValue.GetType(scope) == BOOL {
						if fallbackValue.GetValue(scope) == true {
							// EJECTURAR ELSE IF
							for _, fallbackIns := range fallback.(IfControlFallBack).Body {
								fallbackIns.(IInstruction).Execute(scope)
							}

							// VALOR TERNARIO
							if fallback.(IfControlFallBack).LastExp != nil {
								return fallback.(IfControlFallBack).LastExp.GetValue(scope)
							}

							return defaultValue
						}
					} else {
						Errors = append(Errors, Error{"The expression must be of type bool", fallback.(IfControlFallBack).Line, fallback.(IfControlFallBack).Column})
					}
				}
			}

			// EJECUTAR ELSE
			for _, elseIns := range ctrl.ElseBody {
				elseIns.(IInstruction).Execute(scope)
			}

			// VALOR TERNARIO
			if elseExp != nil {
				return elseExp.GetValue(scope)
			} else {
				return defaultValue
			}
		}
	} else {
		Errors = append(Errors, Error{"The expression must be of type bool", ctrl.GetLine(), ctrl.GetColumn()})
	}

	// VALOR POR DEFECTO
	return defaultValue
}
