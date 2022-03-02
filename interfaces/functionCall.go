package interfaces

// LLAMADA A FUNCION BASE
type FunctionCall struct {
	Instruction
	Value
	Params []interface{} // []Expression
	Scope  *Scope
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
func (fn FunctionCall) Execute(scope Scope) {
	// OBTENER FUNCION
	localFn := scope.GetFunction(fn.Value.Value.(string)).(Function)

	if localFn.GetID() != "-NOFN" {
		// CREAR SCOPE
		fn.Scope = &Scope{&scope, "Function", make(map[string]IValue), make(map[string]IInstruction)}

		// GUARDAR PARAMETROS
		for index, param := range fn.Params {
			fn.Scope.AddVariable(localFn.Params[index].(FunctionParam).Id, param.(Expression).GetValue(scope), false)
		}

		// EJECUTAR FUNCION
		for _, ins := range localFn.Body {
			ins.(IInstruction).Execute(*fn.Scope)
		}
	}
}

// *VALUE -> OBTENER VALOR
func (fn FunctionCall) GetValue(scope Scope) interface{} {
	return fn.Scope.GetVariable("return").GetValue(*fn.Scope)
}

// *VALUE -> OBTENER TIPO
func (fn FunctionCall) GetType(scope Scope) ValueType {
	return fn.Scope.GetVariable("return").GetType(*fn.Scope)
}
