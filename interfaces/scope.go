package interfaces

// ENTORNOS
type Scope struct {
	Previous  *Scope
	Name      string
	Variables map[string]IValue
}

// GUARDAR VARIABLE
func (scope Scope) AddVariable(id string, value IValue, mut bool) {
	if _, ok := scope.Variables[id]; !ok {
		scope.Variables[id] = ValueMut{Value{
			value.GetLine(), value.GetColumn(), value.GetType(scope), value.GetValue(scope)}, mut}
	}
}

// ACTUALIZAR VARIABLE
func (scope Scope) SetVariable(id string, value IValue) {
	if _, ok := scope.Variables[id]; ok {
		if scope.Variables[id].(ValueMut).Mut {
			scope.Variables[id] = ValueMut{Value{
				value.GetLine(), value.GetColumn(), value.GetType(scope), value.GetValue(scope)}, true}
		}
	}
}

// OBTENER VARIABLE
func (scope Scope) GetVariable(id string) IValue {
	// ENTORNO ACTUAL
	var tmpScope Scope = scope

	// BUSCAR EN PADRES
	for {
		if variable, ok := tmpScope.Variables[id]; ok {
			return variable
		}
		if scope.Previous == nil {
			break
		} else {
			tmpScope = *tmpScope.Previous
		}
	}

	// VALOR POR DEFECTO
	return ValueMut{Value{0, 0, UNDEF, ""}, false}
}
