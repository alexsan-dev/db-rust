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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 30, 187,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4,
	18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23,
	9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9,
	28, 4, 29, 9, 29, 4, 30, 9, 30, 3, 2, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3,
	3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3,
	5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 11, 6, 11, 110, 10, 11, 13, 11, 14,
	11, 111, 3, 12, 6, 12, 115, 10, 12, 13, 12, 14, 12, 116, 3, 12, 3, 12,
	6, 12, 121, 10, 12, 13, 12, 14, 12, 122, 3, 13, 3, 13, 7, 13, 127, 10,
	13, 12, 13, 14, 13, 130, 11, 13, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14, 3,
	14, 3, 15, 3, 15, 7, 15, 140, 10, 15, 12, 15, 14, 15, 143, 11, 15, 3, 16,
	3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3,
	18, 3, 18, 3, 19, 3, 19, 3, 20, 3, 20, 3, 21, 3, 21, 3, 22, 3, 22, 3, 23,
	3, 23, 3, 24, 3, 24, 3, 25, 3, 25, 3, 26, 3, 26, 3, 27, 3, 27, 3, 28, 3,
	28, 3, 29, 6, 29, 179, 10, 29, 13, 29, 14, 29, 180, 3, 29, 3, 29, 3, 30,
	3, 30, 3, 30, 2, 2, 31, 3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17,
	10, 19, 11, 21, 12, 23, 13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35,
	19, 37, 20, 39, 21, 41, 22, 43, 23, 45, 24, 47, 25, 49, 26, 51, 27, 53,
	28, 55, 29, 57, 30, 59, 2, 3, 2, 9, 3, 2, 50, 59, 3, 2, 36, 36, 3, 2, 41,
	41, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50, 59, 67, 92, 97, 97, 99, 124,
	5, 2, 11, 12, 15, 15, 34, 34, 9, 2, 34, 35, 37, 37, 45, 45, 47, 48, 60,
	60, 66, 66, 93, 95, 2, 191, 2, 3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3,
	2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15,
	3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2,
	23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2,
	2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2,
	2, 2, 39, 3, 2, 2, 2, 2, 41, 3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2,
	2, 2, 2, 47, 3, 2, 2, 2, 2, 49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 2, 53, 3,
	2, 2, 2, 2, 55, 3, 2, 2, 2, 2, 57, 3, 2, 2, 2, 3, 61, 3, 2, 2, 2, 5, 65,
	3, 2, 2, 2, 7, 69, 3, 2, 2, 2, 9, 78, 3, 2, 2, 2, 11, 82, 3, 2, 2, 2, 13,
	86, 3, 2, 2, 2, 15, 91, 3, 2, 2, 2, 17, 96, 3, 2, 2, 2, 19, 101, 3, 2,
	2, 2, 21, 109, 3, 2, 2, 2, 23, 114, 3, 2, 2, 2, 25, 124, 3, 2, 2, 2, 27,
	133, 3, 2, 2, 2, 29, 137, 3, 2, 2, 2, 31, 144, 3, 2, 2, 2, 33, 150, 3,
	2, 2, 2, 35, 155, 3, 2, 2, 2, 37, 157, 3, 2, 2, 2, 39, 159, 3, 2, 2, 2,
	41, 161, 3, 2, 2, 2, 43, 163, 3, 2, 2, 2, 45, 165, 3, 2, 2, 2, 47, 167,
	3, 2, 2, 2, 49, 169, 3, 2, 2, 2, 51, 171, 3, 2, 2, 2, 53, 173, 3, 2, 2,
	2, 55, 175, 3, 2, 2, 2, 57, 178, 3, 2, 2, 2, 59, 184, 3, 2, 2, 2, 61, 62,
	7, 110, 2, 2, 62, 63, 7, 103, 2, 2, 63, 64, 7, 118, 2, 2, 64, 4, 3, 2,
	2, 2, 65, 66, 7, 111, 2, 2, 66, 67, 7, 119, 2, 2, 67, 68, 7, 118, 2, 2,
	68, 6, 3, 2, 2, 2, 69, 70, 7, 114, 2, 2, 70, 71, 7, 116, 2, 2, 71, 72,
	7, 107, 2, 2, 72, 73, 7, 112, 2, 2, 73, 74, 7, 118, 2, 2, 74, 75, 7, 110,
	2, 2, 75, 76, 7, 112, 2, 2, 76, 77, 7, 35, 2, 2, 77, 8, 3, 2, 2, 2, 78,
	79, 7, 107, 2, 2, 79, 80, 7, 56, 2, 2, 80, 81, 7, 54, 2, 2, 81, 10, 3,
	2, 2, 2, 82, 83, 7, 104, 2, 2, 83, 84, 7, 56, 2, 2, 84, 85, 7, 54, 2, 2,
	85, 12, 3, 2, 2, 2, 86, 87, 7, 100, 2, 2, 87, 88, 7, 113, 2, 2, 88, 89,
	7, 113, 2, 2, 89, 90, 7, 110, 2, 2, 90, 14, 3, 2, 2, 2, 91, 92, 7, 101,
	2, 2, 92, 93, 7, 106, 2, 2, 93, 94, 7, 99, 2, 2, 94, 95, 7, 116, 2, 2,
	95, 16, 3, 2, 2, 2, 96, 97, 7, 40, 2, 2, 97, 98, 7, 117, 2, 2, 98, 99,
	7, 118, 2, 2, 99, 100, 7, 116, 2, 2, 100, 18, 3, 2, 2, 2, 101, 102, 7,
	85, 2, 2, 102, 103, 7, 118, 2, 2, 103, 104, 7, 116, 2, 2, 104, 105, 7,
	107, 2, 2, 105, 106, 7, 112, 2, 2, 106, 107, 7, 105, 2, 2, 107, 20, 3,
	2, 2, 2, 108, 110, 9, 2, 2, 2, 109, 108, 3, 2, 2, 2, 110, 111, 3, 2, 2,
	2, 111, 109, 3, 2, 2, 2, 111, 112, 3, 2, 2, 2, 112, 22, 3, 2, 2, 2, 113,
	115, 9, 2, 2, 2, 114, 113, 3, 2, 2, 2, 115, 116, 3, 2, 2, 2, 116, 114,
	3, 2, 2, 2, 116, 117, 3, 2, 2, 2, 117, 118, 3, 2, 2, 2, 118, 120, 7, 48,
	2, 2, 119, 121, 9, 2, 2, 2, 120, 119, 3, 2, 2, 2, 121, 122, 3, 2, 2, 2,
	122, 120, 3, 2, 2, 2, 122, 123, 3, 2, 2, 2, 123, 24, 3, 2, 2, 2, 124, 128,
	7, 36, 2, 2, 125, 127, 10, 3, 2, 2, 126, 125, 3, 2, 2, 2, 127, 130, 3,
	2, 2, 2, 128, 126, 3, 2, 2, 2, 128, 129, 3, 2, 2, 2, 129, 131, 3, 2, 2,
	2, 130, 128, 3, 2, 2, 2, 131, 132, 7, 36, 2, 2, 132, 26, 3, 2, 2, 2, 133,
	134, 7, 41, 2, 2, 134, 135, 10, 4, 2, 2, 135, 136, 7, 41, 2, 2, 136, 28,
	3, 2, 2, 2, 137, 141, 9, 5, 2, 2, 138, 140, 9, 6, 2, 2, 139, 138, 3, 2,
	2, 2, 140, 143, 3, 2, 2, 2, 141, 139, 3, 2, 2, 2, 141, 142, 3, 2, 2, 2,
	142, 30, 3, 2, 2, 2, 143, 141, 3, 2, 2, 2, 144, 145, 7, 104, 2, 2, 145,
	146, 7, 99, 2, 2, 146, 147, 7, 110, 2, 2, 147, 148, 7, 117, 2, 2, 148,
	149, 7, 103, 2, 2, 149, 32, 3, 2, 2, 2, 150, 151, 7, 118, 2, 2, 151, 152,
	7, 116, 2, 2, 152, 153, 7, 119, 2, 2, 153, 154, 7, 103, 2, 2, 154, 34,
	3, 2, 2, 2, 155, 156, 7, 42, 2, 2, 156, 36, 3, 2, 2, 2, 157, 158, 7, 43,
	2, 2, 158, 38, 3, 2, 2, 2, 159, 160, 7, 60, 2, 2, 160, 40, 3, 2, 2, 2,
	161, 162, 7, 61, 2, 2, 162, 42, 3, 2, 2, 2, 163, 164, 7, 46, 2, 2, 164,
	44, 3, 2, 2, 2, 165, 166, 7, 63, 2, 2, 166, 46, 3, 2, 2, 2, 167, 168, 7,
	44, 2, 2, 168, 48, 3, 2, 2, 2, 169, 170, 7, 49, 2, 2, 170, 50, 3, 2, 2,
	2, 171, 172, 7, 39, 2, 2, 172, 52, 3, 2, 2, 2, 173, 174, 7, 45, 2, 2, 174,
	54, 3, 2, 2, 2, 175, 176, 7, 47, 2, 2, 176, 56, 3, 2, 2, 2, 177, 179, 9,
	7, 2, 2, 178, 177, 3, 2, 2, 2, 179, 180, 3, 2, 2, 2, 180, 178, 3, 2, 2,
	2, 180, 181, 3, 2, 2, 2, 181, 182, 3, 2, 2, 2, 182, 183, 8, 29, 2, 2, 183,
	58, 3, 2, 2, 2, 184, 185, 7, 94, 2, 2, 185, 186, 9, 8, 2, 2, 186, 60, 3,
	2, 2, 2, 9, 2, 111, 116, 122, 128, 141, 180, 3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "'let'", "'mut'", "'println!'", "'i64'", "'f64'", "'bool'", "'char'",
	"'&str'", "'String'", "", "", "", "", "", "'false'", "'true'", "'('", "')'",
	"':'", "';'", "','", "'='", "'*'", "'/'", "'%'", "'+'", "'-'",
}

var lexerSymbolicNames = []string{
	"", "LET", "MUT", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS",
	"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "OPENPAR",
	"CLOSEPAR", "COLOM", "SEMI", "COMMA", "EQUALS", "MUL", "DIV", "MOD", "ADD",
	"SUB", "WHITESPACE",
}

var lexerRuleNames = []string{
	"LET", "MUT", "PRINTLN", "I64", "F64", "BOOL", "CHARTYPE", "STR", "STRCLASS",
	"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "BFALSE", "BTRUE", "OPENPAR",
	"CLOSEPAR", "COLOM", "SEMI", "COMMA", "EQUALS", "MUL", "DIV", "MOD", "ADD",
	"SUB", "WHITESPACE", "ESC_SEQ",
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
	DBRustLexerLET        = 1
	DBRustLexerMUT        = 2
	DBRustLexerPRINTLN    = 3
	DBRustLexerI64        = 4
	DBRustLexerF64        = 5
	DBRustLexerBOOL       = 6
	DBRustLexerCHARTYPE   = 7
	DBRustLexerSTR        = 8
	DBRustLexerSTRCLASS   = 9
	DBRustLexerNUMBER     = 10
	DBRustLexerFLOAT      = 11
	DBRustLexerSTRING     = 12
	DBRustLexerCHAR       = 13
	DBRustLexerID         = 14
	DBRustLexerBFALSE     = 15
	DBRustLexerBTRUE      = 16
	DBRustLexerOPENPAR    = 17
	DBRustLexerCLOSEPAR   = 18
	DBRustLexerCOLOM      = 19
	DBRustLexerSEMI       = 20
	DBRustLexerCOMMA      = 21
	DBRustLexerEQUALS     = 22
	DBRustLexerMUL        = 23
	DBRustLexerDIV        = 24
	DBRustLexerMOD        = 25
	DBRustLexerADD        = 26
	DBRustLexerSUB        = 27
	DBRustLexerWHITESPACE = 28
)
