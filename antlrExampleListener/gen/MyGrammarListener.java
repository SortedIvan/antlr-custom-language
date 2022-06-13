// Generated from MyGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3Statement}.
	 * @param ctx the parse tree
	 */
	void enterZ3Statement(MyGrammarParser.Z3StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3Statement}.
	 * @param ctx the parse tree
	 */
	void exitZ3Statement(MyGrammarParser.Z3StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zValue}
	 * labeled alternative in {@link MyGrammarParser#z3value}.
	 * @param ctx the parse tree
	 */
	void enterZValue(MyGrammarParser.ZValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zValue}
	 * labeled alternative in {@link MyGrammarParser#z3value}.
	 * @param ctx the parse tree
	 */
	void exitZValue(MyGrammarParser.ZValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zAndStatement}
	 * labeled alternative in {@link MyGrammarParser#z3and}.
	 * @param ctx the parse tree
	 */
	void enterZAndStatement(MyGrammarParser.ZAndStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zAndStatement}
	 * labeled alternative in {@link MyGrammarParser#z3and}.
	 * @param ctx the parse tree
	 */
	void exitZAndStatement(MyGrammarParser.ZAndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3or}.
	 * @param ctx the parse tree
	 */
	void enterZ3or(MyGrammarParser.Z3orContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3or}.
	 * @param ctx the parse tree
	 */
	void exitZ3or(MyGrammarParser.Z3orContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3not}.
	 * @param ctx the parse tree
	 */
	void enterZ3not(MyGrammarParser.Z3notContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3not}.
	 * @param ctx the parse tree
	 */
	void exitZ3not(MyGrammarParser.Z3notContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3add}.
	 * @param ctx the parse tree
	 */
	void enterZ3add(MyGrammarParser.Z3addContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3add}.
	 * @param ctx the parse tree
	 */
	void exitZ3add(MyGrammarParser.Z3addContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3subtract}.
	 * @param ctx the parse tree
	 */
	void enterZ3subtract(MyGrammarParser.Z3subtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3subtract}.
	 * @param ctx the parse tree
	 */
	void exitZ3subtract(MyGrammarParser.Z3subtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zITEStatement}
	 * labeled alternative in {@link MyGrammarParser#z3ite}.
	 * @param ctx the parse tree
	 */
	void enterZITEStatement(MyGrammarParser.ZITEStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zITEStatement}
	 * labeled alternative in {@link MyGrammarParser#z3ite}.
	 * @param ctx the parse tree
	 */
	void exitZITEStatement(MyGrammarParser.ZITEStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zcomparisonStatement}
	 * labeled alternative in {@link MyGrammarParser#z3comparison}.
	 * @param ctx the parse tree
	 */
	void enterZcomparisonStatement(MyGrammarParser.ZcomparisonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zcomparisonStatement}
	 * labeled alternative in {@link MyGrammarParser#z3comparison}.
	 * @param ctx the parse tree
	 */
	void exitZcomparisonStatement(MyGrammarParser.ZcomparisonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zvariableDeclaration}
	 * labeled alternative in {@link MyGrammarParser#z3variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterZvariableDeclaration(MyGrammarParser.ZvariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zvariableDeclaration}
	 * labeled alternative in {@link MyGrammarParser#z3variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitZvariableDeclaration(MyGrammarParser.ZvariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3var_type}.
	 * @param ctx the parse tree
	 */
	void enterZ3var_type(MyGrammarParser.Z3var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3var_type}.
	 * @param ctx the parse tree
	 */
	void exitZ3var_type(MyGrammarParser.Z3var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3variable_name}.
	 * @param ctx the parse tree
	 */
	void enterZ3variable_name(MyGrammarParser.Z3variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3variable_name}.
	 * @param ctx the parse tree
	 */
	void exitZ3variable_name(MyGrammarParser.Z3variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3equality}.
	 * @param ctx the parse tree
	 */
	void enterZ3equality(MyGrammarParser.Z3equalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3equality}.
	 * @param ctx the parse tree
	 */
	void exitZ3equality(MyGrammarParser.Z3equalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3expression}.
	 * @param ctx the parse tree
	 */
	void enterZ3expression(MyGrammarParser.Z3expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3expression}.
	 * @param ctx the parse tree
	 */
	void exitZ3expression(MyGrammarParser.Z3expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3_let}.
	 * @param ctx the parse tree
	 */
	void enterZ3_let(MyGrammarParser.Z3_letContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3_let}.
	 * @param ctx the parse tree
	 */
	void exitZ3_let(MyGrammarParser.Z3_letContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#z3_let_rule}.
	 * @param ctx the parse tree
	 */
	void enterZ3_let_rule(MyGrammarParser.Z3_let_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#z3_let_rule}.
	 * @param ctx the parse tree
	 */
	void exitZ3_let_rule(MyGrammarParser.Z3_let_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#str_method}.
	 * @param ctx the parse tree
	 */
	void enterStr_method(MyGrammarParser.Str_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#str_method}.
	 * @param ctx the parse tree
	 */
	void exitStr_method(MyGrammarParser.Str_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#str_len}.
	 * @param ctx the parse tree
	 */
	void enterStr_len(MyGrammarParser.Str_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#str_len}.
	 * @param ctx the parse tree
	 */
	void exitStr_len(MyGrammarParser.Str_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#str_substr}.
	 * @param ctx the parse tree
	 */
	void enterStr_substr(MyGrammarParser.Str_substrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#str_substr}.
	 * @param ctx the parse tree
	 */
	void exitStr_substr(MyGrammarParser.Str_substrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#str_at}.
	 * @param ctx the parse tree
	 */
	void enterStr_at(MyGrammarParser.Str_atContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#str_at}.
	 * @param ctx the parse tree
	 */
	void exitStr_at(MyGrammarParser.Str_atContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#str_concatation}.
	 * @param ctx the parse tree
	 */
	void enterStr_concatation(MyGrammarParser.Str_concatationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#str_concatation}.
	 * @param ctx the parse tree
	 */
	void exitStr_concatation(MyGrammarParser.Str_concatationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#int_to_str}.
	 * @param ctx the parse tree
	 */
	void enterInt_to_str(MyGrammarParser.Int_to_strContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#int_to_str}.
	 * @param ctx the parse tree
	 */
	void exitInt_to_str(MyGrammarParser.Int_to_strContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(MyGrammarParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(MyGrammarParser.OtherContext ctx);
}