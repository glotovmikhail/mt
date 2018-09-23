grammar PascalToC;

@header {
package lab3;
import java.util.*;
}

@members {
    int curOffset = 1;
    public StringBuilder code = new StringBuilder("#include <stdio.h>\nint main() {\n");
    private String curVarNames, curVarType;
    private Map<String, String> types = new HashMap<String, String>();
    boolean ln = false;
    boolean inWrite = false;
    boolean down = false;
    List<String> writeIds = new ArrayList<String>();
    private void append(String s) {
        code.append(s);
    }
    private void offset() {
        for (int i = 0; i < curOffset; i++) {
            code.append("\t");
        }
    }
    private void addVars(String curVarNames, String curVarType) {
        curVarNames = curVarNames.replaceAll(" ", "");
        for (String s : curVarNames.split(",")) {
            if (curVarType.equals("int")) types.put(s, "%d");
            if (curVarType.equals("char*")) types.put(s, "%s");
        }
    }

    public String join(List<String> list, String conjuction) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String item : list) {
            if (first) first = false;
            else sb.append(conjuction);
            sb.append(item);
        }
        return sb.toString();
    }
}

wholeProgram : programId? variables? BEGIN programBody END DOT {offset(); append("return 0;\n}");};

programId : PROGRAM programName SEMI;

variables : VAR variable*;

variable : varNames {curVarNames = $varNames.text;}
           COLON varType {
                offset();
                addVars(curVarNames, curVarType);
                append(curVarType + " " + curVarNames + ";\n");
           }
           SEMI;

varNames : varName
           (COMMA varName)*;
varName : IDENT;
varType : BOOLEAN {curVarType = "bool";} |
          INTEGER {curVarType = "int";}  |
          STRING {curVarType = "char*";};

programName : IDENT;
programBody : statements;
statements : statement ( SEMI statement )*;
statement : ({offset();} singleStatement {append(";\n");} |
            emptyStatement | {offset();} ifStatement      |
            {offset();} whileStatement | {offset();} compoundStatement |
            ) ;

singleStatement : assignStatement |
                  readStatement   |
                  writeStatement  ;
assignStatement : IDENT ASSIGN {append($IDENT.text + " = ");} expression;
readStatement : (READ {ln = false;} | READLN {ln = true;})
                LPAREN { append("scanf(\""); }
                IDENT { append(types.get($IDENT.text));
                        writeIds.add("&" + $IDENT.text);}
                (COMMA IDENT {append(" " + types.get($IDENT.text));
                              writeIds.add("&" + $IDENT.text);} )*
                RPAREN {if (ln) append("\"\\n\"");
                        if (!writeIds.isEmpty()) append("\", ");
                        append(join(writeIds, ", "));
                        writeIds.clear();
                        append(")");} ;
writeStatement : (WRITE {ln = false;} | WRITELN {ln = true;})
                 LPAREN { inWrite = true;
                          append("printf("); }
                 (expression {if (ln) append(" + ");})?
                 RPAREN {if (ln) append("\"\\n\"");
                         if (!writeIds.isEmpty()) append(", ");
                         append(join(writeIds, ", "));
                         writeIds.clear();
                         inWrite = false; append(")");};

emptyStatement : ;

ifStatement : IF {append("if ("); curOffset++;} expression THEN {append(") {\n");} statement {curOffset--;} (ELSE {offset();
                                                                                     append ("} else {\n"); curOffset++;}
                                                                                     statement {curOffset--; offset(); append("}\n");})?;

whileStatement : WHILE {append("while (");} expression {append(") \n"); } DO statement;

compoundStatement : BEGIN {append("{\n"); curOffset++;}
                    statements
                    END {curOffset--;
                         offset();
                         append("}\n");
                    };

expression : simpleExpression ( (EQUAL {append(" == ");}     |
                                 NOT_EQUAL {append(" != ");} |
                                 cmp {append(" " + $cmp.text + " ");}) simpleExpression )*;

cmp : LT | GT | LE | GE;

simpleExpression : term ( (sign {append(" " + $sign.text + " ");} |
                           OR {append(" || ");}) term )*;

term : signedFactor ( (ASTERISK {append(" * ");} |
                       SLASH {append(" / ");}    |
                       DIV {append(" / ");}      |
                       MOD {append(" % ");}      |
                       AND {append(" && ");}
                       ) signedFactor )*;
signedFactor : (sign {append($sign.text);})? factor;
sign : PLUS | MINUS;
factor : IDENT {if (inWrite) {
                    writeIds.add($IDENT.text);
                    append("\"" + types.get($IDENT.text) + "\"");
                } else append($IDENT.text);
               }
       | LPAREN {append("(");} expression RPAREN {append(")");}
       | unsignedConst
       | NOT {append("!");} factor;

unsignedConst : NUM_INT {if (inWrite) {
                            writeIds.add($NUM_INT.text);
                            append("\"%d\"");
                         } else append($NUM_INT.text);
                        }
              | stringLiteral;

stringLiteral : QUOTE string QUOTE {append("\"" + $string.text + "\"");};
string : ('\'\'' | ~('\''))* ;

READ             : 'read'            ;
READLN           : 'readln'          ;
WRITELN          : 'writeln'         ;
WRITE            : 'write'           ;
AND              : 'and'             ;
ARRAY            : 'array'           ;
BEGIN            : 'begin'           ;
BOOLEAN          : 'boolean'         ;
CASE             : 'case'            ;
CHAR             : 'char'            ;
CHR              : 'chr'             ;
EXIT             : 'exit'            ;
CONST            : 'const'           ;
DIV              : 'div'             ;
DO               : 'do'              ;
DOWNTO           : 'downto'          ;
ELSE             : 'else'            ;
END              : 'end'             ;
FILE             : 'file'            ;
FOR              : 'for'             ;
FORWARD          : 'forward'         ;
FUNCTION         : 'function'        ;
GOTO             : 'goto'            ;
IF               : 'if'              ;
IN               : 'in'              ;
INTEGER          : 'integer'         ;
LABEL            : 'label'           ;
MOD              : 'mod'             ;
NIL              : 'nil'             ;
NOT              : 'not'             ;
OF               : 'of'              ;
OR               : 'or'              ;
PACKED           : 'packed'          ;
PROCEDURE        : 'procedure'       ;
PROGRAM          : 'program'         ;
REAL             : 'real'            ;
RECORD           : 'record'          ;
REPEAT           : 'repeat'          ;
SET              : 'set'             ;
THEN             : 'then'            ;
TO               : 'to'              ;
TYPE             : 'type'            ;
UNTIL            : 'until'           ;
VAR              : 'var'             ;
WHILE            : 'while'           ;
WITH             : 'with'            ;
UNIT             : 'unit'            ;
INTERFACE        : 'interface'       ;
USES             : 'uses'            ;
STRING           : 'string'          ;
IMPLEMENTATION   : 'implementation'  ;


PLUS            : '+'   ;
MINUS           : '-'   ;
ASTERISK        : '*'   ;
SLASH           : '/'   ;
ASSIGN          : ':='  ;
COMMA           : ','   ;
SEMI            : ';'   ;
COLON           : ':'   ;
EQUAL           : '='   ;
NOT_EQUAL       : '<>'  ;
LT              : '<'   ;
LE              : '<='  ;
GE              : '>='  ;
GT              : '>'   ;
LPAREN          : '('   ;
RPAREN          : ')'   ;
LBRACK          : '['   ;
LBRACK2         : '(.'  ;
RBRACK          : ']'   ;
RBRACK2         : '.)'  ;
POINTER         : '^'   ;
AT              : '@'   ;
DOT             : '.' ;
DOTDOT          : '..';
LCURLY          : '{' ;
RCURLY          : '}' ;
IDENT  :  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;


QUOTE : '\'';


NUM_INT
  : ('0'..'9')+;

WS : (' ' | '\t' | '\n' | '\r')+
     -> channel(HIDDEN)
   ;




























