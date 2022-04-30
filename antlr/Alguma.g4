grammar Alguma;

@header{
    package antlr;
}

programa: (blocdec)? blocalg EOF #NPrograma;
blocdec: DELIM 'DECLARACAO' (declaracao)* #NBlocoDeclaracao;
declaracao: TIPO VAR #NDeclaracao;
blocalg: DELIM 'ALGORITMO' (comando)* #NBlocoAlgoritmo;

comando: ler | imprimir | condicao | repeticao | atribuicao | WS;

ler: 'LER' VAR;
imprimir: 'IMPRIMIR' (operacaoarit|operando|operacaolog) #NImprimir;
condicao: 'SE' operacaolog 'ENTAO'#NCondicao;
repeticao: 'ENQUANTO' operacaolog 'INICIO' comando 'FIM' #NRepeticao;
atribuicao: 'ATRIBUIR' (operacaoarit|operando|operacaolog) 'A' VAR #NAtribuicao;

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
