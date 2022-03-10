// Code generated from DBRust.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // DBRust

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

import I "main/interfaces"
import arrayList "github.com/colegno/arraylist"

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 50, 497,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 4, 7, 4, 70, 10, 4, 12, 4, 14, 4, 73, 11, 4, 3, 4, 3, 4, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 5, 5, 106, 10, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6,
	3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6,
	3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6,
	5, 6, 138, 10, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8,
	3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 7, 8, 154, 10, 8, 12, 8, 14, 8, 157, 11,
	8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3,
	9, 3, 9, 5, 9, 172, 10, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3,
	9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 7, 9, 189, 10, 9, 12, 9, 14,
	9, 192, 11, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 200, 10,
	10, 3, 11, 3, 11, 3, 11, 3, 11, 5, 11, 206, 10, 11, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 5, 12, 224, 10, 12, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13,
	3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 5, 13, 238, 10, 13, 3,
	14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3,
	14, 3, 14, 5, 14, 263, 10, 14, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15,
	3, 15, 3, 15, 3, 15, 3, 15, 5, 15, 275, 10, 15, 3, 16, 3, 16, 3, 16, 3,
	17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18,
	3, 18, 3, 18, 3, 18, 3, 18, 7, 18, 295, 10, 18, 12, 18, 14, 18, 298, 11,
	18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20,
	3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3,
	20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20,
	3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 5, 20, 339, 10,
	20, 3, 21, 3, 21, 3, 21, 3, 21, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22,
	3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3,
	22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 5, 22,
	371, 10, 22, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3,
	23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23,
	3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3,
	23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23,
	3, 23, 3, 23, 3, 23, 3, 23, 5, 23, 417, 10, 23, 3, 24, 3, 24, 3, 24, 3,
	24, 3, 24, 3, 24, 3, 24, 3, 24, 7, 24, 427, 10, 24, 12, 24, 14, 24, 430,
	11, 24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 7, 25,
	440, 10, 25, 12, 25, 14, 25, 443, 11, 25, 3, 26, 3, 26, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27,
	3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3,
	28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 5, 28, 477, 10, 28, 3, 29,
	3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 7, 29, 487, 10, 29, 12,
	29, 14, 29, 490, 11, 29, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 2, 8,
	14, 16, 34, 46, 48, 56, 31, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24,
	26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 2,
	2, 2, 523, 2, 60, 3, 2, 2, 2, 4, 63, 3, 2, 2, 2, 6, 71, 3, 2, 2, 2, 8,
	105, 3, 2, 2, 2, 10, 137, 3, 2, 2, 2, 12, 139, 3, 2, 2, 2, 14, 144, 3,
	2, 2, 2, 16, 171, 3, 2, 2, 2, 18, 199, 3, 2, 2, 2, 20, 205, 3, 2, 2, 2,
	22, 223, 3, 2, 2, 2, 24, 237, 3, 2, 2, 2, 26, 262, 3, 2, 2, 2, 28, 274,
	3, 2, 2, 2, 30, 276, 3, 2, 2, 2, 32, 279, 3, 2, 2, 2, 34, 285, 3, 2, 2,
	2, 36, 299, 3, 2, 2, 2, 38, 338, 3, 2, 2, 2, 40, 340, 3, 2, 2, 2, 42, 370,
	3, 2, 2, 2, 44, 416, 3, 2, 2, 2, 46, 418, 3, 2, 2, 2, 48, 431, 3, 2, 2,
	2, 50, 444, 3, 2, 2, 2, 52, 450, 3, 2, 2, 2, 54, 476, 3, 2, 2, 2, 56, 478,
	3, 2, 2, 2, 58, 491, 3, 2, 2, 2, 60, 61, 5, 6, 4, 2, 61, 62, 8, 2, 1, 2,
	62, 3, 3, 2, 2, 2, 63, 64, 7, 27, 2, 2, 64, 65, 5, 6, 4, 2, 65, 66, 7,
	28, 2, 2, 66, 67, 8, 3, 1, 2, 67, 5, 3, 2, 2, 2, 68, 70, 5, 8, 5, 2, 69,
	68, 3, 2, 2, 2, 70, 73, 3, 2, 2, 2, 71, 69, 3, 2, 2, 2, 71, 72, 3, 2, 2,
	2, 72, 74, 3, 2, 2, 2, 73, 71, 3, 2, 2, 2, 74, 75, 8, 4, 1, 2, 75, 7, 3,
	2, 2, 2, 76, 77, 5, 10, 6, 2, 77, 78, 7, 33, 2, 2, 78, 79, 8, 5, 1, 2,
	79, 106, 3, 2, 2, 2, 80, 81, 5, 28, 15, 2, 81, 82, 7, 33, 2, 2, 82, 83,
	8, 5, 1, 2, 83, 106, 3, 2, 2, 2, 84, 85, 5, 12, 7, 2, 85, 86, 7, 33, 2,
	2, 86, 87, 8, 5, 1, 2, 87, 106, 3, 2, 2, 2, 88, 89, 5, 30, 16, 2, 89, 90,
	7, 33, 2, 2, 90, 91, 8, 5, 1, 2, 91, 106, 3, 2, 2, 2, 92, 93, 5, 38, 20,
	2, 93, 94, 8, 5, 1, 2, 94, 106, 3, 2, 2, 2, 95, 96, 5, 40, 21, 2, 96, 97,
	7, 33, 2, 2, 97, 98, 8, 5, 1, 2, 98, 106, 3, 2, 2, 2, 99, 100, 5, 42, 22,
	2, 100, 101, 8, 5, 1, 2, 101, 106, 3, 2, 2, 2, 102, 103, 5, 54, 28, 2,
	103, 104, 8, 5, 1, 2, 104, 106, 3, 2, 2, 2, 105, 76, 3, 2, 2, 2, 105, 80,
	3, 2, 2, 2, 105, 84, 3, 2, 2, 2, 105, 88, 3, 2, 2, 2, 105, 92, 3, 2, 2,
	2, 105, 95, 3, 2, 2, 2, 105, 99, 3, 2, 2, 2, 105, 102, 3, 2, 2, 2, 106,
	9, 3, 2, 2, 2, 107, 108, 7, 3, 2, 2, 108, 109, 7, 24, 2, 2, 109, 110, 7,
	32, 2, 2, 110, 111, 5, 24, 13, 2, 111, 112, 7, 46, 2, 2, 112, 113, 5, 16,
	9, 2, 113, 114, 8, 6, 1, 2, 114, 138, 3, 2, 2, 2, 115, 116, 7, 3, 2, 2,
	116, 117, 7, 4, 2, 2, 117, 118, 7, 24, 2, 2, 118, 119, 7, 32, 2, 2, 119,
	120, 5, 24, 13, 2, 120, 121, 7, 46, 2, 2, 121, 122, 5, 16, 9, 2, 122, 123,
	8, 6, 1, 2, 123, 138, 3, 2, 2, 2, 124, 125, 7, 3, 2, 2, 125, 126, 7, 4,
	2, 2, 126, 127, 7, 24, 2, 2, 127, 128, 7, 46, 2, 2, 128, 129, 5, 16, 9,
	2, 129, 130, 8, 6, 1, 2, 130, 138, 3, 2, 2, 2, 131, 132, 7, 3, 2, 2, 132,
	133, 7, 24, 2, 2, 133, 134, 7, 46, 2, 2, 134, 135, 5, 16, 9, 2, 135, 136,
	8, 6, 1, 2, 136, 138, 3, 2, 2, 2, 137, 107, 3, 2, 2, 2, 137, 115, 3, 2,
	2, 2, 137, 124, 3, 2, 2, 2, 137, 131, 3, 2, 2, 2, 138, 11, 3, 2, 2, 2,
	139, 140, 7, 24, 2, 2, 140, 141, 7, 46, 2, 2, 141, 142, 5, 16, 9, 2, 142,
	143, 8, 7, 1, 2, 143, 13, 3, 2, 2, 2, 144, 145, 8, 8, 1, 2, 145, 146, 5,
	16, 9, 2, 146, 147, 8, 8, 1, 2, 147, 155, 3, 2, 2, 2, 148, 149, 12, 4,
	2, 2, 149, 150, 7, 34, 2, 2, 150, 151, 5, 16, 9, 2, 151, 152, 8, 8, 1,
	2, 152, 154, 3, 2, 2, 2, 153, 148, 3, 2, 2, 2, 154, 157, 3, 2, 2, 2, 155,
	153, 3, 2, 2, 2, 155, 156, 3, 2, 2, 2, 156, 15, 3, 2, 2, 2, 157, 155, 3,
	2, 2, 2, 158, 159, 8, 9, 1, 2, 159, 160, 7, 25, 2, 2, 160, 161, 5, 16,
	9, 2, 161, 162, 7, 26, 2, 2, 162, 163, 8, 9, 1, 2, 163, 172, 3, 2, 2, 2,
	164, 165, 7, 47, 2, 2, 165, 166, 5, 16, 9, 4, 166, 167, 8, 9, 1, 2, 167,
	172, 3, 2, 2, 2, 168, 169, 5, 26, 14, 2, 169, 170, 8, 9, 1, 2, 170, 172,
	3, 2, 2, 2, 171, 158, 3, 2, 2, 2, 171, 164, 3, 2, 2, 2, 171, 168, 3, 2,
	2, 2, 172, 190, 3, 2, 2, 2, 173, 174, 12, 8, 2, 2, 174, 175, 5, 18, 10,
	2, 175, 176, 5, 16, 9, 9, 176, 177, 8, 9, 1, 2, 177, 189, 3, 2, 2, 2, 178,
	179, 12, 7, 2, 2, 179, 180, 5, 20, 11, 2, 180, 181, 5, 16, 9, 8, 181, 182,
	8, 9, 1, 2, 182, 189, 3, 2, 2, 2, 183, 184, 12, 6, 2, 2, 184, 185, 5, 22,
	12, 2, 185, 186, 5, 16, 9, 7, 186, 187, 8, 9, 1, 2, 187, 189, 3, 2, 2,
	2, 188, 173, 3, 2, 2, 2, 188, 178, 3, 2, 2, 2, 188, 183, 3, 2, 2, 2, 189,
	192, 3, 2, 2, 2, 190, 188, 3, 2, 2, 2, 190, 191, 3, 2, 2, 2, 191, 17, 3,
	2, 2, 2, 192, 190, 3, 2, 2, 2, 193, 194, 7, 35, 2, 2, 194, 200, 8, 10,
	1, 2, 195, 196, 7, 36, 2, 2, 196, 200, 8, 10, 1, 2, 197, 198, 7, 37, 2,
	2, 198, 200, 8, 10, 1, 2, 199, 193, 3, 2, 2, 2, 199, 195, 3, 2, 2, 2, 199,
	197, 3, 2, 2, 2, 200, 19, 3, 2, 2, 2, 201, 202, 7, 38, 2, 2, 202, 206,
	8, 11, 1, 2, 203, 204, 7, 39, 2, 2, 204, 206, 8, 11, 1, 2, 205, 201, 3,
	2, 2, 2, 205, 203, 3, 2, 2, 2, 206, 21, 3, 2, 2, 2, 207, 208, 7, 45, 2,
	2, 208, 224, 8, 12, 1, 2, 209, 210, 7, 42, 2, 2, 210, 224, 8, 12, 1, 2,
	211, 212, 7, 40, 2, 2, 212, 224, 8, 12, 1, 2, 213, 214, 7, 44, 2, 2, 214,
	224, 8, 12, 1, 2, 215, 216, 7, 43, 2, 2, 216, 224, 8, 12, 1, 2, 217, 218,
	7, 41, 2, 2, 218, 224, 8, 12, 1, 2, 219, 220, 7, 48, 2, 2, 220, 224, 8,
	12, 1, 2, 221, 222, 7, 49, 2, 2, 222, 224, 8, 12, 1, 2, 223, 207, 3, 2,
	2, 2, 223, 209, 3, 2, 2, 2, 223, 211, 3, 2, 2, 2, 223, 213, 3, 2, 2, 2,
	223, 215, 3, 2, 2, 2, 223, 217, 3, 2, 2, 2, 223, 219, 3, 2, 2, 2, 223,
	221, 3, 2, 2, 2, 224, 23, 3, 2, 2, 2, 225, 226, 7, 11, 2, 2, 226, 238,
	8, 13, 1, 2, 227, 228, 7, 12, 2, 2, 228, 238, 8, 13, 1, 2, 229, 230, 7,
	13, 2, 2, 230, 238, 8, 13, 1, 2, 231, 232, 7, 14, 2, 2, 232, 238, 8, 13,
	1, 2, 233, 234, 7, 15, 2, 2, 234, 238, 8, 13, 1, 2, 235, 236, 7, 16, 2,
	2, 236, 238, 8, 13, 1, 2, 237, 225, 3, 2, 2, 2, 237, 227, 3, 2, 2, 2, 237,
	229, 3, 2, 2, 2, 237, 231, 3, 2, 2, 2, 237, 233, 3, 2, 2, 2, 237, 235,
	3, 2, 2, 2, 238, 25, 3, 2, 2, 2, 239, 240, 7, 20, 2, 2, 240, 263, 8, 14,
	1, 2, 241, 242, 7, 21, 2, 2, 242, 263, 8, 14, 1, 2, 243, 244, 7, 22, 2,
	2, 244, 263, 8, 14, 1, 2, 245, 246, 7, 23, 2, 2, 246, 263, 8, 14, 1, 2,
	247, 248, 7, 18, 2, 2, 248, 263, 8, 14, 1, 2, 249, 250, 7, 19, 2, 2, 250,
	263, 8, 14, 1, 2, 251, 252, 7, 24, 2, 2, 252, 263, 8, 14, 1, 2, 253, 254,
	5, 30, 16, 2, 254, 255, 8, 14, 1, 2, 255, 263, 3, 2, 2, 2, 256, 257, 5,
	28, 15, 2, 257, 258, 8, 14, 1, 2, 258, 263, 3, 2, 2, 2, 259, 260, 5, 44,
	23, 2, 260, 261, 8, 14, 1, 2, 261, 263, 3, 2, 2, 2, 262, 239, 3, 2, 2,
	2, 262, 241, 3, 2, 2, 2, 262, 243, 3, 2, 2, 2, 262, 245, 3, 2, 2, 2, 262,
	247, 3, 2, 2, 2, 262, 249, 3, 2, 2, 2, 262, 251, 3, 2, 2, 2, 262, 253,
	3, 2, 2, 2, 262, 256, 3, 2, 2, 2, 262, 259, 3, 2, 2, 2, 263, 27, 3, 2,
	2, 2, 264, 265, 7, 24, 2, 2, 265, 266, 7, 25, 2, 2, 266, 267, 5, 14, 8,
	2, 267, 268, 7, 26, 2, 2, 268, 269, 8, 15, 1, 2, 269, 275, 3, 2, 2, 2,
	270, 271, 7, 24, 2, 2, 271, 272, 7, 25, 2, 2, 272, 273, 7, 26, 2, 2, 273,
	275, 8, 15, 1, 2, 274, 264, 3, 2, 2, 2, 274, 270, 3, 2, 2, 2, 275, 29,
	3, 2, 2, 2, 276, 277, 5, 32, 17, 2, 277, 278, 8, 16, 1, 2, 278, 31, 3,
	2, 2, 2, 279, 280, 7, 5, 2, 2, 280, 281, 7, 25, 2, 2, 281, 282, 5, 14,
	8, 2, 282, 283, 7, 26, 2, 2, 283, 284, 8, 17, 1, 2, 284, 33, 3, 2, 2, 2,
	285, 286, 8, 18, 1, 2, 286, 287, 5, 36, 19, 2, 287, 288, 8, 18, 1, 2, 288,
	296, 3, 2, 2, 2, 289, 290, 12, 4, 2, 2, 290, 291, 7, 34, 2, 2, 291, 292,
	5, 36, 19, 2, 292, 293, 8, 18, 1, 2, 293, 295, 3, 2, 2, 2, 294, 289, 3,
	2, 2, 2, 295, 298, 3, 2, 2, 2, 296, 294, 3, 2, 2, 2, 296, 297, 3, 2, 2,
	2, 297, 35, 3, 2, 2, 2, 298, 296, 3, 2, 2, 2, 299, 300, 7, 24, 2, 2, 300,
	301, 7, 32, 2, 2, 301, 302, 5, 24, 13, 2, 302, 303, 8, 19, 1, 2, 303, 37,
	3, 2, 2, 2, 304, 305, 7, 6, 2, 2, 305, 306, 7, 24, 2, 2, 306, 307, 7, 25,
	2, 2, 307, 308, 5, 34, 18, 2, 308, 309, 7, 26, 2, 2, 309, 310, 5, 4, 3,
	2, 310, 311, 8, 20, 1, 2, 311, 339, 3, 2, 2, 2, 312, 313, 7, 6, 2, 2, 313,
	314, 7, 24, 2, 2, 314, 315, 7, 25, 2, 2, 315, 316, 7, 26, 2, 2, 316, 317,
	5, 4, 3, 2, 317, 318, 8, 20, 1, 2, 318, 339, 3, 2, 2, 2, 319, 320, 7, 6,
	2, 2, 320, 321, 7, 24, 2, 2, 321, 322, 7, 25, 2, 2, 322, 323, 5, 34, 18,
	2, 323, 324, 7, 26, 2, 2, 324, 325, 7, 29, 2, 2, 325, 326, 5, 24, 13, 2,
	326, 327, 5, 4, 3, 2, 327, 328, 8, 20, 1, 2, 328, 339, 3, 2, 2, 2, 329,
	330, 7, 6, 2, 2, 330, 331, 7, 24, 2, 2, 331, 332, 7, 25, 2, 2, 332, 333,
	7, 26, 2, 2, 333, 334, 7, 29, 2, 2, 334, 335, 5, 24, 13, 2, 335, 336, 5,
	4, 3, 2, 336, 337, 8, 20, 1, 2, 337, 339, 3, 2, 2, 2, 338, 304, 3, 2, 2,
	2, 338, 312, 3, 2, 2, 2, 338, 319, 3, 2, 2, 2, 338, 329, 3, 2, 2, 2, 339,
	39, 3, 2, 2, 2, 340, 341, 7, 7, 2, 2, 341, 342, 5, 16, 9, 2, 342, 343,
	8, 21, 1, 2, 343, 41, 3, 2, 2, 2, 344, 345, 7, 8, 2, 2, 345, 346, 5, 16,
	9, 2, 346, 347, 5, 4, 3, 2, 347, 348, 8, 22, 1, 2, 348, 371, 3, 2, 2, 2,
	349, 350, 7, 8, 2, 2, 350, 351, 5, 16, 9, 2, 351, 352, 5, 4, 3, 2, 352,
	353, 5, 46, 24, 2, 353, 354, 8, 22, 1, 2, 354, 371, 3, 2, 2, 2, 355, 356,
	7, 8, 2, 2, 356, 357, 5, 16, 9, 2, 357, 358, 5, 4, 3, 2, 358, 359, 7, 9,
	2, 2, 359, 360, 5, 4, 3, 2, 360, 361, 8, 22, 1, 2, 361, 371, 3, 2, 2, 2,
	362, 363, 7, 8, 2, 2, 363, 364, 5, 16, 9, 2, 364, 365, 5, 4, 3, 2, 365,
	366, 5, 46, 24, 2, 366, 367, 7, 9, 2, 2, 367, 368, 5, 4, 3, 2, 368, 369,
	8, 22, 1, 2, 369, 371, 3, 2, 2, 2, 370, 344, 3, 2, 2, 2, 370, 349, 3, 2,
	2, 2, 370, 355, 3, 2, 2, 2, 370, 362, 3, 2, 2, 2, 371, 43, 3, 2, 2, 2,
	372, 373, 7, 8, 2, 2, 373, 374, 5, 16, 9, 2, 374, 375, 7, 27, 2, 2, 375,
	376, 5, 6, 4, 2, 376, 377, 5, 16, 9, 2, 377, 378, 7, 28, 2, 2, 378, 379,
	8, 23, 1, 2, 379, 417, 3, 2, 2, 2, 380, 381, 7, 8, 2, 2, 381, 382, 5, 16,
	9, 2, 382, 383, 7, 27, 2, 2, 383, 384, 5, 6, 4, 2, 384, 385, 5, 16, 9,
	2, 385, 386, 7, 28, 2, 2, 386, 387, 5, 48, 25, 2, 387, 388, 8, 23, 1, 2,
	388, 417, 3, 2, 2, 2, 389, 390, 7, 8, 2, 2, 390, 391, 5, 16, 9, 2, 391,
	392, 7, 27, 2, 2, 392, 393, 5, 6, 4, 2, 393, 394, 5, 16, 9, 2, 394, 395,
	7, 28, 2, 2, 395, 396, 7, 9, 2, 2, 396, 397, 7, 27, 2, 2, 397, 398, 5,
	6, 4, 2, 398, 399, 5, 16, 9, 2, 399, 400, 7, 28, 2, 2, 400, 401, 8, 23,
	1, 2, 401, 417, 3, 2, 2, 2, 402, 403, 7, 8, 2, 2, 403, 404, 5, 16, 9, 2,
	404, 405, 7, 27, 2, 2, 405, 406, 5, 6, 4, 2, 406, 407, 5, 16, 9, 2, 407,
	408, 7, 28, 2, 2, 408, 409, 5, 48, 25, 2, 409, 410, 7, 9, 2, 2, 410, 411,
	7, 27, 2, 2, 411, 412, 5, 6, 4, 2, 412, 413, 5, 16, 9, 2, 413, 414, 7,
	28, 2, 2, 414, 415, 8, 23, 1, 2, 415, 417, 3, 2, 2, 2, 416, 372, 3, 2,
	2, 2, 416, 380, 3, 2, 2, 2, 416, 389, 3, 2, 2, 2, 416, 402, 3, 2, 2, 2,
	417, 45, 3, 2, 2, 2, 418, 419, 8, 24, 1, 2, 419, 420, 5, 50, 26, 2, 420,
	421, 8, 24, 1, 2, 421, 428, 3, 2, 2, 2, 422, 423, 12, 4, 2, 2, 423, 424,
	5, 50, 26, 2, 424, 425, 8, 24, 1, 2, 425, 427, 3, 2, 2, 2, 426, 422, 3,
	2, 2, 2, 427, 430, 3, 2, 2, 2, 428, 426, 3, 2, 2, 2, 428, 429, 3, 2, 2,
	2, 429, 47, 3, 2, 2, 2, 430, 428, 3, 2, 2, 2, 431, 432, 8, 25, 1, 2, 432,
	433, 5, 52, 27, 2, 433, 434, 8, 25, 1, 2, 434, 441, 3, 2, 2, 2, 435, 436,
	12, 4, 2, 2, 436, 437, 5, 52, 27, 2, 437, 438, 8, 25, 1, 2, 438, 440, 3,
	2, 2, 2, 439, 435, 3, 2, 2, 2, 440, 443, 3, 2, 2, 2, 441, 439, 3, 2, 2,
	2, 441, 442, 3, 2, 2, 2, 442, 49, 3, 2, 2, 2, 443, 441, 3, 2, 2, 2, 444,
	445, 7, 9, 2, 2, 445, 446, 7, 8, 2, 2, 446, 447, 5, 16, 9, 2, 447, 448,
	5, 4, 3, 2, 448, 449, 8, 26, 1, 2, 449, 51, 3, 2, 2, 2, 450, 451, 7, 9,
	2, 2, 451, 452, 7, 8, 2, 2, 452, 453, 5, 16, 9, 2, 453, 454, 7, 27, 2,
	2, 454, 455, 5, 6, 4, 2, 455, 456, 5, 16, 9, 2, 456, 457, 7, 28, 2, 2,
	457, 458, 8, 27, 1, 2, 458, 53, 3, 2, 2, 2, 459, 460, 7, 10, 2, 2, 460,
	461, 5, 16, 9, 2, 461, 462, 7, 27, 2, 2, 462, 463, 5, 56, 29, 2, 463, 464,
	7, 17, 2, 2, 464, 465, 7, 30, 2, 2, 465, 466, 5, 4, 3, 2, 466, 467, 7,
	28, 2, 2, 467, 468, 8, 28, 1, 2, 468, 477, 3, 2, 2, 2, 469, 470, 7, 10,
	2, 2, 470, 471, 5, 16, 9, 2, 471, 472, 7, 27, 2, 2, 472, 473, 5, 56, 29,
	2, 473, 474, 7, 28, 2, 2, 474, 475, 8, 28, 1, 2, 475, 477, 3, 2, 2, 2,
	476, 459, 3, 2, 2, 2, 476, 469, 3, 2, 2, 2, 477, 55, 3, 2, 2, 2, 478, 479,
	8, 29, 1, 2, 479, 480, 5, 58, 30, 2, 480, 481, 8, 29, 1, 2, 481, 488, 3,
	2, 2, 2, 482, 483, 12, 4, 2, 2, 483, 484, 5, 58, 30, 2, 484, 485, 8, 29,
	1, 2, 485, 487, 3, 2, 2, 2, 486, 482, 3, 2, 2, 2, 487, 490, 3, 2, 2, 2,
	488, 486, 3, 2, 2, 2, 488, 489, 3, 2, 2, 2, 489, 57, 3, 2, 2, 2, 490, 488,
	3, 2, 2, 2, 491, 492, 5, 16, 9, 2, 492, 493, 7, 30, 2, 2, 493, 494, 5,
	4, 3, 2, 494, 495, 8, 30, 1, 2, 495, 59, 3, 2, 2, 2, 23, 71, 105, 137,
	155, 171, 188, 190, 199, 205, 223, 237, 262, 274, 296, 338, 370, 416, 428,
	441, 476, 488,
}
var literalNames = []string{
	"", "'let'", "'mut'", "'println!'", "'fn'", "'return'", "'if'", "'else'",
	"'match'", "'i64'", "'f64'", "'bool'", "'char'", "'&str'", "'String'",
	"'_'", "'false'", "'true'", "", "", "", "", "", "'('", "')'", "'{'", "'}'",
	"'->'", "'=>'", "'.'", "':'", "';'", "','", "'*'", "'/'", "'%'", "'+'",
	"'-'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'='", "'!'", "'&&'",
	"'||'",
}
var symbolicNames = []string{
	"", "LET", "MUT", "PRINTLN", "FN", "RETURN", "IF", "ELSE", "MATCH", "I64",
	"F64", "BOOL", "CHARTYPE", "STR", "STRCLASS", "UNDERSCORE", "BFALSE", "BTRUE",
	"NUMBER", "FLOAT", "STRING", "CHAR", "ID", "OPENPAR", "CLOSEPAR", "OPENBRACKET",
	"CLOSEBRACKET", "ARROW", "DBLARROW", "DOT", "COLOM", "SEMI", "COMMA", "MUL",
	"DIV", "MOD", "ADD", "SUB", "LESSOREQUALS", "MINOR", "MOREOREQUALS", "MAJOR",
	"EQUALSEQUALS", "NOTEQUALS", "EQUALS", "NOT", "AND", "OR", "WHITESPACE",
}

var ruleNames = []string{
	"start", "instructionsBlock", "instructions", "instruction", "declaration",
	"assignment", "expList", "expression", "expOpAlgb1", "expOpAlgb2", "expOpRel1",
	"valueType", "value", "functionCall", "methods", "printlnCall", "paramList",
	"param", "function", "returnValue", "conditions", "ternaryConditions",
	"conditionList", "ternConditionList", "elseIf", "ternElseIf", "matchExp",
	"matchCaseList", "matchCase",
}

type DBRustParser struct {
	*antlr.BaseParser
}

// NewDBRustParser produces a new parser instance for the optional input antlr.TokenStream.
//
// The *DBRustParser instance produced may be reused by calling the SetInputStream method.
// The initial parser configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewDBRustParser(input antlr.TokenStream) *DBRustParser {
	this := new(DBRustParser)
	deserializer := antlr.NewATNDeserializer(nil)
	deserializedATN := deserializer.DeserializeFromUInt16(parserATN)
	decisionToDFA := make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "DBRust.g4"

	return this
}

// DBRustParser tokens.
const (
	DBRustParserEOF          = antlr.TokenEOF
	DBRustParserLET          = 1
	DBRustParserMUT          = 2
	DBRustParserPRINTLN      = 3
	DBRustParserFN           = 4
	DBRustParserRETURN       = 5
	DBRustParserIF           = 6
	DBRustParserELSE         = 7
	DBRustParserMATCH        = 8
	DBRustParserI64          = 9
	DBRustParserF64          = 10
	DBRustParserBOOL         = 11
	DBRustParserCHARTYPE     = 12
	DBRustParserSTR          = 13
	DBRustParserSTRCLASS     = 14
	DBRustParserUNDERSCORE   = 15
	DBRustParserBFALSE       = 16
	DBRustParserBTRUE        = 17
	DBRustParserNUMBER       = 18
	DBRustParserFLOAT        = 19
	DBRustParserSTRING       = 20
	DBRustParserCHAR         = 21
	DBRustParserID           = 22
	DBRustParserOPENPAR      = 23
	DBRustParserCLOSEPAR     = 24
	DBRustParserOPENBRACKET  = 25
	DBRustParserCLOSEBRACKET = 26
	DBRustParserARROW        = 27
	DBRustParserDBLARROW     = 28
	DBRustParserDOT          = 29
	DBRustParserCOLOM        = 30
	DBRustParserSEMI         = 31
	DBRustParserCOMMA        = 32
	DBRustParserMUL          = 33
	DBRustParserDIV          = 34
	DBRustParserMOD          = 35
	DBRustParserADD          = 36
	DBRustParserSUB          = 37
	DBRustParserLESSOREQUALS = 38
	DBRustParserMINOR        = 39
	DBRustParserMOREOREQUALS = 40
	DBRustParserMAJOR        = 41
	DBRustParserEQUALSEQUALS = 42
	DBRustParserNOTEQUALS    = 43
	DBRustParserEQUALS       = 44
	DBRustParserNOT          = 45
	DBRustParserAND          = 46
	DBRustParserOR           = 47
	DBRustParserWHITESPACE   = 48
)

// DBRustParser rules.
const (
	DBRustParserRULE_start             = 0
	DBRustParserRULE_instructionsBlock = 1
	DBRustParserRULE_instructions      = 2
	DBRustParserRULE_instruction       = 3
	DBRustParserRULE_declaration       = 4
	DBRustParserRULE_assignment        = 5
	DBRustParserRULE_expList           = 6
	DBRustParserRULE_expression        = 7
	DBRustParserRULE_expOpAlgb1        = 8
	DBRustParserRULE_expOpAlgb2        = 9
	DBRustParserRULE_expOpRel1         = 10
	DBRustParserRULE_valueType         = 11
	DBRustParserRULE_value             = 12
	DBRustParserRULE_functionCall      = 13
	DBRustParserRULE_methods           = 14
	DBRustParserRULE_printlnCall       = 15
	DBRustParserRULE_paramList         = 16
	DBRustParserRULE_param             = 17
	DBRustParserRULE_function          = 18
	DBRustParserRULE_returnValue       = 19
	DBRustParserRULE_conditions        = 20
	DBRustParserRULE_ternaryConditions = 21
	DBRustParserRULE_conditionList     = 22
	DBRustParserRULE_ternConditionList = 23
	DBRustParserRULE_elseIf            = 24
	DBRustParserRULE_ternElseIf        = 25
	DBRustParserRULE_matchExp          = 26
	DBRustParserRULE_matchCaseList     = 27
	DBRustParserRULE_matchCase         = 28
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instructions returns the _instructions rule contexts.
	Get_instructions() IInstructionsContext

	// Set_instructions sets the _instructions rule contexts.
	Set_instructions(IInstructionsContext)

	// GetList returns the list attribute.
	GetList() *arrayList.List

	// SetList sets the list attribute.
	SetList(*arrayList.List)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	list          *arrayList.List
	_instructions IInstructionsContext
}

func NewEmptyStartContext() *StartContext {
	var p = new(StartContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_start
	return p
}

func (*StartContext) IsStartContext() {}

func NewStartContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StartContext {
	var p = new(StartContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_start

	return p
}

func (s *StartContext) GetParser() antlr.Parser { return s.parser }

func (s *StartContext) Get_instructions() IInstructionsContext { return s._instructions }

func (s *StartContext) Set_instructions(v IInstructionsContext) { s._instructions = v }

func (s *StartContext) GetList() *arrayList.List { return s.list }

func (s *StartContext) SetList(v *arrayList.List) { s.list = v }

func (s *StartContext) Instructions() IInstructionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsContext)
}

func (s *StartContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StartContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StartContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterStart(s)
	}
}

func (s *StartContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitStart(s)
	}
}

func (p *DBRustParser) Start() (localctx IStartContext) {
	localctx = NewStartContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, DBRustParserRULE_start)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(58)

		var _x = p.Instructions()

		localctx.(*StartContext)._instructions = _x
	}
	localctx.(*StartContext).list = localctx.(*StartContext).Get_instructions().GetL()

	return localctx
}

// IInstructionsBlockContext is an interface to support dynamic dispatch.
type IInstructionsBlockContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instructions returns the _instructions rule contexts.
	Get_instructions() IInstructionsContext

	// Set_instructions sets the _instructions rule contexts.
	Set_instructions(IInstructionsContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsInstructionsBlockContext differentiates from other interfaces.
	IsInstructionsBlockContext()
}

type InstructionsBlockContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	l             *arrayList.List
	_instructions IInstructionsContext
}

func NewEmptyInstructionsBlockContext() *InstructionsBlockContext {
	var p = new(InstructionsBlockContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_instructionsBlock
	return p
}

func (*InstructionsBlockContext) IsInstructionsBlockContext() {}

func NewInstructionsBlockContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionsBlockContext {
	var p = new(InstructionsBlockContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_instructionsBlock

	return p
}

func (s *InstructionsBlockContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionsBlockContext) Get_instructions() IInstructionsContext { return s._instructions }

func (s *InstructionsBlockContext) Set_instructions(v IInstructionsContext) { s._instructions = v }

func (s *InstructionsBlockContext) GetL() *arrayList.List { return s.l }

func (s *InstructionsBlockContext) SetL(v *arrayList.List) { s.l = v }

func (s *InstructionsBlockContext) OPENBRACKET() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENBRACKET, 0)
}

func (s *InstructionsBlockContext) Instructions() IInstructionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsContext)
}

func (s *InstructionsBlockContext) CLOSEBRACKET() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEBRACKET, 0)
}

func (s *InstructionsBlockContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionsBlockContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionsBlockContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterInstructionsBlock(s)
	}
}

func (s *InstructionsBlockContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitInstructionsBlock(s)
	}
}

func (p *DBRustParser) InstructionsBlock() (localctx IInstructionsBlockContext) {
	localctx = NewInstructionsBlockContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, DBRustParserRULE_instructionsBlock)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(61)
		p.Match(DBRustParserOPENBRACKET)
	}
	{
		p.SetState(62)

		var _x = p.Instructions()

		localctx.(*InstructionsBlockContext)._instructions = _x
	}
	{
		p.SetState(63)
		p.Match(DBRustParserCLOSEBRACKET)
	}

	localctx.(*InstructionsBlockContext).l = localctx.(*InstructionsBlockContext).Get_instructions().GetL()

	return localctx
}

// IInstructionsContext is an interface to support dynamic dispatch.
type IInstructionsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruction returns the _instruction rule contexts.
	Get_instruction() IInstructionContext

	// Set_instruction sets the _instruction rule contexts.
	Set_instruction(IInstructionContext)

	// GetE returns the e rule context list.
	GetE() []IInstructionContext

	// SetE sets the e rule context list.
	SetE([]IInstructionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsInstructionsContext differentiates from other interfaces.
	IsInstructionsContext()
}

type InstructionsContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	l            *arrayList.List
	_instruction IInstructionContext
	e            []IInstructionContext
}

func NewEmptyInstructionsContext() *InstructionsContext {
	var p = new(InstructionsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_instructions
	return p
}

func (*InstructionsContext) IsInstructionsContext() {}

func NewInstructionsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionsContext {
	var p = new(InstructionsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_instructions

	return p
}

func (s *InstructionsContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionsContext) Get_instruction() IInstructionContext { return s._instruction }

func (s *InstructionsContext) Set_instruction(v IInstructionContext) { s._instruction = v }

func (s *InstructionsContext) GetE() []IInstructionContext { return s.e }

func (s *InstructionsContext) SetE(v []IInstructionContext) { s.e = v }

func (s *InstructionsContext) GetL() *arrayList.List { return s.l }

func (s *InstructionsContext) SetL(v *arrayList.List) { s.l = v }

func (s *InstructionsContext) AllInstruction() []IInstructionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstructionContext)(nil)).Elem())
	var tst = make([]IInstructionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstructionContext)
		}
	}

	return tst
}

func (s *InstructionsContext) Instruction(i int) IInstructionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstructionContext)
}

func (s *InstructionsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterInstructions(s)
	}
}

func (s *InstructionsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitInstructions(s)
	}
}

func (p *DBRustParser) Instructions() (localctx IInstructionsContext) {
	localctx = NewInstructionsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, DBRustParserRULE_instructions)

	localctx.(*InstructionsContext).l = arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(69)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			{
				p.SetState(66)

				var _x = p.Instruction()

				localctx.(*InstructionsContext)._instruction = _x
			}
			localctx.(*InstructionsContext).e = append(localctx.(*InstructionsContext).e, localctx.(*InstructionsContext)._instruction)

		}
		p.SetState(71)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext())
	}

	listInt := localctx.(*InstructionsContext).GetE()
	for _, e := range listInt {
		localctx.(*InstructionsContext).l.Add(e.GetState())
	}

	return localctx
}

// IInstructionContext is an interface to support dynamic dispatch.
type IInstructionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetDecltn returns the decltn rule contexts.
	GetDecltn() IDeclarationContext

	// GetCalls returns the calls rule contexts.
	GetCalls() IFunctionCallContext

	// GetAssign returns the assign rule contexts.
	GetAssign() IAssignmentContext

	// GetMth returns the mth rule contexts.
	GetMth() IMethodsContext

	// GetFn returns the fn rule contexts.
	GetFn() IFunctionContext

	// GetRtn returns the rtn rule contexts.
	GetRtn() IReturnValueContext

	// GetCdtn returns the cdtn rule contexts.
	GetCdtn() IConditionsContext

	// GetMtch returns the mtch rule contexts.
	GetMtch() IMatchExpContext

	// SetDecltn sets the decltn rule contexts.
	SetDecltn(IDeclarationContext)

	// SetCalls sets the calls rule contexts.
	SetCalls(IFunctionCallContext)

	// SetAssign sets the assign rule contexts.
	SetAssign(IAssignmentContext)

	// SetMth sets the mth rule contexts.
	SetMth(IMethodsContext)

	// SetFn sets the fn rule contexts.
	SetFn(IFunctionContext)

	// SetRtn sets the rtn rule contexts.
	SetRtn(IReturnValueContext)

	// SetCdtn sets the cdtn rule contexts.
	SetCdtn(IConditionsContext)

	// SetMtch sets the mtch rule contexts.
	SetMtch(IMatchExpContext)

	// GetState returns the state attribute.
	GetState() I.IInstruction

	// SetState sets the state attribute.
	SetState(I.IInstruction)

	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.IInstruction
	decltn IDeclarationContext
	calls  IFunctionCallContext
	assign IAssignmentContext
	mth    IMethodsContext
	fn     IFunctionContext
	rtn    IReturnValueContext
	cdtn   IConditionsContext
	mtch   IMatchExpContext
}

func NewEmptyInstructionContext() *InstructionContext {
	var p = new(InstructionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_instruction
	return p
}

func (*InstructionContext) IsInstructionContext() {}

func NewInstructionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionContext {
	var p = new(InstructionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_instruction

	return p
}

func (s *InstructionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionContext) GetDecltn() IDeclarationContext { return s.decltn }

func (s *InstructionContext) GetCalls() IFunctionCallContext { return s.calls }

func (s *InstructionContext) GetAssign() IAssignmentContext { return s.assign }

func (s *InstructionContext) GetMth() IMethodsContext { return s.mth }

func (s *InstructionContext) GetFn() IFunctionContext { return s.fn }

func (s *InstructionContext) GetRtn() IReturnValueContext { return s.rtn }

func (s *InstructionContext) GetCdtn() IConditionsContext { return s.cdtn }

func (s *InstructionContext) GetMtch() IMatchExpContext { return s.mtch }

func (s *InstructionContext) SetDecltn(v IDeclarationContext) { s.decltn = v }

func (s *InstructionContext) SetCalls(v IFunctionCallContext) { s.calls = v }

func (s *InstructionContext) SetAssign(v IAssignmentContext) { s.assign = v }

func (s *InstructionContext) SetMth(v IMethodsContext) { s.mth = v }

func (s *InstructionContext) SetFn(v IFunctionContext) { s.fn = v }

func (s *InstructionContext) SetRtn(v IReturnValueContext) { s.rtn = v }

func (s *InstructionContext) SetCdtn(v IConditionsContext) { s.cdtn = v }

func (s *InstructionContext) SetMtch(v IMatchExpContext) { s.mtch = v }

func (s *InstructionContext) GetState() I.IInstruction { return s.state }

func (s *InstructionContext) SetState(v I.IInstruction) { s.state = v }

func (s *InstructionContext) SEMI() antlr.TerminalNode {
	return s.GetToken(DBRustParserSEMI, 0)
}

func (s *InstructionContext) Declaration() IDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeclarationContext)
}

func (s *InstructionContext) FunctionCall() IFunctionCallContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionCallContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionCallContext)
}

func (s *InstructionContext) Assignment() IAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAssignmentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAssignmentContext)
}

func (s *InstructionContext) Methods() IMethodsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMethodsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMethodsContext)
}

func (s *InstructionContext) Function() IFunctionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionContext)
}

func (s *InstructionContext) ReturnValue() IReturnValueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IReturnValueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IReturnValueContext)
}

func (s *InstructionContext) Conditions() IConditionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConditionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IConditionsContext)
}

func (s *InstructionContext) MatchExp() IMatchExpContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatchExpContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatchExpContext)
}

func (s *InstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterInstruction(s)
	}
}

func (s *InstructionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitInstruction(s)
	}
}

func (p *DBRustParser) Instruction() (localctx IInstructionContext) {
	localctx = NewInstructionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, DBRustParserRULE_instruction)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(103)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(74)

			var _x = p.Declaration()

			localctx.(*InstructionContext).decltn = _x
		}
		{
			p.SetState(75)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetDecltn().GetState()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(78)

			var _x = p.FunctionCall()

			localctx.(*InstructionContext).calls = _x
		}
		{
			p.SetState(79)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetCalls().GetState()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(82)

			var _x = p.Assignment()

			localctx.(*InstructionContext).assign = _x
		}
		{
			p.SetState(83)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetAssign().GetState()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(86)

			var _x = p.Methods()

			localctx.(*InstructionContext).mth = _x
		}
		{
			p.SetState(87)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetMth().GetState()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(90)

			var _x = p.Function()

			localctx.(*InstructionContext).fn = _x
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetFn().GetState()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(93)

			var _x = p.ReturnValue()

			localctx.(*InstructionContext).rtn = _x
		}
		{
			p.SetState(94)
			p.Match(DBRustParserSEMI)
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetRtn().GetState()

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(97)

			var _x = p.Conditions()

			localctx.(*InstructionContext).cdtn = _x
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetCdtn().GetState()

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(100)

			var _x = p.MatchExp()

			localctx.(*InstructionContext).mtch = _x
		}
		localctx.(*InstructionContext).state = localctx.(*InstructionContext).GetMtch().GetState()

	}

	return localctx
}

// IDeclarationContext is an interface to support dynamic dispatch.
type IDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_valueType returns the _valueType rule contexts.
	Get_valueType() IValueTypeContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_valueType sets the _valueType rule contexts.
	Set_valueType(IValueTypeContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.Declaration

	// SetState sets the state attribute.
	SetState(I.Declaration)

	// IsDeclarationContext differentiates from other interfaces.
	IsDeclarationContext()
}

type DeclarationContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.Declaration
	_ID         antlr.Token
	_valueType  IValueTypeContext
	_expression IExpressionContext
}

func NewEmptyDeclarationContext() *DeclarationContext {
	var p = new(DeclarationContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_declaration
	return p
}

func (*DeclarationContext) IsDeclarationContext() {}

func NewDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclarationContext {
	var p = new(DeclarationContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_declaration

	return p
}

func (s *DeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclarationContext) Get_ID() antlr.Token { return s._ID }

func (s *DeclarationContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *DeclarationContext) Get_valueType() IValueTypeContext { return s._valueType }

func (s *DeclarationContext) Get_expression() IExpressionContext { return s._expression }

func (s *DeclarationContext) Set_valueType(v IValueTypeContext) { s._valueType = v }

func (s *DeclarationContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *DeclarationContext) GetState() I.Declaration { return s.state }

func (s *DeclarationContext) SetState(v I.Declaration) { s.state = v }

func (s *DeclarationContext) LET() antlr.TerminalNode {
	return s.GetToken(DBRustParserLET, 0)
}

func (s *DeclarationContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *DeclarationContext) COLOM() antlr.TerminalNode {
	return s.GetToken(DBRustParserCOLOM, 0)
}

func (s *DeclarationContext) ValueType() IValueTypeContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueTypeContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueTypeContext)
}

func (s *DeclarationContext) EQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserEQUALS, 0)
}

func (s *DeclarationContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *DeclarationContext) MUT() antlr.TerminalNode {
	return s.GetToken(DBRustParserMUT, 0)
}

func (s *DeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclarationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterDeclaration(s)
	}
}

func (s *DeclarationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitDeclaration(s)
	}
}

func (p *DBRustParser) Declaration() (localctx IDeclarationContext) {
	localctx = NewDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, DBRustParserRULE_declaration)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(135)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(105)
			p.Match(DBRustParserLET)
		}
		{
			p.SetState(106)

			var _m = p.Match(DBRustParserID)

			localctx.(*DeclarationContext)._ID = _m
		}
		{
			p.SetState(107)
			p.Match(DBRustParserCOLOM)
		}
		{
			p.SetState(108)

			var _x = p.ValueType()

			localctx.(*DeclarationContext)._valueType = _x
		}
		{
			p.SetState(109)
			p.Match(DBRustParserEQUALS)
		}
		{
			p.SetState(110)

			var _x = p.expression(0)

			localctx.(*DeclarationContext)._expression = _x
		}

		expPoint := localctx.(*DeclarationContext).Get_expression().GetState()
		localctx.(*DeclarationContext).state = I.Declaration{
			Instruction: I.Instruction{"Declaration"},
			Mut:         false,
			Type:        localctx.(*DeclarationContext).Get_valueType().GetState(),
			Id: (func() string {
				if localctx.(*DeclarationContext).Get_ID() == nil {
					return ""
				} else {
					return localctx.(*DeclarationContext).Get_ID().GetText()
				}
			}()),
			Expression: &expPoint,
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(113)
			p.Match(DBRustParserLET)
		}
		{
			p.SetState(114)
			p.Match(DBRustParserMUT)
		}
		{
			p.SetState(115)

			var _m = p.Match(DBRustParserID)

			localctx.(*DeclarationContext)._ID = _m
		}
		{
			p.SetState(116)
			p.Match(DBRustParserCOLOM)
		}
		{
			p.SetState(117)

			var _x = p.ValueType()

			localctx.(*DeclarationContext)._valueType = _x
		}
		{
			p.SetState(118)
			p.Match(DBRustParserEQUALS)
		}
		{
			p.SetState(119)

			var _x = p.expression(0)

			localctx.(*DeclarationContext)._expression = _x
		}

		expPoint := localctx.(*DeclarationContext).Get_expression().GetState()
		localctx.(*DeclarationContext).state = I.Declaration{
			Instruction: I.Instruction{"Declaration"},
			Mut:         true,
			Type:        localctx.(*DeclarationContext).Get_valueType().GetState(),
			Id: (func() string {
				if localctx.(*DeclarationContext).Get_ID() == nil {
					return ""
				} else {
					return localctx.(*DeclarationContext).Get_ID().GetText()
				}
			}()),
			Expression: &expPoint,
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(122)
			p.Match(DBRustParserLET)
		}
		{
			p.SetState(123)
			p.Match(DBRustParserMUT)
		}
		{
			p.SetState(124)

			var _m = p.Match(DBRustParserID)

			localctx.(*DeclarationContext)._ID = _m
		}
		{
			p.SetState(125)
			p.Match(DBRustParserEQUALS)
		}
		{
			p.SetState(126)

			var _x = p.expression(0)

			localctx.(*DeclarationContext)._expression = _x
		}

		expPoint := localctx.(*DeclarationContext).Get_expression().GetState()
		localctx.(*DeclarationContext).state = I.Declaration{
			Instruction: I.Instruction{"Declaration"},
			Mut:         true,
			Type:        I.UNDEF,
			Id: (func() string {
				if localctx.(*DeclarationContext).Get_ID() == nil {
					return ""
				} else {
					return localctx.(*DeclarationContext).Get_ID().GetText()
				}
			}()),
			Expression: &expPoint,
		}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(129)
			p.Match(DBRustParserLET)
		}
		{
			p.SetState(130)

			var _m = p.Match(DBRustParserID)

			localctx.(*DeclarationContext)._ID = _m
		}
		{
			p.SetState(131)
			p.Match(DBRustParserEQUALS)
		}
		{
			p.SetState(132)

			var _x = p.expression(0)

			localctx.(*DeclarationContext)._expression = _x
		}

		expPoint := localctx.(*DeclarationContext).Get_expression().GetState()
		localctx.(*DeclarationContext).state = I.Declaration{
			Instruction: I.Instruction{"Declaration"},
			Mut:         true,
			Type:        I.UNDEF,
			Id: (func() string {
				if localctx.(*DeclarationContext).Get_ID() == nil {
					return ""
				} else {
					return localctx.(*DeclarationContext).Get_ID().GetText()
				}
			}()),
			Expression: &expPoint,
		}

	}

	return localctx
}

// IAssignmentContext is an interface to support dynamic dispatch.
type IAssignmentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.Assignment

	// SetState sets the state attribute.
	SetState(I.Assignment)

	// IsAssignmentContext differentiates from other interfaces.
	IsAssignmentContext()
}

type AssignmentContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.Assignment
	_ID         antlr.Token
	_expression IExpressionContext
}

func NewEmptyAssignmentContext() *AssignmentContext {
	var p = new(AssignmentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_assignment
	return p
}

func (*AssignmentContext) IsAssignmentContext() {}

func NewAssignmentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AssignmentContext {
	var p = new(AssignmentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_assignment

	return p
}

func (s *AssignmentContext) GetParser() antlr.Parser { return s.parser }

func (s *AssignmentContext) Get_ID() antlr.Token { return s._ID }

func (s *AssignmentContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *AssignmentContext) Get_expression() IExpressionContext { return s._expression }

func (s *AssignmentContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *AssignmentContext) GetState() I.Assignment { return s.state }

func (s *AssignmentContext) SetState(v I.Assignment) { s.state = v }

func (s *AssignmentContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *AssignmentContext) EQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserEQUALS, 0)
}

func (s *AssignmentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AssignmentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AssignmentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AssignmentContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterAssignment(s)
	}
}

func (s *AssignmentContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitAssignment(s)
	}
}

func (p *DBRustParser) Assignment() (localctx IAssignmentContext) {
	localctx = NewAssignmentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, DBRustParserRULE_assignment)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(137)

		var _m = p.Match(DBRustParserID)

		localctx.(*AssignmentContext)._ID = _m
	}
	{
		p.SetState(138)
		p.Match(DBRustParserEQUALS)
	}
	{
		p.SetState(139)

		var _x = p.expression(0)

		localctx.(*AssignmentContext)._expression = _x
	}

	expPoint := localctx.(*AssignmentContext).Get_expression().GetState()
	localctx.(*AssignmentContext).state = I.Assignment{
		Instruction: I.Instruction{"Assignment"},
		Id: (func() string {
			if localctx.(*AssignmentContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*AssignmentContext).Get_ID().GetText()
			}
		}()),
		Expression: &expPoint,
	}

	return localctx
}

// IExpListContext is an interface to support dynamic dispatch.
type IExpListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IExpListContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetList sets the list rule contexts.
	SetList(IExpListContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsExpListContext differentiates from other interfaces.
	IsExpListContext()
}

type ExpListContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	l           *arrayList.List
	list        IExpListContext
	_expression IExpressionContext
}

func NewEmptyExpListContext() *ExpListContext {
	var p = new(ExpListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expList
	return p
}

func (*ExpListContext) IsExpListContext() {}

func NewExpListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpListContext {
	var p = new(ExpListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expList

	return p
}

func (s *ExpListContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpListContext) GetList() IExpListContext { return s.list }

func (s *ExpListContext) Get_expression() IExpressionContext { return s._expression }

func (s *ExpListContext) SetList(v IExpListContext) { s.list = v }

func (s *ExpListContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ExpListContext) GetL() *arrayList.List { return s.l }

func (s *ExpListContext) SetL(v *arrayList.List) { s.l = v }

func (s *ExpListContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpListContext) COMMA() antlr.TerminalNode {
	return s.GetToken(DBRustParserCOMMA, 0)
}

func (s *ExpListContext) ExpList() IExpListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpListContext)
}

func (s *ExpListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpList(s)
	}
}

func (s *ExpListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpList(s)
	}
}

func (p *DBRustParser) ExpList() (localctx IExpListContext) {
	return p.expList(0)
}

func (p *DBRustParser) expList(_p int) (localctx IExpListContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpListContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpListContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 12
	p.EnterRecursionRule(localctx, 12, DBRustParserRULE_expList, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(143)

		var _x = p.expression(0)

		localctx.(*ExpListContext)._expression = _x
	}

	localctx.(*ExpListContext).l = arrayList.New()
	localctx.(*ExpListContext).l.Add(localctx.(*ExpListContext).Get_expression().GetState())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(153)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewExpListContext(p, _parentctx, _parentState)
			localctx.(*ExpListContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_expList)
			p.SetState(146)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(147)
				p.Match(DBRustParserCOMMA)
			}
			{
				p.SetState(148)

				var _x = p.expression(0)

				localctx.(*ExpListContext)._expression = _x
			}

			localctx.(*ExpListContext).GetList().GetL().Add(localctx.(*ExpListContext).Get_expression().GetState())
			localctx.(*ExpListContext).l = localctx.(*ExpListContext).GetList().GetL()

		}
		p.SetState(155)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetLeftExp returns the leftExp rule contexts.
	GetLeftExp() IExpressionContext

	// GetExp returns the exp rule contexts.
	GetExp() IExpressionContext

	// Get_value returns the _value rule contexts.
	Get_value() IValueContext

	// Get_expOpAlgb1 returns the _expOpAlgb1 rule contexts.
	Get_expOpAlgb1() IExpOpAlgb1Context

	// GetRightExp returns the rightExp rule contexts.
	GetRightExp() IExpressionContext

	// Get_expOpAlgb2 returns the _expOpAlgb2 rule contexts.
	Get_expOpAlgb2() IExpOpAlgb2Context

	// Get_expOpRel1 returns the _expOpRel1 rule contexts.
	Get_expOpRel1() IExpOpRel1Context

	// SetLeftExp sets the leftExp rule contexts.
	SetLeftExp(IExpressionContext)

	// SetExp sets the exp rule contexts.
	SetExp(IExpressionContext)

	// Set_value sets the _value rule contexts.
	Set_value(IValueContext)

	// Set_expOpAlgb1 sets the _expOpAlgb1 rule contexts.
	Set_expOpAlgb1(IExpOpAlgb1Context)

	// SetRightExp sets the rightExp rule contexts.
	SetRightExp(IExpressionContext)

	// Set_expOpAlgb2 sets the _expOpAlgb2 rule contexts.
	Set_expOpAlgb2(IExpOpAlgb2Context)

	// Set_expOpRel1 sets the _expOpRel1 rule contexts.
	Set_expOpRel1(IExpOpRel1Context)

	// GetState returns the state attribute.
	GetState() I.Expression

	// SetState sets the state attribute.
	SetState(I.Expression)

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.Expression
	leftExp     IExpressionContext
	exp         IExpressionContext
	_value      IValueContext
	_expOpAlgb1 IExpOpAlgb1Context
	rightExp    IExpressionContext
	_expOpAlgb2 IExpOpAlgb2Context
	_expOpRel1  IExpOpRel1Context
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) GetLeftExp() IExpressionContext { return s.leftExp }

func (s *ExpressionContext) GetExp() IExpressionContext { return s.exp }

func (s *ExpressionContext) Get_value() IValueContext { return s._value }

func (s *ExpressionContext) Get_expOpAlgb1() IExpOpAlgb1Context { return s._expOpAlgb1 }

func (s *ExpressionContext) GetRightExp() IExpressionContext { return s.rightExp }

func (s *ExpressionContext) Get_expOpAlgb2() IExpOpAlgb2Context { return s._expOpAlgb2 }

func (s *ExpressionContext) Get_expOpRel1() IExpOpRel1Context { return s._expOpRel1 }

func (s *ExpressionContext) SetLeftExp(v IExpressionContext) { s.leftExp = v }

func (s *ExpressionContext) SetExp(v IExpressionContext) { s.exp = v }

func (s *ExpressionContext) Set_value(v IValueContext) { s._value = v }

func (s *ExpressionContext) Set_expOpAlgb1(v IExpOpAlgb1Context) { s._expOpAlgb1 = v }

func (s *ExpressionContext) SetRightExp(v IExpressionContext) { s.rightExp = v }

func (s *ExpressionContext) Set_expOpAlgb2(v IExpOpAlgb2Context) { s._expOpAlgb2 = v }

func (s *ExpressionContext) Set_expOpRel1(v IExpOpRel1Context) { s._expOpRel1 = v }

func (s *ExpressionContext) GetState() I.Expression { return s.state }

func (s *ExpressionContext) SetState(v I.Expression) { s.state = v }

func (s *ExpressionContext) OPENPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENPAR, 0)
}

func (s *ExpressionContext) CLOSEPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEPAR, 0)
}

func (s *ExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpressionContext) NOT() antlr.TerminalNode {
	return s.GetToken(DBRustParserNOT, 0)
}

func (s *ExpressionContext) Value() IValueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueContext)
}

func (s *ExpressionContext) ExpOpAlgb1() IExpOpAlgb1Context {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpOpAlgb1Context)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpOpAlgb1Context)
}

func (s *ExpressionContext) ExpOpAlgb2() IExpOpAlgb2Context {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpOpAlgb2Context)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpOpAlgb2Context)
}

func (s *ExpressionContext) ExpOpRel1() IExpOpRel1Context {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpOpRel1Context)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpOpRel1Context)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (p *DBRustParser) Expression() (localctx IExpressionContext) {
	return p.expression(0)
}

func (p *DBRustParser) expression(_p int) (localctx IExpressionContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpressionContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 14
	p.EnterRecursionRule(localctx, 14, DBRustParserRULE_expression, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(169)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserOPENPAR:
		{
			p.SetState(157)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(158)

			var _x = p.expression(0)

			localctx.(*ExpressionContext).exp = _x
		}
		{
			p.SetState(159)
			p.Match(DBRustParserCLOSEPAR)
		}

		localctx.(*ExpressionContext).state = localctx.(*ExpressionContext).GetExp().GetState()

	case DBRustParserNOT:
		{
			p.SetState(162)
			p.Match(DBRustParserNOT)
		}
		{
			p.SetState(163)

			var _x = p.expression(2)

			localctx.(*ExpressionContext).exp = _x
		}

		exp := localctx.(*ExpressionContext).GetExp().GetState()
		localctx.(*ExpressionContext).state = I.Expression{
			Value:     nil,
			Left:      &exp,
			Right:     nil,
			Operation: I.UNOT,
		}

	case DBRustParserPRINTLN, DBRustParserIF, DBRustParserBFALSE, DBRustParserBTRUE, DBRustParserNUMBER, DBRustParserFLOAT, DBRustParserSTRING, DBRustParserCHAR, DBRustParserID:
		{
			p.SetState(166)

			var _x = p.Value()

			localctx.(*ExpressionContext)._value = _x
		}

		sym := localctx.(*ExpressionContext).Get_value().GetState()
		localctx.(*ExpressionContext).state = I.Expression{
			Value:     &sym,
			Left:      nil,
			Right:     nil,
			Operation: I.NOOP,
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(188)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(186)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 5, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpressionContext(p, _parentctx, _parentState)
				localctx.(*ExpressionContext).leftExp = _prevctx
				p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_expression)
				p.SetState(171)

				if !(p.Precpred(p.GetParserRuleContext(), 6)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 6)", ""))
				}
				{
					p.SetState(172)

					var _x = p.ExpOpAlgb1()

					localctx.(*ExpressionContext)._expOpAlgb1 = _x
				}
				{
					p.SetState(173)

					var _x = p.expression(7)

					localctx.(*ExpressionContext).rightExp = _x
				}

				left, right := localctx.(*ExpressionContext).GetLeftExp().GetState(), localctx.(*ExpressionContext).GetRightExp().GetState()
				localctx.(*ExpressionContext).state = I.Expression{
					Value:     nil,
					Left:      &left,
					Right:     &right,
					Operation: localctx.(*ExpressionContext).Get_expOpAlgb1().GetState(),
				}

			case 2:
				localctx = NewExpressionContext(p, _parentctx, _parentState)
				localctx.(*ExpressionContext).leftExp = _prevctx
				p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_expression)
				p.SetState(176)

				if !(p.Precpred(p.GetParserRuleContext(), 5)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 5)", ""))
				}
				{
					p.SetState(177)

					var _x = p.ExpOpAlgb2()

					localctx.(*ExpressionContext)._expOpAlgb2 = _x
				}
				{
					p.SetState(178)

					var _x = p.expression(6)

					localctx.(*ExpressionContext).rightExp = _x
				}

				left, right := localctx.(*ExpressionContext).GetLeftExp().GetState(), localctx.(*ExpressionContext).GetRightExp().GetState()
				localctx.(*ExpressionContext).state = I.Expression{
					Value:     nil,
					Left:      &left,
					Right:     &right,
					Operation: localctx.(*ExpressionContext).Get_expOpAlgb2().GetState(),
				}

			case 3:
				localctx = NewExpressionContext(p, _parentctx, _parentState)
				localctx.(*ExpressionContext).leftExp = _prevctx
				p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_expression)
				p.SetState(181)

				if !(p.Precpred(p.GetParserRuleContext(), 4)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 4)", ""))
				}
				{
					p.SetState(182)

					var _x = p.ExpOpRel1()

					localctx.(*ExpressionContext)._expOpRel1 = _x
				}
				{
					p.SetState(183)

					var _x = p.expression(5)

					localctx.(*ExpressionContext).rightExp = _x
				}

				left, right := localctx.(*ExpressionContext).GetLeftExp().GetState(), localctx.(*ExpressionContext).GetRightExp().GetState()
				localctx.(*ExpressionContext).state = I.Expression{
					Value:     nil,
					Left:      &left,
					Right:     &right,
					Operation: localctx.(*ExpressionContext).Get_expOpRel1().GetState(),
				}

			}

		}
		p.SetState(190)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext())
	}

	return localctx
}

// IExpOpAlgb1Context is an interface to support dynamic dispatch.
type IExpOpAlgb1Context interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetState returns the state attribute.
	GetState() I.Operation

	// SetState sets the state attribute.
	SetState(I.Operation)

	// IsExpOpAlgb1Context differentiates from other interfaces.
	IsExpOpAlgb1Context()
}

type ExpOpAlgb1Context struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.Operation
}

func NewEmptyExpOpAlgb1Context() *ExpOpAlgb1Context {
	var p = new(ExpOpAlgb1Context)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expOpAlgb1
	return p
}

func (*ExpOpAlgb1Context) IsExpOpAlgb1Context() {}

func NewExpOpAlgb1Context(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpOpAlgb1Context {
	var p = new(ExpOpAlgb1Context)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expOpAlgb1

	return p
}

func (s *ExpOpAlgb1Context) GetParser() antlr.Parser { return s.parser }

func (s *ExpOpAlgb1Context) GetState() I.Operation { return s.state }

func (s *ExpOpAlgb1Context) SetState(v I.Operation) { s.state = v }

func (s *ExpOpAlgb1Context) MUL() antlr.TerminalNode {
	return s.GetToken(DBRustParserMUL, 0)
}

func (s *ExpOpAlgb1Context) DIV() antlr.TerminalNode {
	return s.GetToken(DBRustParserDIV, 0)
}

func (s *ExpOpAlgb1Context) MOD() antlr.TerminalNode {
	return s.GetToken(DBRustParserMOD, 0)
}

func (s *ExpOpAlgb1Context) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpOpAlgb1Context) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpOpAlgb1Context) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpOpAlgb1(s)
	}
}

func (s *ExpOpAlgb1Context) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpOpAlgb1(s)
	}
}

func (p *DBRustParser) ExpOpAlgb1() (localctx IExpOpAlgb1Context) {
	localctx = NewExpOpAlgb1Context(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, DBRustParserRULE_expOpAlgb1)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(197)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserMUL:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(191)
			p.Match(DBRustParserMUL)
		}

		localctx.(*ExpOpAlgb1Context).state = I.MUL

	case DBRustParserDIV:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(193)
			p.Match(DBRustParserDIV)
		}

		localctx.(*ExpOpAlgb1Context).state = I.DIV

	case DBRustParserMOD:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(195)
			p.Match(DBRustParserMOD)
		}

		localctx.(*ExpOpAlgb1Context).state = I.MOD

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpOpAlgb2Context is an interface to support dynamic dispatch.
type IExpOpAlgb2Context interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetState returns the state attribute.
	GetState() I.Operation

	// SetState sets the state attribute.
	SetState(I.Operation)

	// IsExpOpAlgb2Context differentiates from other interfaces.
	IsExpOpAlgb2Context()
}

type ExpOpAlgb2Context struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.Operation
}

func NewEmptyExpOpAlgb2Context() *ExpOpAlgb2Context {
	var p = new(ExpOpAlgb2Context)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expOpAlgb2
	return p
}

func (*ExpOpAlgb2Context) IsExpOpAlgb2Context() {}

func NewExpOpAlgb2Context(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpOpAlgb2Context {
	var p = new(ExpOpAlgb2Context)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expOpAlgb2

	return p
}

func (s *ExpOpAlgb2Context) GetParser() antlr.Parser { return s.parser }

func (s *ExpOpAlgb2Context) GetState() I.Operation { return s.state }

func (s *ExpOpAlgb2Context) SetState(v I.Operation) { s.state = v }

func (s *ExpOpAlgb2Context) ADD() antlr.TerminalNode {
	return s.GetToken(DBRustParserADD, 0)
}

func (s *ExpOpAlgb2Context) SUB() antlr.TerminalNode {
	return s.GetToken(DBRustParserSUB, 0)
}

func (s *ExpOpAlgb2Context) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpOpAlgb2Context) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpOpAlgb2Context) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpOpAlgb2(s)
	}
}

func (s *ExpOpAlgb2Context) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpOpAlgb2(s)
	}
}

func (p *DBRustParser) ExpOpAlgb2() (localctx IExpOpAlgb2Context) {
	localctx = NewExpOpAlgb2Context(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, DBRustParserRULE_expOpAlgb2)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(203)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserADD:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(199)
			p.Match(DBRustParserADD)
		}

		localctx.(*ExpOpAlgb2Context).state = I.ADD

	case DBRustParserSUB:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(201)
			p.Match(DBRustParserSUB)
		}

		localctx.(*ExpOpAlgb2Context).state = I.SUB

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpOpRel1Context is an interface to support dynamic dispatch.
type IExpOpRel1Context interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetState returns the state attribute.
	GetState() I.Operation

	// SetState sets the state attribute.
	SetState(I.Operation)

	// IsExpOpRel1Context differentiates from other interfaces.
	IsExpOpRel1Context()
}

type ExpOpRel1Context struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.Operation
}

func NewEmptyExpOpRel1Context() *ExpOpRel1Context {
	var p = new(ExpOpRel1Context)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_expOpRel1
	return p
}

func (*ExpOpRel1Context) IsExpOpRel1Context() {}

func NewExpOpRel1Context(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpOpRel1Context {
	var p = new(ExpOpRel1Context)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_expOpRel1

	return p
}

func (s *ExpOpRel1Context) GetParser() antlr.Parser { return s.parser }

func (s *ExpOpRel1Context) GetState() I.Operation { return s.state }

func (s *ExpOpRel1Context) SetState(v I.Operation) { s.state = v }

func (s *ExpOpRel1Context) NOTEQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserNOTEQUALS, 0)
}

func (s *ExpOpRel1Context) MOREOREQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserMOREOREQUALS, 0)
}

func (s *ExpOpRel1Context) LESSOREQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserLESSOREQUALS, 0)
}

func (s *ExpOpRel1Context) EQUALSEQUALS() antlr.TerminalNode {
	return s.GetToken(DBRustParserEQUALSEQUALS, 0)
}

func (s *ExpOpRel1Context) MAJOR() antlr.TerminalNode {
	return s.GetToken(DBRustParserMAJOR, 0)
}

func (s *ExpOpRel1Context) MINOR() antlr.TerminalNode {
	return s.GetToken(DBRustParserMINOR, 0)
}

func (s *ExpOpRel1Context) AND() antlr.TerminalNode {
	return s.GetToken(DBRustParserAND, 0)
}

func (s *ExpOpRel1Context) OR() antlr.TerminalNode {
	return s.GetToken(DBRustParserOR, 0)
}

func (s *ExpOpRel1Context) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpOpRel1Context) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpOpRel1Context) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterExpOpRel1(s)
	}
}

func (s *ExpOpRel1Context) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitExpOpRel1(s)
	}
}

func (p *DBRustParser) ExpOpRel1() (localctx IExpOpRel1Context) {
	localctx = NewExpOpRel1Context(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, DBRustParserRULE_expOpRel1)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(221)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserNOTEQUALS:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(205)
			p.Match(DBRustParserNOTEQUALS)
		}

		localctx.(*ExpOpRel1Context).state = I.NOTEQUALS

	case DBRustParserMOREOREQUALS:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(207)
			p.Match(DBRustParserMOREOREQUALS)
		}

		localctx.(*ExpOpRel1Context).state = I.MOREOREQUALS

	case DBRustParserLESSOREQUALS:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(209)
			p.Match(DBRustParserLESSOREQUALS)
		}

		localctx.(*ExpOpRel1Context).state = I.LESSOREQUALS

	case DBRustParserEQUALSEQUALS:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(211)
			p.Match(DBRustParserEQUALSEQUALS)
		}

		localctx.(*ExpOpRel1Context).state = I.EQUALSEQUALS

	case DBRustParserMAJOR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(213)
			p.Match(DBRustParserMAJOR)
		}

		localctx.(*ExpOpRel1Context).state = I.MAJOR

	case DBRustParserMINOR:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(215)
			p.Match(DBRustParserMINOR)
		}

		localctx.(*ExpOpRel1Context).state = I.MINOR

	case DBRustParserAND:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(217)
			p.Match(DBRustParserAND)
		}

		localctx.(*ExpOpRel1Context).state = I.AND

	case DBRustParserOR:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(219)
			p.Match(DBRustParserOR)
		}

		localctx.(*ExpOpRel1Context).state = I.OR

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IValueTypeContext is an interface to support dynamic dispatch.
type IValueTypeContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetState returns the state attribute.
	GetState() I.ValueType

	// SetState sets the state attribute.
	SetState(I.ValueType)

	// IsValueTypeContext differentiates from other interfaces.
	IsValueTypeContext()
}

type ValueTypeContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	state  I.ValueType
}

func NewEmptyValueTypeContext() *ValueTypeContext {
	var p = new(ValueTypeContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_valueType
	return p
}

func (*ValueTypeContext) IsValueTypeContext() {}

func NewValueTypeContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ValueTypeContext {
	var p = new(ValueTypeContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_valueType

	return p
}

func (s *ValueTypeContext) GetParser() antlr.Parser { return s.parser }

func (s *ValueTypeContext) GetState() I.ValueType { return s.state }

func (s *ValueTypeContext) SetState(v I.ValueType) { s.state = v }

func (s *ValueTypeContext) I64() antlr.TerminalNode {
	return s.GetToken(DBRustParserI64, 0)
}

func (s *ValueTypeContext) F64() antlr.TerminalNode {
	return s.GetToken(DBRustParserF64, 0)
}

func (s *ValueTypeContext) BOOL() antlr.TerminalNode {
	return s.GetToken(DBRustParserBOOL, 0)
}

func (s *ValueTypeContext) CHARTYPE() antlr.TerminalNode {
	return s.GetToken(DBRustParserCHARTYPE, 0)
}

func (s *ValueTypeContext) STR() antlr.TerminalNode {
	return s.GetToken(DBRustParserSTR, 0)
}

func (s *ValueTypeContext) STRCLASS() antlr.TerminalNode {
	return s.GetToken(DBRustParserSTRCLASS, 0)
}

func (s *ValueTypeContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ValueTypeContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ValueTypeContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterValueType(s)
	}
}

func (s *ValueTypeContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitValueType(s)
	}
}

func (p *DBRustParser) ValueType() (localctx IValueTypeContext) {
	localctx = NewValueTypeContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, DBRustParserRULE_valueType)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(235)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case DBRustParserI64:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(223)
			p.Match(DBRustParserI64)
		}

		localctx.(*ValueTypeContext).state = I.INTEGER

	case DBRustParserF64:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(225)
			p.Match(DBRustParserF64)
		}

		localctx.(*ValueTypeContext).state = I.FLOAT

	case DBRustParserBOOL:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(227)
			p.Match(DBRustParserBOOL)
		}

		localctx.(*ValueTypeContext).state = I.BOOL

	case DBRustParserCHARTYPE:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(229)
			p.Match(DBRustParserCHARTYPE)
		}

		localctx.(*ValueTypeContext).state = I.CHAR

	case DBRustParserSTR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(231)
			p.Match(DBRustParserSTR)
		}

		localctx.(*ValueTypeContext).state = I.STR

	case DBRustParserSTRCLASS:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(233)
			p.Match(DBRustParserSTRCLASS)
		}

		localctx.(*ValueTypeContext).state = I.STRING

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IValueContext is an interface to support dynamic dispatch.
type IValueContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_FLOAT returns the _FLOAT token.
	Get_FLOAT() antlr.Token

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Get_CHAR returns the _CHAR token.
	Get_CHAR() antlr.Token

	// Get_BFALSE returns the _BFALSE token.
	Get_BFALSE() antlr.Token

	// Get_BTRUE returns the _BTRUE token.
	Get_BTRUE() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// Set_CHAR sets the _CHAR token.
	Set_CHAR(antlr.Token)

	// Set_BFALSE sets the _BFALSE token.
	Set_BFALSE(antlr.Token)

	// Set_BTRUE sets the _BTRUE token.
	Set_BTRUE(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_methods returns the _methods rule contexts.
	Get_methods() IMethodsContext

	// Get_functionCall returns the _functionCall rule contexts.
	Get_functionCall() IFunctionCallContext

	// Get_ternaryConditions returns the _ternaryConditions rule contexts.
	Get_ternaryConditions() ITernaryConditionsContext

	// Set_methods sets the _methods rule contexts.
	Set_methods(IMethodsContext)

	// Set_functionCall sets the _functionCall rule contexts.
	Set_functionCall(IFunctionCallContext)

	// Set_ternaryConditions sets the _ternaryConditions rule contexts.
	Set_ternaryConditions(ITernaryConditionsContext)

	// GetState returns the state attribute.
	GetState() I.IValue

	// SetState sets the state attribute.
	SetState(I.IValue)

	// IsValueContext differentiates from other interfaces.
	IsValueContext()
}

type ValueContext struct {
	*antlr.BaseParserRuleContext
	parser             antlr.Parser
	state              I.IValue
	_NUMBER            antlr.Token
	_FLOAT             antlr.Token
	_STRING            antlr.Token
	_CHAR              antlr.Token
	_BFALSE            antlr.Token
	_BTRUE             antlr.Token
	_ID                antlr.Token
	_methods           IMethodsContext
	_functionCall      IFunctionCallContext
	_ternaryConditions ITernaryConditionsContext
}

func NewEmptyValueContext() *ValueContext {
	var p = new(ValueContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_value
	return p
}

func (*ValueContext) IsValueContext() {}

func NewValueContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ValueContext {
	var p = new(ValueContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_value

	return p
}

func (s *ValueContext) GetParser() antlr.Parser { return s.parser }

func (s *ValueContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *ValueContext) Get_FLOAT() antlr.Token { return s._FLOAT }

func (s *ValueContext) Get_STRING() antlr.Token { return s._STRING }

func (s *ValueContext) Get_CHAR() antlr.Token { return s._CHAR }

func (s *ValueContext) Get_BFALSE() antlr.Token { return s._BFALSE }

func (s *ValueContext) Get_BTRUE() antlr.Token { return s._BTRUE }

func (s *ValueContext) Get_ID() antlr.Token { return s._ID }

func (s *ValueContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *ValueContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *ValueContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *ValueContext) Set_CHAR(v antlr.Token) { s._CHAR = v }

func (s *ValueContext) Set_BFALSE(v antlr.Token) { s._BFALSE = v }

func (s *ValueContext) Set_BTRUE(v antlr.Token) { s._BTRUE = v }

func (s *ValueContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ValueContext) Get_methods() IMethodsContext { return s._methods }

func (s *ValueContext) Get_functionCall() IFunctionCallContext { return s._functionCall }

func (s *ValueContext) Get_ternaryConditions() ITernaryConditionsContext { return s._ternaryConditions }

func (s *ValueContext) Set_methods(v IMethodsContext) { s._methods = v }

func (s *ValueContext) Set_functionCall(v IFunctionCallContext) { s._functionCall = v }

func (s *ValueContext) Set_ternaryConditions(v ITernaryConditionsContext) { s._ternaryConditions = v }

func (s *ValueContext) GetState() I.IValue { return s.state }

func (s *ValueContext) SetState(v I.IValue) { s.state = v }

func (s *ValueContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(DBRustParserNUMBER, 0)
}

func (s *ValueContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(DBRustParserFLOAT, 0)
}

func (s *ValueContext) STRING() antlr.TerminalNode {
	return s.GetToken(DBRustParserSTRING, 0)
}

func (s *ValueContext) CHAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCHAR, 0)
}

func (s *ValueContext) BFALSE() antlr.TerminalNode {
	return s.GetToken(DBRustParserBFALSE, 0)
}

func (s *ValueContext) BTRUE() antlr.TerminalNode {
	return s.GetToken(DBRustParserBTRUE, 0)
}

func (s *ValueContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *ValueContext) Methods() IMethodsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMethodsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMethodsContext)
}

func (s *ValueContext) FunctionCall() IFunctionCallContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionCallContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionCallContext)
}

func (s *ValueContext) TernaryConditions() ITernaryConditionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITernaryConditionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITernaryConditionsContext)
}

func (s *ValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ValueContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ValueContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterValue(s)
	}
}

func (s *ValueContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitValue(s)
	}
}

func (p *DBRustParser) Value() (localctx IValueContext) {
	localctx = NewValueContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, DBRustParserRULE_value)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(260)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 11, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(237)

			var _m = p.Match(DBRustParserNUMBER)

			localctx.(*ValueContext)._NUMBER = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"NUMBER", localctx.(*ValueContext).Get_NUMBER().GetLine(), localctx.(*ValueContext).Get_NUMBER().GetColumn()}, (func() string {
			if localctx.(*ValueContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_NUMBER().GetText()
			}
		}()), I.INTEGER}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(239)

			var _m = p.Match(DBRustParserFLOAT)

			localctx.(*ValueContext)._FLOAT = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"FLOAT", localctx.(*ValueContext).Get_FLOAT().GetLine(), localctx.(*ValueContext).Get_FLOAT().GetColumn()}, (func() string {
			if localctx.(*ValueContext).Get_FLOAT() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_FLOAT().GetText()
			}
		}()), I.FLOAT}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(241)

			var _m = p.Match(DBRustParserSTRING)

			localctx.(*ValueContext)._STRING = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"SRING", localctx.(*ValueContext).Get_STRING().GetLine(), localctx.(*ValueContext).Get_STRING().GetColumn()}, (func() string {
			if localctx.(*ValueContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*ValueContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_STRING().GetText()
			}
		}()))-1], I.STR}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(243)

			var _m = p.Match(DBRustParserCHAR)

			localctx.(*ValueContext)._CHAR = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"CHAR", localctx.(*ValueContext).Get_CHAR().GetLine(), localctx.(*ValueContext).Get_CHAR().GetColumn()}, (func() string {
			if localctx.(*ValueContext).Get_CHAR() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_CHAR().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*ValueContext).Get_CHAR() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_CHAR().GetText()
			}
		}()))-1], I.CHAR}

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(245)

			var _m = p.Match(DBRustParserBFALSE)

			localctx.(*ValueContext)._BFALSE = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"BFALSE", localctx.(*ValueContext).Get_BFALSE().GetLine(), localctx.(*ValueContext).Get_BFALSE().GetColumn()}, false, I.BOOL}

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(247)

			var _m = p.Match(DBRustParserBTRUE)

			localctx.(*ValueContext)._BTRUE = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"BTRUE", localctx.(*ValueContext).Get_BTRUE().GetLine(), localctx.(*ValueContext).Get_BTRUE().GetColumn()}, false, I.BOOL}

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(249)

			var _m = p.Match(DBRustParserID)

			localctx.(*ValueContext)._ID = _m
		}

		localctx.(*ValueContext).state = I.Value{I.Token{"ID", localctx.(*ValueContext).Get_ID().GetLine(), localctx.(*ValueContext).Get_ID().GetColumn()}, (func() string {
			if localctx.(*ValueContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*ValueContext).Get_ID().GetText()
			}
		}()), I.ID}

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(251)

			var _x = p.Methods()

			localctx.(*ValueContext)._methods = _x
		}

		localctx.(*ValueContext).SetState(localctx.(*ValueContext).Get_methods().GetState())

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(254)

			var _x = p.FunctionCall()

			localctx.(*ValueContext)._functionCall = _x
		}

		localctx.(*ValueContext).SetState(localctx.(*ValueContext).Get_functionCall().GetState())

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(257)

			var _x = p.TernaryConditions()

			localctx.(*ValueContext)._ternaryConditions = _x
		}

		localctx.(*ValueContext).SetState(localctx.(*ValueContext).Get_ternaryConditions().GetState())

	}

	return localctx
}

// IFunctionCallContext is an interface to support dynamic dispatch.
type IFunctionCallContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_expList returns the _expList rule contexts.
	Get_expList() IExpListContext

	// Set_expList sets the _expList rule contexts.
	Set_expList(IExpListContext)

	// GetState returns the state attribute.
	GetState() I.IFunctionCall

	// SetState sets the state attribute.
	SetState(I.IFunctionCall)

	// IsFunctionCallContext differentiates from other interfaces.
	IsFunctionCallContext()
}

type FunctionCallContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	state    I.IFunctionCall
	_ID      antlr.Token
	_expList IExpListContext
}

func NewEmptyFunctionCallContext() *FunctionCallContext {
	var p = new(FunctionCallContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_functionCall
	return p
}

func (*FunctionCallContext) IsFunctionCallContext() {}

func NewFunctionCallContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionCallContext {
	var p = new(FunctionCallContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_functionCall

	return p
}

func (s *FunctionCallContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionCallContext) Get_ID() antlr.Token { return s._ID }

func (s *FunctionCallContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FunctionCallContext) Get_expList() IExpListContext { return s._expList }

func (s *FunctionCallContext) Set_expList(v IExpListContext) { s._expList = v }

func (s *FunctionCallContext) GetState() I.IFunctionCall { return s.state }

func (s *FunctionCallContext) SetState(v I.IFunctionCall) { s.state = v }

func (s *FunctionCallContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *FunctionCallContext) OPENPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENPAR, 0)
}

func (s *FunctionCallContext) ExpList() IExpListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpListContext)
}

func (s *FunctionCallContext) CLOSEPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEPAR, 0)
}

func (s *FunctionCallContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionCallContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionCallContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterFunctionCall(s)
	}
}

func (s *FunctionCallContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitFunctionCall(s)
	}
}

func (p *DBRustParser) FunctionCall() (localctx IFunctionCallContext) {
	localctx = NewFunctionCallContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, DBRustParserRULE_functionCall)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(272)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(262)

			var _m = p.Match(DBRustParserID)

			localctx.(*FunctionCallContext)._ID = _m
		}
		{
			p.SetState(263)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(264)

			var _x = p.expList(0)

			localctx.(*FunctionCallContext)._expList = _x
		}
		{
			p.SetState(265)
			p.Match(DBRustParserCLOSEPAR)
		}

		localctx.(*FunctionCallContext).state = I.FunctionCall{I.Instruction{"FunctionCall"}, I.Value{I.Token{"FunctionCall", localctx.(*FunctionCallContext).Get_ID().GetLine(), localctx.(*FunctionCallContext).Get_ID().GetColumn()}, (func() string {
			if localctx.(*FunctionCallContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionCallContext).Get_ID().GetText()
			}
		}()), I.VOID}, (func() string {
			if localctx.(*FunctionCallContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionCallContext).Get_ID().GetText()
			}
		}()), localctx.(*FunctionCallContext).Get_expList().GetL().ToArray()}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(268)

			var _m = p.Match(DBRustParserID)

			localctx.(*FunctionCallContext)._ID = _m
		}
		{
			p.SetState(269)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(270)
			p.Match(DBRustParserCLOSEPAR)
		}

		localctx.(*FunctionCallContext).state = I.FunctionCall{I.Instruction{"FunctionCall"}, I.Value{I.Token{"FunctionCall", localctx.(*FunctionCallContext).Get_ID().GetLine(), localctx.(*FunctionCallContext).Get_ID().GetColumn()}, (func() string {
			if localctx.(*FunctionCallContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionCallContext).Get_ID().GetText()
			}
		}()), I.VOID}, (func() string {
			if localctx.(*FunctionCallContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionCallContext).Get_ID().GetText()
			}
		}()), make([]interface{}, 0)}

	}

	return localctx
}

// IMethodsContext is an interface to support dynamic dispatch.
type IMethodsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printlnCall returns the _printlnCall rule contexts.
	Get_printlnCall() IPrintlnCallContext

	// Set_printlnCall sets the _printlnCall rule contexts.
	Set_printlnCall(IPrintlnCallContext)

	// GetState returns the state attribute.
	GetState() I.IFunctionCall

	// SetState sets the state attribute.
	SetState(I.IFunctionCall)

	// IsMethodsContext differentiates from other interfaces.
	IsMethodsContext()
}

type MethodsContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	state        I.IFunctionCall
	_printlnCall IPrintlnCallContext
}

func NewEmptyMethodsContext() *MethodsContext {
	var p = new(MethodsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_methods
	return p
}

func (*MethodsContext) IsMethodsContext() {}

func NewMethodsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MethodsContext {
	var p = new(MethodsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_methods

	return p
}

func (s *MethodsContext) GetParser() antlr.Parser { return s.parser }

func (s *MethodsContext) Get_printlnCall() IPrintlnCallContext { return s._printlnCall }

func (s *MethodsContext) Set_printlnCall(v IPrintlnCallContext) { s._printlnCall = v }

func (s *MethodsContext) GetState() I.IFunctionCall { return s.state }

func (s *MethodsContext) SetState(v I.IFunctionCall) { s.state = v }

func (s *MethodsContext) PrintlnCall() IPrintlnCallContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrintlnCallContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrintlnCallContext)
}

func (s *MethodsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MethodsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MethodsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterMethods(s)
	}
}

func (s *MethodsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitMethods(s)
	}
}

func (p *DBRustParser) Methods() (localctx IMethodsContext) {
	localctx = NewMethodsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, DBRustParserRULE_methods)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(274)

		var _x = p.PrintlnCall()

		localctx.(*MethodsContext)._printlnCall = _x
	}
	localctx.(*MethodsContext).state = localctx.(*MethodsContext).Get_printlnCall().GetState()

	return localctx
}

// IPrintlnCallContext is an interface to support dynamic dispatch.
type IPrintlnCallContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PRINTLN returns the _PRINTLN token.
	Get_PRINTLN() antlr.Token

	// Set_PRINTLN sets the _PRINTLN token.
	Set_PRINTLN(antlr.Token)

	// Get_expList returns the _expList rule contexts.
	Get_expList() IExpListContext

	// Set_expList sets the _expList rule contexts.
	Set_expList(IExpListContext)

	// GetState returns the state attribute.
	GetState() I.PrintlnCall

	// SetState sets the state attribute.
	SetState(I.PrintlnCall)

	// IsPrintlnCallContext differentiates from other interfaces.
	IsPrintlnCallContext()
}

type PrintlnCallContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	state    I.PrintlnCall
	_PRINTLN antlr.Token
	_expList IExpListContext
}

func NewEmptyPrintlnCallContext() *PrintlnCallContext {
	var p = new(PrintlnCallContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_printlnCall
	return p
}

func (*PrintlnCallContext) IsPrintlnCallContext() {}

func NewPrintlnCallContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintlnCallContext {
	var p = new(PrintlnCallContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_printlnCall

	return p
}

func (s *PrintlnCallContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintlnCallContext) Get_PRINTLN() antlr.Token { return s._PRINTLN }

func (s *PrintlnCallContext) Set_PRINTLN(v antlr.Token) { s._PRINTLN = v }

func (s *PrintlnCallContext) Get_expList() IExpListContext { return s._expList }

func (s *PrintlnCallContext) Set_expList(v IExpListContext) { s._expList = v }

func (s *PrintlnCallContext) GetState() I.PrintlnCall { return s.state }

func (s *PrintlnCallContext) SetState(v I.PrintlnCall) { s.state = v }

func (s *PrintlnCallContext) PRINTLN() antlr.TerminalNode {
	return s.GetToken(DBRustParserPRINTLN, 0)
}

func (s *PrintlnCallContext) OPENPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENPAR, 0)
}

func (s *PrintlnCallContext) ExpList() IExpListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpListContext)
}

func (s *PrintlnCallContext) CLOSEPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEPAR, 0)
}

func (s *PrintlnCallContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintlnCallContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintlnCallContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterPrintlnCall(s)
	}
}

func (s *PrintlnCallContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitPrintlnCall(s)
	}
}

func (p *DBRustParser) PrintlnCall() (localctx IPrintlnCallContext) {
	localctx = NewPrintlnCallContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, DBRustParserRULE_printlnCall)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(277)

		var _m = p.Match(DBRustParserPRINTLN)

		localctx.(*PrintlnCallContext)._PRINTLN = _m
	}
	{
		p.SetState(278)
		p.Match(DBRustParserOPENPAR)
	}
	{
		p.SetState(279)

		var _x = p.expList(0)

		localctx.(*PrintlnCallContext)._expList = _x
	}
	{
		p.SetState(280)
		p.Match(DBRustParserCLOSEPAR)
	}

	localctx.(*PrintlnCallContext).state = I.PrintlnCall{I.FunctionCall{I.Instruction{"FunctionCall"}, I.Value{I.Token{"Println", localctx.(*PrintlnCallContext).Get_PRINTLN().GetLine(), localctx.(*PrintlnCallContext).Get_PRINTLN().GetColumn()}, "Println", I.VOID}, "Println", localctx.(*PrintlnCallContext).Get_expList().GetL().ToArray()}}

	return localctx
}

// IParamListContext is an interface to support dynamic dispatch.
type IParamListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IParamListContext

	// Get_param returns the _param rule contexts.
	Get_param() IParamContext

	// SetList sets the list rule contexts.
	SetList(IParamListContext)

	// Set_param sets the _param rule contexts.
	Set_param(IParamContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsParamListContext differentiates from other interfaces.
	IsParamListContext()
}

type ParamListContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	l      *arrayList.List
	list   IParamListContext
	_param IParamContext
}

func NewEmptyParamListContext() *ParamListContext {
	var p = new(ParamListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_paramList
	return p
}

func (*ParamListContext) IsParamListContext() {}

func NewParamListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ParamListContext {
	var p = new(ParamListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_paramList

	return p
}

func (s *ParamListContext) GetParser() antlr.Parser { return s.parser }

func (s *ParamListContext) GetList() IParamListContext { return s.list }

func (s *ParamListContext) Get_param() IParamContext { return s._param }

func (s *ParamListContext) SetList(v IParamListContext) { s.list = v }

func (s *ParamListContext) Set_param(v IParamContext) { s._param = v }

func (s *ParamListContext) GetL() *arrayList.List { return s.l }

func (s *ParamListContext) SetL(v *arrayList.List) { s.l = v }

func (s *ParamListContext) Param() IParamContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParamContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParamContext)
}

func (s *ParamListContext) COMMA() antlr.TerminalNode {
	return s.GetToken(DBRustParserCOMMA, 0)
}

func (s *ParamListContext) ParamList() IParamListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParamListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParamListContext)
}

func (s *ParamListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ParamListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ParamListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterParamList(s)
	}
}

func (s *ParamListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitParamList(s)
	}
}

func (p *DBRustParser) ParamList() (localctx IParamListContext) {
	return p.paramList(0)
}

func (p *DBRustParser) paramList(_p int) (localctx IParamListContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewParamListContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IParamListContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 32
	p.EnterRecursionRule(localctx, 32, DBRustParserRULE_paramList, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(284)

		var _x = p.Param()

		localctx.(*ParamListContext)._param = _x
	}

	localctx.(*ParamListContext).l = arrayList.New()
	localctx.(*ParamListContext).l.Add(localctx.(*ParamListContext).Get_param().GetState())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(294)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 13, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewParamListContext(p, _parentctx, _parentState)
			localctx.(*ParamListContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_paramList)
			p.SetState(287)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(288)
				p.Match(DBRustParserCOMMA)
			}
			{
				p.SetState(289)

				var _x = p.Param()

				localctx.(*ParamListContext)._param = _x
			}

			localctx.(*ParamListContext).GetList().GetL().Add(localctx.(*ParamListContext).Get_param().GetState())
			localctx.(*ParamListContext).l = localctx.(*ParamListContext).GetList().GetL()

		}
		p.SetState(296)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 13, p.GetParserRuleContext())
	}

	return localctx
}

// IParamContext is an interface to support dynamic dispatch.
type IParamContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_valueType returns the _valueType rule contexts.
	Get_valueType() IValueTypeContext

	// Set_valueType sets the _valueType rule contexts.
	Set_valueType(IValueTypeContext)

	// GetState returns the state attribute.
	GetState() I.FunctionParam

	// SetState sets the state attribute.
	SetState(I.FunctionParam)

	// IsParamContext differentiates from other interfaces.
	IsParamContext()
}

type ParamContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	state      I.FunctionParam
	_ID        antlr.Token
	_valueType IValueTypeContext
}

func NewEmptyParamContext() *ParamContext {
	var p = new(ParamContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_param
	return p
}

func (*ParamContext) IsParamContext() {}

func NewParamContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ParamContext {
	var p = new(ParamContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_param

	return p
}

func (s *ParamContext) GetParser() antlr.Parser { return s.parser }

func (s *ParamContext) Get_ID() antlr.Token { return s._ID }

func (s *ParamContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ParamContext) Get_valueType() IValueTypeContext { return s._valueType }

func (s *ParamContext) Set_valueType(v IValueTypeContext) { s._valueType = v }

func (s *ParamContext) GetState() I.FunctionParam { return s.state }

func (s *ParamContext) SetState(v I.FunctionParam) { s.state = v }

func (s *ParamContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *ParamContext) COLOM() antlr.TerminalNode {
	return s.GetToken(DBRustParserCOLOM, 0)
}

func (s *ParamContext) ValueType() IValueTypeContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueTypeContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueTypeContext)
}

func (s *ParamContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ParamContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ParamContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterParam(s)
	}
}

func (s *ParamContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitParam(s)
	}
}

func (p *DBRustParser) Param() (localctx IParamContext) {
	localctx = NewParamContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 34, DBRustParserRULE_param)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(297)

		var _m = p.Match(DBRustParserID)

		localctx.(*ParamContext)._ID = _m
	}
	{
		p.SetState(298)
		p.Match(DBRustParserCOLOM)
	}
	{
		p.SetState(299)

		var _x = p.ValueType()

		localctx.(*ParamContext)._valueType = _x
	}

	localctx.(*ParamContext).SetState(I.FunctionParam{(func() string {
		if localctx.(*ParamContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*ParamContext).Get_ID().GetText()
		}
	}()), localctx.(*ParamContext).Get_valueType().GetState()})

	return localctx
}

// IFunctionContext is an interface to support dynamic dispatch.
type IFunctionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_FN returns the _FN token.
	Get_FN() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_FN sets the _FN token.
	Set_FN(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_paramList returns the _paramList rule contexts.
	Get_paramList() IParamListContext

	// Get_instructionsBlock returns the _instructionsBlock rule contexts.
	Get_instructionsBlock() IInstructionsBlockContext

	// Get_valueType returns the _valueType rule contexts.
	Get_valueType() IValueTypeContext

	// Set_paramList sets the _paramList rule contexts.
	Set_paramList(IParamListContext)

	// Set_instructionsBlock sets the _instructionsBlock rule contexts.
	Set_instructionsBlock(IInstructionsBlockContext)

	// Set_valueType sets the _valueType rule contexts.
	Set_valueType(IValueTypeContext)

	// GetState returns the state attribute.
	GetState() I.Function

	// SetState sets the state attribute.
	SetState(I.Function)

	// IsFunctionContext differentiates from other interfaces.
	IsFunctionContext()
}

type FunctionContext struct {
	*antlr.BaseParserRuleContext
	parser             antlr.Parser
	state              I.Function
	_FN                antlr.Token
	_ID                antlr.Token
	_paramList         IParamListContext
	_instructionsBlock IInstructionsBlockContext
	_valueType         IValueTypeContext
}

func NewEmptyFunctionContext() *FunctionContext {
	var p = new(FunctionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_function
	return p
}

func (*FunctionContext) IsFunctionContext() {}

func NewFunctionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionContext {
	var p = new(FunctionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_function

	return p
}

func (s *FunctionContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionContext) Get_FN() antlr.Token { return s._FN }

func (s *FunctionContext) Get_ID() antlr.Token { return s._ID }

func (s *FunctionContext) Set_FN(v antlr.Token) { s._FN = v }

func (s *FunctionContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FunctionContext) Get_paramList() IParamListContext { return s._paramList }

func (s *FunctionContext) Get_instructionsBlock() IInstructionsBlockContext {
	return s._instructionsBlock
}

func (s *FunctionContext) Get_valueType() IValueTypeContext { return s._valueType }

func (s *FunctionContext) Set_paramList(v IParamListContext) { s._paramList = v }

func (s *FunctionContext) Set_instructionsBlock(v IInstructionsBlockContext) {
	s._instructionsBlock = v
}

func (s *FunctionContext) Set_valueType(v IValueTypeContext) { s._valueType = v }

func (s *FunctionContext) GetState() I.Function { return s.state }

func (s *FunctionContext) SetState(v I.Function) { s.state = v }

func (s *FunctionContext) FN() antlr.TerminalNode {
	return s.GetToken(DBRustParserFN, 0)
}

func (s *FunctionContext) ID() antlr.TerminalNode {
	return s.GetToken(DBRustParserID, 0)
}

func (s *FunctionContext) OPENPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENPAR, 0)
}

func (s *FunctionContext) ParamList() IParamListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParamListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParamListContext)
}

func (s *FunctionContext) CLOSEPAR() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEPAR, 0)
}

func (s *FunctionContext) InstructionsBlock() IInstructionsBlockContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsBlockContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsBlockContext)
}

func (s *FunctionContext) ARROW() antlr.TerminalNode {
	return s.GetToken(DBRustParserARROW, 0)
}

func (s *FunctionContext) ValueType() IValueTypeContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueTypeContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueTypeContext)
}

func (s *FunctionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterFunction(s)
	}
}

func (s *FunctionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitFunction(s)
	}
}

func (p *DBRustParser) Function() (localctx IFunctionContext) {
	localctx = NewFunctionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 36, DBRustParserRULE_function)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(336)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(302)

			var _m = p.Match(DBRustParserFN)

			localctx.(*FunctionContext)._FN = _m
		}
		{
			p.SetState(303)

			var _m = p.Match(DBRustParserID)

			localctx.(*FunctionContext)._ID = _m
		}
		{
			p.SetState(304)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(305)

			var _x = p.paramList(0)

			localctx.(*FunctionContext)._paramList = _x
		}
		{
			p.SetState(306)
			p.Match(DBRustParserCLOSEPAR)
		}
		{
			p.SetState(307)

			var _x = p.InstructionsBlock()

			localctx.(*FunctionContext)._instructionsBlock = _x
		}

		localctx.(*FunctionContext).SetState(I.Function{I.Instruction{"Function"}, I.Token{"Function", localctx.(*FunctionContext).Get_FN().GetLine(), localctx.(*FunctionContext).Get_FN().GetColumn()}, (func() string {
			if localctx.(*FunctionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionContext).Get_ID().GetText()
			}
		}()), localctx.(*FunctionContext).Get_paramList().GetL().ToArray(), localctx.(*FunctionContext).Get_instructionsBlock().GetL().ToArray(), I.VOID, nil})

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(310)

			var _m = p.Match(DBRustParserFN)

			localctx.(*FunctionContext)._FN = _m
		}
		{
			p.SetState(311)

			var _m = p.Match(DBRustParserID)

			localctx.(*FunctionContext)._ID = _m
		}
		{
			p.SetState(312)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(313)
			p.Match(DBRustParserCLOSEPAR)
		}
		{
			p.SetState(314)

			var _x = p.InstructionsBlock()

			localctx.(*FunctionContext)._instructionsBlock = _x
		}

		localctx.(*FunctionContext).SetState(I.Function{I.Instruction{"Function"}, I.Token{"Function", localctx.(*FunctionContext).Get_FN().GetLine(), localctx.(*FunctionContext).Get_FN().GetColumn()}, (func() string {
			if localctx.(*FunctionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionContext).Get_ID().GetText()
			}
		}()), make([]interface{}, 0), localctx.(*FunctionContext).Get_instructionsBlock().GetL().ToArray(), I.VOID, nil})

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(317)

			var _m = p.Match(DBRustParserFN)

			localctx.(*FunctionContext)._FN = _m
		}
		{
			p.SetState(318)

			var _m = p.Match(DBRustParserID)

			localctx.(*FunctionContext)._ID = _m
		}
		{
			p.SetState(319)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(320)

			var _x = p.paramList(0)

			localctx.(*FunctionContext)._paramList = _x
		}
		{
			p.SetState(321)
			p.Match(DBRustParserCLOSEPAR)
		}
		{
			p.SetState(322)
			p.Match(DBRustParserARROW)
		}
		{
			p.SetState(323)

			var _x = p.ValueType()

			localctx.(*FunctionContext)._valueType = _x
		}
		{
			p.SetState(324)

			var _x = p.InstructionsBlock()

			localctx.(*FunctionContext)._instructionsBlock = _x
		}

		localctx.(*FunctionContext).SetState(I.Function{I.Instruction{"Function"}, I.Token{"Function", localctx.(*FunctionContext).Get_FN().GetLine(), localctx.(*FunctionContext).Get_FN().GetColumn()}, (func() string {
			if localctx.(*FunctionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionContext).Get_ID().GetText()
			}
		}()), localctx.(*FunctionContext).Get_paramList().GetL().ToArray(), localctx.(*FunctionContext).Get_instructionsBlock().GetL().ToArray(), localctx.(*FunctionContext).Get_valueType().GetState(), nil})

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(327)

			var _m = p.Match(DBRustParserFN)

			localctx.(*FunctionContext)._FN = _m
		}
		{
			p.SetState(328)

			var _m = p.Match(DBRustParserID)

			localctx.(*FunctionContext)._ID = _m
		}
		{
			p.SetState(329)
			p.Match(DBRustParserOPENPAR)
		}
		{
			p.SetState(330)
			p.Match(DBRustParserCLOSEPAR)
		}
		{
			p.SetState(331)
			p.Match(DBRustParserARROW)
		}
		{
			p.SetState(332)

			var _x = p.ValueType()

			localctx.(*FunctionContext)._valueType = _x
		}
		{
			p.SetState(333)

			var _x = p.InstructionsBlock()

			localctx.(*FunctionContext)._instructionsBlock = _x
		}

		localctx.(*FunctionContext).SetState(I.Function{I.Instruction{"Function"}, I.Token{"Function", localctx.(*FunctionContext).Get_FN().GetLine(), localctx.(*FunctionContext).Get_FN().GetColumn()}, (func() string {
			if localctx.(*FunctionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FunctionContext).Get_ID().GetText()
			}
		}()), make([]interface{}, 0), localctx.(*FunctionContext).Get_instructionsBlock().GetL().ToArray(), localctx.(*FunctionContext).Get_valueType().GetState(), nil})

	}

	return localctx
}

// IReturnValueContext is an interface to support dynamic dispatch.
type IReturnValueContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_RETURN returns the _RETURN token.
	Get_RETURN() antlr.Token

	// Set_RETURN sets the _RETURN token.
	Set_RETURN(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.ReturnValue

	// SetState sets the state attribute.
	SetState(I.ReturnValue)

	// IsReturnValueContext differentiates from other interfaces.
	IsReturnValueContext()
}

type ReturnValueContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	state       I.ReturnValue
	_RETURN     antlr.Token
	_expression IExpressionContext
}

func NewEmptyReturnValueContext() *ReturnValueContext {
	var p = new(ReturnValueContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_returnValue
	return p
}

func (*ReturnValueContext) IsReturnValueContext() {}

func NewReturnValueContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ReturnValueContext {
	var p = new(ReturnValueContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_returnValue

	return p
}

func (s *ReturnValueContext) GetParser() antlr.Parser { return s.parser }

func (s *ReturnValueContext) Get_RETURN() antlr.Token { return s._RETURN }

func (s *ReturnValueContext) Set_RETURN(v antlr.Token) { s._RETURN = v }

func (s *ReturnValueContext) Get_expression() IExpressionContext { return s._expression }

func (s *ReturnValueContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ReturnValueContext) GetState() I.ReturnValue { return s.state }

func (s *ReturnValueContext) SetState(v I.ReturnValue) { s.state = v }

func (s *ReturnValueContext) RETURN() antlr.TerminalNode {
	return s.GetToken(DBRustParserRETURN, 0)
}

func (s *ReturnValueContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ReturnValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ReturnValueContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ReturnValueContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterReturnValue(s)
	}
}

func (s *ReturnValueContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitReturnValue(s)
	}
}

func (p *DBRustParser) ReturnValue() (localctx IReturnValueContext) {
	localctx = NewReturnValueContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 38, DBRustParserRULE_returnValue)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(338)

		var _m = p.Match(DBRustParserRETURN)

		localctx.(*ReturnValueContext)._RETURN = _m
	}
	{
		p.SetState(339)

		var _x = p.expression(0)

		localctx.(*ReturnValueContext)._expression = _x
	}

	localctx.(*ReturnValueContext).state = I.ReturnValue{I.Instruction{"Return"}, I.Token{"Return", localctx.(*ReturnValueContext).Get_RETURN().GetLine(), localctx.(*ReturnValueContext).Get_RETURN().GetColumn()}, localctx.(*ReturnValueContext).Get_expression().GetState()}

	return localctx
}

// IConditionsContext is an interface to support dynamic dispatch.
type IConditionsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetInsBody returns the insBody rule contexts.
	GetInsBody() IInstructionsBlockContext

	// Get_conditionList returns the _conditionList rule contexts.
	Get_conditionList() IConditionListContext

	// GetElseBody returns the elseBody rule contexts.
	GetElseBody() IInstructionsBlockContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetInsBody sets the insBody rule contexts.
	SetInsBody(IInstructionsBlockContext)

	// Set_conditionList sets the _conditionList rule contexts.
	Set_conditionList(IConditionListContext)

	// SetElseBody sets the elseBody rule contexts.
	SetElseBody(IInstructionsBlockContext)

	// GetState returns the state attribute.
	GetState() I.IfControl

	// SetState sets the state attribute.
	SetState(I.IfControl)

	// IsConditionsContext differentiates from other interfaces.
	IsConditionsContext()
}

type ConditionsContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	state          I.IfControl
	_IF            antlr.Token
	_expression    IExpressionContext
	insBody        IInstructionsBlockContext
	_conditionList IConditionListContext
	elseBody       IInstructionsBlockContext
}

func NewEmptyConditionsContext() *ConditionsContext {
	var p = new(ConditionsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_conditions
	return p
}

func (*ConditionsContext) IsConditionsContext() {}

func NewConditionsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ConditionsContext {
	var p = new(ConditionsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_conditions

	return p
}

func (s *ConditionsContext) GetParser() antlr.Parser { return s.parser }

func (s *ConditionsContext) Get_IF() antlr.Token { return s._IF }

func (s *ConditionsContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *ConditionsContext) Get_expression() IExpressionContext { return s._expression }

func (s *ConditionsContext) GetInsBody() IInstructionsBlockContext { return s.insBody }

func (s *ConditionsContext) Get_conditionList() IConditionListContext { return s._conditionList }

func (s *ConditionsContext) GetElseBody() IInstructionsBlockContext { return s.elseBody }

func (s *ConditionsContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ConditionsContext) SetInsBody(v IInstructionsBlockContext) { s.insBody = v }

func (s *ConditionsContext) Set_conditionList(v IConditionListContext) { s._conditionList = v }

func (s *ConditionsContext) SetElseBody(v IInstructionsBlockContext) { s.elseBody = v }

func (s *ConditionsContext) GetState() I.IfControl { return s.state }

func (s *ConditionsContext) SetState(v I.IfControl) { s.state = v }

func (s *ConditionsContext) IF() antlr.TerminalNode {
	return s.GetToken(DBRustParserIF, 0)
}

func (s *ConditionsContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ConditionsContext) AllInstructionsBlock() []IInstructionsBlockContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstructionsBlockContext)(nil)).Elem())
	var tst = make([]IInstructionsBlockContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstructionsBlockContext)
		}
	}

	return tst
}

func (s *ConditionsContext) InstructionsBlock(i int) IInstructionsBlockContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsBlockContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstructionsBlockContext)
}

func (s *ConditionsContext) ConditionList() IConditionListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConditionListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IConditionListContext)
}

func (s *ConditionsContext) ELSE() antlr.TerminalNode {
	return s.GetToken(DBRustParserELSE, 0)
}

func (s *ConditionsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConditionsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ConditionsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterConditions(s)
	}
}

func (s *ConditionsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitConditions(s)
	}
}

func (p *DBRustParser) Conditions() (localctx IConditionsContext) {
	localctx = NewConditionsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, DBRustParserRULE_conditions)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(368)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 15, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(342)

			var _m = p.Match(DBRustParserIF)

			localctx.(*ConditionsContext)._IF = _m
		}
		{
			p.SetState(343)

			var _x = p.expression(0)

			localctx.(*ConditionsContext)._expression = _x
		}
		{
			p.SetState(344)

			var _x = p.InstructionsBlock()

			localctx.(*ConditionsContext).insBody = _x
		}

		localctx.(*ConditionsContext).SetState(I.IfControl{I.Instruction{"Control"}, I.Value{I.Token{"IF", localctx.(*ConditionsContext).Get_IF().GetLine(), localctx.(*ConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*ConditionsContext).Get_expression().GetState(), localctx.(*ConditionsContext).GetInsBody().GetL().ToArray(), make([]interface{}, 0), make([]interface{}, 0)})

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(347)

			var _m = p.Match(DBRustParserIF)

			localctx.(*ConditionsContext)._IF = _m
		}
		{
			p.SetState(348)

			var _x = p.expression(0)

			localctx.(*ConditionsContext)._expression = _x
		}
		{
			p.SetState(349)

			var _x = p.InstructionsBlock()

			localctx.(*ConditionsContext).insBody = _x
		}
		{
			p.SetState(350)

			var _x = p.conditionList(0)

			localctx.(*ConditionsContext)._conditionList = _x
		}

		localctx.(*ConditionsContext).SetState(I.IfControl{I.Instruction{"Control"}, I.Value{I.Token{"IF", localctx.(*ConditionsContext).Get_IF().GetLine(), localctx.(*ConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*ConditionsContext).Get_expression().GetState(), localctx.(*ConditionsContext).GetInsBody().GetL().ToArray(), localctx.(*ConditionsContext).Get_conditionList().GetL().ToArray(), make([]interface{}, 0)})

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(353)

			var _m = p.Match(DBRustParserIF)

			localctx.(*ConditionsContext)._IF = _m
		}
		{
			p.SetState(354)

			var _x = p.expression(0)

			localctx.(*ConditionsContext)._expression = _x
		}
		{
			p.SetState(355)

			var _x = p.InstructionsBlock()

			localctx.(*ConditionsContext).insBody = _x
		}
		{
			p.SetState(356)
			p.Match(DBRustParserELSE)
		}
		{
			p.SetState(357)

			var _x = p.InstructionsBlock()

			localctx.(*ConditionsContext).elseBody = _x
		}

		localctx.(*ConditionsContext).SetState(I.IfControl{I.Instruction{"Control"}, I.Value{I.Token{"IF", localctx.(*ConditionsContext).Get_IF().GetLine(), localctx.(*ConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*ConditionsContext).Get_expression().GetState(), localctx.(*ConditionsContext).GetInsBody().GetL().ToArray(), make([]interface{}, 0), localctx.(*ConditionsContext).GetElseBody().GetL().ToArray()})

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(360)

			var _m = p.Match(DBRustParserIF)

			localctx.(*ConditionsContext)._IF = _m
		}
		{
			p.SetState(361)

			var _x = p.expression(0)

			localctx.(*ConditionsContext)._expression = _x
		}
		{
			p.SetState(362)

			var _x = p.InstructionsBlock()

			localctx.(*ConditionsContext).insBody = _x
		}
		{
			p.SetState(363)

			var _x = p.conditionList(0)

			localctx.(*ConditionsContext)._conditionList = _x
		}
		{
			p.SetState(364)
			p.Match(DBRustParserELSE)
		}
		{
			p.SetState(365)

			var _x = p.InstructionsBlock()

			localctx.(*ConditionsContext).elseBody = _x
		}

		localctx.(*ConditionsContext).SetState(I.IfControl{I.Instruction{"Control"}, I.Value{I.Token{"IF", localctx.(*ConditionsContext).Get_IF().GetLine(), localctx.(*ConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*ConditionsContext).Get_expression().GetState(), localctx.(*ConditionsContext).GetInsBody().GetL().ToArray(), localctx.(*ConditionsContext).Get_conditionList().GetL().ToArray(), localctx.(*ConditionsContext).GetElseBody().GetL().ToArray()})

	}

	return localctx
}

// ITernaryConditionsContext is an interface to support dynamic dispatch.
type ITernaryConditionsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// GetFirstExp returns the firstExp rule contexts.
	GetFirstExp() IExpressionContext

	// GetInsBody returns the insBody rule contexts.
	GetInsBody() IInstructionsContext

	// GetTernExp returns the ternExp rule contexts.
	GetTernExp() IExpressionContext

	// Get_ternConditionList returns the _ternConditionList rule contexts.
	Get_ternConditionList() ITernConditionListContext

	// GetElseBody returns the elseBody rule contexts.
	GetElseBody() IInstructionsContext

	// GetElseTernExp returns the elseTernExp rule contexts.
	GetElseTernExp() IExpressionContext

	// SetFirstExp sets the firstExp rule contexts.
	SetFirstExp(IExpressionContext)

	// SetInsBody sets the insBody rule contexts.
	SetInsBody(IInstructionsContext)

	// SetTernExp sets the ternExp rule contexts.
	SetTernExp(IExpressionContext)

	// Set_ternConditionList sets the _ternConditionList rule contexts.
	Set_ternConditionList(ITernConditionListContext)

	// SetElseBody sets the elseBody rule contexts.
	SetElseBody(IInstructionsContext)

	// SetElseTernExp sets the elseTernExp rule contexts.
	SetElseTernExp(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.IfTernaryControl

	// SetState sets the state attribute.
	SetState(I.IfTernaryControl)

	// IsTernaryConditionsContext differentiates from other interfaces.
	IsTernaryConditionsContext()
}

type TernaryConditionsContext struct {
	*antlr.BaseParserRuleContext
	parser             antlr.Parser
	state              I.IfTernaryControl
	_IF                antlr.Token
	firstExp           IExpressionContext
	insBody            IInstructionsContext
	ternExp            IExpressionContext
	_ternConditionList ITernConditionListContext
	elseBody           IInstructionsContext
	elseTernExp        IExpressionContext
}

func NewEmptyTernaryConditionsContext() *TernaryConditionsContext {
	var p = new(TernaryConditionsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_ternaryConditions
	return p
}

func (*TernaryConditionsContext) IsTernaryConditionsContext() {}

func NewTernaryConditionsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TernaryConditionsContext {
	var p = new(TernaryConditionsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_ternaryConditions

	return p
}

func (s *TernaryConditionsContext) GetParser() antlr.Parser { return s.parser }

func (s *TernaryConditionsContext) Get_IF() antlr.Token { return s._IF }

func (s *TernaryConditionsContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *TernaryConditionsContext) GetFirstExp() IExpressionContext { return s.firstExp }

func (s *TernaryConditionsContext) GetInsBody() IInstructionsContext { return s.insBody }

func (s *TernaryConditionsContext) GetTernExp() IExpressionContext { return s.ternExp }

func (s *TernaryConditionsContext) Get_ternConditionList() ITernConditionListContext {
	return s._ternConditionList
}

func (s *TernaryConditionsContext) GetElseBody() IInstructionsContext { return s.elseBody }

func (s *TernaryConditionsContext) GetElseTernExp() IExpressionContext { return s.elseTernExp }

func (s *TernaryConditionsContext) SetFirstExp(v IExpressionContext) { s.firstExp = v }

func (s *TernaryConditionsContext) SetInsBody(v IInstructionsContext) { s.insBody = v }

func (s *TernaryConditionsContext) SetTernExp(v IExpressionContext) { s.ternExp = v }

func (s *TernaryConditionsContext) Set_ternConditionList(v ITernConditionListContext) {
	s._ternConditionList = v
}

func (s *TernaryConditionsContext) SetElseBody(v IInstructionsContext) { s.elseBody = v }

func (s *TernaryConditionsContext) SetElseTernExp(v IExpressionContext) { s.elseTernExp = v }

func (s *TernaryConditionsContext) GetState() I.IfTernaryControl { return s.state }

func (s *TernaryConditionsContext) SetState(v I.IfTernaryControl) { s.state = v }

func (s *TernaryConditionsContext) IF() antlr.TerminalNode {
	return s.GetToken(DBRustParserIF, 0)
}

func (s *TernaryConditionsContext) AllOPENBRACKET() []antlr.TerminalNode {
	return s.GetTokens(DBRustParserOPENBRACKET)
}

func (s *TernaryConditionsContext) OPENBRACKET(i int) antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENBRACKET, i)
}

func (s *TernaryConditionsContext) AllCLOSEBRACKET() []antlr.TerminalNode {
	return s.GetTokens(DBRustParserCLOSEBRACKET)
}

func (s *TernaryConditionsContext) CLOSEBRACKET(i int) antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEBRACKET, i)
}

func (s *TernaryConditionsContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *TernaryConditionsContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *TernaryConditionsContext) AllInstructions() []IInstructionsContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstructionsContext)(nil)).Elem())
	var tst = make([]IInstructionsContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstructionsContext)
		}
	}

	return tst
}

func (s *TernaryConditionsContext) Instructions(i int) IInstructionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstructionsContext)
}

func (s *TernaryConditionsContext) TernConditionList() ITernConditionListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITernConditionListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITernConditionListContext)
}

func (s *TernaryConditionsContext) ELSE() antlr.TerminalNode {
	return s.GetToken(DBRustParserELSE, 0)
}

func (s *TernaryConditionsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TernaryConditionsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TernaryConditionsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterTernaryConditions(s)
	}
}

func (s *TernaryConditionsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitTernaryConditions(s)
	}
}

func (p *DBRustParser) TernaryConditions() (localctx ITernaryConditionsContext) {
	localctx = NewTernaryConditionsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, DBRustParserRULE_ternaryConditions)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(414)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 16, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(370)

			var _m = p.Match(DBRustParserIF)

			localctx.(*TernaryConditionsContext)._IF = _m
		}
		{
			p.SetState(371)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).firstExp = _x
		}
		{
			p.SetState(372)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(373)

			var _x = p.Instructions()

			localctx.(*TernaryConditionsContext).insBody = _x
		}
		{
			p.SetState(374)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).ternExp = _x
		}
		{
			p.SetState(375)
			p.Match(DBRustParserCLOSEBRACKET)
		}

		trueExp := localctx.(*TernaryConditionsContext).GetTernExp().GetState()
		localctx.(*TernaryConditionsContext).SetState(I.IfTernaryControl{I.IfControl{I.Instruction{"TernaryControl"}, I.Value{I.Token{"IF", localctx.(*TernaryConditionsContext).Get_IF().GetLine(), localctx.(*TernaryConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*TernaryConditionsContext).GetFirstExp().GetState(), localctx.(*TernaryConditionsContext).GetInsBody().GetL().ToArray(), make([]interface{}, 0), make([]interface{}, 0)}, &trueExp, nil})

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(378)

			var _m = p.Match(DBRustParserIF)

			localctx.(*TernaryConditionsContext)._IF = _m
		}
		{
			p.SetState(379)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).firstExp = _x
		}
		{
			p.SetState(380)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(381)

			var _x = p.Instructions()

			localctx.(*TernaryConditionsContext).insBody = _x
		}
		{
			p.SetState(382)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).ternExp = _x
		}
		{
			p.SetState(383)
			p.Match(DBRustParserCLOSEBRACKET)
		}
		{
			p.SetState(384)

			var _x = p.ternConditionList(0)

			localctx.(*TernaryConditionsContext)._ternConditionList = _x
		}

		trueExp := localctx.(*TernaryConditionsContext).GetTernExp().GetState()
		localctx.(*TernaryConditionsContext).SetState(I.IfTernaryControl{I.IfControl{I.Instruction{"TernaryControl"}, I.Value{I.Token{"IF", localctx.(*TernaryConditionsContext).Get_IF().GetLine(), localctx.(*TernaryConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*TernaryConditionsContext).GetFirstExp().GetState(), localctx.(*TernaryConditionsContext).GetInsBody().GetL().ToArray(), localctx.(*TernaryConditionsContext).Get_ternConditionList().GetL().ToArray(), make([]interface{}, 0)}, &trueExp, nil})

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(387)

			var _m = p.Match(DBRustParserIF)

			localctx.(*TernaryConditionsContext)._IF = _m
		}
		{
			p.SetState(388)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).firstExp = _x
		}
		{
			p.SetState(389)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(390)

			var _x = p.Instructions()

			localctx.(*TernaryConditionsContext).insBody = _x
		}
		{
			p.SetState(391)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).ternExp = _x
		}
		{
			p.SetState(392)
			p.Match(DBRustParserCLOSEBRACKET)
		}
		{
			p.SetState(393)
			p.Match(DBRustParserELSE)
		}
		{
			p.SetState(394)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(395)

			var _x = p.Instructions()

			localctx.(*TernaryConditionsContext).elseBody = _x
		}
		{
			p.SetState(396)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).elseTernExp = _x
		}
		{
			p.SetState(397)
			p.Match(DBRustParserCLOSEBRACKET)
		}

		trueExp, elseExp := localctx.(*TernaryConditionsContext).GetTernExp().GetState(), localctx.(*TernaryConditionsContext).GetElseTernExp().GetState()
		localctx.(*TernaryConditionsContext).SetState(I.IfTernaryControl{I.IfControl{I.Instruction{"TernaryControl"}, I.Value{I.Token{"IF", localctx.(*TernaryConditionsContext).Get_IF().GetLine(), localctx.(*TernaryConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*TernaryConditionsContext).GetFirstExp().GetState(), localctx.(*TernaryConditionsContext).GetInsBody().GetL().ToArray(), make([]interface{}, 0), localctx.(*TernaryConditionsContext).GetElseBody().GetL().ToArray()}, &trueExp, &elseExp})

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(400)

			var _m = p.Match(DBRustParserIF)

			localctx.(*TernaryConditionsContext)._IF = _m
		}
		{
			p.SetState(401)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).firstExp = _x
		}
		{
			p.SetState(402)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(403)

			var _x = p.Instructions()

			localctx.(*TernaryConditionsContext).insBody = _x
		}
		{
			p.SetState(404)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).ternExp = _x
		}
		{
			p.SetState(405)
			p.Match(DBRustParserCLOSEBRACKET)
		}
		{
			p.SetState(406)

			var _x = p.ternConditionList(0)

			localctx.(*TernaryConditionsContext)._ternConditionList = _x
		}
		{
			p.SetState(407)
			p.Match(DBRustParserELSE)
		}
		{
			p.SetState(408)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(409)

			var _x = p.Instructions()

			localctx.(*TernaryConditionsContext).elseBody = _x
		}
		{
			p.SetState(410)

			var _x = p.expression(0)

			localctx.(*TernaryConditionsContext).elseTernExp = _x
		}
		{
			p.SetState(411)
			p.Match(DBRustParserCLOSEBRACKET)
		}

		trueExp, elseExp := localctx.(*TernaryConditionsContext).GetTernExp().GetState(), localctx.(*TernaryConditionsContext).GetElseTernExp().GetState()
		localctx.(*TernaryConditionsContext).SetState(I.IfTernaryControl{I.IfControl{I.Instruction{"TernaryControl"}, I.Value{I.Token{"IF", localctx.(*TernaryConditionsContext).Get_IF().GetLine(), localctx.(*TernaryConditionsContext).Get_IF().GetColumn()}, "If", I.VOID}, localctx.(*TernaryConditionsContext).GetFirstExp().GetState(), localctx.(*TernaryConditionsContext).GetInsBody().GetL().ToArray(), localctx.(*TernaryConditionsContext).Get_ternConditionList().GetL().ToArray(), localctx.(*TernaryConditionsContext).GetElseBody().GetL().ToArray()}, &trueExp, &elseExp})

	}

	return localctx
}

// IConditionListContext is an interface to support dynamic dispatch.
type IConditionListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IConditionListContext

	// Get_elseIf returns the _elseIf rule contexts.
	Get_elseIf() IElseIfContext

	// SetList sets the list rule contexts.
	SetList(IConditionListContext)

	// Set_elseIf sets the _elseIf rule contexts.
	Set_elseIf(IElseIfContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsConditionListContext differentiates from other interfaces.
	IsConditionListContext()
}

type ConditionListContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	l       *arrayList.List
	list    IConditionListContext
	_elseIf IElseIfContext
}

func NewEmptyConditionListContext() *ConditionListContext {
	var p = new(ConditionListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_conditionList
	return p
}

func (*ConditionListContext) IsConditionListContext() {}

func NewConditionListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ConditionListContext {
	var p = new(ConditionListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_conditionList

	return p
}

func (s *ConditionListContext) GetParser() antlr.Parser { return s.parser }

func (s *ConditionListContext) GetList() IConditionListContext { return s.list }

func (s *ConditionListContext) Get_elseIf() IElseIfContext { return s._elseIf }

func (s *ConditionListContext) SetList(v IConditionListContext) { s.list = v }

func (s *ConditionListContext) Set_elseIf(v IElseIfContext) { s._elseIf = v }

func (s *ConditionListContext) GetL() *arrayList.List { return s.l }

func (s *ConditionListContext) SetL(v *arrayList.List) { s.l = v }

func (s *ConditionListContext) ElseIf() IElseIfContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IElseIfContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IElseIfContext)
}

func (s *ConditionListContext) ConditionList() IConditionListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConditionListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IConditionListContext)
}

func (s *ConditionListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConditionListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ConditionListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterConditionList(s)
	}
}

func (s *ConditionListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitConditionList(s)
	}
}

func (p *DBRustParser) ConditionList() (localctx IConditionListContext) {
	return p.conditionList(0)
}

func (p *DBRustParser) conditionList(_p int) (localctx IConditionListContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewConditionListContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IConditionListContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 44
	p.EnterRecursionRule(localctx, 44, DBRustParserRULE_conditionList, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(417)

		var _x = p.ElseIf()

		localctx.(*ConditionListContext)._elseIf = _x
	}

	localctx.(*ConditionListContext).l = arrayList.New()
	localctx.(*ConditionListContext).l.Add(localctx.(*ConditionListContext).Get_elseIf().GetState())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(426)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewConditionListContext(p, _parentctx, _parentState)
			localctx.(*ConditionListContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_conditionList)
			p.SetState(420)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(421)

				var _x = p.ElseIf()

				localctx.(*ConditionListContext)._elseIf = _x
			}

			localctx.(*ConditionListContext).GetList().GetL().Add(localctx.(*ConditionListContext).Get_elseIf().GetState())
			localctx.(*ConditionListContext).l = localctx.(*ConditionListContext).GetList().GetL()

		}
		p.SetState(428)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext())
	}

	return localctx
}

// ITernConditionListContext is an interface to support dynamic dispatch.
type ITernConditionListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() ITernConditionListContext

	// Get_ternElseIf returns the _ternElseIf rule contexts.
	Get_ternElseIf() ITernElseIfContext

	// SetList sets the list rule contexts.
	SetList(ITernConditionListContext)

	// Set_ternElseIf sets the _ternElseIf rule contexts.
	Set_ternElseIf(ITernElseIfContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsTernConditionListContext differentiates from other interfaces.
	IsTernConditionListContext()
}

type TernConditionListContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	l           *arrayList.List
	list        ITernConditionListContext
	_ternElseIf ITernElseIfContext
}

func NewEmptyTernConditionListContext() *TernConditionListContext {
	var p = new(TernConditionListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_ternConditionList
	return p
}

func (*TernConditionListContext) IsTernConditionListContext() {}

func NewTernConditionListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TernConditionListContext {
	var p = new(TernConditionListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_ternConditionList

	return p
}

func (s *TernConditionListContext) GetParser() antlr.Parser { return s.parser }

func (s *TernConditionListContext) GetList() ITernConditionListContext { return s.list }

func (s *TernConditionListContext) Get_ternElseIf() ITernElseIfContext { return s._ternElseIf }

func (s *TernConditionListContext) SetList(v ITernConditionListContext) { s.list = v }

func (s *TernConditionListContext) Set_ternElseIf(v ITernElseIfContext) { s._ternElseIf = v }

func (s *TernConditionListContext) GetL() *arrayList.List { return s.l }

func (s *TernConditionListContext) SetL(v *arrayList.List) { s.l = v }

func (s *TernConditionListContext) TernElseIf() ITernElseIfContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITernElseIfContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITernElseIfContext)
}

func (s *TernConditionListContext) TernConditionList() ITernConditionListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITernConditionListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITernConditionListContext)
}

func (s *TernConditionListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TernConditionListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TernConditionListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterTernConditionList(s)
	}
}

func (s *TernConditionListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitTernConditionList(s)
	}
}

func (p *DBRustParser) TernConditionList() (localctx ITernConditionListContext) {
	return p.ternConditionList(0)
}

func (p *DBRustParser) ternConditionList(_p int) (localctx ITernConditionListContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewTernConditionListContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx ITernConditionListContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 46
	p.EnterRecursionRule(localctx, 46, DBRustParserRULE_ternConditionList, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(430)

		var _x = p.TernElseIf()

		localctx.(*TernConditionListContext)._ternElseIf = _x
	}

	localctx.(*TernConditionListContext).l = arrayList.New()
	localctx.(*TernConditionListContext).l.Add(localctx.(*TernConditionListContext).Get_ternElseIf().GetState())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(439)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewTernConditionListContext(p, _parentctx, _parentState)
			localctx.(*TernConditionListContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_ternConditionList)
			p.SetState(433)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(434)

				var _x = p.TernElseIf()

				localctx.(*TernConditionListContext)._ternElseIf = _x
			}

			localctx.(*TernConditionListContext).GetList().GetL().Add(localctx.(*TernConditionListContext).Get_ternElseIf().GetState())
			localctx.(*TernConditionListContext).l = localctx.(*TernConditionListContext).GetList().GetL()

		}
		p.SetState(441)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())
	}

	return localctx
}

// IElseIfContext is an interface to support dynamic dispatch.
type IElseIfContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_instructionsBlock returns the _instructionsBlock rule contexts.
	Get_instructionsBlock() IInstructionsBlockContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_instructionsBlock sets the _instructionsBlock rule contexts.
	Set_instructionsBlock(IInstructionsBlockContext)

	// GetState returns the state attribute.
	GetState() I.IfControlFallBack

	// SetState sets the state attribute.
	SetState(I.IfControlFallBack)

	// IsElseIfContext differentiates from other interfaces.
	IsElseIfContext()
}

type ElseIfContext struct {
	*antlr.BaseParserRuleContext
	parser             antlr.Parser
	state              I.IfControlFallBack
	_IF                antlr.Token
	_expression        IExpressionContext
	_instructionsBlock IInstructionsBlockContext
}

func NewEmptyElseIfContext() *ElseIfContext {
	var p = new(ElseIfContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_elseIf
	return p
}

func (*ElseIfContext) IsElseIfContext() {}

func NewElseIfContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ElseIfContext {
	var p = new(ElseIfContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_elseIf

	return p
}

func (s *ElseIfContext) GetParser() antlr.Parser { return s.parser }

func (s *ElseIfContext) Get_IF() antlr.Token { return s._IF }

func (s *ElseIfContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *ElseIfContext) Get_expression() IExpressionContext { return s._expression }

func (s *ElseIfContext) Get_instructionsBlock() IInstructionsBlockContext {
	return s._instructionsBlock
}

func (s *ElseIfContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ElseIfContext) Set_instructionsBlock(v IInstructionsBlockContext) { s._instructionsBlock = v }

func (s *ElseIfContext) GetState() I.IfControlFallBack { return s.state }

func (s *ElseIfContext) SetState(v I.IfControlFallBack) { s.state = v }

func (s *ElseIfContext) ELSE() antlr.TerminalNode {
	return s.GetToken(DBRustParserELSE, 0)
}

func (s *ElseIfContext) IF() antlr.TerminalNode {
	return s.GetToken(DBRustParserIF, 0)
}

func (s *ElseIfContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ElseIfContext) InstructionsBlock() IInstructionsBlockContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsBlockContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsBlockContext)
}

func (s *ElseIfContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ElseIfContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ElseIfContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterElseIf(s)
	}
}

func (s *ElseIfContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitElseIf(s)
	}
}

func (p *DBRustParser) ElseIf() (localctx IElseIfContext) {
	localctx = NewElseIfContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 48, DBRustParserRULE_elseIf)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(442)
		p.Match(DBRustParserELSE)
	}
	{
		p.SetState(443)

		var _m = p.Match(DBRustParserIF)

		localctx.(*ElseIfContext)._IF = _m
	}
	{
		p.SetState(444)

		var _x = p.expression(0)

		localctx.(*ElseIfContext)._expression = _x
	}
	{
		p.SetState(445)

		var _x = p.InstructionsBlock()

		localctx.(*ElseIfContext)._instructionsBlock = _x
	}

	localctx.(*ElseIfContext).SetState(I.IfControlFallBack{I.Token{"ElseIf", localctx.(*ElseIfContext).Get_IF().GetLine(), localctx.(*ElseIfContext).Get_IF().GetColumn()}, localctx.(*ElseIfContext).Get_expression().GetState(), localctx.(*ElseIfContext).Get_instructionsBlock().GetL().ToArray(), nil})

	return localctx
}

// ITernElseIfContext is an interface to support dynamic dispatch.
type ITernElseIfContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// GetFirstExp returns the firstExp rule contexts.
	GetFirstExp() IExpressionContext

	// Get_instructions returns the _instructions rule contexts.
	Get_instructions() IInstructionsContext

	// GetTernExp returns the ternExp rule contexts.
	GetTernExp() IExpressionContext

	// SetFirstExp sets the firstExp rule contexts.
	SetFirstExp(IExpressionContext)

	// Set_instructions sets the _instructions rule contexts.
	Set_instructions(IInstructionsContext)

	// SetTernExp sets the ternExp rule contexts.
	SetTernExp(IExpressionContext)

	// GetState returns the state attribute.
	GetState() I.IfControlFallBack

	// SetState sets the state attribute.
	SetState(I.IfControlFallBack)

	// IsTernElseIfContext differentiates from other interfaces.
	IsTernElseIfContext()
}

type TernElseIfContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	state         I.IfControlFallBack
	_IF           antlr.Token
	firstExp      IExpressionContext
	_instructions IInstructionsContext
	ternExp       IExpressionContext
}

func NewEmptyTernElseIfContext() *TernElseIfContext {
	var p = new(TernElseIfContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_ternElseIf
	return p
}

func (*TernElseIfContext) IsTernElseIfContext() {}

func NewTernElseIfContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TernElseIfContext {
	var p = new(TernElseIfContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_ternElseIf

	return p
}

func (s *TernElseIfContext) GetParser() antlr.Parser { return s.parser }

func (s *TernElseIfContext) Get_IF() antlr.Token { return s._IF }

func (s *TernElseIfContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *TernElseIfContext) GetFirstExp() IExpressionContext { return s.firstExp }

func (s *TernElseIfContext) Get_instructions() IInstructionsContext { return s._instructions }

func (s *TernElseIfContext) GetTernExp() IExpressionContext { return s.ternExp }

func (s *TernElseIfContext) SetFirstExp(v IExpressionContext) { s.firstExp = v }

func (s *TernElseIfContext) Set_instructions(v IInstructionsContext) { s._instructions = v }

func (s *TernElseIfContext) SetTernExp(v IExpressionContext) { s.ternExp = v }

func (s *TernElseIfContext) GetState() I.IfControlFallBack { return s.state }

func (s *TernElseIfContext) SetState(v I.IfControlFallBack) { s.state = v }

func (s *TernElseIfContext) ELSE() antlr.TerminalNode {
	return s.GetToken(DBRustParserELSE, 0)
}

func (s *TernElseIfContext) IF() antlr.TerminalNode {
	return s.GetToken(DBRustParserIF, 0)
}

func (s *TernElseIfContext) OPENBRACKET() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENBRACKET, 0)
}

func (s *TernElseIfContext) Instructions() IInstructionsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsContext)
}

func (s *TernElseIfContext) CLOSEBRACKET() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEBRACKET, 0)
}

func (s *TernElseIfContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *TernElseIfContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *TernElseIfContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TernElseIfContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TernElseIfContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterTernElseIf(s)
	}
}

func (s *TernElseIfContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitTernElseIf(s)
	}
}

func (p *DBRustParser) TernElseIf() (localctx ITernElseIfContext) {
	localctx = NewTernElseIfContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, DBRustParserRULE_ternElseIf)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(448)
		p.Match(DBRustParserELSE)
	}
	{
		p.SetState(449)

		var _m = p.Match(DBRustParserIF)

		localctx.(*TernElseIfContext)._IF = _m
	}
	{
		p.SetState(450)

		var _x = p.expression(0)

		localctx.(*TernElseIfContext).firstExp = _x
	}
	{
		p.SetState(451)
		p.Match(DBRustParserOPENBRACKET)
	}
	{
		p.SetState(452)

		var _x = p.Instructions()

		localctx.(*TernElseIfContext)._instructions = _x
	}
	{
		p.SetState(453)

		var _x = p.expression(0)

		localctx.(*TernElseIfContext).ternExp = _x
	}
	{
		p.SetState(454)
		p.Match(DBRustParserCLOSEBRACKET)
	}

	trueExp := localctx.(*TernElseIfContext).GetTernExp().GetState()
	localctx.(*TernElseIfContext).SetState(I.IfControlFallBack{I.Token{"ElseIf", localctx.(*TernElseIfContext).Get_IF().GetLine(), localctx.(*TernElseIfContext).Get_IF().GetColumn()}, localctx.(*TernElseIfContext).GetFirstExp().GetState(), localctx.(*TernElseIfContext).Get_instructions().GetL().ToArray(), &trueExp})

	return localctx
}

// IMatchExpContext is an interface to support dynamic dispatch.
type IMatchExpContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_MATCH returns the _MATCH token.
	Get_MATCH() antlr.Token

	// Set_MATCH sets the _MATCH token.
	Set_MATCH(antlr.Token)

	// GetTrueExp returns the trueExp rule contexts.
	GetTrueExp() IExpressionContext

	// Get_matchCaseList returns the _matchCaseList rule contexts.
	Get_matchCaseList() IMatchCaseListContext

	// GetDefBody returns the defBody rule contexts.
	GetDefBody() IInstructionsBlockContext

	// SetTrueExp sets the trueExp rule contexts.
	SetTrueExp(IExpressionContext)

	// Set_matchCaseList sets the _matchCaseList rule contexts.
	Set_matchCaseList(IMatchCaseListContext)

	// SetDefBody sets the defBody rule contexts.
	SetDefBody(IInstructionsBlockContext)

	// GetState returns the state attribute.
	GetState() I.MatchControl

	// SetState sets the state attribute.
	SetState(I.MatchControl)

	// IsMatchExpContext differentiates from other interfaces.
	IsMatchExpContext()
}

type MatchExpContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	state          I.MatchControl
	_MATCH         antlr.Token
	trueExp        IExpressionContext
	_matchCaseList IMatchCaseListContext
	defBody        IInstructionsBlockContext
}

func NewEmptyMatchExpContext() *MatchExpContext {
	var p = new(MatchExpContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_matchExp
	return p
}

func (*MatchExpContext) IsMatchExpContext() {}

func NewMatchExpContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MatchExpContext {
	var p = new(MatchExpContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_matchExp

	return p
}

func (s *MatchExpContext) GetParser() antlr.Parser { return s.parser }

func (s *MatchExpContext) Get_MATCH() antlr.Token { return s._MATCH }

func (s *MatchExpContext) Set_MATCH(v antlr.Token) { s._MATCH = v }

func (s *MatchExpContext) GetTrueExp() IExpressionContext { return s.trueExp }

func (s *MatchExpContext) Get_matchCaseList() IMatchCaseListContext { return s._matchCaseList }

func (s *MatchExpContext) GetDefBody() IInstructionsBlockContext { return s.defBody }

func (s *MatchExpContext) SetTrueExp(v IExpressionContext) { s.trueExp = v }

func (s *MatchExpContext) Set_matchCaseList(v IMatchCaseListContext) { s._matchCaseList = v }

func (s *MatchExpContext) SetDefBody(v IInstructionsBlockContext) { s.defBody = v }

func (s *MatchExpContext) GetState() I.MatchControl { return s.state }

func (s *MatchExpContext) SetState(v I.MatchControl) { s.state = v }

func (s *MatchExpContext) MATCH() antlr.TerminalNode {
	return s.GetToken(DBRustParserMATCH, 0)
}

func (s *MatchExpContext) OPENBRACKET() antlr.TerminalNode {
	return s.GetToken(DBRustParserOPENBRACKET, 0)
}

func (s *MatchExpContext) MatchCaseList() IMatchCaseListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatchCaseListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatchCaseListContext)
}

func (s *MatchExpContext) UNDERSCORE() antlr.TerminalNode {
	return s.GetToken(DBRustParserUNDERSCORE, 0)
}

func (s *MatchExpContext) DBLARROW() antlr.TerminalNode {
	return s.GetToken(DBRustParserDBLARROW, 0)
}

func (s *MatchExpContext) CLOSEBRACKET() antlr.TerminalNode {
	return s.GetToken(DBRustParserCLOSEBRACKET, 0)
}

func (s *MatchExpContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *MatchExpContext) InstructionsBlock() IInstructionsBlockContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsBlockContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsBlockContext)
}

func (s *MatchExpContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MatchExpContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MatchExpContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterMatchExp(s)
	}
}

func (s *MatchExpContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitMatchExp(s)
	}
}

func (p *DBRustParser) MatchExp() (localctx IMatchExpContext) {
	localctx = NewMatchExpContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, DBRustParserRULE_matchExp)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(474)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(457)

			var _m = p.Match(DBRustParserMATCH)

			localctx.(*MatchExpContext)._MATCH = _m
		}
		{
			p.SetState(458)

			var _x = p.expression(0)

			localctx.(*MatchExpContext).trueExp = _x
		}
		{
			p.SetState(459)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(460)

			var _x = p.matchCaseList(0)

			localctx.(*MatchExpContext)._matchCaseList = _x
		}
		{
			p.SetState(461)
			p.Match(DBRustParserUNDERSCORE)
		}
		{
			p.SetState(462)
			p.Match(DBRustParserDBLARROW)
		}
		{
			p.SetState(463)

			var _x = p.InstructionsBlock()

			localctx.(*MatchExpContext).defBody = _x
		}
		{
			p.SetState(464)
			p.Match(DBRustParserCLOSEBRACKET)
		}

		defCase := localctx.(*MatchExpContext).GetDefBody().GetL().ToArray()
		localctx.(*MatchExpContext).SetState(I.MatchControl{I.Instruction{"Match"}, I.Value{I.Token{"Match", localctx.(*MatchExpContext).Get_MATCH().GetLine(), localctx.(*MatchExpContext).Get_MATCH().GetColumn()}, "Match", I.VOID}, localctx.(*MatchExpContext).GetTrueExp().GetState(), localctx.(*MatchExpContext).Get_matchCaseList().GetL().ToArray(), &defCase})

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(467)

			var _m = p.Match(DBRustParserMATCH)

			localctx.(*MatchExpContext)._MATCH = _m
		}
		{
			p.SetState(468)

			var _x = p.expression(0)

			localctx.(*MatchExpContext).trueExp = _x
		}
		{
			p.SetState(469)
			p.Match(DBRustParserOPENBRACKET)
		}
		{
			p.SetState(470)

			var _x = p.matchCaseList(0)

			localctx.(*MatchExpContext)._matchCaseList = _x
		}
		{
			p.SetState(471)
			p.Match(DBRustParserCLOSEBRACKET)
		}

		localctx.(*MatchExpContext).SetState(I.MatchControl{I.Instruction{"Match"}, I.Value{I.Token{"Match", localctx.(*MatchExpContext).Get_MATCH().GetLine(), localctx.(*MatchExpContext).Get_MATCH().GetColumn()}, "Match", I.VOID}, localctx.(*MatchExpContext).GetTrueExp().GetState(), localctx.(*MatchExpContext).Get_matchCaseList().GetL().ToArray(), nil})

	}

	return localctx
}

// IMatchCaseListContext is an interface to support dynamic dispatch.
type IMatchCaseListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IMatchCaseListContext

	// Get_matchCase returns the _matchCase rule contexts.
	Get_matchCase() IMatchCaseContext

	// SetList sets the list rule contexts.
	SetList(IMatchCaseListContext)

	// Set_matchCase sets the _matchCase rule contexts.
	Set_matchCase(IMatchCaseContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsMatchCaseListContext differentiates from other interfaces.
	IsMatchCaseListContext()
}

type MatchCaseListContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	l          *arrayList.List
	list       IMatchCaseListContext
	_matchCase IMatchCaseContext
}

func NewEmptyMatchCaseListContext() *MatchCaseListContext {
	var p = new(MatchCaseListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_matchCaseList
	return p
}

func (*MatchCaseListContext) IsMatchCaseListContext() {}

func NewMatchCaseListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MatchCaseListContext {
	var p = new(MatchCaseListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_matchCaseList

	return p
}

func (s *MatchCaseListContext) GetParser() antlr.Parser { return s.parser }

func (s *MatchCaseListContext) GetList() IMatchCaseListContext { return s.list }

func (s *MatchCaseListContext) Get_matchCase() IMatchCaseContext { return s._matchCase }

func (s *MatchCaseListContext) SetList(v IMatchCaseListContext) { s.list = v }

func (s *MatchCaseListContext) Set_matchCase(v IMatchCaseContext) { s._matchCase = v }

func (s *MatchCaseListContext) GetL() *arrayList.List { return s.l }

func (s *MatchCaseListContext) SetL(v *arrayList.List) { s.l = v }

func (s *MatchCaseListContext) MatchCase() IMatchCaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatchCaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatchCaseContext)
}

func (s *MatchCaseListContext) MatchCaseList() IMatchCaseListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatchCaseListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatchCaseListContext)
}

func (s *MatchCaseListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MatchCaseListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MatchCaseListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterMatchCaseList(s)
	}
}

func (s *MatchCaseListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitMatchCaseList(s)
	}
}

func (p *DBRustParser) MatchCaseList() (localctx IMatchCaseListContext) {
	return p.matchCaseList(0)
}

func (p *DBRustParser) matchCaseList(_p int) (localctx IMatchCaseListContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewMatchCaseListContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IMatchCaseListContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 54
	p.EnterRecursionRule(localctx, 54, DBRustParserRULE_matchCaseList, _p)

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(477)

		var _x = p.MatchCase()

		localctx.(*MatchCaseListContext)._matchCase = _x
	}

	localctx.(*MatchCaseListContext).l = arrayList.New()
	localctx.(*MatchCaseListContext).l.Add(localctx.(*MatchCaseListContext).Get_matchCase().GetState())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(486)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewMatchCaseListContext(p, _parentctx, _parentState)
			localctx.(*MatchCaseListContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, DBRustParserRULE_matchCaseList)
			p.SetState(480)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(481)

				var _x = p.MatchCase()

				localctx.(*MatchCaseListContext)._matchCase = _x
			}

			localctx.(*MatchCaseListContext).GetList().GetL().Add(localctx.(*MatchCaseListContext).Get_matchCase().GetState())
			localctx.(*MatchCaseListContext).l = localctx.(*MatchCaseListContext).GetList().GetL()

		}
		p.SetState(488)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext())
	}

	return localctx
}

// IMatchCaseContext is an interface to support dynamic dispatch.
type IMatchCaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_DBLARROW returns the _DBLARROW token.
	Get_DBLARROW() antlr.Token

	// Set_DBLARROW sets the _DBLARROW token.
	Set_DBLARROW(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_instructionsBlock returns the _instructionsBlock rule contexts.
	Get_instructionsBlock() IInstructionsBlockContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_instructionsBlock sets the _instructionsBlock rule contexts.
	Set_instructionsBlock(IInstructionsBlockContext)

	// GetState returns the state attribute.
	GetState() I.CaseMatchControl

	// SetState sets the state attribute.
	SetState(I.CaseMatchControl)

	// IsMatchCaseContext differentiates from other interfaces.
	IsMatchCaseContext()
}

type MatchCaseContext struct {
	*antlr.BaseParserRuleContext
	parser             antlr.Parser
	state              I.CaseMatchControl
	_expression        IExpressionContext
	_DBLARROW          antlr.Token
	_instructionsBlock IInstructionsBlockContext
}

func NewEmptyMatchCaseContext() *MatchCaseContext {
	var p = new(MatchCaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = DBRustParserRULE_matchCase
	return p
}

func (*MatchCaseContext) IsMatchCaseContext() {}

func NewMatchCaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MatchCaseContext {
	var p = new(MatchCaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = DBRustParserRULE_matchCase

	return p
}

func (s *MatchCaseContext) GetParser() antlr.Parser { return s.parser }

func (s *MatchCaseContext) Get_DBLARROW() antlr.Token { return s._DBLARROW }

func (s *MatchCaseContext) Set_DBLARROW(v antlr.Token) { s._DBLARROW = v }

func (s *MatchCaseContext) Get_expression() IExpressionContext { return s._expression }

func (s *MatchCaseContext) Get_instructionsBlock() IInstructionsBlockContext {
	return s._instructionsBlock
}

func (s *MatchCaseContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *MatchCaseContext) Set_instructionsBlock(v IInstructionsBlockContext) {
	s._instructionsBlock = v
}

func (s *MatchCaseContext) GetState() I.CaseMatchControl { return s.state }

func (s *MatchCaseContext) SetState(v I.CaseMatchControl) { s.state = v }

func (s *MatchCaseContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *MatchCaseContext) DBLARROW() antlr.TerminalNode {
	return s.GetToken(DBRustParserDBLARROW, 0)
}

func (s *MatchCaseContext) InstructionsBlock() IInstructionsBlockContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstructionsBlockContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstructionsBlockContext)
}

func (s *MatchCaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MatchCaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MatchCaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.EnterMatchCase(s)
	}
}

func (s *MatchCaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(DBRustListener); ok {
		listenerT.ExitMatchCase(s)
	}
}

func (p *DBRustParser) MatchCase() (localctx IMatchCaseContext) {
	localctx = NewMatchCaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 56, DBRustParserRULE_matchCase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(489)

		var _x = p.expression(0)

		localctx.(*MatchCaseContext)._expression = _x
	}
	{
		p.SetState(490)

		var _m = p.Match(DBRustParserDBLARROW)

		localctx.(*MatchCaseContext)._DBLARROW = _m
	}
	{
		p.SetState(491)

		var _x = p.InstructionsBlock()

		localctx.(*MatchCaseContext)._instructionsBlock = _x
	}

	localctx.(*MatchCaseContext).SetState(I.CaseMatchControl{I.Token{"MatchCase", localctx.(*MatchCaseContext).Get_DBLARROW().GetLine(), localctx.(*MatchCaseContext).Get_DBLARROW().GetColumn()}, localctx.(*MatchCaseContext).Get_expression().GetState(), localctx.(*MatchCaseContext).Get_instructionsBlock().GetL().ToArray()})

	return localctx
}

func (p *DBRustParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 6:
		var t *ExpListContext = nil
		if localctx != nil {
			t = localctx.(*ExpListContext)
		}
		return p.ExpList_Sempred(t, predIndex)

	case 7:
		var t *ExpressionContext = nil
		if localctx != nil {
			t = localctx.(*ExpressionContext)
		}
		return p.Expression_Sempred(t, predIndex)

	case 16:
		var t *ParamListContext = nil
		if localctx != nil {
			t = localctx.(*ParamListContext)
		}
		return p.ParamList_Sempred(t, predIndex)

	case 22:
		var t *ConditionListContext = nil
		if localctx != nil {
			t = localctx.(*ConditionListContext)
		}
		return p.ConditionList_Sempred(t, predIndex)

	case 23:
		var t *TernConditionListContext = nil
		if localctx != nil {
			t = localctx.(*TernConditionListContext)
		}
		return p.TernConditionList_Sempred(t, predIndex)

	case 27:
		var t *MatchCaseListContext = nil
		if localctx != nil {
			t = localctx.(*MatchCaseListContext)
		}
		return p.MatchCaseList_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *DBRustParser) ExpList_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBRustParser) Expression_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 6)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 5)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 4)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBRustParser) ParamList_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 4:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBRustParser) ConditionList_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 5:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBRustParser) TernConditionList_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 6:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *DBRustParser) MatchCaseList_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 7:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
