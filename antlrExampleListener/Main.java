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
	Map<Pair<String, String>, String> graph = new HashMap();
	List<String> vertices = new ArrayList<>();
	List<String> verticesWithOutgoingEdges = new ArrayList<>();
	List<String> edges = new ArrayList<>();
	GraphVizHelper graphVisualisation = new GraphVizHelper("Typoto ime na typata grapha");
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx)
	{
		System.err.println("enterMyStart()");
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{
		System.err.println("exitMyStart()");
	}


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
		if (!verticesWithOutgoingEdges.contains(firstNum)){
			verticesWithOutgoingEdges.add(firstNum);
		}
		graph.put(new Pair(firstNum,secondNum), letter);

		if(graph.keySet().size() == 10){
			graphVisualisation.SetVertices(vertices);
			graphVisualisation.SetVerticesWithOutgoingEdges(verticesWithOutgoingEdges);
			String s = graphVisualisation.getGraphVizScript(graph);
			System.err.println(s);
		}

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

        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}

class GraphVizHelper {

	String graphName;
	List<String> vertices = new ArrayList<>();
	List<String> verticesWithOutgoingEdges = new ArrayList<>();

	public void SetVertices(List<String> v) {
		this.vertices = v;
	}
	public void SetVerticesWithOutgoingEdges(List<String> v) {
		this.verticesWithOutgoingEdges = v;
	}
	public GraphVizHelper(String graphName){
		this.graphName = graphName;
	}

	public String getGraphVizScript(Map<Pair<String, String>, String> graph){
		StringBuilder s = new StringBuilder("digraph " + graphName + " {\n" +
				"  rankdir = LR\n" +
				"  node [shape = circle, style = filled, fillcolor = white, fontname = Arial]\n" +
				"  edge [fontname = Arial]\n" +
				"  dummy [style = filled, fontcolor = white, color = white]\n" +
				"  \n" +
				"  dummy -> 0\n");
		for (String doubleCircledVertex : this.CheckDoubleCircled()) {
			s.append("  " + doubleCircledVertex +" [shape = doublecircle]\n");
		}
		for (var connection: graph.keySet()) {
			s.append("  " + connection.a + " -> " + connection.b + " [label = \"" + graph.get(connection) + "\"]\n");
		}
		s.append("}");
		return s.toString();
	}

	public List<String> CheckDoubleCircled(){
		List<String> doubleCircled = new ArrayList<>();
		for (int i = 0; i < this.vertices.size(); i++){
			if(!this.verticesWithOutgoingEdges.contains(this.vertices.get(i))){
				doubleCircled.add(this.vertices.get(i));
			}
		}
		return doubleCircled;
	}

}
