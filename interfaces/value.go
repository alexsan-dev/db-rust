package interfaces

import "strconv"

// VALOR BASE
type Value struct {
	Line   int
	Column int
	Type   ValueType
	Value  string
}

type ValueMut struct {
	Value
	Mut bool
}

type IValue interface {
	GetLine() int
	GetColumn() int
	GetValue() interface{}
	GetType() ValueType
}

// OBTENER LINEA
func (sym Value) GetLine() int {
	return sym.Line
}

// OBTENER COLUMNA
func (sym Value) GetColumn() int {
	return sym.Column
}

// OBTENER VALOR DE SIMBOLO
func (sym Value) GetValue() interface{} {
	if sym.Type == INTEGER {
		intVar, _ := strconv.Atoi(sym.Value)
		return intVar
	} else if sym.Type == FLOAT {
		floatVar, _ := strconv.ParseFloat(sym.Value, 64)
		return floatVar
	} else if sym.Type == CHAR {
		return sym.Value[0]
	} else if sym.Type == BOOL {
		return sym.Value == "true"
	} else {
		return sym.Value
	}
}

// OBTENER EL TIPO DE LA VARIABLE
func (sym Value) GetType() ValueType {
	return sym.Type
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
