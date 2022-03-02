package interfaces

import (
	"fmt"
	"math"
)

// EXPRESION
type Expression struct {
	Value     *IValue
	Left      *Expression
	Right     *Expression
	Operation Operation
}

// *VALUE
func (exp Expression) GetValue(scope Scope) IValue {
	// OBTENER VALORES
	var sym IValue = Value{0, 0, UNDEF, ""}

	// VALOR UNICO
	if exp.Value != nil {
		sym = *exp.Value
	} else {
		// VALORES DE OPERADORES
		var left, right = exp.Left.GetValue(scope), exp.Right.GetValue(scope)
		var rType, rVal = right.GetType(scope), right.GetValue(scope)
		var lType, lVal = left.GetType(scope), left.GetValue(scope)
		var lLine, lCol = left.GetLine(), left.GetColumn()

		// TABLA DE OPERACIONES
		switch exp.Operation {
		case MUL:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, (lVal.(int) * rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, float64(lVal.(int)) * rVal.(float64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, lVal.(float64) * float64(rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, lVal.(float64) * rVal.(float64)}
				}
			}
		case DIV:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, (lVal.(int) / rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, float64(lVal.(int)) / rVal.(float64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, lVal.(float64) / float64(rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, lVal.(float64) / rVal.(float64)}
				}
			}
		case MOD:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, (lVal.(int) % rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, (math.Mod((math.Log10(float64(lVal.(int))) / math.Log10(rVal.(float64))), 1.0))}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, (math.Mod(lVal.(float64), float64(rVal.(int))))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, (math.Mod(lVal.(float64), rVal.(float64)))}
				}
			}
		case ADD:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, (lVal.(int) + rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, (float64(lVal.(int)) + rVal.(float64))}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, (lVal.(float64) + float64(rVal.(int)))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, (lVal.(float64) + rVal.(float64))}
				}
			} else if lType == STR {
				if rType == STR {
					sym = Value{lLine, lCol, STR, lVal.(string) + rVal.(string)}
				}
			} else if lType == STRING {
				if rType == STR || rType == STRING {
					sym = Value{lLine, lCol, STR, lVal.(string) + rVal.(string)}
				}
			}
		case SUB:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, (lVal.(int) - rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, (float64(lVal.(int)) - rVal.(float64))}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, (lVal.(float64) - float64(rVal.(int)))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, (lVal.(float64) - rVal.(float64))}
				}
			}
		}
	}

	// ERROR DE UNDEFINED
	if sym.GetType(scope) == UNDEF {
		if exp.Left != nil && exp.Right != nil {
			var left, right = exp.Left.GetValue(scope), exp.Right.GetValue(scope)
			var lLine, lCol = left.GetLine(), left.GetColumn()

			sym = Value{lLine, 0, UNDEF, ""}
			Errors = append(Errors, Error{
				fmt.Sprintf("It was not possible to operate the type %s %s %s",
					left.GetType(scope), exp.Operation.String(), right.GetType(scope)), lLine, lCol})
		}
	}

	// VALOR FINAL
	return sym
}
