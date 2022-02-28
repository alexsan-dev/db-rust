package interfaces

import (
	"math"
	"strconv"
)

// EXPRESION
type Expression struct {
	Value     *Value
	Left      *Expression
	Right     *Expression
	Operation Operation
}

// *INSTRUCTION
func (exp Expression) Execute() {}

// *EXPRESSION
func (exp Expression) getValue() Value {
	// OBTENER VALORES
	var sym Value

	// VALOR UNICO
	if exp.Value != nil {
		sym = *exp.Value
	} else {
		// VALORES DE OPERADORES
		var left, right = exp.Left.getValue(), exp.Right.getValue()
		var lType, lVal = left.getType(), left.getValue()
		var rType, rVal = right.getType(), right.getValue()

		// TABLA DE OPERACIONES
		switch exp.Operation {
		case MUL:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{INTEGER, strconv.Itoa(lVal.(int) * rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(float64(lVal.(int))*rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)*float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)*rVal.(float64), 'E', -1, 64)}
				}
			}
		case DIV:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{INTEGER, strconv.Itoa(lVal.(int) / rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(float64(lVal.(int))/rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)/float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)/rVal.(float64), 'E', -1, 64)}
				}
			}
		case MOD:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{INTEGER, strconv.Itoa(lVal.(int) % rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(math.Mod((math.Log10(float64(lVal.(int)))/math.Log10(rVal.(float64))), 1.0), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{FLOAT, strconv.FormatFloat(math.Mod((math.Log10(float64(lVal.(float64)))/math.Log10(float64(rVal.(int)))), 1.0), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(math.Mod((math.Log10(float64(lVal.(float64)))/math.Log10(rVal.(float64))), 1.0), 'E', -1, 64)}
				}
			}
		case ADD:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{INTEGER, strconv.Itoa(lVal.(int) + rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(float64(lVal.(int))+rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)+float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)+rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == STRING {
				if rType == STRING || rType == STRINGCLASS {
					sym = Value{FLOAT, lVal.(string) + rVal.(string)}
				}
			} else if lType == STRINGCLASS {
				if rType == STRING || rType == STRINGCLASS {
					sym = Value{FLOAT, lVal.(string) + rVal.(string)}
				}
			}
		case SUB:
			if lType == INTEGER {
				if rType == INTEGER {
					sym = Value{INTEGER, strconv.Itoa(lVal.(int) - rVal.(int))}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(float64(lVal.(int))-rVal.(float64), 'E', -1, 64)}
				}
			} else if lType == FLOAT {
				if rType == INTEGER {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)-float64(rVal.(int)), 'E', -1, 64)}
				} else if rType == FLOAT {
					sym = Value{FLOAT, strconv.FormatFloat(lVal.(float64)-rVal.(float64), 'E', -1, 64)}
				}
			}
		}
	}

	// VALOR FINAL
	return sym
}
