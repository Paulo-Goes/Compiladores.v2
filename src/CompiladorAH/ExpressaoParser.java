package CompiladorAH;// Generated from C:/Users/Paulo/IdeaProjects/Compiladores.v2/src/Expressao.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		NEWLINE=60, ID=61, NUM_INT=62, NUM_DEC=63, TEXTO=64;
	public static final int
		RULE_programa = 0, RULE_declarar = 1, RULE_declararVAR = 2, RULE_declararPrintln = 3, 
		RULE_expr = 4, RULE_termo = 5, RULE_type = 6, RULE_declararFunc = 7, RULE_parametros = 8, 
		RULE_parametro = 9, RULE_bloco = 10, RULE_coment = 11, RULE_atribuicao = 12, 
		RULE_estruturaControle = 13, RULE_caseLista = 14, RULE_caseDecl = 15, 
		RULE_declararEstruct = 16, RULE_array = 17, RULE_arrayInicializacao = 18, 
		RULE_expressao = 19, RULE_expreLogica = 20, RULE_expreRelacional = 21, 
		RULE_expreAritmetica = 22, RULE_expreMulti = 23, RULE_expreUnaria = 24, 
		RULE_exprePostfix = 25, RULE_argumentos = 26, RULE_primaria = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declarar", "declararVAR", "declararPrintln", "expr", "termo", 
			"type", "declararFunc", "parametros", "parametro", "bloco", "coment", 
			"atribuicao", "estruturaControle", "caseLista", "caseDecl", "declararEstruct", 
			"array", "arrayInicializacao", "expressao", "expreLogica", "expreRelacional", 
			"expreAritmetica", "expreMulti", "expreUnaria", "exprePostfix", "argumentos", 
			"primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'println'", "'('", "')'", "'+'", "'int'", 
			"'float'", "'double'", "'char'", "'boolean'", "'vet'", "'void'", "','", 
			"'{'", "'}'", "'//'", "'/*'", "'*/'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'&&='", "'||='", "'if'", "'else'", "'while'", "'for'", "'switch'", 
			"'break'", "'continue'", "'return'", "'case'", "':'", "'default'", "'struct'", 
			"'expressaoLista'", "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'.'", "'->'", 
			"'vazio'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEWLINE", "ID", "NUM_INT", "NUM_DEC", "TEXTO"
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
	public String getGrammarFileName() { return "Expressao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressaoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressaoParser.NEWLINE, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305844244555431456L) != 0)) {
				{
				{
				setState(56);
				declarar();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(57);
					match(NEWLINE);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararContext extends ParserRuleContext {
		public DeclararVARContext declararVAR() {
			return getRuleContext(DeclararVARContext.class,0);
		}
		public DeclararFuncContext declararFunc() {
			return getRuleContext(DeclararFuncContext.class,0);
		}
		public DeclararEstructContext declararEstruct() {
			return getRuleContext(DeclararEstructContext.class,0);
		}
		public ComentContext coment() {
			return getRuleContext(ComentContext.class,0);
		}
		public ArrayInicializacaoContext arrayInicializacao() {
			return getRuleContext(ArrayInicializacaoContext.class,0);
		}
		public EstruturaControleContext estruturaControle() {
			return getRuleContext(EstruturaControleContext.class,0);
		}
		public DeclararPrintlnContext declararPrintln() {
			return getRuleContext(DeclararPrintlnContext.class,0);
		}
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarar);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				declararVAR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				declararFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				declararEstruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				coment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				arrayInicializacao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				estruturaControle();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				declararPrintln();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararVARContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclararVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVAR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterDeclararVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitDeclararVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitDeclararVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVARContext declararVAR() throws RecognitionException {
		DeclararVARContext _localctx = new DeclararVARContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declararVAR);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65024L) != 0)) {
					{
					{
					setState(77);
					type();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(ID);
				setState(84);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				type();
				setState(86);
				match(ID);
				setState(87);
				match(T__1);
				setState(88);
				expressao();
				setState(89);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				type();
				setState(92);
				match(ID);
				setState(93);
				match(T__2);
				setState(94);
				match(T__3);
				setState(95);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				type();
				setState(98);
				match(ID);
				setState(99);
				match(T__2);
				setState(100);
				match(T__3);
				setState(101);
				match(T__1);
				setState(102);
				expressao();
				setState(103);
				match(T__0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararPrintlnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclararPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterDeclararPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitDeclararPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitDeclararPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararPrintlnContext declararPrintln() throws RecognitionException {
		DeclararPrintlnContext _localctx = new DeclararPrintlnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declararPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__4);
			setState(108);
			match(T__5);
			setState(109);
			expr();
			setState(110);
			match(T__6);
			setState(111);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			termo();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(114);
				match(T__7);
				setState(115);
				termo();
				}
				}
				setState(120);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public TerminalNode TEXTO() { return getToken(ExpressaoParser.TEXTO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXTO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65024L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararFuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclararFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterDeclararFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitDeclararFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitDeclararFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararFuncContext declararFunc() throws RecognitionException {
		DeclararFuncContext _localctx = new DeclararFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declararFunc);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				type();
				setState(126);
				match(ID);
				setState(127);
				match(T__5);
				setState(128);
				parametros();
				setState(129);
				match(T__6);
				setState(130);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				type();
				setState(133);
				match(ID);
				setState(134);
				match(T__5);
				setState(135);
				match(T__6);
				setState(136);
				bloco();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				parametro();
				setState(142);
				match(T__15);
				setState(143);
				parametros();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametro);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				type();
				setState(148);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				type();
				setState(151);
				match(ID);
				setState(152);
				match(T__2);
				setState(153);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				type();
				setState(156);
				match(ID);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressaoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressaoParser.NEWLINE, i);
		}
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__16);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(161);
				match(NEWLINE);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305844244555431456L) != 0)) {
				{
				{
				setState(167);
				declarar();
				setState(168);
				match(NEWLINE);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComentContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressaoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressaoParser.NEWLINE, i);
		}
		public ComentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterComent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitComent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitComent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentContext coment() throws RecognitionException {
		ComentContext _localctx = new ComentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_coment);
		int _la;
		try {
			int _alt;
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__18);
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__19);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -1048577L) != 0)) {
					{
					{
					setState(185);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__20) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExpressaoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExpressaoParser.ID, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicao);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ID);
				setState(195);
				match(T__1);
				setState(196);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(ID);
				setState(198);
				match(T__21);
				setState(199);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(ID);
				setState(201);
				match(T__22);
				setState(202);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(ID);
				setState(204);
				match(T__23);
				setState(205);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T__24);
				setState(208);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(ID);
				setState(210);
				match(T__25);
				setState(211);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(ID);
				setState(213);
				match(T__26);
				setState(214);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				match(ID);
				setState(216);
				match(T__27);
				setState(217);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				match(ID);
				setState(219);
				match(T__1);
				setState(220);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(221);
				match(ID);
				setState(222);
				match(T__21);
				setState(223);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(224);
				match(ID);
				setState(225);
				match(T__22);
				setState(226);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(227);
				match(ID);
				setState(228);
				match(T__23);
				setState(229);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(230);
				match(ID);
				setState(231);
				match(T__24);
				setState(232);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(233);
				match(ID);
				setState(234);
				match(T__25);
				setState(235);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(236);
				match(ID);
				setState(237);
				match(T__26);
				setState(238);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(239);
				match(ID);
				setState(240);
				match(T__27);
				setState(241);
				match(ID);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaControleContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CaseListaContext caseLista() {
			return getRuleContext(CaseListaContext.class,0);
		}
		public EstruturaControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaControle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterEstruturaControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitEstruturaControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitEstruturaControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaControleContext estruturaControle() throws RecognitionException {
		EstruturaControleContext _localctx = new EstruturaControleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_estruturaControle);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__28);
				setState(245);
				match(T__5);
				setState(246);
				expressao();
				setState(247);
				match(T__6);
				setState(248);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__28);
				setState(251);
				match(T__5);
				setState(252);
				expressao();
				setState(253);
				match(T__6);
				setState(254);
				bloco();
				setState(255);
				match(T__29);
				setState(256);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__30);
				setState(259);
				match(T__5);
				setState(260);
				expressao();
				setState(261);
				match(T__6);
				setState(262);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(T__31);
				setState(265);
				match(T__5);
				setState(266);
				expressao();
				setState(267);
				match(T__0);
				setState(268);
				expressao();
				setState(269);
				match(T__0);
				setState(270);
				expressao();
				setState(271);
				match(T__6);
				setState(272);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(T__32);
				setState(275);
				match(T__5);
				setState(276);
				expressao();
				setState(277);
				match(T__6);
				setState(278);
				caseLista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				match(T__33);
				setState(281);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(T__34);
				setState(283);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				match(T__35);
				setState(285);
				expressao();
				setState(286);
				match(T__0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseListaContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressaoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressaoParser.NEWLINE, i);
		}
		public List<CaseDeclContext> caseDecl() {
			return getRuleContexts(CaseDeclContext.class);
		}
		public CaseDeclContext caseDecl(int i) {
			return getRuleContext(CaseDeclContext.class,i);
		}
		public CaseListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterCaseLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitCaseLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitCaseLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListaContext caseLista() throws RecognitionException {
		CaseListaContext _localctx = new CaseListaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_caseLista);
		int _la;
		try {
			int _alt;
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						match(NEWLINE);
						setState(291);
						caseDecl();
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__36 || _la==T__38) {
					{
					{
					setState(297);
					caseDecl();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterCaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitCaseDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitCaseDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseDeclContext caseDecl() throws RecognitionException {
		CaseDeclContext _localctx = new CaseDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caseDecl);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__36);
				setState(306);
				expressao();
				setState(307);
				match(T__37);
				setState(308);
				bloco();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(T__38);
				setState(311);
				match(T__37);
				setState(312);
				bloco();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararEstructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public List<DeclararVARContext> declararVAR() {
			return getRuleContexts(DeclararVARContext.class);
		}
		public DeclararVARContext declararVAR(int i) {
			return getRuleContext(DeclararVARContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExpressaoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExpressaoParser.NEWLINE, i);
		}
		public DeclararEstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararEstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterDeclararEstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitDeclararEstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitDeclararEstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararEstructContext declararEstruct() throws RecognitionException {
		DeclararEstructContext _localctx = new DeclararEstructContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declararEstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__39);
			setState(316);
			match(ID);
			setState(317);
			match(T__16);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764513820605952L) != 0)) {
				{
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(318);
					match(NEWLINE);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				declararVAR();
				setState(325);
				match(NEWLINE);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(T__17);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(333);
				match(NEWLINE);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(ID);
				setState(342);
				match(T__2);
				setState(343);
				expressao();
				setState(344);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(ID);
				setState(347);
				match(T__2);
				setState(348);
				match(T__3);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInicializacaoContext extends ParserRuleContext {
		public ArrayInicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterArrayInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitArrayInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitArrayInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInicializacaoContext arrayInicializacao() throws RecognitionException {
		ArrayInicializacaoContext _localctx = new ArrayInicializacaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayInicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__16);
			setState(352);
			match(T__40);
			setState(353);
			match(T__17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpreLogicaContext expreLogica() {
			return getRuleContext(ExpreLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressao);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				expreLogica(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreLogicaContext extends ParserRuleContext {
		public ExpreRelacionalContext expreRelacional() {
			return getRuleContext(ExpreRelacionalContext.class,0);
		}
		public ExpreLogicaContext expreLogica() {
			return getRuleContext(ExpreLogicaContext.class,0);
		}
		public ExpreLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpreLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpreLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpreLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreLogicaContext expreLogica() throws RecognitionException {
		return expreLogica(0);
	}

	private ExpreLogicaContext expreLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpreLogicaContext _localctx = new ExpreLogicaContext(_ctx, _parentState);
		ExpreLogicaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expreLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__50:
			case T__54:
			case T__55:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				{
				setState(360);
				expreRelacional();
				}
				break;
			case T__43:
				{
				setState(361);
				match(T__43);
				setState(362);
				expreRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreLogica);
						setState(365);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(366);
						match(T__41);
						setState(367);
						expreRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpreLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreLogica);
						setState(368);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(369);
						match(T__42);
						setState(370);
						expreRelacional();
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreRelacionalContext extends ParserRuleContext {
		public List<ExpreAritmeticaContext> expreAritmetica() {
			return getRuleContexts(ExpreAritmeticaContext.class);
		}
		public ExpreAritmeticaContext expreAritmetica(int i) {
			return getRuleContext(ExpreAritmeticaContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ExpressaoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExpressaoParser.ID, i);
		}
		public ExpreRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpreRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpreRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpreRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreRelacionalContext expreRelacional() throws RecognitionException {
		ExpreRelacionalContext _localctx = new ExpreRelacionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expreRelacional);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				expreAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				expreAritmetica(0);
				setState(378);
				match(T__44);
				setState(379);
				expreAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				expreAritmetica(0);
				setState(382);
				match(T__45);
				setState(383);
				expreAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				expreAritmetica(0);
				setState(386);
				match(T__46);
				setState(387);
				expreAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				expreAritmetica(0);
				setState(390);
				match(T__47);
				setState(391);
				expreAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				expreAritmetica(0);
				setState(394);
				match(T__48);
				setState(395);
				expreAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				expreAritmetica(0);
				setState(398);
				match(T__49);
				setState(399);
				expreAritmetica(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(401);
				match(ID);
				setState(402);
				match(T__45);
				setState(403);
				match(ID);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreAritmeticaContext extends ParserRuleContext {
		public ExpreMultiContext expreMulti() {
			return getRuleContext(ExpreMultiContext.class,0);
		}
		public ExpreAritmeticaContext expreAritmetica() {
			return getRuleContext(ExpreAritmeticaContext.class,0);
		}
		public ExpreAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpreAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpreAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpreAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreAritmeticaContext expreAritmetica() throws RecognitionException {
		return expreAritmetica(0);
	}

	private ExpreAritmeticaContext expreAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpreAritmeticaContext _localctx = new ExpreAritmeticaContext(_ctx, _parentState);
		ExpreAritmeticaContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expreAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(407);
			expreMulti(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreAritmetica);
						setState(409);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(410);
						match(T__7);
						setState(411);
						expreMulti(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpreAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreAritmetica);
						setState(412);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(413);
						match(T__50);
						setState(414);
						expreMulti(0);
						}
						break;
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreMultiContext extends ParserRuleContext {
		public ExpreUnariaContext expreUnaria() {
			return getRuleContext(ExpreUnariaContext.class,0);
		}
		public ExpreMultiContext expreMulti() {
			return getRuleContext(ExpreMultiContext.class,0);
		}
		public ExpreMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpreMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpreMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpreMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreMultiContext expreMulti() throws RecognitionException {
		return expreMulti(0);
	}

	private ExpreMultiContext expreMulti(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpreMultiContext _localctx = new ExpreMultiContext(_ctx, _parentState);
		ExpreMultiContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expreMulti, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(421);
			expreUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(423);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(424);
						match(T__51);
						setState(425);
						expreUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(426);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(427);
						match(T__52);
						setState(428);
						expreUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpreMultiContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expreMulti);
						setState(429);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(430);
						match(T__53);
						setState(431);
						expreUnaria();
						}
						break;
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpreUnariaContext extends ParserRuleContext {
		public ExprePostfixContext exprePostfix() {
			return getRuleContext(ExprePostfixContext.class,0);
		}
		public ExpreUnariaContext expreUnaria() {
			return getRuleContext(ExpreUnariaContext.class,0);
		}
		public ExpreUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExpreUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExpreUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExpreUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpreUnariaContext expreUnaria() throws RecognitionException {
		ExpreUnariaContext _localctx = new ExpreUnariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expreUnaria);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				exprePostfix();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(T__50);
				setState(439);
				expreUnaria();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(T__54);
				setState(441);
				exprePostfix();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(T__55);
				setState(443);
				exprePostfix();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprePostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public ExprePostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprePostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterExprePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitExprePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitExprePostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprePostfixContext exprePostfix() throws RecognitionException {
		ExprePostfixContext _localctx = new ExprePostfixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprePostfix);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				primaria();
				setState(448);
				match(T__2);
				setState(449);
				expressao();
				setState(450);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				primaria();
				setState(453);
				match(T__5);
				setState(454);
				argumentos();
				setState(455);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				primaria();
				setState(458);
				match(T__56);
				setState(459);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				primaria();
				setState(462);
				match(T__57);
				setState(463);
				match(ID);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__58) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressaoParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(ExpressaoParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(ExpressaoParser.NUM_DEC, 0); }
		public TerminalNode TEXTO() { return getToken(ExpressaoParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).enterPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressaoListener ) ((ExpressaoListener)listener).exitPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressaoVisitor ) return ((ExpressaoVisitor<? extends T>)visitor).visitPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primaria);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				match(NUM_DEC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				match(TEXTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				match(T__5);
				setState(475);
				expressao();
				setState(476);
				match(T__6);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expreLogica_sempred((ExpreLogicaContext)_localctx, predIndex);
		case 22:
			return expreAritmetica_sempred((ExpreAritmeticaContext)_localctx, predIndex);
		case 23:
			return expreMulti_sempred((ExpreMultiContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expreLogica_sempred(ExpreLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expreAritmetica_sempred(ExpreAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expreMulti_sempred(ExpreMultiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u01e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"L\b\u0001\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002R\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004u\b\u0004\n\u0004\f\u0004x\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u008b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0092"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u009f\b\t\u0001\n\u0001\n\u0005\n\u00a3\b\n"+
		"\n\n\f\n\u00a6\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ab\b\n\n\n\f\n\u00ae"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u00b4\b\u000b"+
		"\n\u000b\f\u000b\u00b7\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00bb"+
		"\b\u000b\n\u000b\f\u000b\u00be\t\u000b\u0001\u000b\u0003\u000b\u00c1\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f3\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0121\b\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0125\b\u000e\n\u000e\f\u000e\u0128\t\u000e\u0001"+
		"\u000e\u0005\u000e\u012b\b\u000e\n\u000e\f\u000e\u012e\t\u000e\u0003\u000e"+
		"\u0130\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013a\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0140\b\u0010\n\u0010"+
		"\f\u0010\u0143\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0148\b\u0010\n\u0010\f\u0010\u014b\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u014f\b\u0010\n\u0010\f\u0010\u0152\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u015e\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0166\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u016c\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0174\b\u0014\n\u0014\f\u0014\u0177\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0195\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01a0\b\u0016\n\u0016\f\u0016\u01a3\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u01b1\b\u0017\n\u0017\f\u0017\u01b4\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01bd\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d2\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01df\b\u001b\u0001"+
		"\u001b\u0000\u0003(,.\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0005\u0002"+
		"\u0000==@@\u0001\u0000\t\u000f\u0001\u0000<<\u0001\u0000\u0015\u0015\u0002"+
		"\u0000));;\u0214\u0000A\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000"+
		"\u0000\u0004i\u0001\u0000\u0000\u0000\u0006k\u0001\u0000\u0000\u0000\b"+
		"q\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000"+
		"\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000\u0000"+
		"\u0000\u0012\u009e\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000"+
		"\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00f2\u0001\u0000\u0000"+
		"\u0000\u001a\u0120\u0001\u0000\u0000\u0000\u001c\u012f\u0001\u0000\u0000"+
		"\u0000\u001e\u0139\u0001\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000"+
		"\"\u015d\u0001\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u0165"+
		"\u0001\u0000\u0000\u0000(\u016b\u0001\u0000\u0000\u0000*\u0194\u0001\u0000"+
		"\u0000\u0000,\u0196\u0001\u0000\u0000\u0000.\u01a4\u0001\u0000\u0000\u0000"+
		"0\u01bc\u0001\u0000\u0000\u00002\u01d1\u0001\u0000\u0000\u00004\u01d3"+
		"\u0001\u0000\u0000\u00006\u01de\u0001\u0000\u0000\u00008<\u0003\u0002"+
		"\u0001\u00009;\u0005<\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?8\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0001\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DL\u0003"+
		"\u0004\u0002\u0000EL\u0003\u000e\u0007\u0000FL\u0003 \u0010\u0000GL\u0003"+
		"\u0016\u000b\u0000HL\u0003$\u0012\u0000IL\u0003\u001a\r\u0000JL\u0003"+
		"\u0006\u0003\u0000KD\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000"+
		"KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0003\u0001"+
		"\u0000\u0000\u0000MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005=\u0000\u0000"+
		"Tj\u0005\u0001\u0000\u0000UV\u0003\f\u0006\u0000VW\u0005=\u0000\u0000"+
		"WX\u0005\u0002\u0000\u0000XY\u0003&\u0013\u0000YZ\u0005\u0001\u0000\u0000"+
		"Zj\u0001\u0000\u0000\u0000[\\\u0003\f\u0006\u0000\\]\u0005=\u0000\u0000"+
		"]^\u0005\u0003\u0000\u0000^_\u0005\u0004\u0000\u0000_`\u0005\u0001\u0000"+
		"\u0000`j\u0001\u0000\u0000\u0000ab\u0003\f\u0006\u0000bc\u0005=\u0000"+
		"\u0000cd\u0005\u0003\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005\u0002"+
		"\u0000\u0000fg\u0003&\u0013\u0000gh\u0005\u0001\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000iP\u0001\u0000\u0000\u0000iU\u0001\u0000\u0000\u0000i[\u0001"+
		"\u0000\u0000\u0000ia\u0001\u0000\u0000\u0000j\u0005\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0005\u0000\u0000lm\u0005\u0006\u0000\u0000mn\u0003\b\u0004"+
		"\u0000no\u0005\u0007\u0000\u0000op\u0005\u0001\u0000\u0000p\u0007\u0001"+
		"\u0000\u0000\u0000qv\u0003\n\u0005\u0000rs\u0005\b\u0000\u0000su\u0003"+
		"\n\u0005\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\t\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yz\u0007\u0000\u0000\u0000z\u000b\u0001\u0000"+
		"\u0000\u0000{|\u0007\u0001\u0000\u0000|\r\u0001\u0000\u0000\u0000}~\u0003"+
		"\f\u0006\u0000~\u007f\u0005=\u0000\u0000\u007f\u0080\u0005\u0006\u0000"+
		"\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082\u0005\u0007\u0000\u0000"+
		"\u0082\u0083\u0003\u0014\n\u0000\u0083\u008b\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0003\f\u0006\u0000\u0085\u0086\u0005=\u0000\u0000\u0086\u0087"+
		"\u0005\u0006\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089"+
		"\u0003\u0014\n\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a}\u0001"+
		"\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008b\u000f\u0001"+
		"\u0000\u0000\u0000\u008c\u0092\u0003\u0012\t\u0000\u008d\u008e\u0003\u0012"+
		"\t\u0000\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0090\u0003\u0010\b"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000"+
		"\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0003\f\u0006\u0000\u0094\u0095\u0005=\u0000\u0000"+
		"\u0095\u009f\u0001\u0000\u0000\u0000\u0096\u0097\u0003\f\u0006\u0000\u0097"+
		"\u0098\u0005=\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009a"+
		"\u0005\u0004\u0000\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0003\f\u0006\u0000\u009c\u009d\u0005=\u0000\u0000\u009d\u009f\u0001"+
		"\u0000\u0000\u0000\u009e\u0093\u0001\u0000\u0000\u0000\u009e\u0096\u0001"+
		"\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u0013\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a4\u0005\u0011\u0000\u0000\u00a1\u00a3\u0005"+
		"<\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00ac\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0003\u0002\u0001\u0000\u00a8\u00a9\u0005<\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0012\u0000"+
		"\u0000\u00b0\u0015\u0001\u0000\u0000\u0000\u00b1\u00b5\u0005\u0013\u0000"+
		"\u0000\u00b2\u00b4\b\u0002\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00c1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005\u0014\u0000\u0000"+
		"\u00b9\u00bb\b\u0003\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\u0015\u0000\u0000\u00c0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c1"+
		"\u0017\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005=\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0002\u0000\u0000\u00c4\u00f3\u0003&\u0013\u0000\u00c5\u00c6\u0005"+
		"=\u0000\u0000\u00c6\u00c7\u0005\u0016\u0000\u0000\u00c7\u00f3\u0003&\u0013"+
		"\u0000\u00c8\u00c9\u0005=\u0000\u0000\u00c9\u00ca\u0005\u0017\u0000\u0000"+
		"\u00ca\u00f3\u0003&\u0013\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0018\u0000\u0000\u00cd\u00f3\u0003&\u0013\u0000\u00ce\u00cf\u0005"+
		"=\u0000\u0000\u00cf\u00d0\u0005\u0019\u0000\u0000\u00d0\u00f3\u0003&\u0013"+
		"\u0000\u00d1\u00d2\u0005=\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000"+
		"\u00d3\u00f3\u0003&\u0013\u0000\u00d4\u00d5\u0005=\u0000\u0000\u00d5\u00d6"+
		"\u0005\u001b\u0000\u0000\u00d6\u00f3\u0003&\u0013\u0000\u00d7\u00d8\u0005"+
		"=\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9\u00f3\u0003&\u0013"+
		"\u0000\u00da\u00db\u0005=\u0000\u0000\u00db\u00dc\u0005\u0002\u0000\u0000"+
		"\u00dc\u00f3\u0005=\u0000\u0000\u00dd\u00de\u0005=\u0000\u0000\u00de\u00df"+
		"\u0005\u0016\u0000\u0000\u00df\u00f3\u0005=\u0000\u0000\u00e0\u00e1\u0005"+
		"=\u0000\u0000\u00e1\u00e2\u0005\u0017\u0000\u0000\u00e2\u00f3\u0005=\u0000"+
		"\u0000\u00e3\u00e4\u0005=\u0000\u0000\u00e4\u00e5\u0005\u0018\u0000\u0000"+
		"\u00e5\u00f3\u0005=\u0000\u0000\u00e6\u00e7\u0005=\u0000\u0000\u00e7\u00e8"+
		"\u0005\u0019\u0000\u0000\u00e8\u00f3\u0005=\u0000\u0000\u00e9\u00ea\u0005"+
		"=\u0000\u0000\u00ea\u00eb\u0005\u001a\u0000\u0000\u00eb\u00f3\u0005=\u0000"+
		"\u0000\u00ec\u00ed\u0005=\u0000\u0000\u00ed\u00ee\u0005\u001b\u0000\u0000"+
		"\u00ee\u00f3\u0005=\u0000\u0000\u00ef\u00f0\u0005=\u0000\u0000\u00f0\u00f1"+
		"\u0005\u001c\u0000\u0000\u00f1\u00f3\u0005=\u0000\u0000\u00f2\u00c2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00c5\u0001\u0000\u0000\u0000\u00f2\u00c8\u0001"+
		"\u0000\u0000\u0000\u00f2\u00cb\u0001\u0000\u0000\u0000\u00f2\u00ce\u0001"+
		"\u0000\u0000\u0000\u00f2\u00d1\u0001\u0000\u0000\u0000\u00f2\u00d4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00d7\u0001\u0000\u0000\u0000\u00f2\u00da\u0001"+
		"\u0000\u0000\u0000\u00f2\u00dd\u0001\u0000\u0000\u0000\u00f2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00e3\u0001\u0000\u0000\u0000\u00f2\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f3\u0019\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\u001d\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0006\u0000\u0000\u00f6\u00f7\u0003&\u0013\u0000\u00f7\u00f8\u0005\u0007"+
		"\u0000\u0000\u00f8\u00f9\u0003\u0014\n\u0000\u00f9\u0121\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u001d\u0000\u0000\u00fb\u00fc\u0005\u0006\u0000"+
		"\u0000\u00fc\u00fd\u0003&\u0013\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000"+
		"\u00fe\u00ff\u0003\u0014\n\u0000\u00ff\u0100\u0005\u001e\u0000\u0000\u0100"+
		"\u0101\u0003\u0014\n\u0000\u0101\u0121\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u001f\u0000\u0000\u0103\u0104\u0005\u0006\u0000\u0000\u0104\u0105"+
		"\u0003&\u0013\u0000\u0105\u0106\u0005\u0007\u0000\u0000\u0106\u0107\u0003"+
		"\u0014\n\u0000\u0107\u0121\u0001\u0000\u0000\u0000\u0108\u0109\u0005 "+
		"\u0000\u0000\u0109\u010a\u0005\u0006\u0000\u0000\u010a\u010b\u0003&\u0013"+
		"\u0000\u010b\u010c\u0005\u0001\u0000\u0000\u010c\u010d\u0003&\u0013\u0000"+
		"\u010d\u010e\u0005\u0001\u0000\u0000\u010e\u010f\u0003&\u0013\u0000\u010f"+
		"\u0110\u0005\u0007\u0000\u0000\u0110\u0111\u0003\u0014\n\u0000\u0111\u0121"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0005!\u0000\u0000\u0113\u0114\u0005"+
		"\u0006\u0000\u0000\u0114\u0115\u0003&\u0013\u0000\u0115\u0116\u0005\u0007"+
		"\u0000\u0000\u0116\u0117\u0003\u001c\u000e\u0000\u0117\u0121\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005\"\u0000\u0000\u0119\u0121\u0005\u0001\u0000"+
		"\u0000\u011a\u011b\u0005#\u0000\u0000\u011b\u0121\u0005\u0001\u0000\u0000"+
		"\u011c\u011d\u0005$\u0000\u0000\u011d\u011e\u0003&\u0013\u0000\u011e\u011f"+
		"\u0005\u0001\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u00f4"+
		"\u0001\u0000\u0000\u0000\u0120\u00fa\u0001\u0000\u0000\u0000\u0120\u0102"+
		"\u0001\u0000\u0000\u0000\u0120\u0108\u0001\u0000\u0000\u0000\u0120\u0112"+
		"\u0001\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0120\u011a"+
		"\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0121\u001b"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0005<\u0000\u0000\u0123\u0125\u0003"+
		"\u001e\u000f\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0130\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u012b\u0003\u001e\u000f\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0126\u0001"+
		"\u0000\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u0130\u001d\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005%\u0000\u0000\u0132\u0133\u0003&\u0013"+
		"\u0000\u0133\u0134\u0005&\u0000\u0000\u0134\u0135\u0003\u0014\n\u0000"+
		"\u0135\u013a\u0001\u0000\u0000\u0000\u0136\u0137\u0005\'\u0000\u0000\u0137"+
		"\u0138\u0005&\u0000\u0000\u0138\u013a\u0003\u0014\n\u0000\u0139\u0131"+
		"\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u013a\u001f"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0005(\u0000\u0000\u013c\u013d\u0005"+
		"=\u0000\u0000\u013d\u0149\u0005\u0011\u0000\u0000\u013e\u0140\u0005<\u0000"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0003\u0004\u0002\u0000\u0145\u0146\u0005<\u0000\u0000"+
		"\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0141\u0001\u0000\u0000\u0000"+
		"\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0150\u0005\u0012\u0000\u0000"+
		"\u014d\u014f\u0005<\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0001\u0000\u0000\u0154"+
		"!\u0001\u0000\u0000\u0000\u0155\u0156\u0005=\u0000\u0000\u0156\u0157\u0005"+
		"\u0003\u0000\u0000\u0157\u0158\u0003&\u0013\u0000\u0158\u0159\u0005\u0004"+
		"\u0000\u0000\u0159\u015e\u0001\u0000\u0000\u0000\u015a\u015b\u0005=\u0000"+
		"\u0000\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015e\u0005\u0004\u0000"+
		"\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000"+
		"\u0000\u015e#\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0011\u0000\u0000"+
		"\u0160\u0161\u0005)\u0000\u0000\u0161\u0162\u0005\u0012\u0000\u0000\u0162"+
		"%\u0001\u0000\u0000\u0000\u0163\u0166\u0003\u0018\f\u0000\u0164\u0166"+
		"\u0003(\u0014\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\'\u0001\u0000\u0000\u0000\u0167\u0168\u0006\u0014"+
		"\uffff\uffff\u0000\u0168\u016c\u0003*\u0015\u0000\u0169\u016a\u0005,\u0000"+
		"\u0000\u016a\u016c\u0003*\u0015\u0000\u016b\u0167\u0001\u0000\u0000\u0000"+
		"\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u0175\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\n\u0003\u0000\u0000\u016e\u016f\u0005*\u0000\u0000\u016f"+
		"\u0174\u0003*\u0015\u0000\u0170\u0171\n\u0002\u0000\u0000\u0171\u0172"+
		"\u0005+\u0000\u0000\u0172\u0174\u0003*\u0015\u0000\u0173\u016d\u0001\u0000"+
		"\u0000\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176)\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0178\u0195\u0003,\u0016\u0000\u0179\u017a\u0003,\u0016\u0000\u017a"+
		"\u017b\u0005-\u0000\u0000\u017b\u017c\u0003,\u0016\u0000\u017c\u0195\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0003,\u0016\u0000\u017e\u017f\u0005.\u0000"+
		"\u0000\u017f\u0180\u0003,\u0016\u0000\u0180\u0195\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0003,\u0016\u0000\u0182\u0183\u0005/\u0000\u0000\u0183\u0184"+
		"\u0003,\u0016\u0000\u0184\u0195\u0001\u0000\u0000\u0000\u0185\u0186\u0003"+
		",\u0016\u0000\u0186\u0187\u00050\u0000\u0000\u0187\u0188\u0003,\u0016"+
		"\u0000\u0188\u0195\u0001\u0000\u0000\u0000\u0189\u018a\u0003,\u0016\u0000"+
		"\u018a\u018b\u00051\u0000\u0000\u018b\u018c\u0003,\u0016\u0000\u018c\u0195"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0003,\u0016\u0000\u018e\u018f\u0005"+
		"2\u0000\u0000\u018f\u0190\u0003,\u0016\u0000\u0190\u0195\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005=\u0000\u0000\u0192\u0193\u0005.\u0000\u0000\u0193"+
		"\u0195\u0005=\u0000\u0000\u0194\u0178\u0001\u0000\u0000\u0000\u0194\u0179"+
		"\u0001\u0000\u0000\u0000\u0194\u017d\u0001\u0000\u0000\u0000\u0194\u0181"+
		"\u0001\u0000\u0000\u0000\u0194\u0185\u0001\u0000\u0000\u0000\u0194\u0189"+
		"\u0001\u0000\u0000\u0000\u0194\u018d\u0001\u0000\u0000\u0000\u0194\u0191"+
		"\u0001\u0000\u0000\u0000\u0195+\u0001\u0000\u0000\u0000\u0196\u0197\u0006"+
		"\u0016\uffff\uffff\u0000\u0197\u0198\u0003.\u0017\u0000\u0198\u01a1\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\n\u0002\u0000\u0000\u019a\u019b\u0005\b"+
		"\u0000\u0000\u019b\u01a0\u0003.\u0017\u0000\u019c\u019d\n\u0001\u0000"+
		"\u0000\u019d\u019e\u00053\u0000\u0000\u019e\u01a0\u0003.\u0017\u0000\u019f"+
		"\u0199\u0001\u0000\u0000\u0000\u019f\u019c\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2-\u0001\u0000\u0000\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0006\u0017\uffff\uffff\u0000\u01a5"+
		"\u01a6\u00030\u0018\u0000\u01a6\u01b2\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\n\u0003\u0000\u0000\u01a8\u01a9\u00054\u0000\u0000\u01a9\u01b1\u0003"+
		"0\u0018\u0000\u01aa\u01ab\n\u0002\u0000\u0000\u01ab\u01ac\u00055\u0000"+
		"\u0000\u01ac\u01b1\u00030\u0018\u0000\u01ad\u01ae\n\u0001\u0000\u0000"+
		"\u01ae\u01af\u00056\u0000\u0000\u01af\u01b1\u00030\u0018\u0000\u01b0\u01a7"+
		"\u0001\u0000\u0000\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000\u01b0\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3/\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01bd\u0003"+
		"2\u0019\u0000\u01b6\u01b7\u00053\u0000\u0000\u01b7\u01bd\u00030\u0018"+
		"\u0000\u01b8\u01b9\u00057\u0000\u0000\u01b9\u01bd\u00032\u0019\u0000\u01ba"+
		"\u01bb\u00058\u0000\u0000\u01bb\u01bd\u00032\u0019\u0000\u01bc\u01b5\u0001"+
		"\u0000\u0000\u0000\u01bc\u01b6\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd1\u0001\u0000"+
		"\u0000\u0000\u01be\u01d2\u00036\u001b\u0000\u01bf\u01c0\u00036\u001b\u0000"+
		"\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c2\u0003&\u0013\u0000\u01c2"+
		"\u01c3\u0005\u0004\u0000\u0000\u01c3\u01d2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u00036\u001b\u0000\u01c5\u01c6\u0005\u0006\u0000\u0000\u01c6\u01c7"+
		"\u00034\u001a\u0000\u01c7\u01c8\u0005\u0007\u0000\u0000\u01c8\u01d2\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u00036\u001b\u0000\u01ca\u01cb\u00059\u0000"+
		"\u0000\u01cb\u01cc\u0005=\u0000\u0000\u01cc\u01d2\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\u00036\u001b\u0000\u01ce\u01cf\u0005:\u0000\u0000\u01cf\u01d0"+
		"\u0005=\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01be\u0001"+
		"\u0000\u0000\u0000\u01d1\u01bf\u0001\u0000\u0000\u0000\u01d1\u01c4\u0001"+
		"\u0000\u0000\u0000\u01d1\u01c9\u0001\u0000\u0000\u0000\u01d1\u01cd\u0001"+
		"\u0000\u0000\u0000\u01d23\u0001\u0000\u0000\u0000\u01d3\u01d4\u0007\u0004"+
		"\u0000\u0000\u01d45\u0001\u0000\u0000\u0000\u01d5\u01df\u0005=\u0000\u0000"+
		"\u01d6\u01df\u0003\"\u0011\u0000\u01d7\u01df\u0005>\u0000\u0000\u01d8"+
		"\u01df\u0005?\u0000\u0000\u01d9\u01df\u0005@\u0000\u0000\u01da\u01db\u0005"+
		"\u0006\u0000\u0000\u01db\u01dc\u0003&\u0013\u0000\u01dc\u01dd\u0005\u0007"+
		"\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01d5\u0001\u0000"+
		"\u0000\u0000\u01de\u01d6\u0001\u0000\u0000\u0000\u01de\u01d7\u0001\u0000"+
		"\u0000\u0000\u01de\u01d8\u0001\u0000\u0000\u0000\u01de\u01d9\u0001\u0000"+
		"\u0000\u0000\u01de\u01da\u0001\u0000\u0000\u0000\u01df7\u0001\u0000\u0000"+
		"\u0000$<AKPiv\u008a\u0091\u009e\u00a4\u00ac\u00b5\u00bc\u00c0\u00f2\u0120"+
		"\u0126\u012c\u012f\u0139\u0141\u0149\u0150\u015d\u0165\u016b\u0173\u0175"+
		"\u0194\u019f\u01a1\u01b0\u01b2\u01bc\u01d1\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}