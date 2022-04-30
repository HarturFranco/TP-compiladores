grammar Alguma;

@header{
    package antlr;
}

programa: (blocdec)? blocalg EOF #NPrograma;
blocdec: DELIM 'DECLARACAO' (declaracao)* #NBlocoDeclaracao;
declaracao: TIPO VAR #NDeclaracao;
blocalg: DELIM 'ALGORITMO' comando #NBlocoAlgoritmo;
comando: ( 'LER' VAR
	| 'IMPRIMIR' (operacaoarit|operando|operacaolog)
	| 'SE' operacaolog 'ENTAO'
	| 'ENQUANTO' operacaolog 'INICIO' comando 'FIM'
	| 'ATRIBUIR' (operacaoarit|operando|operacaolog) 'A' VAR
		)* #NComando;
operacaoarit: operando OPARIT (operacaoarit|operando) #NOperacaoArit;
operacaolog: (operacaoarit|operando) OPREL (operacaoarit|operando) #NOperacaoLog;
operando: VAR|NUM|STR #NOperando;

DELIM: ':';
TIPO: 'int'|'float'|'string'|'Bool';
VAR: ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*;
NUM: [0-9]+(','[0-9]+)?;
OPARIT: '+'|'-'|'*'|'/';
OPREL: '<='|'>='|'='|'<'|'>';
STR: '"' .*? '"';
WS: [ \r\t\n]* ->skip;
