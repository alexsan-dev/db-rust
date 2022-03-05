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
	Scope      *Scope
}

// *INSTRUCTION
func (fn Function) Execute(scope Scope) {
	// GUARDAR FUNCION
	if scope.GetFunction(fn.Id).(Function).GetID() == "-NOFN" {
		fn.Scope = &scope
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
