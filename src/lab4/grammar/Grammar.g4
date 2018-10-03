grammar Grammar;

@header {
    package lab4.grammar;
}

gramma : header? members? main? rule1*;

header : '@header' CODE # headerLabel;

members : '@members' CODE # membersLabel;

main : '@main' CODE # mainLabel;

rule1 : NON_TERM_NAME inherited? ('->' synthesized)? ':' nonterminalProduction ('|' nonterminalProduction)* ';' # nonTerminalLabel
      | TERM_NAME ':' terminalProduction ('|' terminalProduction)* ';' # terminalLabel;

inherited : declAttrs;

declAttrs : '[' arg (',' arg)* ']';

callAttrs : '[' CODE (',' CODE)* ']';

arg : argType argName;

argType : NON_TERM_NAME
        | TERM_NAME
        | MIXED_CASE;

argName : NON_TERM_NAME
        | TERM_NAME
        | MIXED_CASE;

synthesized : NON_TERM_NAME
            | TERM_NAME
            | MIXED_CASE;

nonterminalVariant : ((NON_TERM_NAME callAttrs?)
                     | TERM_NAME);

nonterminalProduction : nonterminalVariant* CODE?;

terminalProduction : STRING+;

NON_TERM_NAME : [a-z] [a-zA-Z_0-9]*         ;
TERM_NAME     : [A-Z] [A-Z_0-9]*            ;
MIXED_CASE    : [A-Za-z] [a-z_A-Z0-9]*      ;
CODE          : '{' (~[{}]+ CODE?)* '}'     ;
STRING        : '\'' (~'\'' | '\\\'')* '\'' ;
WS            : [ \t\r\n]+ -> skip          ;