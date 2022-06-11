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
		INT_PARAM=22, STRING_PARAM=23, BOOL_PARAM=24, PRINT=25, IF=26, FOR=27, 
		FI=28, WHILE=29, THEN=30, DO=31, DOT=32, ELSE=33, DECLAREFUNVOID=34, DECLAREFUNSTRING=35, 
		DECLAREFUNINT=36, DECLAREFUNBOOL=37, RETURN=38, SAT=39, DEFINEFUN=40, 
		Z3INT=41, ITE=42, Z3AND=43, EQUAL=44, NEQUAL=45, EQUALCHECK=46, COMMA=47, 
		NUMBER=48, WS=49, BOOL=50, STRING=51, ID=52;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_loop = 2, RULE_ifStat = 3, RULE_url = 4, 
		RULE_print_statement = 5, RULE_expression = 6, RULE_variable = 7, RULE_int_variable = 8, 
		RULE_bool_variable = 9, RULE_string_variable = 10, RULE_mathExpression = 11, 
		RULE_declareFunctions = 12, RULE_declare_body = 13, RULE_call_functions = 14, 
		RULE_parameter_variables = 15, RULE_function_parameters = 16, RULE_z3Statement = 17, 
		RULE_z3value = 18, RULE_z3and = 19, RULE_z3ite = 20, RULE_z3comparison = 21, 
		RULE_z3variable_declaration = 22, RULE_z3variable_name = 23, RULE_z3expression = 24, 
		RULE_numberA = 25, RULE_numberB = 26, RULE_numberC = 27, RULE_numberD = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "loop", "ifStat", "url", "print_statement", "expression", 
			"variable", "int_variable", "bool_variable", "string_variable", "mathExpression", 
			"declareFunctions", "declare_body", "call_functions", "parameter_variables", 
			"function_parameters", "z3Statement", "z3value", "z3and", "z3ite", "z3comparison", 
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTCURL) | (1L << OPAR) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DECLAREFUNVOID) | (1L << DECLAREFUNSTRING) | (1L << DECLAREFUNINT) | (1L << DECLAREFUNBOOL) | (1L << SAT) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
	public static class Z3OutputContext extends StatementContext {
		public Z3StatementContext z3Statement() {
			return getRuleContext(Z3StatementContext.class,0);
		}
		public Z3OutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZ3Output(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBodyContext extends StatementContext {
		public TerminalNode LEFTCURL() { return getToken(Example2Parser.LEFTCURL, 0); }
		public TerminalNode RIGHTCURL() { return getToken(Example2Parser.RIGHTCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBodyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStatementBody(this);
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
	public static class DeclareFunctionContext extends StatementContext {
		public DeclareFunctionsContext declareFunctions() {
			return getRuleContext(DeclareFunctionsContext.class,0);
		}
		public DeclareFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareFunction(this);
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
	public static class CallFunctionsContext extends StatementContext {
		public Call_functionsContext call_functions() {
			return getRuleContext(Call_functionsContext.class,0);
		}
		public CallFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCallFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				variable();
				}
				break;
			case 2:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				print_statement();
				}
				break;
			case 3:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				loop();
				}
				break;
			case 4:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				ifStat();
				}
				break;
			case 5:
				_localctx = new UrlStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				url();
				}
				break;
			case 6:
				_localctx = new Z3OutputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				z3Statement();
				}
				break;
			case 7:
				_localctx = new StatementBodyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				match(LEFTCURL);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					statement();
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTCURL) | (1L << OPAR) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DECLAREFUNVOID) | (1L << DECLAREFUNSTRING) | (1L << DECLAREFUNINT) | (1L << DECLAREFUNBOOL) | (1L << SAT) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0) );
				setState(78);
				match(RIGHTCURL);
				}
				break;
			case 8:
				_localctx = new DeclareFunctionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				declareFunctions();
				}
				break;
			case 9:
				_localctx = new CallFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				call_functions();
				}
				break;
			case 10:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				expression();
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
			setState(85);
			match(WHILE);
			setState(86);
			expression();
			setState(87);
			match(DO);
			setState(88);
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
			setState(90);
			match(IF);
			setState(91);
			expression();
			setState(92);
			match(THEN);
			setState(93);
			match(LEFTCURL);
			setState(94);
			statement();
			setState(95);
			match(RIGHTCURL);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(96);
				match(ELSE);
				setState(97);
				statement();
				}
			}

			setState(100);
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
			setState(102);
			numberA();
			setState(103);
			match(DOT);
			setState(104);
			numberB();
			setState(105);
			match(DOT);
			setState(106);
			numberC();
			setState(107);
			match(DOT);
			setState(108);
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
			setState(110);
			match(PRINT);
			setState(111);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MathExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				mathExpression(0);
				}
				break;
			case 2:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				int_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				bool_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_INIT:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(INT_INIT);
				setState(124);
				match(ID);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(125);
					match(EQUAL);
					setState(126);
					statement();
					}
				}

				}
				break;
			case ID:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				setState(130);
				match(EQUAL);
				setState(131);
				statement();
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BoolAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(BOOL_INIT);
				setState(135);
				match(ID);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(136);
					match(EQUAL);
					setState(137);
					mathExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(BOOL_INIT);
				setState(141);
				match(ID);
				setState(142);
				match(EQUAL);
				setState(143);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_INIT:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(STRING_INIT);
				setState(147);
				match(ID);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(148);
					match(EQUAL);
					setState(149);
					statement();
					}
				}

				}
				break;
			case ID:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(153);
				match(EQUAL);
				setState(154);
				statement();
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				match(OPAR);
				setState(159);
				mathExpression(0);
				setState(160);
				match(CPAR);
				}
				break;
			case NUMBER:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MULContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(167);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(168);
						((MULContext)_localctx).op = match(MUL);
						setState(169);
						mathExpression(19);
						}
						break;
					case 2:
						{
						_localctx = new DIVContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(170);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(171);
						((DIVContext)_localctx).op = match(DIV);
						setState(172);
						mathExpression(18);
						}
						break;
					case 3:
						{
						_localctx = new ADDContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(174);
						((ADDContext)_localctx).op = match(ADD);
						setState(175);
						mathExpression(17);
						}
						break;
					case 4:
						{
						_localctx = new SUBContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(176);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(177);
						((SUBContext)_localctx).op = match(SUB);
						setState(178);
						mathExpression(16);
						}
						break;
					case 5:
						{
						_localctx = new POWContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(179);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(180);
						((POWContext)_localctx).op = match(POW);
						setState(181);
						mathExpression(15);
						}
						break;
					case 6:
						{
						_localctx = new EQUALCheckContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183);
						((EQUALCheckContext)_localctx).op = match(EQUALCHECK);
						setState(184);
						mathExpression(13);
						}
						break;
					case 7:
						{
						_localctx = new ANDoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(185);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(186);
						((ANDoperationContext)_localctx).op = match(AND);
						setState(187);
						mathExpression(12);
						}
						break;
					case 8:
						{
						_localctx = new NOToperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(188);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(189);
						((NOToperationContext)_localctx).op = match(NEQUAL);
						setState(190);
						mathExpression(11);
						}
						break;
					case 9:
						{
						_localctx = new ORoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(191);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(192);
						((ORoperationContext)_localctx).op = match(OR);
						setState(193);
						mathExpression(10);
						}
						break;
					case 10:
						{
						_localctx = new BIGGERoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(194);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(195);
						((BIGGERoperationContext)_localctx).op = match(BIGGERTHAN);
						setState(196);
						mathExpression(9);
						}
						break;
					case 11:
						{
						_localctx = new SMALLERoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
						((SMALLERoperationContext)_localctx).op = match(SMALLERTHAN);
						setState(199);
						mathExpression(8);
						}
						break;
					case 12:
						{
						_localctx = new BIGOREQUALoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						((BIGOREQUALoperationContext)_localctx).op = match(BIGGEROREQUAL);
						setState(202);
						mathExpression(7);
						}
						break;
					case 13:
						{
						_localctx = new SMALLOREQUALoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						((SMALLOREQUALoperationContext)_localctx).op = match(SMALLEROREQUAL);
						setState(205);
						mathExpression(6);
						}
						break;
					case 14:
						{
						_localctx = new FACTContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(206);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(207);
						((FACTContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(212);
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

	public static class DeclareFunctionsContext extends ParserRuleContext {
		public Declare_bodyContext declare_body() {
			return getRuleContext(Declare_bodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(Example2Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Function_parametersContext> function_parameters() {
			return getRuleContexts(Function_parametersContext.class);
		}
		public Function_parametersContext function_parameters(int i) {
			return getRuleContext(Function_parametersContext.class,i);
		}
		public DeclareFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareFunctions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareFunctionsContext declareFunctions() throws RecognitionException {
		DeclareFunctionsContext _localctx = new DeclareFunctionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declareFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			declare_body();
			setState(214);
			match(ID);
			setState(215);
			match(OPAR);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_PARAM) | (1L << STRING_PARAM) | (1L << BOOL_PARAM) | (1L << COMMA))) != 0)) {
				{
				{
				setState(216);
				function_parameters();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(CPAR);
			setState(223);
			statement();
			setState(224);
			match(RETURN);
			setState(225);
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

	public static class Declare_bodyContext extends ParserRuleContext {
		public Declare_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_body; }
	 
		public Declare_bodyContext() { }
		public void copyFrom(Declare_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareFunBoolContext extends Declare_bodyContext {
		public TerminalNode DECLAREFUNBOOL() { return getToken(Example2Parser.DECLAREFUNBOOL, 0); }
		public DeclareFunBoolContext(Declare_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareFunBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareFunVoidContext extends Declare_bodyContext {
		public TerminalNode DECLAREFUNVOID() { return getToken(Example2Parser.DECLAREFUNVOID, 0); }
		public DeclareFunVoidContext(Declare_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareFunVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareFunIntContext extends Declare_bodyContext {
		public TerminalNode DECLAREFUNINT() { return getToken(Example2Parser.DECLAREFUNINT, 0); }
		public DeclareFunIntContext(Declare_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareFunInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareFunStringContext extends Declare_bodyContext {
		public TerminalNode DECLAREFUNSTRING() { return getToken(Example2Parser.DECLAREFUNSTRING, 0); }
		public DeclareFunStringContext(Declare_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDeclareFunString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_bodyContext declare_body() throws RecognitionException {
		Declare_bodyContext _localctx = new Declare_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declare_body);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLAREFUNVOID:
				_localctx = new DeclareFunVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(DECLAREFUNVOID);
				}
				break;
			case DECLAREFUNSTRING:
				_localctx = new DeclareFunStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(DECLAREFUNSTRING);
				}
				break;
			case DECLAREFUNINT:
				_localctx = new DeclareFunIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(DECLAREFUNINT);
				}
				break;
			case DECLAREFUNBOOL:
				_localctx = new DeclareFunBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(DECLAREFUNBOOL);
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

	public static class Call_functionsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public Call_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCall_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionsContext call_functions() throws RecognitionException {
		Call_functionsContext _localctx = new Call_functionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call_functions);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(ID);
				setState(234);
				match(OPAR);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(235);
					expression();
					}
				}

				setState(238);
				match(CPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(ID);
				setState(240);
				match(OPAR);
				setState(241);
				expression();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					expression();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(CPAR);
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

	public static class Parameter_variablesContext extends ParserRuleContext {
		public TerminalNode STRING_PARAM() { return getToken(Example2Parser.STRING_PARAM, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode BOOL_PARAM() { return getToken(Example2Parser.BOOL_PARAM, 0); }
		public TerminalNode INT_PARAM() { return getToken(Example2Parser.INT_PARAM, 0); }
		public Parameter_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParameter_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_variablesContext parameter_variables() throws RecognitionException {
		Parameter_variablesContext _localctx = new Parameter_variablesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter_variables);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_PARAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(STRING_PARAM);
				setState(254);
				match(ID);
				}
				break;
			case BOOL_PARAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(BOOL_PARAM);
				setState(256);
				match(ID);
				}
				break;
			case INT_PARAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(INT_PARAM);
				setState(258);
				match(ID);
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

	public static class Function_parametersContext extends ParserRuleContext {
		public Parameter_variablesContext parameter_variables() {
			return getRuleContext(Parameter_variablesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Example2Parser.COMMA, 0); }
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_parameters);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_PARAM:
			case STRING_PARAM:
			case BOOL_PARAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				parameter_variables();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(COMMA);
				setState(263);
				parameter_variables();
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

	public static class Z3StatementContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(Example2Parser.SAT, 0); }
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZ3Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3StatementContext z3Statement() throws RecognitionException {
		Z3StatementContext _localctx = new Z3StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_z3Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(SAT);
			setState(267);
			match(OPAR);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				z3value();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPAR );
			setState(273);
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
		public List<TerminalNode> OPAR() { return getTokens(Example2Parser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(Example2Parser.OPAR, i);
		}
		public TerminalNode DEFINEFUN() { return getToken(Example2Parser.DEFINEFUN, 0); }
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public List<TerminalNode> CPAR() { return getTokens(Example2Parser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(Example2Parser.CPAR, i);
		}
		public TerminalNode Z3INT() { return getToken(Example2Parser.Z3INT, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3valueContext z3value() throws RecognitionException {
		Z3valueContext _localctx = new Z3valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_z3value);
		int _la;
		try {
			_localctx = new ZValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(OPAR);
			setState(276);
			match(DEFINEFUN);
			setState(277);
			z3variable_name();
			setState(278);
			match(OPAR);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAR) {
				{
				{
				setState(279);
				z3variable_declaration();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(CPAR);
			setState(286);
			match(Z3INT);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				{
				setState(287);
				z3expression();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode Z3AND() { return getToken(Example2Parser.Z3AND, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public List<Z3expressionContext> z3expression() {
			return getRuleContexts(Z3expressionContext.class);
		}
		public Z3expressionContext z3expression(int i) {
			return getRuleContext(Z3expressionContext.class,i);
		}
		public ZAndStatementContext(Z3andContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZAndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3andContext z3and() throws RecognitionException {
		Z3andContext _localctx = new Z3andContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_z3and);
		int _la;
		try {
			_localctx = new ZAndStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(OPAR);
			setState(296);
			match(Z3AND);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				z3expression();
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUMBER) | (1L << ID))) != 0) );
			setState(302);
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
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode ITE() { return getToken(Example2Parser.ITE, 0); }
		public List<Z3expressionContext> z3expression() {
			return getRuleContexts(Z3expressionContext.class);
		}
		public Z3expressionContext z3expression(int i) {
			return getRuleContext(Z3expressionContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public ZITEStatementContext(Z3iteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZITEStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3iteContext z3ite() throws RecognitionException {
		Z3iteContext _localctx = new Z3iteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_z3ite);
		try {
			_localctx = new ZITEStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(OPAR);
			setState(305);
			match(ITE);
			setState(306);
			z3expression();
			setState(307);
			z3expression();
			setState(308);
			z3expression();
			setState(309);
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
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(Example2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Example2Parser.NUMBER, i);
		}
		public ZcomparisonStatementContext(Z3comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZcomparisonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3comparisonContext z3comparison() throws RecognitionException {
		Z3comparisonContext _localctx = new Z3comparisonContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_z3comparison);
		int _la;
		try {
			_localctx = new ZcomparisonStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(OPAR);
			setState(312);
			match(EQUAL);
			setState(313);
			z3variable_name();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(314);
				match(NUMBER);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
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
		public TerminalNode OPAR() { return getToken(Example2Parser.OPAR, 0); }
		public Z3variable_nameContext z3variable_name() {
			return getRuleContext(Z3variable_nameContext.class,0);
		}
		public TerminalNode Z3INT() { return getToken(Example2Parser.Z3INT, 0); }
		public TerminalNode CPAR() { return getToken(Example2Parser.CPAR, 0); }
		public ZvariableDeclarationContext(Z3variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZvariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3variable_declarationContext z3variable_declaration() throws RecognitionException {
		Z3variable_declarationContext _localctx = new Z3variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_z3variable_declaration);
		try {
			_localctx = new ZvariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(OPAR);
			setState(323);
			z3variable_name();
			setState(324);
			match(Z3INT);
			setState(325);
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
		public TerminalNode FACT() { return getToken(Example2Parser.FACT, 0); }
		public List<TerminalNode> ID() { return getTokens(Example2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Example2Parser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(Example2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Example2Parser.NUMBER, i);
		}
		public Z3variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3variable_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZ3variable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3variable_nameContext z3variable_name() throws RecognitionException {
		Z3variable_nameContext _localctx = new Z3variable_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_z3variable_name);
		int _la;
		try {
			int _alt;
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(327);
					match(ID);
					}
					}
					setState(330); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(332);
				match(FACT);
				setState(334); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(333);
						match(NUMBER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(336); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
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
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public Z3expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z3expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitZ3expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Z3expressionContext z3expression() throws RecognitionException {
		Z3expressionContext _localctx = new Z3expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_z3expression);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				z3and();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				z3ite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				z3comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				z3value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				z3variable_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
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
		enterRule(_localctx, 50, RULE_numberA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 52, RULE_numberB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 54, RULE_numberC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		enterRule(_localctx, 56, RULE_numberD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		"\u0004\u00014\u0167\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"K\b\u0001\u000b\u0001\f\u0001L\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006u\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0080\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0085\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008b\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0091\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0097\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00a6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00d1\b\u000b\n\u000b\f\u000b\u00d4"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00da\b\f\n\f\f\f\u00dd"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00e8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ed"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00f5\b\u000e\n\u000e\f\u000e\u00f8\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00fc\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0104\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0109\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u010e\b\u0011\u000b\u0011\f\u0011\u010f\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0119\b\u0012\n\u0012\f\u0012\u011c\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0121\b\u0012\n\u0012\f\u0012\u0124"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u012b\b\u0013\u000b\u0013\f\u0013\u012c\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u013c\b\u0015\n\u0015\f\u0015\u013f\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004"+
		"\u0017\u0149\b\u0017\u000b\u0017\f\u0017\u014a\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u014f\b\u0017\u000b\u0017\f\u0017\u0150\u0001\u0017\u0003"+
		"\u0017\u0154\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u015d\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0000\u0001\u0016\u001d\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8\u0000\u0000\u0188\u0000=\u0001\u0000\u0000\u0000\u0002S\u0001\u0000"+
		"\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000"+
		"\bf\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\ft\u0001\u0000"+
		"\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010\u0084\u0001\u0000\u0000"+
		"\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u009b\u0001\u0000\u0000"+
		"\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000"+
		"\u0000\u001a\u00e7\u0001\u0000\u0000\u0000\u001c\u00fb\u0001\u0000\u0000"+
		"\u0000\u001e\u0103\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000"+
		"\"\u010a\u0001\u0000\u0000\u0000$\u0113\u0001\u0000\u0000\u0000&\u0127"+
		"\u0001\u0000\u0000\u0000(\u0130\u0001\u0000\u0000\u0000*\u0137\u0001\u0000"+
		"\u0000\u0000,\u0142\u0001\u0000\u0000\u0000.\u0153\u0001\u0000\u0000\u0000"+
		"0\u015c\u0001\u0000\u0000\u00002\u015e\u0001\u0000\u0000\u00004\u0160"+
		"\u0001\u0000\u0000\u00006\u0162\u0001\u0000\u0000\u00008\u0164\u0001\u0000"+
		"\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0000\u0000"+
		"\u0001A\u0001\u0001\u0000\u0000\u0000BT\u0003\u000e\u0007\u0000CT\u0003"+
		"\n\u0005\u0000DT\u0003\u0004\u0002\u0000ET\u0003\u0006\u0003\u0000FT\u0003"+
		"\b\u0004\u0000GT\u0003\"\u0011\u0000HJ\u0005\u0001\u0000\u0000IK\u0003"+
		"\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0002\u0000\u0000OT\u0001\u0000\u0000\u0000PT\u0003\u0018"+
		"\f\u0000QT\u0003\u001c\u000e\u0000RT\u0003\f\u0006\u0000SB\u0001\u0000"+
		"\u0000\u0000SC\u0001\u0000\u0000\u0000SD\u0001\u0000\u0000\u0000SE\u0001"+
		"\u0000\u0000\u0000SF\u0001\u0000\u0000\u0000SG\u0001\u0000\u0000\u0000"+
		"SH\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000SR\u0001\u0000\u0000\u0000T\u0003\u0001\u0000\u0000\u0000UV\u0005"+
		"\u001d\u0000\u0000VW\u0003\f\u0006\u0000WX\u0005\u001f\u0000\u0000XY\u0003"+
		"\u0002\u0001\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0005\u001a\u0000"+
		"\u0000[\\\u0003\f\u0006\u0000\\]\u0005\u001e\u0000\u0000]^\u0005\u0001"+
		"\u0000\u0000^_\u0003\u0002\u0001\u0000_b\u0005\u0002\u0000\u0000`a\u0005"+
		"!\u0000\u0000ac\u0003\u0002\u0001\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u001c\u0000\u0000"+
		"e\u0007\u0001\u0000\u0000\u0000fg\u00032\u0019\u0000gh\u0005 \u0000\u0000"+
		"hi\u00034\u001a\u0000ij\u0005 \u0000\u0000jk\u00036\u001b\u0000kl\u0005"+
		" \u0000\u0000lm\u00038\u001c\u0000m\t\u0001\u0000\u0000\u0000no\u0005"+
		"\u0019\u0000\u0000op\u0003\f\u0006\u0000p\u000b\u0001\u0000\u0000\u0000"+
		"qu\u0003\u0016\u000b\u0000ru\u00052\u0000\u0000su\u00053\u0000\u0000t"+
		"q\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000u\r\u0001\u0000\u0000\u0000vz\u0003\u0010\b\u0000wz\u0003\u0012"+
		"\t\u0000xz\u0003\u0014\n\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u000f\u0001\u0000\u0000\u0000"+
		"{|\u0005\u0012\u0000\u0000|\u007f\u00054\u0000\u0000}~\u0005,\u0000\u0000"+
		"~\u0080\u0003\u0002\u0001\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0085\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u00054\u0000\u0000\u0082\u0083\u0005,\u0000\u0000\u0083\u0085\u0003\u0002"+
		"\u0001\u0000\u0084{\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000"+
		"\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0014\u0000"+
		"\u0000\u0087\u008a\u00054\u0000\u0000\u0088\u0089\u0005,\u0000\u0000\u0089"+
		"\u008b\u0003\u0016\u000b\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0091\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u0014\u0000\u0000\u008d\u008e\u00054\u0000\u0000\u008e\u008f"+
		"\u0005,\u0000\u0000\u008f\u0091\u00052\u0000\u0000\u0090\u0086\u0001\u0000"+
		"\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u0013\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u0013\u0000\u0000\u0093\u0096\u00054\u0000"+
		"\u0000\u0094\u0095\u0005,\u0000\u0000\u0095\u0097\u0003\u0002\u0001\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u009c\u0001\u0000\u0000\u0000\u0098\u0099\u00054\u0000\u0000\u0099"+
		"\u009a\u0005,\u0000\u0000\u009a\u009c\u0003\u0002\u0001\u0000\u009b\u0092"+
		"\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009c\u0015"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0006\u000b\uffff\uffff\u0000\u009e"+
		"\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0"+
		"\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a6\u00050\u0000\u0000\u00a3\u00a6\u00053\u0000\u0000\u00a4\u00a6\u0005"+
		"4\u0000\u0000\u00a5\u009d\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00d2\u0001\u0000\u0000\u0000\u00a7\u00a8\n\u0012\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9\u00d1\u0003\u0016\u000b"+
		"\u0013\u00aa\u00ab\n\u0011\u0000\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000"+
		"\u00ac\u00d1\u0003\u0016\u000b\u0012\u00ad\u00ae\n\u0010\u0000\u0000\u00ae"+
		"\u00af\u0005\u0007\u0000\u0000\u00af\u00d1\u0003\u0016\u000b\u0011\u00b0"+
		"\u00b1\n\u000f\u0000\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00d1"+
		"\u0003\u0016\u000b\u0010\u00b3\u00b4\n\u000e\u0000\u0000\u00b4\u00b5\u0005"+
		"\t\u0000\u0000\u00b5\u00d1\u0003\u0016\u000b\u000f\u00b6\u00b7\n\f\u0000"+
		"\u0000\u00b7\u00b8\u0005.\u0000\u0000\u00b8\u00d1\u0003\u0016\u000b\r"+
		"\u00b9\u00ba\n\u000b\u0000\u0000\u00ba\u00bb\u0005\f\u0000\u0000\u00bb"+
		"\u00d1\u0003\u0016\u000b\f\u00bc\u00bd\n\n\u0000\u0000\u00bd\u00be\u0005"+
		"-\u0000\u0000\u00be\u00d1\u0003\u0016\u000b\u000b\u00bf\u00c0\n\t\u0000"+
		"\u0000\u00c0\u00c1\u0005\r\u0000\u0000\u00c1\u00d1\u0003\u0016\u000b\n"+
		"\u00c2\u00c3\n\b\u0000\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4"+
		"\u00d1\u0003\u0016\u000b\t\u00c5\u00c6\n\u0007\u0000\u0000\u00c6\u00c7"+
		"\u0005\u000f\u0000\u0000\u00c7\u00d1\u0003\u0016\u000b\b\u00c8\u00c9\n"+
		"\u0006\u0000\u0000\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca\u00d1\u0003"+
		"\u0016\u000b\u0007\u00cb\u00cc\n\u0005\u0000\u0000\u00cc\u00cd\u0005\u0011"+
		"\u0000\u0000\u00cd\u00d1\u0003\u0016\u000b\u0006\u00ce\u00cf\n\r\u0000"+
		"\u0000\u00cf\u00d1\u0005\n\u0000\u0000\u00d0\u00a7\u0001\u0000\u0000\u0000"+
		"\u00d0\u00aa\u0001\u0000\u0000\u0000\u00d0\u00ad\u0001\u0000\u0000\u0000"+
		"\u00d0\u00b0\u0001\u0000\u0000\u0000\u00d0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00d0\u00b6\u0001\u0000\u0000\u0000\u00d0\u00b9\u0001\u0000\u0000\u0000"+
		"\u00d0\u00bc\u0001\u0000\u0000\u0000\u00d0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c2\u0001\u0000\u0000\u0000\u00d0\u00c5\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u0017\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0003\u001a\r\u0000\u00d6\u00d7\u00054\u0000\u0000\u00d7"+
		"\u00db\u0005\u0003\u0000\u0000\u00d8\u00da\u0003 \u0010\u0000\u00d9\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005\u0004\u0000\u0000\u00df\u00e0\u0003\u0002\u0001\u0000\u00e0\u00e1"+
		"\u0005&\u0000\u0000\u00e1\u00e2\u0003\f\u0006\u0000\u00e2\u0019\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e8\u0005\"\u0000\u0000\u00e4\u00e8\u0005#"+
		"\u0000\u0000\u00e5\u00e8\u0005$\u0000\u0000\u00e6\u00e8\u0005%\u0000\u0000"+
		"\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u001b\u0001\u0000\u0000\u0000\u00e9\u00ea\u00054\u0000\u0000\u00ea"+
		"\u00ec\u0005\u0003\u0000\u0000\u00eb\u00ed\u0003\f\u0006\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00fc\u0005\u0004\u0000\u0000\u00ef\u00f0"+
		"\u00054\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f6\u0003"+
		"\f\u0006\u0000\u00f2\u00f3\u0005/\u0000\u0000\u00f3\u00f5\u0003\f\u0006"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fb\u00e9\u0001\u0000\u0000\u0000\u00fb\u00ef\u0001\u0000\u0000"+
		"\u0000\u00fc\u001d\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0017\u0000"+
		"\u0000\u00fe\u0104\u00054\u0000\u0000\u00ff\u0100\u0005\u0018\u0000\u0000"+
		"\u0100\u0104\u00054\u0000\u0000\u0101\u0102\u0005\u0016\u0000\u0000\u0102"+
		"\u0104\u00054\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u00ff"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u001f"+
		"\u0001\u0000\u0000\u0000\u0105\u0109\u0003\u001e\u000f\u0000\u0106\u0107"+
		"\u0005/\u0000\u0000\u0107\u0109\u0003\u001e\u000f\u0000\u0108\u0105\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109!\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0005\'\u0000\u0000\u010b\u010d\u0005\u0003\u0000"+
		"\u0000\u010c\u010e\u0003$\u0012\u0000\u010d\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0004\u0000\u0000\u0112#\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005\u0003\u0000\u0000\u0114\u0115\u0005(\u0000\u0000\u0115\u0116"+
		"\u0003.\u0017\u0000\u0116\u011a\u0005\u0003\u0000\u0000\u0117\u0119\u0003"+
		",\u0016\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e\u0122\u0005)\u0000"+
		"\u0000\u011f\u0121\u00030\u0018\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0004\u0000\u0000"+
		"\u0126%\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0003\u0000\u0000\u0128"+
		"\u012a\u0005+\u0000\u0000\u0129\u012b\u00030\u0018\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005\u0004\u0000\u0000\u012f\'\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0005\u0003\u0000\u0000\u0131\u0132\u0005*\u0000"+
		"\u0000\u0132\u0133\u00030\u0018\u0000\u0133\u0134\u00030\u0018\u0000\u0134"+
		"\u0135\u00030\u0018\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136)\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u0005"+
		",\u0000\u0000\u0139\u013d\u0003.\u0017\u0000\u013a\u013c\u00050\u0000"+
		"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0005\u0004\u0000\u0000\u0141+\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005\u0003\u0000\u0000\u0143\u0144\u0003.\u0017\u0000\u0144"+
		"\u0145\u0005)\u0000\u0000\u0145\u0146\u0005\u0004\u0000\u0000\u0146-\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u00054\u0000\u0000\u0148\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0005\n\u0000\u0000\u014d\u014f\u00050\u0000"+
		"\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0154\u00054\u0000\u0000"+
		"\u0153\u0148\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u0154/\u0001\u0000\u0000\u0000\u0155\u015d\u0003&\u0013\u0000\u0156\u015d"+
		"\u0003(\u0014\u0000\u0157\u015d\u0003*\u0015\u0000\u0158\u015d\u0003$"+
		"\u0012\u0000\u0159\u015d\u0003.\u0017\u0000\u015a\u015d\u00050\u0000\u0000"+
		"\u015b\u015d\u00054\u0000\u0000\u015c\u0155\u0001\u0000\u0000\u0000\u015c"+
		"\u0156\u0001\u0000\u0000\u0000\u015c\u0157\u0001\u0000\u0000\u0000\u015c"+
		"\u0158\u0001\u0000\u0000\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d"+
		"1\u0001\u0000\u0000\u0000\u015e\u015f\u00050\u0000\u0000\u015f3\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u00050\u0000\u0000\u01615\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u00050\u0000\u0000\u01637\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u00050\u0000\u0000\u01659\u0001\u0000\u0000\u0000\u001f=LSbty\u007f"+
		"\u0084\u008a\u0090\u0096\u009b\u00a5\u00d0\u00d2\u00db\u00e7\u00ec\u00f6"+
		"\u00fb\u0103\u0108\u010f\u011a\u0122\u012c\u013d\u014a\u0150\u0153\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}