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
		NUMBER=48, WS=49, BOOL=50, ID=51, STRING=52;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_loop = 2, RULE_ifStat = 3, RULE_print_statement = 4, 
		RULE_expression = 5, RULE_variable = 6, RULE_int_variable = 7, RULE_bool_variable = 8, 
		RULE_string_variable = 9, RULE_mathExpression = 10, RULE_declareFunctions = 11, 
		RULE_declare_body = 12, RULE_call_functions = 13, RULE_parameter_variables = 14, 
		RULE_function_parameters = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "loop", "ifStat", "print_statement", "expression", 
			"variable", "int_variable", "bool_variable", "string_variable", "mathExpression", 
			"declareFunctions", "declare_body", "call_functions", "parameter_variables", 
			"function_parameters"
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
			"BOOL", "ID", "STRING"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTCURL) | (1L << OPAR) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DECLAREFUNVOID) | (1L << DECLAREFUNSTRING) | (1L << DECLAREFUNINT) | (1L << DECLAREFUNBOOL) | (1L << RETURN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
	public static class MultipleReturnsContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(Example2Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultipleReturnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMultipleReturns(this);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				variable();
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				print_statement();
				}
				break;
			case 4:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				loop();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				ifStat();
				}
				break;
			case 6:
				_localctx = new StatementBodyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(LEFTCURL);
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					statement();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTCURL) | (1L << OPAR) | (1L << INT_INIT) | (1L << STRING_INIT) | (1L << BOOL_INIT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DECLAREFUNVOID) | (1L << DECLAREFUNSTRING) | (1L << DECLAREFUNINT) | (1L << DECLAREFUNBOOL) | (1L << RETURN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID) | (1L << STRING))) != 0) );
				setState(51);
				match(RIGHTCURL);
				}
				break;
			case 7:
				_localctx = new DeclareFunctionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				declareFunctions();
				}
				break;
			case 8:
				_localctx = new MultipleReturnsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				match(RETURN);
				setState(55);
				expression();
				}
				break;
			case 9:
				_localctx = new CallFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
				call_functions();
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
		enterRule(_localctx, 8, RULE_print_statement);
		try {
			_localctx = new PrintExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PRINT);
			setState(77);
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
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MathExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				mathExpression(0);
				}
				break;
			case 2:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
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
		enterRule(_localctx, 12, RULE_variable);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				int_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				bool_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
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
		enterRule(_localctx, 14, RULE_int_variable);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_INIT:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(INT_INIT);
				setState(90);
				match(ID);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(91);
					match(EQUAL);
					setState(92);
					statement();
					}
				}

				}
				break;
			case ID:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(ID);
				setState(96);
				match(EQUAL);
				setState(97);
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
		enterRule(_localctx, 16, RULE_bool_variable);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BoolAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(BOOL_INIT);
				setState(101);
				match(ID);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(102);
					match(EQUAL);
					setState(103);
					mathExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(BOOL_INIT);
				setState(107);
				match(ID);
				setState(108);
				match(EQUAL);
				setState(109);
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
		enterRule(_localctx, 18, RULE_string_variable);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_INIT:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(STRING_INIT);
				setState(113);
				match(ID);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(114);
					match(EQUAL);
					setState(115);
					statement();
					}
				}

				}
				break;
			case ID:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(ID);
				setState(119);
				match(EQUAL);
				setState(120);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_mathExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				match(OPAR);
				setState(125);
				mathExpression(0);
				setState(126);
				match(CPAR);
				}
				break;
			case NUMBER:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MULContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(133);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(134);
						((MULContext)_localctx).op = match(MUL);
						setState(135);
						mathExpression(19);
						}
						break;
					case 2:
						{
						_localctx = new DIVContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(136);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(137);
						((DIVContext)_localctx).op = match(DIV);
						setState(138);
						mathExpression(18);
						}
						break;
					case 3:
						{
						_localctx = new ADDContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(139);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(140);
						((ADDContext)_localctx).op = match(ADD);
						setState(141);
						mathExpression(17);
						}
						break;
					case 4:
						{
						_localctx = new SUBContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(142);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(143);
						((SUBContext)_localctx).op = match(SUB);
						setState(144);
						mathExpression(16);
						}
						break;
					case 5:
						{
						_localctx = new POWContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(145);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(146);
						((POWContext)_localctx).op = match(POW);
						setState(147);
						mathExpression(15);
						}
						break;
					case 6:
						{
						_localctx = new EQUALCheckContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(148);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(149);
						((EQUALCheckContext)_localctx).op = match(EQUALCHECK);
						setState(150);
						mathExpression(13);
						}
						break;
					case 7:
						{
						_localctx = new ANDoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(151);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(152);
						((ANDoperationContext)_localctx).op = match(AND);
						setState(153);
						mathExpression(12);
						}
						break;
					case 8:
						{
						_localctx = new NOToperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(154);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(155);
						((NOToperationContext)_localctx).op = match(NEQUAL);
						setState(156);
						mathExpression(11);
						}
						break;
					case 9:
						{
						_localctx = new ORoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(157);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(158);
						((ORoperationContext)_localctx).op = match(OR);
						setState(159);
						mathExpression(10);
						}
						break;
					case 10:
						{
						_localctx = new BIGGERoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(160);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(161);
						((BIGGERoperationContext)_localctx).op = match(BIGGERTHAN);
						setState(162);
						mathExpression(9);
						}
						break;
					case 11:
						{
						_localctx = new SMALLERoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(163);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(164);
						((SMALLERoperationContext)_localctx).op = match(SMALLERTHAN);
						setState(165);
						mathExpression(8);
						}
						break;
					case 12:
						{
						_localctx = new BIGOREQUALoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(166);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						((BIGOREQUALoperationContext)_localctx).op = match(BIGGEROREQUAL);
						setState(168);
						mathExpression(7);
						}
						break;
					case 13:
						{
						_localctx = new SMALLOREQUALoperationContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						((SMALLOREQUALoperationContext)_localctx).op = match(SMALLEROREQUAL);
						setState(171);
						mathExpression(6);
						}
						break;
					case 14:
						{
						_localctx = new FACTContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(172);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(173);
						((FACTContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(178);
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
		enterRule(_localctx, 22, RULE_declareFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			declare_body();
			setState(180);
			match(ID);
			setState(181);
			match(OPAR);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_PARAM) | (1L << STRING_PARAM) | (1L << BOOL_PARAM) | (1L << COMMA))) != 0)) {
				{
				{
				setState(182);
				function_parameters();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(CPAR);
			setState(189);
			statement();
			setState(190);
			match(RETURN);
			setState(191);
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
		enterRule(_localctx, 24, RULE_declare_body);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLAREFUNVOID:
				_localctx = new DeclareFunVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(DECLAREFUNVOID);
				}
				break;
			case DECLAREFUNSTRING:
				_localctx = new DeclareFunStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(DECLAREFUNSTRING);
				}
				break;
			case DECLAREFUNINT:
				_localctx = new DeclareFunIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(DECLAREFUNINT);
				}
				break;
			case DECLAREFUNBOOL:
				_localctx = new DeclareFunBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
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
		enterRule(_localctx, 26, RULE_call_functions);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ID);
				setState(200);
				match(OPAR);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << NUMBER) | (1L << BOOL) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					setState(201);
					expression();
					}
				}

				setState(204);
				match(CPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(ID);
				setState(206);
				match(OPAR);
				setState(207);
				expression();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					expression();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
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
		enterRule(_localctx, 28, RULE_parameter_variables);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_PARAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(STRING_PARAM);
				setState(220);
				match(ID);
				}
				break;
			case BOOL_PARAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(BOOL_PARAM);
				setState(222);
				match(ID);
				}
				break;
			case INT_PARAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(INT_PARAM);
				setState(224);
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
		enterRule(_localctx, 30, RULE_function_parameters);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_PARAM:
			case STRING_PARAM:
			case BOOL_PARAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				parameter_variables();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(COMMA);
				setState(229);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
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
		"\u0004\u00014\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u00010\b\u0001\u000b\u0001\f\u00011\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006X\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007^\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007c\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bi\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bo\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tu\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tz\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00af\b\n\n\n\f\n\u00b2\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00b8\b\u000b\n\u000b\f\u000b\u00bb"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c6\b\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00cb\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d3"+
		"\b\r\n\r\f\r\u00d6\t\r\u0001\r\u0001\r\u0003\r\u00da\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e2"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e7\b\u000f"+
		"\u0001\u000f\u0000\u0001\u0014\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u0108\u0000"+
		"#\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000"+
		"\u0000\nR\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000eb\u0001"+
		"\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u00b3\u0001\u0000\u0000"+
		"\u0000\u0018\u00c5\u0001\u0000\u0000\u0000\u001a\u00d9\u0001\u0000\u0000"+
		"\u0000\u001c\u00e1\u0001\u0000\u0000\u0000\u001e\u00e6\u0001\u0000\u0000"+
		"\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0000\u0000\u0001"+
		"\'\u0001\u0001\u0000\u0000\u0000(:\u0003\n\u0005\u0000):\u0003\f\u0006"+
		"\u0000*:\u0003\b\u0004\u0000+:\u0003\u0004\u0002\u0000,:\u0003\u0006\u0003"+
		"\u0000-/\u0005\u0001\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u0000"+
		"4:\u0001\u0000\u0000\u00005:\u0003\u0016\u000b\u000067\u0005&\u0000\u0000"+
		"7:\u0003\n\u0005\u00008:\u0003\u001a\r\u00009(\u0001\u0000\u0000\u0000"+
		"9)\u0001\u0000\u0000\u00009*\u0001\u0000\u0000\u00009+\u0001\u0000\u0000"+
		"\u00009,\u0001\u0000\u0000\u00009-\u0001\u0000\u0000\u000095\u0001\u0000"+
		"\u0000\u000096\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0003"+
		"\u0001\u0000\u0000\u0000;<\u0005\u001d\u0000\u0000<=\u0003\n\u0005\u0000"+
		"=>\u0005\u001f\u0000\u0000>?\u0003\u0002\u0001\u0000?\u0005\u0001\u0000"+
		"\u0000\u0000@A\u0005\u001a\u0000\u0000AB\u0003\n\u0005\u0000BC\u0005\u001e"+
		"\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0003\u0002\u0001\u0000EH\u0005"+
		"\u0002\u0000\u0000FG\u0005!\u0000\u0000GI\u0003\u0002\u0001\u0000HF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0005\u001c\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005\u0019"+
		"\u0000\u0000MN\u0003\n\u0005\u0000N\t\u0001\u0000\u0000\u0000OS\u0003"+
		"\u0014\n\u0000PS\u00052\u0000\u0000QS\u00054\u0000\u0000RO\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u000b"+
		"\u0001\u0000\u0000\u0000TX\u0003\u000e\u0007\u0000UX\u0003\u0010\b\u0000"+
		"VX\u0003\u0012\t\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0005\u0012\u0000"+
		"\u0000Z]\u00053\u0000\u0000[\\\u0005,\u0000\u0000\\^\u0003\u0002\u0001"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^c\u0001\u0000"+
		"\u0000\u0000_`\u00053\u0000\u0000`a\u0005,\u0000\u0000ac\u0003\u0002\u0001"+
		"\u0000bY\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000c\u000f\u0001"+
		"\u0000\u0000\u0000de\u0005\u0014\u0000\u0000eh\u00053\u0000\u0000fg\u0005"+
		",\u0000\u0000gi\u0003\u0014\n\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000io\u0001\u0000\u0000\u0000jk\u0005\u0014\u0000\u0000"+
		"kl\u00053\u0000\u0000lm\u0005,\u0000\u0000mo\u00052\u0000\u0000nd\u0001"+
		"\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000o\u0011\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0013\u0000\u0000qt\u00053\u0000\u0000rs\u0005,\u0000\u0000"+
		"su\u0003\u0002\u0001\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uz\u0001\u0000\u0000\u0000vw\u00053\u0000\u0000wx\u0005,\u0000\u0000"+
		"xz\u0003\u0002\u0001\u0000yp\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000z\u0013\u0001\u0000\u0000\u0000{|\u0006\n\uffff\uffff\u0000|}\u0005"+
		"\u0003\u0000\u0000}~\u0003\u0014\n\u0000~\u007f\u0005\u0004\u0000\u0000"+
		"\u007f\u0084\u0001\u0000\u0000\u0000\u0080\u0084\u00050\u0000\u0000\u0081"+
		"\u0084\u00054\u0000\u0000\u0082\u0084\u00053\u0000\u0000\u0083{\u0001"+
		"\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u00b0\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\n\u0012\u0000\u0000\u0086\u0087\u0005\u0005"+
		"\u0000\u0000\u0087\u00af\u0003\u0014\n\u0013\u0088\u0089\n\u0011\u0000"+
		"\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u00af\u0003\u0014\n\u0012"+
		"\u008b\u008c\n\u0010\u0000\u0000\u008c\u008d\u0005\u0007\u0000\u0000\u008d"+
		"\u00af\u0003\u0014\n\u0011\u008e\u008f\n\u000f\u0000\u0000\u008f\u0090"+
		"\u0005\b\u0000\u0000\u0090\u00af\u0003\u0014\n\u0010\u0091\u0092\n\u000e"+
		"\u0000\u0000\u0092\u0093\u0005\t\u0000\u0000\u0093\u00af\u0003\u0014\n"+
		"\u000f\u0094\u0095\n\f\u0000\u0000\u0095\u0096\u0005.\u0000\u0000\u0096"+
		"\u00af\u0003\u0014\n\r\u0097\u0098\n\u000b\u0000\u0000\u0098\u0099\u0005"+
		"\f\u0000\u0000\u0099\u00af\u0003\u0014\n\f\u009a\u009b\n\n\u0000\u0000"+
		"\u009b\u009c\u0005-\u0000\u0000\u009c\u00af\u0003\u0014\n\u000b\u009d"+
		"\u009e\n\t\u0000\u0000\u009e\u009f\u0005\r\u0000\u0000\u009f\u00af\u0003"+
		"\u0014\n\n\u00a0\u00a1\n\b\u0000\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000"+
		"\u00a2\u00af\u0003\u0014\n\t\u00a3\u00a4\n\u0007\u0000\u0000\u00a4\u00a5"+
		"\u0005\u000f\u0000\u0000\u00a5\u00af\u0003\u0014\n\b\u00a6\u00a7\n\u0006"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0010\u0000\u0000\u00a8\u00af\u0003\u0014"+
		"\n\u0007\u00a9\u00aa\n\u0005\u0000\u0000\u00aa\u00ab\u0005\u0011\u0000"+
		"\u0000\u00ab\u00af\u0003\u0014\n\u0006\u00ac\u00ad\n\r\u0000\u0000\u00ad"+
		"\u00af\u0005\n\u0000\u0000\u00ae\u0085\u0001\u0000\u0000\u0000\u00ae\u0088"+
		"\u0001\u0000\u0000\u0000\u00ae\u008b\u0001\u0000\u0000\u0000\u00ae\u008e"+
		"\u0001\u0000\u0000\u0000\u00ae\u0091\u0001\u0000\u0000\u0000\u00ae\u0094"+
		"\u0001\u0000\u0000\u0000\u00ae\u0097\u0001\u0000\u0000\u0000\u00ae\u009a"+
		"\u0001\u0000\u0000\u0000\u00ae\u009d\u0001\u0000\u0000\u0000\u00ae\u00a0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a3\u0001\u0000\u0000\u0000\u00ae\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0015"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0003\u0018\f\u0000\u00b4\u00b5\u00053\u0000\u0000\u00b5\u00b9\u0005"+
		"\u0003\u0000\u0000\u00b6\u00b8\u0003\u001e\u000f\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0004\u0000\u0000\u00bd\u00be\u0003\u0002\u0001\u0000\u00be\u00bf\u0005"+
		"&\u0000\u0000\u00bf\u00c0\u0003\n\u0005\u0000\u00c0\u0017\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c6\u0005\"\u0000\u0000\u00c2\u00c6\u0005#\u0000"+
		"\u0000\u00c3\u00c6\u0005$\u0000\u0000\u00c4\u00c6\u0005%\u0000\u0000\u00c5"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u0019\u0001\u0000\u0000\u0000\u00c7\u00c8\u00053\u0000\u0000\u00c8\u00ca"+
		"\u0005\u0003\u0000\u0000\u00c9\u00cb\u0003\n\u0005\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00da\u0005\u0004\u0000\u0000\u00cd\u00ce\u0005"+
		"3\u0000\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d4\u0003\n"+
		"\u0005\u0000\u00d0\u00d1\u0005/\u0000\u0000\u00d1\u00d3\u0003\n\u0005"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000\u00d8\u00da\u0001\u0000\u0000"+
		"\u0000\u00d9\u00c7\u0001\u0000\u0000\u0000\u00d9\u00cd\u0001\u0000\u0000"+
		"\u0000\u00da\u001b\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0017\u0000"+
		"\u0000\u00dc\u00e2\u00053\u0000\u0000\u00dd\u00de\u0005\u0018\u0000\u0000"+
		"\u00de\u00e2\u00053\u0000\u0000\u00df\u00e0\u0005\u0016\u0000\u0000\u00e0"+
		"\u00e2\u00053\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u001d"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e7\u0003\u001c\u000e\u0000\u00e4\u00e5"+
		"\u0005/\u0000\u0000\u00e5\u00e7\u0003\u001c\u000e\u0000\u00e6\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u001f\u0001"+
		"\u0000\u0000\u0000\u0016#19HRW]bhnty\u0083\u00ae\u00b0\u00b9\u00c5\u00ca"+
		"\u00d4\u00d9\u00e1\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}