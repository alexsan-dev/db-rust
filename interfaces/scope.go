package interfaces

// ENTORNOS
type Scope struct {
	Previous  *Scope
	Name      string
	Variables map[string]IValue
	Functions map[string]IInstruction
}

// GUARDAR VARIABLE
func (scope Scope) AddVariable(id string, value IValue, mut bool) {
	if _, ok := scope.Variables[id]; !ok {
		scope.Variables[id] = ValueMut{value, mut}
	}
}

// ACTUALIZAR VARIABLE
func (scope Scope) SetVariable(id string, value IValue) {
	if _, ok := scope.Variables[id]; ok {
		if scope.Variables[id].(ValueMut).Mut {
			scope.Variables[id] = ValueMut{Value: value.(Value), Mut: true}
		}
	}
}

// GUARDAR FUNCION
func (scope Scope) AddFunction(id string, fn IInstruction) {
	if _, ok := scope.Functions[id]; !ok {
		scope.Functions[id] = fn
	}
}

// OBTENER VARIABLE
func (scope Scope) GetVariable(id string) IValue {
	// ENTORNO ACTUAL
	tmpScope := scope

	// BUSCAR EN PADRES
	for {
		if variable, ok := tmpScope.Variables[id]; ok {
			return variable
		}
		if tmpScope.Previous == nil {
			break
		} else {
			tmpScope = *tmpScope.Previous
		}
	}

	// VALOR POR DEFECTO
	return ValueMut{Value{Token{"", 0, 0}, "", UNDEF}, false}
}

// OBTENER FUNCION
func (scope Scope) GetFunction(id string) IInstruction {
	// ENTORNO ACTUAL
	tmpScope := scope

	// BUSCAR EN PADRES
	for {
		if fn, ok := tmpScope.Functions[id]; ok {
			return fn
		}
		if tmpScope.Previous == nil {
			break
		} else {
			tmpScope = *tmpScope.Previous
		}
	}

	// VALOR POR DEFECTO
	return Function{
		Instruction{"Function"}, Token{"-NOFN", 0, 0}, "-NOFN", make([]interface{}, 0), make([]interface{}, 0), VOID}
}
