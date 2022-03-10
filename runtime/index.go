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
	globalScope := I.Scope{
		Previous:  nil,
		Name:      "Global",
		Variables: make(map[string]I.IValue),
		Functions: make(map[string]I.IInstruction),
	}

	// EJECUTAR DECLARACIONES DE FUNCIONES
	mainName := "main"
	for _, s := range ctx.GetList().ToArray() {
		switch ins := s.(type) {
		case I.Function:
			ins.Execute(globalScope)
		}
	}

	// EJECUTAR MAIN
	mainCall := I.FunctionCall{
		Instruction: I.Instruction{Name: "Function"},
		Value: I.Value{
			Token: I.Token{
				Name:   mainName,
				Line:   0,
				Column: 0,
			}, Value: mainName, Type: I.VOID},
		Id:     mainName,
		Params: make([]interface{}, 0),
	}

	mainCall.Execute(globalScope)

	// MOSTRAR ERRORES
	for _, e := range I.Errors {
		d := C.New(C.FgRed, C.Bold)
		d.Print("[Error] ")
		d2 := C.New(C.FgWhite)
		d2.Print(e.Msg + " at ")
		d3 := C.New(C.FgCyan, C.Bold)
		d3.Printf("Line: %d, Column: %d", e.Line, e.Column+1)
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
	token := ctx.GetSymbol()
	l.Tokens = append(l.Tokens, I.Token{
		Name:   token.GetText(),
		Column: token.GetColumn() + 1,
		Line:   token.GetLine(),
	})
}
