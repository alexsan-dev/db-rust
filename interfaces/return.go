package interfaces

// INSTRUCCION DE RETURN
type ReturnValue struct {
	Instruction
	Token
	Expression Expression
}

// *INSTRUCTION
func (rtn ReturnValue) Execute(scope Scope) {
	// BUSCAR ENTORNO DE FUNCION
	tmpScope := scope
	for {
		if tmpScope.Name == "Function" {
			break
		}
		if tmpScope.Previous == nil {
			break
		} else {
			tmpScope = *tmpScope.Previous
		}
	}

	// AGREGAR VALOR DE RETURN
	expValue := rtn.Expression.GetValue(scope).(Value)
	tmpScope.AddVariable("return", Value{expValue.Token, expValue.GetValue(scope), expValue.GetType(scope)}, false)
}
