package interfaces

// LLAMADA A FUNCION BASE
type FunctionCall struct {
	Instruction
	Value
	Params []interface{} // []Expression
}

type IFunctionCall interface {
	Execute(scope Scope)
	GetLine() int
	GetColumn() int
	GetTokenName() string
	GetValue(scope Scope) interface{}
	GetType(scope Scope) ValueType
}

// *VALUE -> OBTENER NOMBRE DE TOKEN
func (fn FunctionCall) GetTokenName() string {
	return fn.Name
}

// *VALUE -> OBTENER LINEA
func (fn FunctionCall) GetLine() int {
	return fn.Line
}

// *VALUE -> OBTENER COLUMNA
func (fn FunctionCall) GetColumn() int {
	return fn.Column
}

// *VALUE -> EJECUTAR FUNCION
func (fn FunctionCall) Execute(scope Scope) {}

// *VALUE -> OBTENER VALOR
func (fn FunctionCall) GetValue(scope Scope) interface{} {
	return ""
}

// *VALUE -> OBTENER TIPO
func (fn FunctionCall) GetType(scope Scope) ValueType {
	return INTEGER
}
