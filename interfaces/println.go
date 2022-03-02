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
	for _, exp := range fn.Params {
		finalStr += fmt.Sprintf("%v", exp.(Expression).GetValue(scope).GetValue(scope)) + " "
	}

	// AGREGAR
	Logs = append(Logs, finalStr)
}

// *VALUE -> OBTENER VALOR
func (fn PrintlnCall) GetValue(scope Scope) interface{} {
	return Value{Token{"", 0, 0}, "", VOID}
}

// *VALUE -> OBTENER TIPO
func (fn PrintlnCall) GetType(scope Scope) ValueType {
	return VOID
}
