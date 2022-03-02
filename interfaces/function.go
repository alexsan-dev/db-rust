package interfaces

// LLAMADA A FUNCION BASE
type Function struct {
	Instruction
	Id     string
	Params []interface{}
	Body   []interface{}
	Return ValueType
}

// *INSTRUCTION
func (fn Function) Execute(scope Scope) {}
