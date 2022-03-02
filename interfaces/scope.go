package interfaces

import "fmt"

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
			value.GetLine(), value.GetColumn(), value.GetType(), fmt.Sprintf("%v", value.GetValue())}, mut}
	}
}

// ACTUALIZAR VARIABLE
func (scope Scope) SetVariable(id string, value IValue) {
	if _, ok := scope.Variables[id]; ok {
		if scope.Variables[id].(ValueMut).Mut {
			scope.Variables[id] = ValueMut{Value{
				value.GetLine(), value.GetColumn(), value.GetType(), fmt.Sprintf("%v", value.GetValue())}, true}
		}
	}
}

// OBTENER VARIABLE
func (scope Scope) GetVariable(id string) IValue {
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
