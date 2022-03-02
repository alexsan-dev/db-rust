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
	// VALORES DE SALIDA
	var valueType ValueType = UNDEF
	var finalValue interface{}

	// VALOR UNICO
	if exp.Value != nil {
		return *exp.Value
	} else {
		// VARIABLES DE ENTRADA
		var left = exp.Left.GetValue(scope)
		var lType, lVal = left.GetType(scope), left.GetValue(scope)
		var lLine, lCol = left.GetLine(), left.GetColumn()

		// OPERACIONES UNARIAS
		if exp.Operation == UNOT {
			if lType == BOOL {
				valueType, finalValue = BOOL, !lVal.(bool)
			}
		} else {
			// VALORES DE OPERADORES
			var right = exp.Right.GetValue(scope)
			var rType, rVal = right.GetType(scope), right.GetValue(scope)

			// TABLA DE OPERACIONES
			switch exp.Operation {
			// SOLO REASIGNAR EXPRESION
			case NOOP:
				valueType, finalValue = lType, lVal

			// ALGEBRAICOS
			case MUL:
				if lType == INTEGER {
					if rType == INTEGER {
						valueType, finalValue = INTEGER, (lVal.(int64) * rVal.(int64))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, float64(lVal.(int64))*rVal.(float64)
					}
				} else if lType == FLOAT {
					if rType == INTEGER {
						valueType, finalValue = FLOAT, lVal.(float64)*float64(rVal.(int64))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, lVal.(float64)*rVal.(float64)
					}
				}
			case DIV:
				if lType == INTEGER {
					if rType == INTEGER {
						valueType, finalValue = INTEGER, (lVal.(int64) / rVal.(int64))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, float64(lVal.(int64))/rVal.(float64)
					}
				} else if lType == FLOAT {
					if rType == INTEGER {
						valueType, finalValue = FLOAT, lVal.(float64)/float64(rVal.(int64))

					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, lVal.(float64)/rVal.(float64)
					}
				}
			case MOD:
				if lType == INTEGER {
					if rType == INTEGER {
						valueType, finalValue = INTEGER, (lVal.(int64) % rVal.(int64))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, (math.Mod((math.Log10(float64(lVal.(int64))) / math.Log10(rVal.(float64))), 1.0))
					}
				} else if lType == FLOAT {
					if rType == INTEGER {
						valueType, finalValue = FLOAT, (math.Mod(lVal.(float64), float64(rVal.(int64))))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, (math.Mod(lVal.(float64), rVal.(float64)))
					}
				}
			case ADD:
				if lType == INTEGER {
					if rType == INTEGER {
						valueType, finalValue = INTEGER, (lVal.(int64) + rVal.(int64))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, (float64(lVal.(int64)) + rVal.(float64))
					}
				} else if lType == FLOAT {
					if rType == INTEGER {
						valueType, finalValue = FLOAT, (lVal.(float64) + float64(rVal.(int64)))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, (lVal.(float64) + rVal.(float64))
					}
				} else if lType == STR {
					if rType == STR {
						valueType, finalValue = STR, lVal.(string)+rVal.(string)
					}
				} else if lType == STRING {
					if rType == STR || rType == STRING {
						valueType, finalValue = STR, lVal.(string)+rVal.(string)
					}
				}
			case SUB:
				if lType == INTEGER {
					if rType == INTEGER {
						valueType, finalValue = INTEGER, (lVal.(int64) - rVal.(int64))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, (float64(lVal.(int64)) - rVal.(float64))
					}
				} else if lType == FLOAT {
					if rType == INTEGER {
						valueType, finalValue = FLOAT, (lVal.(float64) - float64(rVal.(int64)))
					} else if rType == FLOAT {
						valueType, finalValue = FLOAT, (lVal.(float64) - rVal.(float64))
					}
				}

			// RELACIONALES
			case NOTEQUALS:
				valueType, finalValue = BOOL, lVal != rVal

			case EQUALSEQUALS:
				valueType, finalValue = BOOL, lVal == rVal

			case AND:
				if lType == BOOL && rType == BOOL {
					valueType, finalValue = BOOL, lVal.(bool) && rVal.(bool)
				}

			case OR:
				if lType == BOOL && rType == BOOL {
					valueType, finalValue = BOOL, lVal.(bool) || rVal.(bool)
				}

			case MOREOREQUALS:
				if (lType == FLOAT || lType == INTEGER) && (rType == FLOAT || rType == INTEGER) || (lType == STRING && rType == STRING) {
					valueType = BOOL
					switch lv := lVal.(type) {
					case float64:
						switch rv := rVal.(type) {
						case float64:
							finalValue = lv >= rv

						case int64:
							finalValue = lv >= float64(rv)
						}

					case int64:
						switch rv := rVal.(type) {
						case float64:
							finalValue = float64(lv) >= rv

						case int64:
							finalValue = lv >= int64(rv)
						}

					case string:
						if rType == STR {
							finalValue = lv >= rVal.(string)
						}
					}
				}

			case LESSOREQUALS:
				if (lType == FLOAT || lType == INTEGER) && (rType == FLOAT || rType == INTEGER) || (lType == STRING && rType == STRING) {
					valueType = BOOL
					switch lv := lVal.(type) {
					case float64:
						switch rv := rVal.(type) {
						case float64:
							finalValue = lv <= rv

						case int64:
							finalValue = lv <= float64(rv)
						}

					case int64:
						switch rv := rVal.(type) {
						case float64:
							finalValue = float64(lv) <= rv

						case int64:
							finalValue = lv <= rv
						}

					case string:
						if rType == STR {
							finalValue = lv <= rVal.(string)
						}
					}
				}

			case MAJOR:
				if (lType == FLOAT || lType == INTEGER) && (rType == FLOAT || rType == INTEGER) || (lType == STRING && rType == STRING) {
					valueType = BOOL
					switch lv := lVal.(type) {
					case float64:
						switch rv := rVal.(type) {
						case float64:

							finalValue = lv > rv
						case int64:
							finalValue = lv > float64(rv)
						}

					case int64:
						switch rv := rVal.(type) {
						case float64:

							finalValue = float64(lv) > rv
						case int64:
							finalValue = lv > rv
						}

					case string:
						if rType == STR {
							finalValue = lv > rVal.(string)
						}
					}
				}

			case MINOR:
				if (lType == FLOAT || lType == INTEGER) && (rType == FLOAT || rType == INTEGER) || (lType == STRING && rType == STRING) {
					valueType = BOOL
					switch lv := lVal.(type) {
					case float64:
						switch rv := rVal.(type) {
						case float64:
							finalValue = lv < rv

						case int64:
							finalValue = lv < float64(rv)
						}

					case int64:
						switch rv := rVal.(type) {
						case float64:
							finalValue = float64(lv) < rv

						case int64:
							finalValue = lv < rv
						}

					case string:
						if rType == STR {
							finalValue = lv < rVal.(string)
						}
					}
				}
			}
		}

		// ERROR DE UNDEFINED
		if exp.Left != nil && exp.Right != nil {
			var left, right = exp.Left.GetValue(scope), exp.Right.GetValue(scope)
			if valueType == UNDEF {
				Errors = append(Errors, Error{
					fmt.Sprintf("It was not possible to operate the type %s %s %s",
						left.GetType(scope), exp.Operation.String(), right.GetType(scope)), lLine, lCol})
				return Value{lLine, 0, UNDEF, ""}
			}
		}

		// VALOR FINAL
		return Value{lLine, lCol, valueType, finalValue}
	}
}
