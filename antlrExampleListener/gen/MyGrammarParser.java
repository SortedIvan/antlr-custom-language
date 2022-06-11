// Generated from MyGrammar.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFTCURL=1, RIGHTCURL=2, OPAR=3, CPAR=4, MUL=5, DIV=6, ADD=7, SUB=8, POW=9, 
		FACT=10, NOT=11, AND=12, OR=13, BIGGERTHAN=14, SMALLERTHAN=15, BIGGEROREQUAL=16, 
		SMALLEROREQUAL=17, INT_INIT=18, STRING_INIT=19, BOOL_INIT=20, CHAR_INIT=21, 
		INT_PARAM=22, STRING_PARAM=23, BOOL_PARAM=24, PRINT=25, IF=26, FOR=27, 
		FI=28, WHILE=29, THEN=30, DO=31, DOT=32, ELSE=33, DECLAREFUNVOID=34, DECLAREFUNSTRING=35, 
		DECLAREFUNINT=36, DECLAREFUNBOOL=37, RETURN=38, SAT=39, DEFINEFUN=40, 
		Z3INT=41, ITE=42, Z3AND=43, EQUAL=44, NEQUAL=45, EQUALCHECK=46, COMMA=47, 
		NUMBER=48, WS=49, BOOL=50, STRING=51, ID=52;
	public static final int
		RULE_myStart = 0, RULE_statement = 1, RULE_z3Statement = 2, RULE_z3value = 3, 
		RULE_z3and = 4, RULE_z3ite = 5, RULE_z3comparison = 6, RULE_z3variable_declaration = 7, 
		RULE_z3variable_name = 8, RULE_z3expression = 9, RULE_numberA = 10, RULE_numberB = 11, 
		RULE_numberC = 12, RULE_numberD = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "statement", "z3Statement", "z3value", "z3and", "z3ite", "z3comparison", 
			"z3variable_declaration", "z3variable_name", "z3expression", "numberA", 
			"numberB", "numberC", "numberD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'^'", 
			"'!'", "'not'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'int_var'", 
			"'string_var'", "'bool_var'", "'char_var'", "'int_par'", "'string_par'", 
			"'bool_par'", "'print'", "'if'", "'for'", "'fi'", "'while'", "'then'", 
			"'do'", "'.'", "'else'", "'declare_fun_void'", "'declare_fun_string'", 
			"'declare_fun_int'", "'declare_fun_bool'", "'return'", "'sat'", "'define-fun'", 
			"'Int'", "'ite'", "'and'", "'='", "'!='", "'=='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFTCURL", "RIGHTCURL", "OPAR", "CPAR", "MUL", "DIV", "ADD", "SUB", 
			"POW", "FACT", "NOT", "AND", "OR", "BIGGERTHAN", "SMALLERTHAN", "BIGGEROREQUAL", 
			"SMALLEROREQUAL", "INT_INIT", "STRING_INIT", "BOOL_INIT", "CHAR_INIT", 
			"INT_PARAM", "STRING_PARAM", "BOOL_PARAM", "PRINT", "IF", "FOR", "FI", 
			"WHILE", "THEN", "DO", "DOT", "ELSE", "DECLAREFUNVOID", "DECLAREFUNSTRING", 
			"DECLAREFUNINT", "DECLAREFUNBOOL", "RETURN", "SAT", "DEFINEFUN", "Z3INT", 
			"ITE", "Z3AND", "EQUAL", "NEQUAL", "EQUALCHECK", "COMMA", "NUMBER", "WS", 
			"BOOL", "STRING", "ID"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SAT );
			setState(33);
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

	public static class StatementContext extends ParserRuleContext {
		public List<Z3StatementContext> z3Statement() {
			return getRuleContexts(Z3StatementContext.class);
		}
		public Z3StatementContext z3Statement(int i) {
			return getRuleContext(Z3StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(35);
					z3Statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Z3StatementContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(MyGrammarParser.SAT, 0); }
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public List<Z3valueContext> z3value() {
			return getRuleContexts(Z3valueContext.class);
		}
		public Z3valueContext z3value(int i) {
			return getRuleContext(Z3valueContext.class,i);
		}
		public Z3StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZ3Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZ3Statement(this);
		}
	}

	public final Z3StatementContext z3Statement() throws RecognitionException {
		Z3StatementContext _localctx = new Z3StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_z3Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(SAT);
			setState(41);
			match(OPAR);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				z3value();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPAR );
			setState(47);
			match(CPAR);
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

	public static class Z3valueContext extends ParserRuleContext {
		public Z3valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3value; }
	 
		public Z3valueContext() { }
		public void copyFrom(Z3valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZValueContext extends Z3valueContext {
		public List<TerminalNode> OPAR() { return getTokens(MyGrammarParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(MyGrammarParser.OPAR, i);
		}
		public TerminalNode DEFINEFUN() { return getToken(MyGrammarParser.DEFINEFUN, 0); }
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public List<TerminalNode> CPAR() { return getTokens(MyGrammarParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(MyGrammarParser.CPAR, i);
		}
		public TerminalNode Z3INT() { return getToken(MyGrammarParser.Z3INT, 0); }
		public List<Z3variable_declarationContext> z3variable_declaration() {
			return getRuleContexts(Z3variable_declarationContext.class);
		}
		public Z3variable_declarationContext z3variable_declaration(int i) {
			return getRuleContext(Z3variable_declarationContext.class,i);
		}
		public List<Z3expressionContext> z3expression() {
			return getRuleContexts(Z3expressionContext.class);
		}
		public Z3expressionContext z3expression(int i) {
			return getRuleContext(Z3expressionContext.class,i);
		}
		public ZValueContext(Z3valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZValue(this);
		}
	}

	public final Z3valueContext z3value() throws RecognitionException {
		Z3valueContext _localctx = new Z3valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_z3value);
		int _la;
		try {
			_localctx = new ZValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(OPAR);
			setState(50);
			match(DEFINEFUN);
			setState(51);
			z3variable_name();
			setState(52);
			match(OPAR);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAR) {
				{
				{
				setState(53);
				z3variable_declaration();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(CPAR);
			setState(60);
			match(Z3INT);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				{
				setState(61);
				z3expression();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(CPAR);
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

	public static class Z3andContext extends ParserRuleContext {
		public Z3andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3and; }
	 
		public Z3andContext() { }
		public void copyFrom(Z3andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZAndStatementContext extends Z3andContext {
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public TerminalNode Z3AND() { return getToken(MyGrammarParser.Z3AND, 0); }
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public List<Z3expressionContext> z3expression() {
			return getRuleContexts(Z3expressionContext.class);
		}
		public Z3expressionContext z3expression(int i) {
			return getRuleContext(Z3expressionContext.class,i);
		}
		public ZAndStatementContext(Z3andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZAndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZAndStatement(this);
		}
	}

	public final Z3andContext z3and() throws RecognitionException {
		Z3andContext _localctx = new Z3andContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_z3and);
		int _la;
		try {
			_localctx = new ZAndStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(OPAR);
			setState(70);
			match(Z3AND);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				z3expression();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUMBER) | (1L << ID))) != 0) );
			setState(76);
			match(CPAR);
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

	public static class Z3iteContext extends ParserRuleContext {
		public Z3iteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3ite; }
	 
		public Z3iteContext() { }
		public void copyFrom(Z3iteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZITEStatementContext extends Z3iteContext {
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public TerminalNode ITE() { return getToken(MyGrammarParser.ITE, 0); }
		public List<Z3expressionContext> z3expression() {
			return getRuleContexts(Z3expressionContext.class);
		}
		public Z3expressionContext z3expression(int i) {
			return getRuleContext(Z3expressionContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public ZITEStatementContext(Z3iteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZITEStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZITEStatement(this);
		}
	}

	public final Z3iteContext z3ite() throws RecognitionException {
		Z3iteContext _localctx = new Z3iteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_z3ite);
		try {
			_localctx = new ZITEStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(OPAR);
			setState(79);
			match(ITE);
			setState(80);
			z3expression();
			setState(81);
			z3expression();
			setState(82);
			z3expression();
			setState(83);
			match(CPAR);
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

	public static class Z3comparisonContext extends ParserRuleContext {
		public Z3comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3comparison; }
	 
		public Z3comparisonContext() { }
		public void copyFrom(Z3comparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZcomparisonStatementContext extends Z3comparisonContext {
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MyGrammarParser.NUMBER, i);
		}
		public ZcomparisonStatementContext(Z3comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZcomparisonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZcomparisonStatement(this);
		}
	}

	public final Z3comparisonContext z3comparison() throws RecognitionException {
		Z3comparisonContext _localctx = new Z3comparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_z3comparison);
		int _la;
		try {
			_localctx = new ZcomparisonStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OPAR);
			setState(86);
			match(EQUAL);
			setState(87);
			z3variable_name();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(88);
				match(NUMBER);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(CPAR);
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

	public static class Z3variable_declarationContext extends ParserRuleContext {
		public Z3variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3variable_declaration; }
	 
		public Z3variable_declarationContext() { }
		public void copyFrom(Z3variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZvariableDeclarationContext extends Z3variable_declarationContext {
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public TerminalNode Z3INT() { return getToken(MyGrammarParser.Z3INT, 0); }
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public ZvariableDeclarationContext(Z3variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZvariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZvariableDeclaration(this);
		}
	}

	public final Z3variable_declarationContext z3variable_declaration() throws RecognitionException {
		Z3variable_declarationContext _localctx = new Z3variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_z3variable_declaration);
		try {
			_localctx = new ZvariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(OPAR);
			setState(97);
			z3variable_name();
			setState(98);
			match(Z3INT);
			setState(99);
			match(CPAR);
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

	public static class Z3variable_nameContext extends ParserRuleContext {
		public TerminalNode FACT() { return getToken(MyGrammarParser.FACT, 0); }
		public List<TerminalNode> ID() { return getTokens(MyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammarParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MyGrammarParser.NUMBER, i);
		}
		public Z3variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZ3variable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZ3variable_name(this);
		}
	}

	public final Z3variable_nameContext z3variable_name() throws RecognitionException {
		Z3variable_nameContext _localctx = new Z3variable_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_z3variable_name);
		int _la;
		try {
			int _alt;
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					match(ID);
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(106);
				match(FACT);
				setState(108); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(107);
						match(NUMBER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(110); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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

	public static class Z3expressionContext extends ParserRuleContext {
		public Z3andContext z3and() {
			return getRuleContext(Z3andContext.class,0);
		}
		public Z3iteContext z3ite() {
			return getRuleContext(Z3iteContext.class,0);
		}
		public Z3comparisonContext z3comparison() {
			return getRuleContext(Z3comparisonContext.class,0);
		}
		public Z3valueContext z3value() {
			return getRuleContext(Z3valueContext.class,0);
		}
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public Z3expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterZ3expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitZ3expression(this);
		}
	}

	public final Z3expressionContext z3expression() throws RecognitionException {
		Z3expressionContext _localctx = new Z3expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_z3expression);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				z3and();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				z3ite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				z3comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				z3value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				z3variable_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
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

	public static class NumberAContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public NumberAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumberA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumberA(this);
		}
	}

	public final NumberAContext numberA() throws RecognitionException {
		NumberAContext _localctx = new NumberAContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numberA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NUMBER);
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

	public static class NumberBContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public NumberBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumberB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumberB(this);
		}
	}

	public final NumberBContext numberB() throws RecognitionException {
		NumberBContext _localctx = new NumberBContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numberB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NUMBER);
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

	public static class NumberCContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public NumberCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumberC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumberC(this);
		}
	}

	public final NumberCContext numberC() throws RecognitionException {
		NumberCContext _localctx = new NumberCContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numberC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NUMBER);
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

	public static class NumberDContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public NumberDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumberD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumberD(this);
		}
	}

	public final NumberDContext numberD() throws RecognitionException {
		NumberDContext _localctx = new NumberDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numberD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(NUMBER);
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
		"\u0004\u00014\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001%"+
		"\b\u0001\u000b\u0001\f\u0001&\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002,\b\u0002\u000b\u0002\f\u0002-\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00037\b\u0003"+
		"\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004I\b\u0004\u000b\u0004\f\u0004J\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0004\bg\b\b\u000b\b\f\bh\u0001\b\u0001\b\u0004\bm\b\b\u000b\b\f\b"+
		"n\u0001\b\u0003\br\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t{\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u0086\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004(\u0001"+
		"\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000"+
		"\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e`\u0001"+
		"\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000"+
		"\u0000\u0014|\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018"+
		"\u0080\u0001\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000"+
		"\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\'"+
		"\u0000\u0000)+\u0005\u0003\u0000\u0000*,\u0003\u0006\u0003\u0000+*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0004\u0000"+
		"\u00000\u0005\u0001\u0000\u0000\u000012\u0005\u0003\u0000\u000023\u0005"+
		"(\u0000\u000034\u0003\u0010\b\u000048\u0005\u0003\u0000\u000057\u0003"+
		"\u000e\u0007\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0004\u0000\u0000<@\u0005)\u0000"+
		"\u0000=?\u0003\u0012\t\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0004\u0000\u0000D\u0007"+
		"\u0001\u0000\u0000\u0000EF\u0005\u0003\u0000\u0000FH\u0005+\u0000\u0000"+
		"GI\u0003\u0012\t\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0004\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\u0003"+
		"\u0000\u0000OP\u0005*\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0003\u0012"+
		"\t\u0000RS\u0003\u0012\t\u0000ST\u0005\u0004\u0000\u0000T\u000b\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005,\u0000\u0000W[\u0003"+
		"\u0010\b\u0000XZ\u00050\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0004\u0000"+
		"\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0003\u0010"+
		"\b\u0000bc\u0005)\u0000\u0000cd\u0005\u0004\u0000\u0000d\u000f\u0001\u0000"+
		"\u0000\u0000eg\u00054\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0005\n\u0000\u0000km\u00050\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pr\u00054\u0000\u0000"+
		"qf\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0011\u0001\u0000"+
		"\u0000\u0000s{\u0003\b\u0004\u0000t{\u0003\n\u0005\u0000u{\u0003\f\u0006"+
		"\u0000v{\u0003\u0006\u0003\u0000w{\u0003\u0010\b\u0000x{\u00050\u0000"+
		"\u0000y{\u00054\u0000\u0000zs\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000"+
		"\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0013"+
		"\u0001\u0000\u0000\u0000|}\u00050\u0000\u0000}\u0015\u0001\u0000\u0000"+
		"\u0000~\u007f\u00050\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u00050\u0000\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u00050\u0000\u0000\u0083\u001b\u0001\u0000\u0000\u0000\u000b\u001f&-"+
		"8@J[hnqz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}