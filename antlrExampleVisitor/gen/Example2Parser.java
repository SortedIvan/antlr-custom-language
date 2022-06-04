// Generated from Example2.g4 by ANTLR 4.10.1
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
public class Example2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFTCURL=1, RIGHTCURL=2, OPAR=3, CPAR=4, MUL=5, DIV=6, ADD=7, SUB=8, POW=9, 
		FACT=10, NOT=11, AND=12, OR=13, BIGGERTHAN=14, SMALLERTHAN=15, BIGGEROREQUAL=16, 
		SMALLEROREQUAL=17, INT_INIT=18, STRING_INIT=19, BOOL_INIT=20, CHAR_INIT=21, 
		PRINT=22, IF=23, FI=24, WHILE=25, THEN=26, DO=27, DOT=28, ELSE=29, FOR=30, 
		SAT=31, DEFINEFUN=32, Z3INT=33, Z3VARNAME=34, EQUAL=35, NEQUAL=36, EQUALCHECK=37, 
		COMMA=38, NUMBER=39, WS=40, BOOL=41, STRING=42, ID=43;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_loop = 2, RULE_ifStat = 3, RULE_url = 4, 
		RULE_print_statement = 5, RULE_expression = 6, RULE_variable = 7, RULE_int_variable = 8, 
		RULE_bool_variable = 9, RULE_string_variable = 10, RULE_mathExpression = 11, 
		RULE_z3OutputSudokuA = 12, RULE_numberA = 13, RULE_numberB = 14, RULE_numberC = 15, 
		RULE_numberD = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "loop", "ifStat", "url", "print_statement", "expression", 
			"variable", "int_variable", "bool_variable", "string_variable", "mathExpression", 
			"z3OutputSudokuA", "numberA", "numberB", "numberC", "numberD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'^'", 
			"'!'", "'not'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'int_var'", 
			"'string_var'", "'bool_var'", "'char_var'", "'print'", "'if'", "'fi'", 
			"'while'", "'then'", "'do'", "'.'", "'else'", "'for'", "'sat'", "'define-fun'", 
			"'Int'", null, "'='", "'!='", "'=='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFTCURL", "RIGHTCURL", "OPAR", "CPAR", "MUL", "DIV", "ADD", "SUB", 
			"POW", "FACT", "NOT", "AND", "OR", "BIGGERTHAN", "SMALLERTHAN", "BIGGEROREQUAL", 
			"SMALLEROREQUAL", "INT_INIT", "STRING_INIT", "BOOL_INIT", "CHAR_INIT", 
			"PRINT", "IF", "FI", "WHILE", "THEN", "DO", "DOT", "ELSE", "FOR", "SAT", 
			"DEFINEFUN", "Z3INT", "Z3VARNAME", "EQUAL", "NEQUAL", "EQUALCHECK", "COMMA", 
			"NUMBER", "WS", "BOOL", "STRING", "ID"
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
	public String getGrammarFileName() { return "Example2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start2Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Example2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Start2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start2Context start2() throws RecognitionException {
		Start2Context _localctx = new Start2Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTCURL) | (1L << OPAR) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SAT) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopBodyContext extends StatementContext {
		public TerminalNode LEFTCURL() { return getToken(Example2Parser.LEFTCURL, 0); }
		public TerminalNode RIGHTCURL() { return getToken(Example2Parser.RIGHTCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopBodyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Z3OutputWeek3Context extends StatementContext {
		public Z3OutputSudokuAContext z3OutputSudokuA() {
			return getRuleContext(Z3OutputSudokuAContext.class,0);
		}
		public Z3OutputWeek3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZ3OutputWeek3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariableContext extends StatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignVariableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopStatementContext extends StatementContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UrlStatementContext extends StatementContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public UrlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitUrlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				variable();
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				print_statement();
				}
				break;
			case 4:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				loop();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				ifStat();
				}
				break;
			case 6:
				_localctx = new UrlStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				url();
				}
				break;
			case 7:
				_localctx = new Z3OutputWeek3Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				z3OutputSudokuA();
				}
				break;
			case 8:
				_localctx = new LoopBodyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				match(LEFTCURL);
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(50);
					statement();
					}
					}
					setState(53); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTCURL) | (1L << OPAR) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << SAT) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0) );
				setState(55);
				match(RIGHTCURL);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Example2Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(Example2Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(WHILE);
			setState(60);
			expression();
			setState(61);
			match(DO);
			setState(62);
			statement();
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Example2Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Example2Parser.THEN, 0); }
		public TerminalNode LEFTCURL() { return getToken(Example2Parser.LEFTCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RIGHTCURL() { return getToken(Example2Parser.RIGHTCURL, 0); }
		public TerminalNode FI() { return getToken(Example2Parser.FI, 0); }
		public TerminalNode ELSE() { return getToken(Example2Parser.ELSE, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			expression();
			setState(66);
			match(THEN);
			setState(67);
			match(LEFTCURL);
			setState(68);
			statement();
			setState(69);
			match(RIGHTCURL);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(70);
				match(ELSE);
				setState(71);
				statement();
				}
			}

			setState(74);
			match(FI);
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

	public static class UrlContext extends ParserRuleContext {
		public NumberAContext numberA() {
			return getRuleContext(NumberAContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Example2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Example2Parser.DOT, i);
		}
		public NumberBContext numberB() {
			return getRuleContext(NumberBContext.class,0);
		}
		public NumberCContext numberC() {
			return getRuleContext(NumberCContext.class,0);
		}
		public NumberDContext numberD() {
			return getRuleContext(NumberDContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			numberA();
			setState(77);
			match(DOT);
			setState(78);
			numberB();
			setState(79);
			match(DOT);
			setState(80);
			numberC();
			setState(81);
			match(DOT);
			setState(82);
			numberD();
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

	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintExprContext extends Print_statementContext {
		public TerminalNode PRINT() { return getToken(Example2Parser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_statement);
		try {
			_localctx = new PrintExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(PRINT);
			setState(85);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueBoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(Example2Parser.BOOL, 0); }
		public ValueBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public ValueStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExprContext extends ExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public MathExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MathExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				mathExpression(0);
				}
				break;
			case 2:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(STRING);
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

	public static class VariableContext extends ParserRuleContext {
		public Int_variableContext int_variable() {
			return getRuleContext(Int_variableContext.class,0);
		}
		public Bool_variableContext bool_variable() {
			return getRuleContext(Bool_variableContext.class,0);
		}
		public String_variableContext string_variable() {
			return getRuleContext(String_variableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				int_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				bool_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				string_variable();
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

	public static class Int_variableContext extends ParserRuleContext {
		public Int_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_variable; }
	 
		public Int_variableContext() { }
		public void copyFrom(Int_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAssignmentContext extends Int_variableContext {
		public TerminalNode INT_INIT() { return getToken(Example2Parser.INT_INIT, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IntAssignmentContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAssignValueContext extends Int_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IntAssignValueContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_variableContext int_variable() throws RecognitionException {
		Int_variableContext _localctx = new Int_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_int_variable);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_INIT:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(INT_INIT);
				setState(98);
				match(ID);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(99);
					match(EQUAL);
					setState(100);
					mathExpression(0);
					}
				}

				}
				break;
			case ID:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ID);
				setState(104);
				match(EQUAL);
				setState(105);
				mathExpression(0);
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

	public static class Bool_variableContext extends ParserRuleContext {
		public Bool_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_variable; }
	 
		public Bool_variableContext() { }
		public void copyFrom(Bool_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolAssignmentContext extends Bool_variableContext {
		public TerminalNode BOOL_INIT() { return getToken(Example2Parser.BOOL_INIT, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public BoolAssignmentContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAssignValueContext extends Bool_variableContext {
		public TerminalNode BOOL_INIT() { return getToken(Example2Parser.BOOL_INIT, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode BOOL() { return getToken(Example2Parser.BOOL, 0); }
		public BoolAssignValueContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_variableContext bool_variable() throws RecognitionException {
		Bool_variableContext _localctx = new Bool_variableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_variable);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BoolAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(BOOL_INIT);
				setState(109);
				match(ID);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(110);
					match(EQUAL);
					setState(111);
					mathExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(BOOL_INIT);
				setState(115);
				match(ID);
				setState(116);
				match(EQUAL);
				setState(117);
				match(BOOL);
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

	public static class String_variableContext extends ParserRuleContext {
		public String_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_variable; }
	 
		public String_variableContext() { }
		public void copyFrom(String_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringAssignValueContext extends String_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringAssignValueContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignmentContext extends String_variableContext {
		public TerminalNode STRING_INIT() { return getToken(Example2Parser.STRING_INIT, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringAssignmentContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_variableContext string_variable() throws RecognitionException {
		String_variableContext _localctx = new String_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string_variable);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_INIT:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(STRING_INIT);
				setState(121);
				match(ID);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(122);
					match(EQUAL);
					setState(123);
					match(STRING);
					}
				}

				}
				break;
			case ID:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(ID);
				setState(127);
				match(EQUAL);
				setState(128);
				match(STRING);
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

	public static class MathExpressionContext extends ParserRuleContext {
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	 
		public MathExpressionContext() { }
		public void copyFrom(MathExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Example2Parser.ADD, 0); }
		public ADDContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUBContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(Example2Parser.SUB, 0); }
		public SUBContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BIGGERoperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode BIGGERTHAN() { return getToken(Example2Parser.BIGGERTHAN, 0); }
		public BIGGERoperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBIGGERoperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueExprContext extends MathExpressionContext {
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringValueExprContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Example2Parser.MUL, 0); }
		public MULContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMUL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EQUALCheckContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode EQUALCHECK() { return getToken(Example2Parser.EQUALCHECK, 0); }
		public EQUALCheckContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitEQUALCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FACTContext extends MathExpressionContext {
		public Token op;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode FACT() { return getToken(Example2Parser.FACT, 0); }
		public FACTContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFACT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DIVContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Example2Parser.DIV, 0); }
		public DIVContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ORoperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Example2Parser.OR, 0); }
		public ORoperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitORoperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SMALLERoperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode SMALLERTHAN() { return getToken(Example2Parser.SMALLERTHAN, 0); }
		public SMALLERoperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSMALLERoperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueVariableContext extends MathExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public ValueVariableContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NOToperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode NEQUAL() { return getToken(Example2Parser.NEQUAL, 0); }
		public NOToperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNOToperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDoperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Example2Parser.AND, 0); }
		public ANDoperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitANDoperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BIGOREQUALoperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode BIGGEROREQUAL() { return getToken(Example2Parser.BIGGEROREQUAL, 0); }
		public BIGOREQUALoperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBIGOREQUALoperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueNumberContext extends MathExpressionContext {
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public ValueNumberContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POWContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(Example2Parser.POW, 0); }
		public POWContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPOW(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentsContext extends MathExpressionContext {
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public ParentsContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParents(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SMALLOREQUALoperationContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode SMALLEROREQUAL() { return getToken(Example2Parser.SMALLEROREQUAL, 0); }
		public SMALLOREQUALoperationContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSMALLOREQUALoperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mathExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(OPAR);
				setState(133);
				mathExpression(0);
				setState(134);
				match(CPAR);
				}
				break;
			case NUMBER:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MULContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(141);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(142);
						((MULContext)_localctx).op = match(MUL);
						setState(143);
						mathExpression(19);
						}
						break;
					case 2:
						{
						_localctx = new DIVContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(144);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(145);
						((DIVContext)_localctx).op = match(DIV);
						setState(146);
						mathExpression(18);
						}
						break;
					case 3:
						{
						_localctx = new ADDContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(147);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(148);
						((ADDContext)_localctx).op = match(ADD);
						setState(149);
						mathExpression(17);
						}
						break;
					case 4:
						{
						_localctx = new SUBContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(150);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(151);
						((SUBContext)_localctx).op = match(SUB);
						setState(152);
						mathExpression(16);
						}
						break;
					case 5:
						{
						_localctx = new POWContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(153);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(154);
						((POWContext)_localctx).op = match(POW);
						setState(155);
						mathExpression(15);
						}
						break;
					case 6:
						{
						_localctx = new EQUALCheckContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(156);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(157);
						((EQUALCheckContext)_localctx).op = match(EQUALCHECK);
						setState(158);
						mathExpression(13);
						}
						break;
					case 7:
						{
						_localctx = new ANDoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(159);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(160);
						((ANDoperationContext)_localctx).op = match(AND);
						setState(161);
						mathExpression(12);
						}
						break;
					case 8:
						{
						_localctx = new NOToperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(162);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(163);
						((NOToperationContext)_localctx).op = match(NEQUAL);
						setState(164);
						mathExpression(11);
						}
						break;
					case 9:
						{
						_localctx = new ORoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(166);
						((ORoperationContext)_localctx).op = match(OR);
						setState(167);
						mathExpression(10);
						}
						break;
					case 10:
						{
						_localctx = new BIGGERoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(168);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(169);
						((BIGGERoperationContext)_localctx).op = match(BIGGERTHAN);
						setState(170);
						mathExpression(9);
						}
						break;
					case 11:
						{
						_localctx = new SMALLERoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						((SMALLERoperationContext)_localctx).op = match(SMALLERTHAN);
						setState(173);
						mathExpression(8);
						}
						break;
					case 12:
						{
						_localctx = new BIGOREQUALoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						((BIGOREQUALoperationContext)_localctx).op = match(BIGGEROREQUAL);
						setState(176);
						mathExpression(7);
						}
						break;
					case 13:
						{
						_localctx = new SMALLOREQUALoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(178);
						((SMALLOREQUALoperationContext)_localctx).op = match(SMALLEROREQUAL);
						setState(179);
						mathExpression(6);
						}
						break;
					case 14:
						{
						_localctx = new FACTContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(180);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(181);
						((FACTContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Z3OutputSudokuAContext extends ParserRuleContext {
		public Z3OutputSudokuAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3OutputSudokuA; }
	 
		public Z3OutputSudokuAContext() { }
		public void copyFrom(Z3OutputSudokuAContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineFunBodyContext extends Z3OutputSudokuAContext {
		public List<TerminalNode> OPAR() { return getTokens(Example2Parser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(Example2Parser.OPAR, i);
		}
		public TerminalNode DEFINEFUN() { return getToken(Example2Parser.DEFINEFUN, 0); }
		public TerminalNode Z3VARNAME() { return getToken(Example2Parser.Z3VARNAME, 0); }
		public List<TerminalNode> CPAR() { return getTokens(Example2Parser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(Example2Parser.CPAR, i);
		}
		public TerminalNode Z3INT() { return getToken(Example2Parser.Z3INT, 0); }
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public DefineFunBodyContext(Z3OutputSudokuAContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDefineFunBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SatBodyContext extends Z3OutputSudokuAContext {
		public TerminalNode SAT() { return getToken(Example2Parser.SAT, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public List<Z3OutputSudokuAContext> z3OutputSudokuA() {
			return getRuleContexts(Z3OutputSudokuAContext.class);
		}
		public Z3OutputSudokuAContext z3OutputSudokuA(int i) {
			return getRuleContext(Z3OutputSudokuAContext.class,i);
		}
		public SatBodyContext(Z3OutputSudokuAContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSatBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3OutputSudokuAContext z3OutputSudokuA() throws RecognitionException {
		Z3OutputSudokuAContext _localctx = new Z3OutputSudokuAContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_z3OutputSudokuA);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAT:
				_localctx = new SatBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(SAT);
				setState(188);
				match(OPAR);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPAR || _la==SAT) {
					{
					{
					setState(189);
					z3OutputSudokuA();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(CPAR);
				}
				break;
			case OPAR:
				_localctx = new DefineFunBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(OPAR);
				setState(197);
				match(DEFINEFUN);
				setState(198);
				match(Z3VARNAME);
				setState(199);
				match(OPAR);
				setState(200);
				match(CPAR);
				setState(201);
				match(Z3INT);
				setState(202);
				match(NUMBER);
				setState(203);
				match(CPAR);
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

	public static class NumberAContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public NumberAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberA; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNumberA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberAContext numberA() throws RecognitionException {
		NumberAContext _localctx = new NumberAContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numberA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public NumberBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberB; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNumberB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberBContext numberB() throws RecognitionException {
		NumberBContext _localctx = new NumberBContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numberB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public NumberCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberC; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNumberC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberCContext numberC() throws RecognitionException {
		NumberCContext _localctx = new NumberCContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numberC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public NumberDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberD; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNumberD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberDContext numberD() throws RecognitionException {
		NumberDContext _localctx = new NumberDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numberD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bf\b\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tq\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n}\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0082\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008c\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b7\b\u000b"+
		"\n\u000b\f\u000b\u00ba\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00bf\b"+
		"\f\n\f\f\f\u00c2\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00cd\b\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000"+
		"\u0001\u0016\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \u0000\u0000\u00ec\u0000%\u0001\u0000\u0000"+
		"\u0000\u00029\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006"+
		"@\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000"+
		"\u0000\fZ\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010"+
		"j\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000\u0014\u0081\u0001"+
		"\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u00cc\u0001"+
		"\u0000\u0000\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00d0\u0001"+
		"\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000"+
		"\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'"+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000"+
		"\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*:\u0003\f\u0006\u0000+:\u0003"+
		"\u000e\u0007\u0000,:\u0003\n\u0005\u0000-:\u0003\u0004\u0002\u0000.:\u0003"+
		"\u0006\u0003\u0000/:\u0003\b\u0004\u00000:\u0003\u0018\f\u000013\u0005"+
		"\u0001\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0005\u0002\u0000\u00008:\u0001\u0000"+
		"\u0000\u00009*\u0001\u0000\u0000\u00009+\u0001\u0000\u0000\u00009,\u0001"+
		"\u0000\u0000\u00009-\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u0000"+
		"9/\u0001\u0000\u0000\u000090\u0001\u0000\u0000\u000091\u0001\u0000\u0000"+
		"\u0000:\u0003\u0001\u0000\u0000\u0000;<\u0005\u0019\u0000\u0000<=\u0003"+
		"\f\u0006\u0000=>\u0005\u001b\u0000\u0000>?\u0003\u0002\u0001\u0000?\u0005"+
		"\u0001\u0000\u0000\u0000@A\u0005\u0017\u0000\u0000AB\u0003\f\u0006\u0000"+
		"BC\u0005\u001a\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0003\u0002\u0001"+
		"\u0000EH\u0005\u0002\u0000\u0000FG\u0005\u001d\u0000\u0000GI\u0003\u0002"+
		"\u0001\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0018\u0000\u0000K\u0007\u0001\u0000\u0000"+
		"\u0000LM\u0003\u001a\r\u0000MN\u0005\u001c\u0000\u0000NO\u0003\u001c\u000e"+
		"\u0000OP\u0005\u001c\u0000\u0000PQ\u0003\u001e\u000f\u0000QR\u0005\u001c"+
		"\u0000\u0000RS\u0003 \u0010\u0000S\t\u0001\u0000\u0000\u0000TU\u0005\u0016"+
		"\u0000\u0000UV\u0003\f\u0006\u0000V\u000b\u0001\u0000\u0000\u0000W[\u0003"+
		"\u0016\u000b\u0000X[\u0005)\u0000\u0000Y[\u0005*\u0000\u0000ZW\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\r\u0001"+
		"\u0000\u0000\u0000\\`\u0003\u0010\b\u0000]`\u0003\u0012\t\u0000^`\u0003"+
		"\u0014\n\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^"+
		"\u0001\u0000\u0000\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0005\u0012"+
		"\u0000\u0000be\u0005+\u0000\u0000cd\u0005#\u0000\u0000df\u0003\u0016\u000b"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fk\u0001\u0000"+
		"\u0000\u0000gh\u0005+\u0000\u0000hi\u0005#\u0000\u0000ik\u0003\u0016\u000b"+
		"\u0000ja\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000k\u0011\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0014\u0000\u0000mp\u0005+\u0000\u0000no\u0005"+
		"#\u0000\u0000oq\u0003\u0016\u000b\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qw\u0001\u0000\u0000\u0000rs\u0005\u0014\u0000\u0000"+
		"st\u0005+\u0000\u0000tu\u0005#\u0000\u0000uw\u0005)\u0000\u0000vl\u0001"+
		"\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000w\u0013\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0013\u0000\u0000y|\u0005+\u0000\u0000z{\u0005#\u0000\u0000"+
		"{}\u0005*\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0082\u0001\u0000\u0000\u0000~\u007f\u0005+\u0000\u0000\u007f\u0080"+
		"\u0005#\u0000\u0000\u0080\u0082\u0005*\u0000\u0000\u0081x\u0001\u0000"+
		"\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0015\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0006\u000b\uffff\uffff\u0000\u0084\u0085\u0005\u0003"+
		"\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0005\u0004"+
		"\u0000\u0000\u0087\u008c\u0001\u0000\u0000\u0000\u0088\u008c\u0005\'\u0000"+
		"\u0000\u0089\u008c\u0005*\u0000\u0000\u008a\u008c\u0005+\u0000\u0000\u008b"+
		"\u0083\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u00b8\u0001\u0000\u0000\u0000\u008d\u008e\n\u0012\u0000\u0000\u008e\u008f"+
		"\u0005\u0005\u0000\u0000\u008f\u00b7\u0003\u0016\u000b\u0013\u0090\u0091"+
		"\n\u0011\u0000\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u00b7\u0003"+
		"\u0016\u000b\u0012\u0093\u0094\n\u0010\u0000\u0000\u0094\u0095\u0005\u0007"+
		"\u0000\u0000\u0095\u00b7\u0003\u0016\u000b\u0011\u0096\u0097\n\u000f\u0000"+
		"\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098\u00b7\u0003\u0016\u000b\u0010"+
		"\u0099\u009a\n\u000e\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b"+
		"\u00b7\u0003\u0016\u000b\u000f\u009c\u009d\n\f\u0000\u0000\u009d\u009e"+
		"\u0005%\u0000\u0000\u009e\u00b7\u0003\u0016\u000b\r\u009f\u00a0\n\u000b"+
		"\u0000\u0000\u00a0\u00a1\u0005\f\u0000\u0000\u00a1\u00b7\u0003\u0016\u000b"+
		"\f\u00a2\u00a3\n\n\u0000\u0000\u00a3\u00a4\u0005$\u0000\u0000\u00a4\u00b7"+
		"\u0003\u0016\u000b\u000b\u00a5\u00a6\n\t\u0000\u0000\u00a6\u00a7\u0005"+
		"\r\u0000\u0000\u00a7\u00b7\u0003\u0016\u000b\n\u00a8\u00a9\n\b\u0000\u0000"+
		"\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00b7\u0003\u0016\u000b\t\u00ab"+
		"\u00ac\n\u0007\u0000\u0000\u00ac\u00ad\u0005\u000f\u0000\u0000\u00ad\u00b7"+
		"\u0003\u0016\u000b\b\u00ae\u00af\n\u0006\u0000\u0000\u00af\u00b0\u0005"+
		"\u0010\u0000\u0000\u00b0\u00b7\u0003\u0016\u000b\u0007\u00b1\u00b2\n\u0005"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0011\u0000\u0000\u00b3\u00b7\u0003\u0016"+
		"\u000b\u0006\u00b4\u00b5\n\r\u0000\u0000\u00b5\u00b7\u0005\n\u0000\u0000"+
		"\u00b6\u008d\u0001\u0000\u0000\u0000\u00b6\u0090\u0001\u0000\u0000\u0000"+
		"\u00b6\u0093\u0001\u0000\u0000\u0000\u00b6\u0096\u0001\u0000\u0000\u0000"+
		"\u00b6\u0099\u0001\u0000\u0000\u0000\u00b6\u009c\u0001\u0000\u0000\u0000"+
		"\u00b6\u009f\u0001\u0000\u0000\u0000\u00b6\u00a2\u0001\u0000\u0000\u0000"+
		"\u00b6\u00a5\u0001\u0000\u0000\u0000\u00b6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ab\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0017\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001f\u0000\u0000"+
		"\u00bc\u00c0\u0005\u0003\u0000\u0000\u00bd\u00bf\u0003\u0018\f\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00cd\u0005\u0004\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5"+
		"\u00c6\u0005 \u0000\u0000\u00c6\u00c7\u0005\"\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0003\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u00ca"+
		"\u0005!\u0000\u0000\u00ca\u00cb\u0005\'\u0000\u0000\u00cb\u00cd\u0005"+
		"\u0004\u0000\u0000\u00cc\u00bb\u0001\u0000\u0000\u0000\u00cc\u00c4\u0001"+
		"\u0000\u0000\u0000\u00cd\u0019\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\'\u0000\u0000\u00cf\u001b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\'"+
		"\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\'\u0000"+
		"\u0000\u00d3\u001f\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\'\u0000\u0000"+
		"\u00d5!\u0001\u0000\u0000\u0000\u0011%59HZ_ejpv|\u0081\u008b\u00b6\u00b8"+
		"\u00c0\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}