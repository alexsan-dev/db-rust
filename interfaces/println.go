package interfaces

import "fmt"

// LLAMADA A FUNCION BASE
type PrintlnCall struct {
	FunctionCall
}

// *VALUE -> EJECUTAR FUNCION
func (fn PrintlnCall) Execute(scope Scope) {
	// CREAR CADENA
	var finalStr string
	for _, exp := range fn.Expressions {
		finalStr += fmt.Sprintf("%v", exp.(Expression).GetValue().GetValue()) + " "
	}

	// AGREGAR
	Logs = append(Logs, finalStr)
}

// *VALUE -> OBTENER VALOR
func (fn PrintlnCall) GetValue() interface{} {
	return Value{0, 0, UNDEF, ""}
}

// *VALUE -> OBTENER TIPO
func (fn PrintlnCall) GetType() ValueType {
	return UNDEF
}
