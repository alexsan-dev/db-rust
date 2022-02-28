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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 17, 101,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 3, 2, 6, 2, 35,
	10, 2, 13, 2, 14, 2, 36, 3, 3, 6, 3, 40, 10, 3, 13, 3, 14, 3, 41, 3, 3,
	3, 3, 6, 3, 46, 10, 3, 13, 3, 14, 3, 47, 3, 4, 3, 4, 7, 4, 52, 10, 4, 12,
	4, 14, 4, 55, 11, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 7,
	6, 65, 10, 6, 12, 6, 14, 6, 68, 11, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 10, 3, 10, 3, 11, 3, 11,
	3, 12, 3, 12, 3, 13, 3, 13, 3, 14, 3, 14, 3, 15, 3, 15, 3, 16, 6, 16, 96,
	10, 16, 13, 16, 14, 16, 97, 3, 16, 3, 16, 2, 2, 17, 3, 3, 5, 4, 7, 5, 9,
	6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23, 13, 25, 14, 27, 15,
	29, 16, 31, 17, 3, 2, 8, 3, 2, 50, 59, 3, 2, 36, 36, 3, 2, 41, 41, 5, 2,
	67, 92, 97, 97, 99, 124, 6, 2, 50, 59, 67, 92, 97, 97, 99, 124, 5, 2, 11,
	12, 15, 15, 34, 34, 2, 106, 2, 3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3,
	2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15,
	3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2,
	23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2,
	2, 31, 3, 2, 2, 2, 3, 34, 3, 2, 2, 2, 5, 39, 3, 2, 2, 2, 7, 49, 3, 2, 2,
	2, 9, 58, 3, 2, 2, 2, 11, 62, 3, 2, 2, 2, 13, 69, 3, 2, 2, 2, 15, 75, 3,
	2, 2, 2, 17, 80, 3, 2, 2, 2, 19, 82, 3, 2, 2, 2, 21, 84, 3, 2, 2, 2, 23,
	86, 3, 2, 2, 2, 25, 88, 3, 2, 2, 2, 27, 90, 3, 2, 2, 2, 29, 92, 3, 2, 2,
	2, 31, 95, 3, 2, 2, 2, 33, 35, 9, 2, 2, 2, 34, 33, 3, 2, 2, 2, 35, 36,
	3, 2, 2, 2, 36, 34, 3, 2, 2, 2, 36, 37, 3, 2, 2, 2, 37, 4, 3, 2, 2, 2,
	38, 40, 9, 2, 2, 2, 39, 38, 3, 2, 2, 2, 40, 41, 3, 2, 2, 2, 41, 39, 3,
	2, 2, 2, 41, 42, 3, 2, 2, 2, 42, 43, 3, 2, 2, 2, 43, 45, 7, 48, 2, 2, 44,
	46, 9, 2, 2, 2, 45, 44, 3, 2, 2, 2, 46, 47, 3, 2, 2, 2, 47, 45, 3, 2, 2,
	2, 47, 48, 3, 2, 2, 2, 48, 6, 3, 2, 2, 2, 49, 53, 7, 36, 2, 2, 50, 52,
	10, 3, 2, 2, 51, 50, 3, 2, 2, 2, 52, 55, 3, 2, 2, 2, 53, 51, 3, 2, 2, 2,
	53, 54, 3, 2, 2, 2, 54, 56, 3, 2, 2, 2, 55, 53, 3, 2, 2, 2, 56, 57, 7,
	36, 2, 2, 57, 8, 3, 2, 2, 2, 58, 59, 7, 41, 2, 2, 59, 60, 10, 4, 2, 2,
	60, 61, 7, 41, 2, 2, 61, 10, 3, 2, 2, 2, 62, 66, 9, 5, 2, 2, 63, 65, 9,
	6, 2, 2, 64, 63, 3, 2, 2, 2, 65, 68, 3, 2, 2, 2, 66, 64, 3, 2, 2, 2, 66,
	67, 3, 2, 2, 2, 67, 12, 3, 2, 2, 2, 68, 66, 3, 2, 2, 2, 69, 70, 7, 104,
	2, 2, 70, 71, 7, 99, 2, 2, 71, 72, 7, 110, 2, 2, 72, 73, 7, 117, 2, 2,
	73, 74, 7, 103, 2, 2, 74, 14, 3, 2, 2, 2, 75, 76, 7, 118, 2, 2, 76, 77,
	7, 116, 2, 2, 77, 78, 7, 119, 2, 2, 78, 79, 7, 103, 2, 2, 79, 16, 3, 2,
	2, 2, 80, 81, 7, 61, 2, 2, 81, 18, 3, 2, 2, 2, 82, 83, 7, 63, 2, 2, 83,
	20, 3, 2, 2, 2, 84, 85, 7, 44, 2, 2, 85, 22, 3, 2, 2, 2, 86, 87, 7, 49,
	2, 2, 87, 24, 3, 2, 2, 2, 88, 89, 7, 39, 2, 2, 89, 26, 3, 2, 2, 2, 90,
	91, 7, 45, 2, 2, 91, 28, 3, 2, 2, 2, 92, 93, 7, 47, 2, 2, 93, 30, 3, 2,
	2, 2, 94, 96, 9, 7, 2, 2, 95, 94, 3, 2, 2, 2, 96, 97, 3, 2, 2, 2, 97, 95,
	3, 2, 2, 2, 97, 98, 3, 2, 2, 2, 98, 99, 3, 2, 2, 2, 99, 100, 8, 16, 2,
	2, 100, 32, 3, 2, 2, 2, 9, 2, 36, 41, 47, 53, 66, 97, 3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "", "", "", "", "", "'false'", "'true'", "';'", "'='", "'*'", "'/'",
	"'%'", "'+'", "'-'",
}

var lexerSymbolicNames = []string{
	"", "NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "SEMI",
	"EQUALS", "MUL", "DIV", "MOD", "ADD", "SUB", "WHITESPACE",
}

var lexerRuleNames = []string{
	"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "SEMI", "EQUALS",
	"MUL", "DIV", "MOD", "ADD", "SUB", "WHITESPACE",
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
	DBRustLexerFLOAT      = 2
	DBRustLexerSTRING     = 3
	DBRustLexerCHAR       = 4
	DBRustLexerID         = 5
	DBRustLexerBFALSE     = 6
	DBRustLexerBTRUE      = 7
	DBRustLexerSEMI       = 8
	DBRustLexerEQUALS     = 9
	DBRustLexerMUL        = 10
	DBRustLexerDIV        = 11
	DBRustLexerMOD        = 12
	DBRustLexerADD        = 13
	DBRustLexerSUB        = 14
	DBRustLexerWHITESPACE = 15
)
