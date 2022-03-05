package interfaces

import "fmt"

// LLAMADA A FUNCION BASE
type FunctionCall struct {
	Instruction
	Value
	Id     string
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

// *INTRUCTION -> EJECUTAR FUNCION
func (fn FunctionCall) Execute(scope Scope) {
	fn.GetRuntimeValue(scope)
}

// *VALUE -> OBTENER VALOR
func (fn FunctionCall) GetValue(scope Scope) interface{} {
	return fn.GetRuntimeValue(scope)
}

// *VALUE -> OBTENER TIPO
func (fn FunctionCall) GetType(scope Scope) ValueType {
	// OBTENER FUNCION
	localFn := scope.GetFunction(fn.Id).(Function)

	if localFn.GetID() != "-NOFN" {
		return localFn.GetType()
	} else {
		return UNDEF
	}
}

// *FUNCTIONCALL -> Obtener valor
func (fn FunctionCall) GetRuntimeValue(scope Scope) interface{} {
	// OBTENER FUNCION
	localFn := scope.GetFunction(fn.Id).(Function)

	if localFn.GetID() != "-NOFN" {
		// VALIDAR CANTIDAD DE PARAMETROS
		if len(fn.Params) == len(localFn.Params) {
			// VALIDAR TIPO DE PARAMETROS
			validParams := true
			for index, param := range fn.Params {
				if param.(Expression).GetValue(scope).GetType(scope) != localFn.Params[index].(FunctionParam).Type {
					Errors = append(Errors, Error{fmt.Sprintf("The parameter %d of the function %s must be of the type %s", index+1, fn.Id, localFn.Params[index].(FunctionParam).Type), fn.Line, fn.Column})
					validParams = false
				}
			}

			if validParams {
				// CREAR SCOPE
				fnScope := Scope{localFn.Scope, "Function", make(map[string]IValue), make(map[string]IInstruction)}

				// GUARDAR PARAMETROS
				for index, param := range fn.Params {
					paramValue := param.(Expression).GetValue(scope)
					fnScope.AddVariable(localFn.Params[index].(FunctionParam).Id, Value{Token{paramValue.GetTokenName(), paramValue.GetLine(), paramValue.GetColumn()}, paramValue.GetValue(scope), paramValue.GetType(scope)}, false)
				}

				// EJECUTAR FUNCION
				for _, ins := range localFn.Body {
					ins.(IInstruction).Execute(fnScope)
				}

				// RETORNAR VALOR
				return fnScope.GetVariable("return").GetValue(scope)
			} else {
				return nil
			}
		} else {
			Errors = append(Errors, Error{fmt.Sprintf("Function %s expects %d parameters but only got %d", fn.Id, len(localFn.Params), len(fn.Params)), fn.Line, fn.Column})
			return nil
		}
	} else {
		Errors = append(Errors, Error{fmt.Sprintf("The %s function is not declared", fn.Id), fn.Line, fn.Column})
		return nil
	}
}
