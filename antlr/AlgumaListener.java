// Generated from Alguma.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterNPrograma(AlgumaParser.NProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitNPrograma(AlgumaParser.NProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NBlocoDeclaracao}
	 * labeled alternative in {@link AlgumaParser#blocdec}.
	 * @param ctx the parse tree
	 */
	void enterNBlocoDeclaracao(AlgumaParser.NBlocoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NBlocoDeclaracao}
	 * labeled alternative in {@link AlgumaParser#blocdec}.
	 * @param ctx the parse tree
	 */
	void exitNBlocoDeclaracao(AlgumaParser.NBlocoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(AlgumaParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(AlgumaParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NBlocoAlgoritmo}
	 * labeled alternative in {@link AlgumaParser#blocalg}.
	 * @param ctx the parse tree
	 */
	void enterNBlocoAlgoritmo(AlgumaParser.NBlocoAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NBlocoAlgoritmo}
	 * labeled alternative in {@link AlgumaParser#blocalg}.
	 * @param ctx the parse tree
	 */
	void exitNBlocoAlgoritmo(AlgumaParser.NBlocoAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(AlgumaParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(AlgumaParser.LerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NImprimir}
	 * labeled alternative in {@link AlgumaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterNImprimir(AlgumaParser.NImprimirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NImprimir}
	 * labeled alternative in {@link AlgumaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitNImprimir(AlgumaParser.NImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCondicao}
	 * labeled alternative in {@link AlgumaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterNCondicao(AlgumaParser.NCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCondicao}
	 * labeled alternative in {@link AlgumaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitNCondicao(AlgumaParser.NCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link AlgumaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterNRepeticao(AlgumaParser.NRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link AlgumaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitNRepeticao(AlgumaParser.NRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link AlgumaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(AlgumaParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link AlgumaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(AlgumaParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacaoArit}
	 * labeled alternative in {@link AlgumaParser#operacaoarit}.
	 * @param ctx the parse tree
	 */
	void enterNOperacaoArit(AlgumaParser.NOperacaoAritContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacaoArit}
	 * labeled alternative in {@link AlgumaParser#operacaoarit}.
	 * @param ctx the parse tree
	 */
	void exitNOperacaoArit(AlgumaParser.NOperacaoAritContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacaoLog}
	 * labeled alternative in {@link AlgumaParser#operacaolog}.
	 * @param ctx the parse tree
	 */
	void enterNOperacaoLog(AlgumaParser.NOperacaoLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacaoLog}
	 * labeled alternative in {@link AlgumaParser#operacaolog}.
	 * @param ctx the parse tree
	 */
	void exitNOperacaoLog(AlgumaParser.NOperacaoLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(AlgumaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(AlgumaParser.OperandoContext ctx);
}