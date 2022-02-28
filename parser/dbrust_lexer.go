// Code generated from DBRustLexer.g4 by ANTLR 4.9. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 12, 63, 8,
	1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9,
	7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 3, 2, 6, 2, 25,
	10, 2, 13, 2, 14, 2, 26, 3, 3, 3, 3, 7, 3, 31, 10, 3, 12, 3, 14, 3, 34,
	11, 3, 3, 3, 3, 3, 3, 4, 3, 4, 7, 4, 40, 10, 4, 12, 4, 14, 4, 43, 11, 4,
	3, 5, 3, 5, 3, 6, 3, 6, 3, 7, 3, 7, 3, 8, 3, 8, 3, 9, 3, 9, 3, 10, 3, 10,
	3, 11, 6, 11, 58, 10, 11, 13, 11, 14, 11, 59, 3, 11, 3, 11, 2, 2, 12, 3,
	3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 3, 2,
	7, 3, 2, 50, 59, 3, 2, 36, 36, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50,
	59, 67, 92, 97, 97, 99, 124, 5, 2, 11, 12, 15, 15, 34, 34, 2, 66, 2, 3,
	3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11,
	3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2,
	19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 3, 24, 3, 2, 2, 2, 5, 28, 3, 2, 2, 2,
	7, 37, 3, 2, 2, 2, 9, 44, 3, 2, 2, 2, 11, 46, 3, 2, 2, 2, 13, 48, 3, 2,
	2, 2, 15, 50, 3, 2, 2, 2, 17, 52, 3, 2, 2, 2, 19, 54, 3, 2, 2, 2, 21, 57,
	3, 2, 2, 2, 23, 25, 9, 2, 2, 2, 24, 23, 3, 2, 2, 2, 25, 26, 3, 2, 2, 2,
	26, 24, 3, 2, 2, 2, 26, 27, 3, 2, 2, 2, 27, 4, 3, 2, 2, 2, 28, 32, 7, 36,
	2, 2, 29, 31, 10, 3, 2, 2, 30, 29, 3, 2, 2, 2, 31, 34, 3, 2, 2, 2, 32,
	30, 3, 2, 2, 2, 32, 33, 3, 2, 2, 2, 33, 35, 3, 2, 2, 2, 34, 32, 3, 2, 2,
	2, 35, 36, 7, 36, 2, 2, 36, 6, 3, 2, 2, 2, 37, 41, 9, 4, 2, 2, 38, 40,
	9, 5, 2, 2, 39, 38, 3, 2, 2, 2, 40, 43, 3, 2, 2, 2, 41, 39, 3, 2, 2, 2,
	41, 42, 3, 2, 2, 2, 42, 8, 3, 2, 2, 2, 43, 41, 3, 2, 2, 2, 44, 45, 7, 63,
	2, 2, 45, 10, 3, 2, 2, 2, 46, 47, 7, 44, 2, 2, 47, 12, 3, 2, 2, 2, 48,
	49, 7, 49, 2, 2, 49, 14, 3, 2, 2, 2, 50, 51, 7, 39, 2, 2, 51, 16, 3, 2,
	2, 2, 52, 53, 7, 45, 2, 2, 53, 18, 3, 2, 2, 2, 54, 55, 7, 47, 2, 2, 55,
	20, 3, 2, 2, 2, 56, 58, 9, 6, 2, 2, 57, 56, 3, 2, 2, 2, 58, 59, 3, 2, 2,
	2, 59, 57, 3, 2, 2, 2, 59, 60, 3, 2, 2, 2, 60, 61, 3, 2, 2, 2, 61, 62,
	8, 11, 2, 2, 62, 22, 3, 2, 2, 2, 7, 2, 26, 32, 41, 59, 3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "", "", "", "'='", "'*'", "'/'", "'%'", "'+'", "'-'",
}

var lexerSymbolicNames = []string{
	"", "NUMBER", "STRING", "ID", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB",
	"WHITESPACE",
}

var lexerRuleNames = []string{
	"NUMBER", "STRING", "ID", "EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB",
	"WHITESPACE",
}

type DBRustLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

// NewDBRustLexer produces a new lexer instance for the optional input antlr.CharStream.
//
// The *DBRustLexer instance produced may be reused by calling the SetInputStream method.
// The initial lexer configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewDBRustLexer(input antlr.CharStream) *DBRustLexer {
	l := new(DBRustLexer)
	lexerDeserializer := antlr.NewATNDeserializer(nil)
	lexerAtn := lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)
	lexerDecisionToDFA := make([]*antlr.DFA, len(lexerAtn.DecisionToState))
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "DBRustLexer.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// DBRustLexer tokens.
const (
	DBRustLexerNUMBER     = 1
	DBRustLexerSTRING     = 2
	DBRustLexerID         = 3
	DBRustLexerEQUALS     = 4
	DBRustLexerMUL        = 5
	DBRustLexerDIV        = 6
	DBRustLexerMOD        = 7
	DBRustLexerADD        = 8
	DBRustLexerSUB        = 9
	DBRustLexerWHITESPACE = 10
)
