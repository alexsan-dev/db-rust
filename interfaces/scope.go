package interfaces

// ENTORNOS
type Scope struct {
	Previous  *Scope
	Name      string
	Variables map[string]Value
}

// GUARDAR VARIABLE
func (scope Scope) AddVariable(id string, value Value) {
	if _, ok := scope.Variables[id]; !ok {
		scope.Variables[id] = value
	}
}

// ACTUALIZAR VARIABLE
func (scope Scope) SetVariable(id string, value Value) {
	if _, ok := scope.Variables[id]; ok {
		scope.Variables[id] = value
	}
}

// OBTENER VARIABLE
func (scope Scope) GetVariable(id string) Value {
	if _, ok := scope.Variables[id]; ok {
		return scope.Variables[id]
	} else {
		if scope.Previous != nil {
			return scope.Previous.GetVariable(id)
		} else {
			return Value{0, 0, UNDEF, ""}
		}
	}
}
