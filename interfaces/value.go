package interfaces

import (
	"fmt"
	"strconv"
)

// VALOR BASE
type Value struct {
	Token
	Value interface{}
	Type  ValueType
}

type ValueMut struct {
	Value IValue
	Mut   bool
}

type IValue interface {
	GetLine() int
	GetColumn() int
	GetTokenName() string
	GetValue(scope Scope) interface{}
	GetType(Scope Scope) ValueType
}

// OBTENER NOMBRE DE TOKEN
func (sym Value) GetTokenName() string {
	return sym.Name
}

func (sym ValueMut) GetTokenName() string {
	return sym.Value.GetTokenName()
}

// OBTENER LINEA
func (sym Value) GetLine() int {
	return sym.Line
}

func (sym ValueMut) GetLine() int {
	return sym.Value.GetLine()
}

// OBTENER COLUMNA
func (sym Value) GetColumn() int {
	return sym.Column + 1
}

func (sym ValueMut) GetColumn() int {
	return sym.Value.GetColumn()
}

// OBTENER VALOR DE SIMBOLO
func (sym Value) GetValue(scope Scope) interface{} {
	if sym.Type == INTEGER {
		switch value := sym.Value.(type) {
		case string:
			intVar, _ := strconv.Atoi(value)
			return int64(intVar)
		case float64:
			return int64(value)
		case int64:
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
		case int64:
			return float64(value)
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

func (sym ValueMut) GetValue(scope Scope) interface{} {
	return sym.Value.GetValue(scope)
}

// OBTENER EL TIPO DE LA VARIABLE
func (sym Value) GetType(scope Scope) ValueType {
	if sym.Type != ID {
		return sym.Type
	} else {
		return scope.GetVariable(fmt.Sprintf("%v", sym.Value)).GetType(scope)
	}
}

func (sym ValueMut) GetType(scope Scope) ValueType {
	return sym.Value.GetType(scope)
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
	UNOT
	NOTEQUALS
	EQUALSEQUALS
	MOREOREQUALS
	LESSOREQUALS
	MAJOR
	MINOR
	AND
	OR
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
	case UNOT:
		return "!"
	case NOTEQUALS:
		return "!="
	case EQUALSEQUALS:
		return "=="
	case MOREOREQUALS:
		return ">="
	case LESSOREQUALS:
		return "<="
	case MAJOR:
		return ">"
	case MINOR:
		return "<"
	case AND:
		return "&&"
	case OR:
		return "||"
	default:
		return " "
	}
}
