import gen.MyGrammarBaseListener;
import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	private final Stack<Integer> numberStack = new Stack<>();
	Map<String, Integer> intVariables = new HashMap<String, Integer>();
	Map<String, String> stringVariables = new HashMap<String, String>();
	Map<String, Boolean> booleanVariables = new HashMap<String, Boolean>();
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx)
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("enterMyStart()");
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("exitMyStart()");
	}
	
	@Override public void visitTerminal(TerminalNode node) 
	{ 
		System.err.println("terminal-node: '" + node.getText() + "'");
		// TODO: print line+column, token's type, etc.
	}
	// TODO: override other methods of 'MyGrammarBaseListener'

	@Override
	public void exitInt(MyGrammarParser.IntContext ctx) {
		int i = Integer.parseInt(ctx.INT().getText());
		numberStack.push(i);
	}

	@Override
	public void exitOtherExpression(MyGrammarParser.OtherExpressionContext ctx) {
		int result = numberStack.pop();
		System.err.println("Final result is: " + result);
	}

	@Override
	public void exitInitVarWithValue(MyGrammarParser.InitVarWithValueContext ctx) {
		String varName = ctx.variable_name().getText();
		Integer intValue = 0;
		String stringValue ="";
		Boolean boolValue = false;
		if(ctx.variable_block().getText().equals("int_var")) {
			intValue = Integer.parseInt(ctx.value_block().getText());
			intVariables.put(varName, intValue);
		}
		else if(ctx.variable_block().getText().equals("string_var")) {
			stringValue = ctx.value_block().getText();
			stringVariables.put(varName, stringValue);
		}
		else if(ctx.variable_block().getText().equals("bool_var")) {
			boolValue = Boolean.parseBoolean(ctx.value_block().getText());
			booleanVariables.put(varName, boolValue);

		}

		System.out.println("value should be: " + ctx.value_block().getText());
	}

	@Override
	public void exitPrintStatement(MyGrammarParser.PrintStatementContext ctx) {
		if(intVariables.containsKey(ctx.print_stat().print_content().getText())){
			System.out.println("printed: " + intVariables.get(ctx.print_stat().print_content().getText()));
		}
		else if(stringVariables.containsKey(ctx.print_stat().print_content().getText())){
			System.out.println("printed: " + stringVariables.get(ctx.print_stat().print_content().getText()));
		}
		else if(booleanVariables.containsKey(ctx.print_stat().print_content().getText())){
			System.out.println("printed: " + booleanVariables.get(ctx.print_stat().print_content().getText()));
		}
		else if(ctx.print_stat().print_content().getText().charAt(0) == '"'){
			System.out.println("printed: " + ctx.print_stat().print_content().getText());
		}
		else{
			System.out.println("printed: " + this.numberStack.pop());
		}
	}

	@Override
	public void exitAddSub(MyGrammarParser.AddSubContext ctx) {
		int numOne = numberStack.pop();
		int numTwo = numberStack.pop();

		int result = 0;
		if(ctx.op.getType() == MyGrammarParser.ADD){
			result = numTwo + numOne;
			System.err.println("Added "+numTwo + " with " +numOne + " = " + result);
		}else{
			result = numTwo - numOne;
			System.err.println("Subtracted "+numTwo + " with " +numOne+ " = " + result);
		}
		numberStack.push(result);
	}

	@Override
	public void exitMulDiv(MyGrammarParser.MulDivContext ctx){
		int numOne = numberStack.pop();
		int numTwo = numberStack.pop();
		int result = 0;

		if(ctx.op.getType() == MyGrammarParser.DIV){
			if(numOne==0){
				System.err.println("Cannot divide by 0");
			}
			else{
				result = Math.round(numTwo / numOne);
				System.err.println("Divided: " + numTwo + " with: " + numOne + " = " + " and rounded to: " + result);
			}
		}
		else{
			result = numTwo * numOne;
			System.err.println("Multiplied: " + numTwo + " with: " + numOne + " = " + " and rounded to: " + result);
		}
		numberStack.push(result);
	}


	@Override
	public void exitPow(MyGrammarParser.PowContext ctx) {
		int numOne = numberStack.pop();
		int numTwo = numberStack.pop();

		int result = 0;
		result = (int) Math.pow(numTwo , numOne);
		System.err.println(numTwo + " to the power of " +numOne + " = " + result);
		numberStack.push(result);
	}

	@Override
	public void exitFact(MyGrammarParser.FactContext ctx) {
		int numOne = numberStack.pop();
		int result = 1;
		for (int factor = 2; factor <= numOne; factor++) {
			result *= factor;
		}
		System.err.println(numOne + "! = " + result);
		numberStack.push(result);
	}


}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

		// TODO: print the lexer's vocabulary and the actual list of tokens 
		
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}