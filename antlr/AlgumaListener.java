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
	 * Enter a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterNComando(AlgumaParser.NComandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitNComando(AlgumaParser.NComandoContext ctx);
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