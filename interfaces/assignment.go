package interfaces

import "fmt"

// ASIGNACION
type Assignment struct {
	Instruction
	Id         string
	Expression *Expression
}

// *INSTRUCTION
func (assign Assignment) Execute(scope Scope) {
	// OBTENER VARIABLES
	var scopeVar IValue = scope.GetVariable(assign.Id)
	var expValue IValue = assign.Expression.GetValue()

	// VERIFICAR TIPOS
	if scopeVar.GetType() != UNDEF {
		if scopeVar.GetType() == expValue.GetType() {
			if scopeVar.(ValueMut).Mut {
				scope.SetVariable(assign.Id, expValue)
			} else {
				Errors = append(Errors, Error{
					fmt.Sprintf("The variable %s is not mutable", assign.Id),
					expValue.GetLine(),
					expValue.GetColumn(),
				})
			}
		} else {
			Errors = append(Errors, Error{
				fmt.Sprintf("Cannot assign type %s to %s", expValue.GetType().String(), scopeVar.GetType().String()),
				expValue.GetLine(),
				expValue.GetColumn(),
			})
		}
	} else {
		Errors = append(Errors, Error{
			fmt.Sprintf("The variable \"%s\" is not declared", assign.Id),
			expValue.GetLine(),
			expValue.GetColumn(),
		})
	}
}
