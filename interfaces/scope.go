package interfaces

// ENTORNOS
type Scope struct {
	Previous  *Scope
	Name      string
	Variables map[string]ValueMut
}

// GUARDAR VARIABLE
func (scope Scope) AddVariable(id string, value Value, mut bool) {
	if _, ok := scope.Variables[id]; !ok {
		scope.Variables[id] = ValueMut{Value{
			value.Line, value.Column, value.Type, value.Value}, mut}
	}
}

// ACTUALIZAR VARIABLE
func (scope Scope) SetVariable(id string, value Value) {
	if _, ok := scope.Variables[id]; ok {
		if scope.Variables[id].Mut {
			scope.Variables[id] = ValueMut{Value{
				value.Line, value.Column, value.Type, value.Value}, true}
		}
	}
}

// OBTENER VARIABLE
func (scope Scope) GetVariable(id string) ValueMut {
	if _, ok := scope.Variables[id]; ok {
		return scope.Variables[id]
	} else {
		if scope.Previous != nil {
			return scope.Previous.GetVariable(id)
		} else {
			return ValueMut{Value{0, 0, UNDEF, ""}, false}
		}
	}
}
