package interfaces

import (
	"fmt"
	"strconv"
)

// VALOR BASE
type Value struct {
	Line   int
	Column int
	Type   ValueType
	Value  interface{}
}

type ValueMut struct {
	Value
	Mut bool
}

type IValue interface {
	GetLine() int
	GetColumn() int
	GetValue(scope Scope) interface{}
	GetType(Scope Scope) ValueType
}

// OBTENER LINEA
func (sym Value) GetLine() int {
	return sym.Line
}

// OBTENER COLUMNA
func (sym Value) GetColumn() int {
	return sym.Column + 1
}

// OBTENER VALOR DE SIMBOLO
func (sym Value) GetValue(scope Scope) interface{} {
	if sym.Type == INTEGER {
		switch value := sym.Value.(type) {
		case string:
			floatVar, _ := strconv.Atoi(value)
			return floatVar
		case float64:
			return value
		default:
			intVar, _ := strconv.Atoi(fmt.Sprintf("%v", value))
			return intVar
		}
	} else if sym.Type == FLOAT {
		switch value := sym.Value.(type) {
		case string:
			floatVar, _ := strconv.ParseFloat(value, 64)
			return floatVar
		case float64:
			return value
		default:
			floatVar, _ := strconv.ParseFloat(fmt.Sprintf("%v", value), 64)
			return floatVar
		}
	} else if sym.Type == CHAR {
		switch value := sym.Value.(type) {
		case string:
			return value[0]
		case byte:
			return value
		default:
			return fmt.Sprintf("%v", sym.Value)[0]
		}
	} else if sym.Type == BOOL {
		return sym.Value == "true" || sym.Value == true
	} else if sym.Type == ID {
		return scope.GetVariable(fmt.Sprintf("%v", sym.Value)).GetValue(scope)
	} else {
		return sym.Value
	}
}

// OBTENER EL TIPO DE LA VARIABLE
func (sym Value) GetType(scope Scope) ValueType {
	if sym.Type != ID {
		return sym.Type
	} else {
		return scope.GetVariable(fmt.Sprintf("%v", sym.Value)).GetType(scope)
	}
}

// ENUMS DE TIPO
type ValueType int

const (
	INTEGER ValueType = iota
	FLOAT
	STR
	CHAR
	BOOL
	STRING
	UNDEF
	VOID
	ID
)

func (vType ValueType) String() string {
	switch vType {
	case INTEGER:
		return "INTEGER"
	case FLOAT:
		return "FLOAT"
	case STR:
		return "STR"
	case CHAR:
		return "CHAR"
	case BOOL:
		return "BOOL"
	case STRING:
		return "STRING"
	case UNDEF:
		return "UNDEFINED"
	case VOID:
		return "VOID"
	case ID:
		return "ID"
	default:
		return "UNDEFINED"
	}
}

// ENUMS DE OPERACION
type Operation int

const (
	NOOP Operation = iota
	MUL
	DIV
	MOD
	ADD
	SUB
)

func (oper Operation) String() string {
	switch oper {
	case NOOP:
		return " "
	case MUL:
		return "*"
	case DIV:
		return "/"
	case MOD:
		return "%"
	case ADD:
		return "+"
	case SUB:
		return "-"
	default:
		return " "
	}
}
