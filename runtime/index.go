package runtime

import (
	I "main/interfaces"
	"main/parser"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// PILA DE INSTRUCCIONES PRINCIPAL
type DBRustListener struct {
	*parser.BaseDBRustListener
	tokens []I.Token
}

// EJECUTAR TODAS LAS INSTRUCCIONES
func (l *DBRustListener) ExitStart(ctx *parser.StartContext) {
	for _, s := range ctx.GetList().ToArray() {
		s.(I.IInstruction).Execute()
	}
}

// AGREGAR TODOS LOS TOKENS
func (l *DBRustListener) VisitTerminal(ctx antlr.TerminalNode) {
	var token antlr.Token = ctx.GetSymbol()
	l.tokens = append(l.tokens, I.Token{
		Value: token.GetText(),
		Col:   token.GetColumn(),
		Line:  token.GetLine(),
	})
}
