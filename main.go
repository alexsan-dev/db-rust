package main

import (
	"main/parser"
	l "main/runtime"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

var listener l.DBRustListener

func main() {
	// ENTRADA
	input, _ := antlr.NewFileStream("./test/input.rs")

	// CREAR LEXER
	lexer := parser.NewDBRustLexer(input)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// CREAR PARSER
	p := parser.NewDBRustParser(stream)

	// EJECUTAR PARSER
	antlr.ParseTreeWalkerDefault.Walk(&listener, p.Start())
}
