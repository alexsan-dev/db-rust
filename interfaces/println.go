package interfaces

// LLAMADA A FUNCION BASE
type PrintlnCall struct {
	FunctionCall
}

// *VALUE -> EJECUTAR FUNCION
func (fn PrintlnCall) Execute(scope Scope) {
	for _, exp := range fn.Expressions {
		Logs = append(Logs, exp.GetValue().GetValue())
	}
}

// *VALUE -> OBTENER VALOR
func (fn PrintlnCall) GetValue() interface{} {
	return Value{0, 0, UNDEF, ""}
}

// *VALUE -> OBTENER TIPO
func (fn PrintlnCall) GetType() ValueType {
	return UNDEF
}
