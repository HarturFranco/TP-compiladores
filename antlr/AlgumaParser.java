// Generated from Alguma.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DELIM=12, TIPO=13, VAR=14, NUM=15, OPARIT=16, OPREL=17, 
		STR=18, WS=19;
	public static final int
		RULE_programa = 0, RULE_blocdec = 1, RULE_declaracao = 2, RULE_blocalg = 3, 
		RULE_comando = 4, RULE_operacaoarit = 5, RULE_operacaolog = 6, RULE_operando = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "blocdec", "declaracao", "blocalg", "comando", "operacaoarit", 
			"operacaolog", "operando"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACAO'", "'ALGORITMO'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", 
			"'ENQUANTO'", "'INICIO'", "'FIM'", "'ATRIBUIR'", "'A'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DELIM", "TIPO", "VAR", "NUM", "OPARIT", "OPREL", "STR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NProgramaContext extends ProgramaContext {
		public BlocalgContext blocalg() {
			return getRuleContext(BlocalgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlgumaParser.EOF, 0); }
		public BlocdecContext blocdec() {
			return getRuleContext(BlocdecContext.class,0);
		}
		public NProgramaContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			_localctx = new NProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(16);
				blocdec();
				}
				break;
			}
			setState(19);
			blocalg();
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocdecContext extends ParserRuleContext {
		public BlocdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocdec; }
	 
		public BlocdecContext() { }
		public void copyFrom(BlocdecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NBlocoDeclaracaoContext extends BlocdecContext {
		public TerminalNode DELIM() { return getToken(AlgumaParser.DELIM, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public NBlocoDeclaracaoContext(BlocdecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNBlocoDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNBlocoDeclaracao(this);
		}
	}

	public final BlocdecContext blocdec() throws RecognitionException {
		BlocdecContext _localctx = new BlocdecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocdec);
		int _la;
		try {
			_localctx = new NBlocoDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(DELIM);
			setState(23);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(24);
				declaracao();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracaoContext extends DeclaracaoContext {
		public TerminalNode TIPO() { return getToken(AlgumaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(AlgumaParser.VAR, 0); }
		public NDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(TIPO);
			setState(31);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocalgContext extends ParserRuleContext {
		public BlocalgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocalg; }
	 
		public BlocalgContext() { }
		public void copyFrom(BlocalgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NBlocoAlgoritmoContext extends BlocalgContext {
		public TerminalNode DELIM() { return getToken(AlgumaParser.DELIM, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public NBlocoAlgoritmoContext(BlocalgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNBlocoAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNBlocoAlgoritmo(this);
		}
	}

	public final BlocalgContext blocalg() throws RecognitionException {
		BlocalgContext _localctx = new BlocalgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blocalg);
		try {
			_localctx = new NBlocoAlgoritmoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(DELIM);
			setState(34);
			match(T__1);
			setState(35);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComandoContext extends ComandoContext {
		public List<TerminalNode> VAR() { return getTokens(AlgumaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(AlgumaParser.VAR, i);
		}
		public List<OperacaologContext> operacaolog() {
			return getRuleContexts(OperacaologContext.class);
		}
		public OperacaologContext operacaolog(int i) {
			return getRuleContext(OperacaologContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<OperacaoaritContext> operacaoarit() {
			return getRuleContexts(OperacaoaritContext.class);
		}
		public OperacaoaritContext operacaoarit(int i) {
			return getRuleContext(OperacaoaritContext.class,i);
		}
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public NComandoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		int _la;
		try {
			_localctx = new NComandoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9))) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(37);
					match(T__2);
					setState(38);
					match(VAR);
					}
					break;
				case T__3:
					{
					setState(39);
					match(T__3);
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(40);
						operacaoarit();
						}
						break;
					case 2:
						{
						setState(41);
						operando();
						}
						break;
					case 3:
						{
						setState(42);
						operacaolog();
						}
						break;
					}
					}
					break;
				case T__4:
					{
					setState(45);
					match(T__4);
					setState(46);
					operacaolog();
					setState(47);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(49);
					match(T__6);
					setState(50);
					operacaolog();
					setState(51);
					match(T__7);
					setState(52);
					comando();
					setState(53);
					match(T__8);
					}
					break;
				case T__9:
					{
					setState(55);
					match(T__9);
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(56);
						operacaoarit();
						}
						break;
					case 2:
						{
						setState(57);
						operando();
						}
						break;
					case 3:
						{
						setState(58);
						operacaolog();
						}
						break;
					}
					setState(61);
					match(T__10);
					setState(62);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacaoaritContext extends ParserRuleContext {
		public OperacaoaritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoarit; }
	 
		public OperacaoaritContext() { }
		public void copyFrom(OperacaoaritContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperacaoAritContext extends OperacaoaritContext {
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public TerminalNode OPARIT() { return getToken(AlgumaParser.OPARIT, 0); }
		public OperacaoaritContext operacaoarit() {
			return getRuleContext(OperacaoaritContext.class,0);
		}
		public NOperacaoAritContext(OperacaoaritContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNOperacaoArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNOperacaoArit(this);
		}
	}

	public final OperacaoaritContext operacaoarit() throws RecognitionException {
		OperacaoaritContext _localctx = new OperacaoaritContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacaoarit);
		try {
			_localctx = new NOperacaoAritContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			operando();
			setState(70);
			match(OPARIT);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(71);
				operacaoarit();
				}
				break;
			case 2:
				{
				setState(72);
				operando();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacaologContext extends ParserRuleContext {
		public OperacaologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaolog; }
	 
		public OperacaologContext() { }
		public void copyFrom(OperacaologContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperacaoLogContext extends OperacaologContext {
		public TerminalNode OPREL() { return getToken(AlgumaParser.OPREL, 0); }
		public List<OperacaoaritContext> operacaoarit() {
			return getRuleContexts(OperacaoaritContext.class);
		}
		public OperacaoaritContext operacaoarit(int i) {
			return getRuleContext(OperacaoaritContext.class,i);
		}
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public NOperacaoLogContext(OperacaologContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNOperacaoLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNOperacaoLog(this);
		}
	}

	public final OperacaologContext operacaolog() throws RecognitionException {
		OperacaologContext _localctx = new OperacaologContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacaolog);
		try {
			_localctx = new NOperacaoLogContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(75);
				operacaoarit();
				}
				break;
			case 2:
				{
				setState(76);
				operando();
				}
				break;
			}
			setState(79);
			match(OPREL);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(80);
				operacaoarit();
				}
				break;
			case 2:
				{
				setState(81);
				operando();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AlgumaParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(AlgumaParser.NUM, 0); }
		public TerminalNode STR() { return getToken(AlgumaParser.STR, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << NUM) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013W\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001"+
		"\u001d\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004,\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004<\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"A\b\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"N\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0000\u0001\u0002\u0000\u000e\u000f\u0012\u0012\\\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001e"+
		"\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\bB\u0001\u0000"+
		"\u0000\u0000\nE\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e"+
		"T\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014\u0015"+
		"\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0005\f\u0000\u0000\u0017\u001b\u0005\u0001\u0000\u0000\u0018\u001a\u0003"+
		"\u0004\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\r\u0000\u0000\u001f \u0005\u000e"+
		"\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\"\u0005\f\u0000\u0000\"#"+
		"\u0005\u0002\u0000\u0000#$\u0003\b\u0004\u0000$\u0007\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0003\u0000\u0000&A\u0005\u000e\u0000\u0000\'+\u0005\u0004"+
		"\u0000\u0000(,\u0003\n\u0005\u0000),\u0003\u000e\u0007\u0000*,\u0003\f"+
		"\u0006\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,A\u0001\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000"+
		"./\u0003\f\u0006\u0000/0\u0005\u0006\u0000\u00000A\u0001\u0000\u0000\u0000"+
		"12\u0005\u0007\u0000\u000023\u0003\f\u0006\u000034\u0005\b\u0000\u0000"+
		"45\u0003\b\u0004\u000056\u0005\t\u0000\u00006A\u0001\u0000\u0000\u0000"+
		"7;\u0005\n\u0000\u00008<\u0003\n\u0005\u00009<\u0003\u000e\u0007\u0000"+
		":<\u0003\f\u0006\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u000b\u0000"+
		"\u0000>?\u0005\u000e\u0000\u0000?A\u0001\u0000\u0000\u0000@%\u0001\u0000"+
		"\u0000\u0000@\'\u0001\u0000\u0000\u0000@-\u0001\u0000\u0000\u0000@1\u0001"+
		"\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0003\u000e\u0007\u0000FI\u0005\u0010"+
		"\u0000\u0000GJ\u0003\n\u0005\u0000HJ\u0003\u000e\u0007\u0000IG\u0001\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000J\u000b\u0001\u0000\u0000\u0000"+
		"KN\u0003\n\u0005\u0000LN\u0003\u000e\u0007\u0000MK\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0005\u0011\u0000"+
		"\u0000PS\u0003\n\u0005\u0000QS\u0003\u000e\u0007\u0000RP\u0001\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000TU\u0007\u0000"+
		"\u0000\u0000U\u000f\u0001\u0000\u0000\u0000\t\u0011\u001b+;@BIMR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}