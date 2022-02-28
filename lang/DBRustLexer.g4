lexer grammar DBRustLexer;

NUMBER: [0-9]+;
STRING: '"' ~["]* '"';
ID: ([a-zA-Z_]) [a-zA-Z0-9_]*;

EQUALS: '=';
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';

WHITESPACE: [ \r\n\t]+ -> skip;