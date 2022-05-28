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
	 * Enter a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableStatement}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(MyGrammarParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableStatement}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(MyGrammarParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MyGrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MyGrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherExpression}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(MyGrammarParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherExpression}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(MyGrammarParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(MyGrammarParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(MyGrammarParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initVar}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void enterInitVar(MyGrammarParser.InitVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initVar}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void exitInitVar(MyGrammarParser.InitVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initVarWithValue}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void enterInitVarWithValue(MyGrammarParser.InitVarWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initVarWithValue}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void exitInitVarWithValue(MyGrammarParser.InitVarWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initVarWithStatementValue}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void enterInitVarWithStatementValue(MyGrammarParser.InitVarWithStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initVarWithStatementValue}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void exitInitVarWithStatementValue(MyGrammarParser.InitVarWithStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initVarToVar}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void enterInitVarToVar(MyGrammarParser.InitVarToVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initVarToVar}
	 * labeled alternative in {@link MyGrammarParser#variable_stat}.
	 * @param ctx the parse tree
	 */
	void exitInitVarToVar(MyGrammarParser.InitVarToVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(MyGrammarParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(MyGrammarParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void enterStringVariable(MyGrammarParser.StringVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void exitStringVariable(MyGrammarParser.StringVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void enterIntVariable(MyGrammarParser.IntVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void exitIntVariable(MyGrammarParser.IntVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void enterCharVariable(MyGrammarParser.CharVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charVariable}
	 * labeled alternative in {@link MyGrammarParser#variable_block}.
	 * @param ctx the parse tree
	 */
	void exitCharVariable(MyGrammarParser.CharVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableName}
	 * labeled alternative in {@link MyGrammarParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(MyGrammarParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableName}
	 * labeled alternative in {@link MyGrammarParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(MyGrammarParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(MyGrammarParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(MyGrammarParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#print_content}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#print_content}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVariable}
	 * labeled alternative in {@link MyGrammarParser#print_content}.
	 * @param ctx the parse tree
	 */
	void enterPrintVariable(MyGrammarParser.PrintVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVariable}
	 * labeled alternative in {@link MyGrammarParser#print_content}.
	 * @param ctx the parse tree
	 */
	void exitPrintVariable(MyGrammarParser.PrintVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(MyGrammarParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(MyGrammarParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(MyGrammarParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(MyGrammarParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanValue}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(MyGrammarParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanValue}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(MyGrammarParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherVariable}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void enterOtherVariable(MyGrammarParser.OtherVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherVariable}
	 * labeled alternative in {@link MyGrammarParser#value_block}.
	 * @param ctx the parse tree
	 */
	void exitOtherVariable(MyGrammarParser.OtherVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MyGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MyGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(MyGrammarParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(MyGrammarParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(MyGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(MyGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MyGrammarParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MyGrammarParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MyGrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MyGrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFact(MyGrammarParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFact(MyGrammarParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(MyGrammarParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(MyGrammarParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterElse(MyGrammarParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitElse(MyGrammarParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInit}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringInit(MyGrammarParser.StringInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInit}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringInit(MyGrammarParser.StringInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MyGrammarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MyGrammarParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalcheck}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualcheck(MyGrammarParser.EqualcheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalcheck}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualcheck(MyGrammarParser.EqualcheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intInit}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntInit(MyGrammarParser.IntInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intInit}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntInit(MyGrammarParser.IntInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(MyGrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(MyGrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(MyGrammarParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(MyGrammarParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(MyGrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(MyGrammarParser.IfContext ctx);
}