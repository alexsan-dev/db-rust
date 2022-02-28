package interfaces

// LLAMADA A FUNCION BASE
type FunctionCall struct {
	Id          string
	Expressions []*Expression
}

type IFunctionCall interface {
	Execute(scope Scope)
	GetValue() interface{}
	GetType() ValueType
}
