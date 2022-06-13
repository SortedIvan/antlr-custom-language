import gen.MyGrammarBaseListener;
import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.*;



class MyListener extends MyGrammarBaseListener
{
	Boolean solveSudokuA = false;
	Boolean solveSudokuB = false;
	private final Stack<Integer> numberStack = new Stack<>();
	Map<String, String> storageZ3SudokuA = new HashMap<String, String>();
	Map<Integer, String> storageZ3SudokuB = new HashMap<Integer, String>();
	Map<String, Pair<String, String>> graph = new HashMap();
	List<String> vertices = new ArrayList<>();
	List<String> edges = new ArrayList<>();
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
	
//	@Override public void visitTerminal(TerminalNode node)
//	{
//		System.err.println("terminal-node: '" + node.getText() + "'");
//		// TODO: print line+column, token's type, etc.
//	}
	// TODO: override other methods of 'MyGrammarBaseListener'


	@Override
	public void exitZ3Statement(MyGrammarParser.Z3StatementContext ctx) {
		if(solveSudokuA){
			if(ctx.z3value().size() == 81) { //SudokuA
				for (int i = 0; i< 81; i++){
					System.err.println("var name: '" + ctx.z3value(i).getChild(2).getText() + "'");
					System.err.println("var value: '" + ctx.z3value(i).getChild(6).getText() + "'");
					storageZ3SudokuA.put(ctx.z3value(i).getChild(2).getText(),
							ctx.z3value(i).getChild(6).getText());
				}
			}
			if(storageZ3SudokuA.size() == 81){
				for (int i = 1; i <= 9; i++){
					if(i == 4 || i == 7){
						System.err.println(" ---------------------");
					}
					for (int j = 1; j <= 9; j++) {
						if(j == 3 || j == 6){
							System.err.print(" " + storageZ3SudokuA.get("a" + i + j) + " |");
						}
						else{
							System.err.print(" " + storageZ3SudokuA.get("a" + i + j) + "");
						}
					}
					System.err.println();
				}
			}
		}

		super.exitZ3Statement(ctx);
	}

	@Override
	public void exitZITEStatement(MyGrammarParser.ZITEStatementContext ctx) {
		if(solveSudokuB){
			char[] posit = ctx.z3expression(0).getText().toCharArray();
			String position = "";
			position = posit[16] + position;
			position = posit[9] + position;
			Integer deba = Integer.parseInt(position);
			storageZ3SudokuB.put(deba, ctx.z3expression(1).getText());
			if(storageZ3SudokuB.size() == 72){
				for (int i = 10; i <= 90; i+=10){
					if(i == 40 || i == 70){
						System.err.println(" ---------------------");
					}
					for (int j = 1; j <= 9; j++) {
						if(storageZ3SudokuB.containsKey(i+j)){
							if(j == 3 || j == 6){
								System.err.print(" " + storageZ3SudokuB.get(i + j) + " |");
							}
							else{
								System.err.print(" " + storageZ3SudokuB.get(i + j) + "");
							}
						}
						else{
							if(j == 3 || j == 6){
								System.err.print(" X |");
							}
							else{
								System.err.print(" X");
							}
						}
					}
					System.err.println();
				}
			}
		}

		super.exitZITEStatement(ctx);
	}

//	@Override
//	public void exitZAndStatement(MyGrammarParser.ZAndStatementContext ctx) {
//		System.err.println(ctx.z3expression(0).);
//	}

	@Override
	public void exitZcomparisonStatement(MyGrammarParser.ZcomparisonStatementContext ctx) {


	}

	@Override
	public void exitZAndStatement(MyGrammarParser.ZAndStatementContext ctx) {
		String a = ctx.z3expression().get(0).getText();
		String b = ctx.z3expression().get(1).getText();
		String c = ctx.z3expression().get(2).getText();

		String firstNum = Character.toString(a.charAt(a.length() - 2));
		String secondNum = Character.toString(b.charAt(b.length() - 2));
		String letter = Character.toString(c.charAt(c.length() - 3));

		if (!vertices.contains(firstNum)){
			vertices.add(firstNum);
		}
		if (!vertices.contains(secondNum)){
			vertices.add(secondNum);
		}
		System.err.println(vertices);
		graph.put(letter, new Pair(firstNum,secondNum));
		System.err.println("Printed at once");

		super.exitZAndStatement(ctx);
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

class GraphVizHelper {

	String graphName;
	List<String> doubleCircledEdges = new ArrayList<>();

	public GraphVizHelper(String graphName){

	}

	public List<String> CheckDoubleCircled(Map<String, Pair<String, String>> graphBate){ // Map (1: Edge, 2: Nr1 - N2
		for (int i = 0; i < graphBate.size(); i++){
			//graphBate.get()
		}
	}

}
