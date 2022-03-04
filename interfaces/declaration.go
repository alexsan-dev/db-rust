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
	value := declaration.Expression.GetValue(scope)

	if scope.GetVariable(declaration.Id).GetType(scope) == UNDEF {
		if declaration.Type == value.GetType(scope) || declaration.Type == UNDEF {
			scope.AddVariable(declaration.Id, value, declaration.Mut)
		} else {
			Errors = append(Errors, Error{
				fmt.Sprintf("Cannot assign type %s to %s", value.GetType(scope).String(), declaration.Type.String()),
				value.GetLine(),
				value.GetColumn(),
			})
		}
	} else {
		Errors = append(Errors, Error{
			fmt.Sprintf("The variable \"%s\" is already declared", declaration.Id),
			value.GetLine(),
			value.GetColumn(),
		})
	}
}
