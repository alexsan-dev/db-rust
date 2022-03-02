CLASSPATH=.:/usr/local/lib/antlr-4.9-complete.jar
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.9-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.9-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
cd lang
antlr4 -Dlanguage=Go -o ../parser DBRust.g4 DBRustLexer.g4
