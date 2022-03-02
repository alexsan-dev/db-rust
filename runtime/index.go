package runtime

import (
	"fmt"
	I "main/interfaces"
	"main/parser"

	C "github.com/fatih/color"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// PILA DE INSTRUCCIONES PRINCIPAL
type DBRustListener struct {
	*parser.BaseDBRustListener
	Tokens []I.Token
}

// EJECUTAR TODAS LAS INSTRUCCIONES
func (l *DBRustListener) ExitStart(ctx *parser.StartContext) {
	// CREAR ENTORNO GLOBAL
	var globalScope I.Scope = I.Scope{
		Previous:  nil,
		Name:      "Global",
		Variables: make(map[string]I.IValue),
	}

	// EJECUTAR INSTRUCCIONES
	for _, s := range ctx.GetList().ToArray() {
		switch instruction := s.(type) {
		// EJECUTAR DECLARACIONES
		case I.Declaration:
			instruction.Execute(globalScope)

		// EJECUTAR ASIGNACIONES
		case I.Assignment:
			instruction.Execute(globalScope)

		// EJECUTAR LLAMADAS A FUNCIONES
		case I.FunctionCall:
			instruction.Execute(globalScope)

		// EJECUTAR FUNCIONES NATIVAS
		case I.PrintlnCall:
			instruction.Execute(globalScope)
		}
	}

	// MOSTRAR ERRORES
	for _, e := range I.Errors {
		d := C.New(C.FgRed, C.Bold)
		d.Print("[Error] ")
		d2 := C.New(C.FgWhite)
		d2.Print(e.Msg + " at ")
		d3 := C.New(C.FgCyan, C.Bold)
		d3.Printf("Line: %d, Column: %d", e.Line, e.Column)
		df := C.New(C.FgWhite)
		df.Println("")
	}

	// MOSTRAR LOGS
	for _, log := range I.Logs {
		fmt.Println(log)
	}
}

// AGREGAR TODOS LOS TOKENS
func (l *DBRustListener) VisitTerminal(ctx antlr.TerminalNode) {
	var token antlr.Token = ctx.GetSymbol()
	l.Tokens = append(l.Tokens, I.Token{
		Value: token.GetText(),
		Col:   token.GetColumn(),
		Line:  token.GetLine(),
	})
}
