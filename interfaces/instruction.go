package interfaces

// INTERFAZ INICIAL
type IInstruction interface {
	Execute(scope Scope)
}

type Instruction struct {
	Name string
}
