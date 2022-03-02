package interfaces

import (
	"fmt"
	"math"
	"strconv"
)

// EXPRESION
type Expression struct {
	Value     *IValue
	Left      *Expression
	Right     *Expression
	Operation Operation
}

// *VALUE
func (exp Expression) GetValue() IValue {
	// OBTENER VALORES
	var sym IValue = Value{0, 0, UNDEF, ""}

	// VALOR UNICO
	if exp.Value != nil {
		sym = *exp.Value
	} else {
		// VALORES DE OPERADORES
		var left, right = exp.Left.GetValue(), exp.Right.GetValue()
		var rType, rVal = right.GetType(), right.GetValue()
		var lLine, lCol = left.GetLine(), left.GetColumn()
		var lType, lVal = left.GetType(), left.GetValue()

		// TABLA DE OPERACIONES
		switch exp.Operation {
		case MUL:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, strconv.Itoa(lVal.(int) * rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(float64(lVal.(int))*rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)*float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)*rVal.(float64), 'E', -1, 64)}
				}
			}
		case DIV:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, strconv.Itoa(lVal.(int) / rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(float64(lVal.(int))/rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)/float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)/rVal.(float64), 'E', -1, 64)}
				}
			}
		case MOD:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, strconv.Itoa(lVal.(int) % rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(math.Mod((math.Log10(float64(lVal.(int)))/math.Log10(rVal.(float64))), 1.0), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(math.Mod(lVal.(float64), float64(rVal.(int))), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(math.Mod(lVal.(float64), rVal.(float64)), 'E', -1, 64)}
				}
			}
		case ADD:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{lLine, lCol, INTEGER, strconv.Itoa(lVal.(int) + rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(float64(lVal.(int))+rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)+float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)+rVal.(float64), 'E', -1, 64)}
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
					sym = Value{lLine, lCol, INTEGER, strconv.Itoa(lVal.(int) - rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(float64(lVal.(int))-rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)-float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{lLine, lCol, FLOAT, strconv.FormatFloat(lVal.(float64)-rVal.(float64), 'E', -1, 64)}
				}
			}
		}
	}

	// ERROR DE UNDEFINED
	if sym.GetType() == UNDEF {
		var left, right = exp.Left.GetValue(), exp.Right.GetValue()
		var lLine, lCol = left.GetLine(), left.GetColumn()

		sym = Value{lLine, 0, UNDEF, ""}
		Errors = append(Errors, Error{
			fmt.Sprintf("It was not possible to operate the type %s %s %s",
				left.GetType(), exp.Operation.String(), right.GetType()), lLine, lCol})
	}

	// VALOR FINAL
	return sym
}
