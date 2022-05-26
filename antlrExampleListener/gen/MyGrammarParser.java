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
		FACT=10, NOT=11, AND=12, OR=13, INT_INIT=14, STRING_INIT=15, BOOL_INIT=16, 
		CHAR_INIT=17, PRINT=18, IF=19, ELSE=20, FOR=21, EQUAL=22, NEQUAL=23, EQUALCHECK=24, 
		INT=25, WS=26, BOOL=27, STRING=28, IDENTIFIER=29;
	public static final int
		RULE_myStart = 0, RULE_block = 1, RULE_stat = 2, RULE_if_stat = 3, RULE_condition_block = 4, 
		RULE_stat_block = 5, RULE_variable_stat = 6, RULE_variable_block = 7, 
		RULE_variable_name = 8, RULE_print_stat = 9, RULE_print_content = 10, 
		RULE_value_block = 11, RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "block", "stat", "if_stat", "condition_block", "stat_block", 
			"variable_stat", "variable_block", "variable_name", "print_stat", "print_content", 
			"value_block", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'^'", 
			"'!'", "'not'", "'&&'", "'||'", "'int_var'", "'string_var'", "'bool_var'", 
			"'char_var'", "'print'", "'if'", "'else'", "'for'", "'='", "'!='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFTCURL", "RIGHTCURL", "OPAR", "CPAR", "MUL", "DIV", "ADD", "SUB", 
			"POW", "FACT", "NOT", "AND", "OR", "INT_INIT", "STRING_INIT", "BOOL_INIT", 
			"CHAR_INIT", "PRINT", "IF", "ELSE", "FOR", "EQUAL", "NEQUAL", "EQUALCHECK", 
			"INT", "WS", "BOOL", "STRING", "IDENTIFIER"
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				block();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NOT) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << CHAR_INIT) | (1L << PRINT) | (1L << IF) | (1L << ELSE) | (1L << EQUALCHECK) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << IDENTIFIER))) != 0) );
			setState(31);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(33);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36); 
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableStatementContext extends StatContext {
		public Variable_statContext variable_stat() {
			return getRuleContext(Variable_statContext.class,0);
		}
		public VariableStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVariableStatement(this);
		}
	}
	public static class OtherExpressionContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OtherExpressionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOtherExpression(this);
		}
	}
	public static class PrintStatementContext extends StatContext {
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public PrintStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrintStatement(this);
		}
	}
	public static class IfStatementContext extends StatContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public IfStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIfStatement(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				if_stat();
				}
				break;
			case 2:
				_localctx = new VariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				variable_stat();
				}
				break;
			case 3:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				print_stat();
				}
				break;
			case 4:
				_localctx = new OtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				expr(0);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MyGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MyGrammarParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MyGrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MyGrammarParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IF);
			setState(45);
			condition_block();
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(ELSE);
					setState(47);
					match(IF);
					setState(48);
					condition_block();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(54);
				match(ELSE);
				setState(55);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCondition_block(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(OPAR);
			setState(59);
			expr(0);
			setState(60);
			match(CPAR);
			setState(61);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode LEFTCURL() { return getToken(MyGrammarParser.LEFTCURL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHTCURL() { return getToken(MyGrammarParser.RIGHTCURL, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStat_block(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat_block);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(LEFTCURL);
				setState(64);
				block();
				setState(65);
				match(RIGHTCURL);
				}
				break;
			case OPAR:
			case NOT:
			case INT_INIT:
			case STRING_INIT:
			case BOOL_INIT:
			case CHAR_INIT:
			case PRINT:
			case IF:
			case ELSE:
			case EQUALCHECK:
			case INT:
			case BOOL:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				stat();
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

	public static class Variable_statContext extends ParserRuleContext {
		public Variable_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_stat; }
	 
		public Variable_statContext() { }
		public void copyFrom(Variable_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitVarContext extends Variable_statContext {
		public Variable_blockContext variable_block() {
			return getRuleContext(Variable_blockContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public InitVarContext(Variable_statContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInitVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInitVar(this);
		}
	}
	public static class InitVarWithValueContext extends Variable_statContext {
		public Variable_blockContext variable_block() {
			return getRuleContext(Variable_blockContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public Value_blockContext value_block() {
			return getRuleContext(Value_blockContext.class,0);
		}
		public InitVarWithValueContext(Variable_statContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInitVarWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInitVarWithValue(this);
		}
	}
	public static class InitVarWithStatementValueContext extends Variable_statContext {
		public Variable_blockContext variable_block() {
			return getRuleContext(Variable_blockContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public InitVarWithStatementValueContext(Variable_statContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInitVarWithStatementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInitVarWithStatementValue(this);
		}
	}

	public final Variable_statContext variable_stat() throws RecognitionException {
		Variable_statContext _localctx = new Variable_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_stat);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new InitVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				variable_block();
				setState(71);
				variable_name();
				}
				break;
			case 2:
				_localctx = new InitVarWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				variable_block();
				setState(74);
				variable_name();
				setState(75);
				match(EQUAL);
				setState(76);
				value_block();
				}
				break;
			case 3:
				_localctx = new InitVarWithStatementValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				variable_block();
				setState(79);
				variable_name();
				setState(80);
				match(EQUAL);
				setState(81);
				stat();
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

	public static class Variable_blockContext extends ParserRuleContext {
		public Variable_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_block; }
	 
		public Variable_blockContext() { }
		public void copyFrom(Variable_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringVariableContext extends Variable_blockContext {
		public TerminalNode STRING_INIT() { return getToken(MyGrammarParser.STRING_INIT, 0); }
		public StringVariableContext(Variable_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringVariable(this);
		}
	}
	public static class BoolVariableContext extends Variable_blockContext {
		public TerminalNode BOOL_INIT() { return getToken(MyGrammarParser.BOOL_INIT, 0); }
		public BoolVariableContext(Variable_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBoolVariable(this);
		}
	}
	public static class IntVariableContext extends Variable_blockContext {
		public TerminalNode INT_INIT() { return getToken(MyGrammarParser.INT_INIT, 0); }
		public IntVariableContext(Variable_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntVariable(this);
		}
	}
	public static class CharVariableContext extends Variable_blockContext {
		public TerminalNode CHAR_INIT() { return getToken(MyGrammarParser.CHAR_INIT, 0); }
		public CharVariableContext(Variable_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCharVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCharVariable(this);
		}
	}

	public final Variable_blockContext variable_block() throws RecognitionException {
		Variable_blockContext _localctx = new Variable_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_block);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_INIT:
				_localctx = new BoolVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(BOOL_INIT);
				}
				break;
			case STRING_INIT:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(STRING_INIT);
				}
				break;
			case INT_INIT:
				_localctx = new IntVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(INT_INIT);
				}
				break;
			case CHAR_INIT:
				_localctx = new CharVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(CHAR_INIT);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	 
		public Variable_nameContext() { }
		public void copyFrom(Variable_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableNameContext extends Variable_nameContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public VariableNameContext(Variable_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVariableName(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_name);
		try {
			_localctx = new VariableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IDENTIFIER);
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

	public static class Print_statContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MyGrammarParser.PRINT, 0); }
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public Print_contentContext print_content() {
			return getRuleContext(Print_contentContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint_stat(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PRINT);
			setState(94);
			match(OPAR);
			setState(95);
			print_content();
			setState(96);
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

	public static class Print_contentContext extends ParserRuleContext {
		public Print_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_content; }
	 
		public Print_contentContext() { }
		public void copyFrom(Print_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVariableContext extends Print_contentContext {
		public Variable_statContext variable_stat() {
			return getRuleContext(Variable_statContext.class,0);
		}
		public PrintVariableContext(Print_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrintVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrintVariable(this);
		}
	}
	public static class PrintExprContext extends Print_contentContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(Print_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrintExpr(this);
		}
	}

	public final Print_contentContext print_content() throws RecognitionException {
		Print_contentContext _localctx = new Print_contentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print_content);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				expr(0);
				}
				break;
			case 2:
				_localctx = new PrintVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				variable_stat();
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

	public static class Value_blockContext extends ParserRuleContext {
		public Value_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_block; }
	 
		public Value_blockContext() { }
		public void copyFrom(Value_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringValueContext extends Value_blockContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public StringValueContext(Value_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringValue(this);
		}
	}
	public static class OtherVariableContext extends Value_blockContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public OtherVariableContext(Value_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOtherVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOtherVariable(this);
		}
	}
	public static class IntValueContext extends Value_blockContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public IntValueContext(Value_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntValue(this);
		}
	}
	public static class BooleanValueContext extends Value_blockContext {
		public TerminalNode BOOL() { return getToken(MyGrammarParser.BOOL, 0); }
		public BooleanValueContext(Value_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBooleanValue(this);
		}
	}

	public final Value_blockContext value_block() throws RecognitionException {
		Value_blockContext _localctx = new Value_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_block);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(BOOL);
				}
				break;
			case IDENTIFIER:
				_localctx = new OtherVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(IDENTIFIER);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammarParser.IDENTIFIER, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIdentifier(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(MyGrammarParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MyGrammarParser.CPAR, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParens(this);
		}
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MyGrammarParser.OR, 0); }
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOr(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(MyGrammarParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBool(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitString(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MyGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMulDiv(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAddSub(this);
		}
	}
	public static class FactContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FACT() { return getToken(MyGrammarParser.FACT, 0); }
		public FactContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFact(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInt(this);
		}
	}
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MyGrammarParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNot(this);
		}
	}
	public static class ElseContext extends ExprContext {
		public TerminalNode ELSE() { return getToken(MyGrammarParser.ELSE, 0); }
		public ElseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitElse(this);
		}
	}
	public static class StringInitContext extends ExprContext {
		public TerminalNode STRING_INIT() { return getToken(MyGrammarParser.STRING_INIT, 0); }
		public StringInitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringInit(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAnd(this);
		}
	}
	public static class EqualcheckContext extends ExprContext {
		public TerminalNode EQUALCHECK() { return getToken(MyGrammarParser.EQUALCHECK, 0); }
		public EqualcheckContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqualcheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqualcheck(this);
		}
	}
	public static class IntInitContext extends ExprContext {
		public TerminalNode INT_INIT() { return getToken(MyGrammarParser.INT_INIT, 0); }
		public IntInitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntInit(this);
		}
	}
	public static class PowContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MyGrammarParser.POW, 0); }
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPow(this);
		}
	}
	public static class EqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(MyGrammarParser.NEQUAL, 0); }
		public TerminalNode EQUALCHECK() { return getToken(MyGrammarParser.EQUALCHECK, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEquality(this);
		}
	}
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(MyGrammarParser.IF, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIf(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				match(NOT);
				setState(110);
				expr(14);
				}
				break;
			case OPAR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(OPAR);
				setState(112);
				expr(0);
				setState(113);
				match(CPAR);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(INT);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(BOOL);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(IDENTIFIER);
				}
				break;
			case IF:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(IF);
				}
				break;
			case ELSE:
				{
				_localctx = new ElseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(ELSE);
				}
				break;
			case EQUALCHECK:
				{
				_localctx = new EqualcheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(EQUALCHECK);
				}
				break;
			case INT_INIT:
				{
				_localctx = new IntInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(INT_INIT);
				}
				break;
			case STRING_INIT:
				{
				_localctx = new StringInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(STRING_INIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(127);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(130);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(133);
						((PowContext)_localctx).op = match(POW);
						setState(134);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(136);
						match(OR);
						setState(137);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(139);
						match(AND);
						setState(140);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(142);
						((EqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NEQUAL) | (1L << EQUALCHECK))) != 0)) ) {
							((EqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new FactContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(145);
						((FactContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u0098\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000"+
		"\u001d\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001#\b\u0001\u000b"+
		"\u0001\f\u0001$\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002+\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00039\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005E\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003"+
		"\ne\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bk\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f}\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0093\b\f\n\f\f\f\u0096\t\f\u0001\f"+
		"\u0000\u0001\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0003\u0001\u0000\u0005\u0006\u0001\u0000\u0007\b\u0001"+
		"\u0000\u0016\u0018\u00ac\u0000\u001b\u0001\u0000\u0000\u0000\u0002\"\u0001"+
		"\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000"+
		"\u0000\b:\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fS\u0001"+
		"\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000"+
		"\u0000\u0012]\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016"+
		"j\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0000"+
		"\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!#\u0003\u0004\u0002\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&+\u0003"+
		"\u0006\u0003\u0000\'+\u0003\f\u0006\u0000(+\u0003\u0012\t\u0000)+\u0003"+
		"\u0018\f\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*("+
		"\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0005\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0013\u0000\u0000-3\u0003\b\u0004\u0000./\u0005\u0014"+
		"\u0000\u0000/0\u0005\u0013\u0000\u000002\u0003\b\u0004\u00001.\u0001\u0000"+
		"\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000048\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"67\u0005\u0014\u0000\u000079\u0003\n\u0005\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0003\u0018\f\u0000<=\u0005\u0004\u0000\u0000=>\u0003\n"+
		"\u0005\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0003"+
		"\u0002\u0001\u0000AB\u0005\u0002\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CE\u0003\u0004\u0002\u0000D?\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0003\u000e\u0007\u0000GH\u0003"+
		"\u0010\b\u0000HT\u0001\u0000\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0003"+
		"\u0010\b\u0000KL\u0005\u0016\u0000\u0000LM\u0003\u0016\u000b\u0000MT\u0001"+
		"\u0000\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0003\u0010\b\u0000PQ\u0005"+
		"\u0016\u0000\u0000QR\u0003\u0004\u0002\u0000RT\u0001\u0000\u0000\u0000"+
		"SF\u0001\u0000\u0000\u0000SI\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000"+
		"\u0000T\r\u0001\u0000\u0000\u0000UZ\u0005\u0010\u0000\u0000VZ\u0005\u000f"+
		"\u0000\u0000WZ\u0005\u000e\u0000\u0000XZ\u0005\u0011\u0000\u0000YU\u0001"+
		"\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0005\u001d"+
		"\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000]^\u0005\u0012\u0000\u0000"+
		"^_\u0005\u0003\u0000\u0000_`\u0003\u0014\n\u0000`a\u0005\u0004\u0000\u0000"+
		"a\u0013\u0001\u0000\u0000\u0000be\u0003\u0018\f\u0000ce\u0003\f\u0006"+
		"\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0015\u0001"+
		"\u0000\u0000\u0000fk\u0005\u0019\u0000\u0000gk\u0005\u001c\u0000\u0000"+
		"hk\u0005\u001b\u0000\u0000ik\u0005\u001d\u0000\u0000jf\u0001\u0000\u0000"+
		"\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000k\u0017\u0001\u0000\u0000\u0000lm\u0006\f\uffff\uffff\u0000"+
		"mn\u0005\u000b\u0000\u0000n}\u0003\u0018\f\u000eop\u0005\u0003\u0000\u0000"+
		"pq\u0003\u0018\f\u0000qr\u0005\u0004\u0000\u0000r}\u0001\u0000\u0000\u0000"+
		"s}\u0005\u0019\u0000\u0000t}\u0005\u001b\u0000\u0000u}\u0005\u001c\u0000"+
		"\u0000v}\u0005\u001d\u0000\u0000w}\u0005\u0013\u0000\u0000x}\u0005\u0014"+
		"\u0000\u0000y}\u0005\u0018\u0000\u0000z}\u0005\u000e\u0000\u0000{}\u0005"+
		"\u000f\u0000\u0000|l\u0001\u0000\u0000\u0000|o\u0001\u0000\u0000\u0000"+
		"|s\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000|u\u0001\u0000\u0000"+
		"\u0000|v\u0001\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000|x\u0001\u0000"+
		"\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}\u0094\u0001\u0000\u0000\u0000~\u007f\n\u0012\u0000"+
		"\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080\u0093\u0003\u0018\f\u0013"+
		"\u0081\u0082\n\u0011\u0000\u0000\u0082\u0083\u0007\u0001\u0000\u0000\u0083"+
		"\u0093\u0003\u0018\f\u0012\u0084\u0085\n\u0010\u0000\u0000\u0085\u0086"+
		"\u0005\t\u0000\u0000\u0086\u0093\u0003\u0018\f\u0011\u0087\u0088\n\r\u0000"+
		"\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u0093\u0003\u0018\f\u000e"+
		"\u008a\u008b\n\f\u0000\u0000\u008b\u008c\u0005\f\u0000\u0000\u008c\u0093"+
		"\u0003\u0018\f\r\u008d\u008e\n\u000b\u0000\u0000\u008e\u008f\u0007\u0002"+
		"\u0000\u0000\u008f\u0093\u0003\u0018\f\f\u0090\u0091\n\u000f\u0000\u0000"+
		"\u0091\u0093\u0005\n\u0000\u0000\u0092~\u0001\u0000\u0000\u0000\u0092"+
		"\u0081\u0001\u0000\u0000\u0000\u0092\u0084\u0001\u0000\u0000\u0000\u0092"+
		"\u0087\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000\u0000\u0092"+
		"\u008d\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\r\u001d$*38DSYdj|\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}