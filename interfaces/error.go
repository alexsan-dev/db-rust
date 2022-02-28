package interfaces

// ERROR BASE
type Error struct {
	Msg    string
	Line   int
	Column int
}

var Errors []Error
