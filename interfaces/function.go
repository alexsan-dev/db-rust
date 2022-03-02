package interfaces

import "fmt"

// LLAMADA A FUNCION BASE
type Function struct {
	Instruction
	Token
	Id         string
	Params     []interface{} // []FunctionParam
	Body       []interface{} // []Instruction
	ReturnType ValueType
}

// *INSTRUCTION
func (fn Function) Execute(scope Scope) {
	// GUARDAR FUNCION
	if scope.GetFunction(fn.Id).(Function).GetID() == "-NOFN" {
		scope.AddFunction(fn.Id, fn)
	} else {
		Errors = append(Errors, Error{
			fmt.Sprintf("The function \"%s\" is already declared", fn.Id),
			fn.Line,
			fn.Column,
		})
	}
}

// *FUNCTION -> OBTENER TIPO
func (fn Function) GetType() ValueType {
	return fn.ReturnType
}

// *FUNCTION -> Obtener id
func (fn Function) GetID() string {
	return fn.Id
}

// PARAMETROS
type FunctionParam struct {
	Id   string
	Type ValueType
}
