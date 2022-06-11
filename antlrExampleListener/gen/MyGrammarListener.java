// Generated from MyGrammar.g4 by ANTLR 4.10.1
package gen;
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
	 * Enter a parse tree produced by {@link MyGrammarParser#numberA}.
	 * @param ctx the parse tree
	 */
	void enterNumberA(MyGrammarParser.NumberAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberA}.
	 * @param ctx the parse tree
	 */
	void exitNumberA(MyGrammarParser.NumberAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberB}.
	 * @param ctx the parse tree
	 */
	void enterNumberB(MyGrammarParser.NumberBContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberB}.
	 * @param ctx the parse tree
	 */
	void exitNumberB(MyGrammarParser.NumberBContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberC}.
	 * @param ctx the parse tree
	 */
	void enterNumberC(MyGrammarParser.NumberCContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberC}.
	 * @param ctx the parse tree
	 */
	void exitNumberC(MyGrammarParser.NumberCContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberD}.
	 * @param ctx the parse tree
	 */
	void enterNumberD(MyGrammarParser.NumberDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberD}.
	 * @param ctx the parse tree
	 */
	void exitNumberD(MyGrammarParser.NumberDContext ctx);
}