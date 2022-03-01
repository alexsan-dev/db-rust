package interfaces

import "fmt"

// DECLARACION
type Declaration struct {
	Instruction
	Mut        bool
	Type       ValueType
	Id         string
	Expression *Expression
}

// *INSTRUCTION
func (declaration Declaration) Execute(scope Scope) {
	// VERIFICAR TIPOS
	var value Value = declaration.Expression.GetValue()

	if scope.GetVariable(declaration.Id).GetType() == UNDEF {
		if declaration.Type == value.GetType() {
			scope.AddVariable(declaration.Id, value, declaration.Mut)
		} else {
			Errors = append(Errors, Error{
				fmt.Sprintf("Cannot assign type %s to %s", value.GetType().String(), declaration.Type.String()),
				value.Line,
				value.Column,
			})
		}
	} else {
		Errors = append(Errors, Error{
			fmt.Sprintf("The variable \"%s\" is already declared", declaration.Id),
			value.Line,
			value.Column,
		})
	}
}
