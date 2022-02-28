package interfaces

import "fmt"

// ASIGNACION
type Assignment struct {
	Name string
	Exp  *Expression
}

// *INSTRUCTION
func (assign Assignment) Execute() {
	fmt.Print(assign.Exp.getValue().getValue())
}
