import gen.Example2BaseVisitor;
import gen.Example2Lexer;
import gen.Example2Parser;
import gen.Example2Visitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Integer asInteger() {
        return (Integer)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}


class MyVisitor extends Example2BaseVisitor<Value>
{
    Map<String, Value> storage = new HashMap<String, Value>();
	// MyVisitor doesn't contain visitAndExpr(), so Example2BaseVisitor.visitAndExpr()
    // is called when running the application
	// (see Example2BaseVisitor.java: this Example2BaseVisitor.visitAndExpr() calls visitChildren())


    @Override public Value visitLoop(Example2Parser.LoopContext ctx)
	{ 
		System.err.println("loop: visit 'statement'-child only");
		Value v = visit(ctx.block());
		return v; 
	}
	@Override public Value visitPrint(Example2Parser.PrintContext ctx) 
	{ 
		System.err.println("print: visit all children");
		Value v = visitChildren(ctx);
		return v;
	}
	@Override public Value visitIfStat(Example2Parser.IfStatContext ctx) 
	{ 
		System.err.println("if: visit no children at all");
		return Value.VOID;
	}

    @Override
    public Value visitStart2(Example2Parser.Start2Context ctx) {
        return super.visitStart2(ctx);
    }

    ///////////////// STRING

    @Override
    public Value visitStringAssignValue(Example2Parser.StringAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(storage.get(id) != null){
            value = this.visit(ctx.STRING());
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitStringAssignment(Example2Parser.StringAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(ctx.STRING() == null){
            value = new Value("");
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }else {
            value = this.visit(ctx.STRING());
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    ///////////////// INT

    @Override
    public Value visitIntAssignment(Example2Parser.IntAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(ctx.mathExpression() == null){
            value = new Value(0);
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }else {
            value = this.visit(ctx.mathExpression());
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitIntAssignValue(Example2Parser.IntAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(storage.get(id) != null){
            value = this.visit(ctx.mathExpression());
            storage.put(id, value);
            System.err.println("value changed: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitValueVariable(Example2Parser.ValueVariableContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(storage.get(id) != null){
            value = storage.get(id);
            storage.put(id,value);
        }
        return value;
    }

    @Override
    public Value visitADD(Example2Parser.ADDContext ctx) {
        Value first = visit(ctx.mathExpression(0));
        Value second = visit(ctx.mathExpression(1));

        return new Value((Integer.parseInt(first.asString())) + (Integer.parseInt(second.asString())));
    }

    ////////////// BOOL

    @Override
    public Value visitValueNumber(Example2Parser.ValueNumberContext ctx) {
        Value number = visit(ctx.NUMBER());
        return (number);
    }

    @Override
    public Value visitBoolAssignment(Example2Parser.BoolAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(ctx.mathExpression() == null){
            value = new Value(0);
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }else {
            value = this.visit(ctx.mathExpression());
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitBoolAssignValue(Example2Parser.BoolAssignValueContext ctx) {
        String id = ctx.ID().getText();
        Value value = visit(ctx.BOOL());
        storage.put(id, value);
        System.err.println("[value changed " + id +" = "+ value + "]");
        return value;
    }


    @Override
    public Value visitValueBool(Example2Parser.ValueBoolContext ctx) {
        Value bool = visit(ctx.BOOL());
        return (bool);
    }

    ///////////// IF Statement


    @Override
    public Value visitEQUALCheck(Example2Parser.EQUALCheckContext ctx) {          // a == b
        if(storage.containsKey(ctx.mathExpression().get(0).getText()) && storage.containsKey(ctx.mathExpression().get(1).getText()) ){
            if(storage.get(ctx.mathExpression().get(0).getText()) == storage.get(ctx.mathExpression().get(1).getText())){
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(storage.containsKey(ctx.mathExpression().get(0).getText())){       // a == 1 or a == 1+ 1 or a == b + 1
            if(storage.get(ctx.mathExpression().get(0).getText()).asString().equals(visit(ctx.mathExpression().get(1)).toString())){ //a == 1+1
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(visit(ctx.mathExpression().get(0)).toString().equals(visit(ctx.mathExpression().get(1)).toString())){    // 1 == 1
              System.err.println("[true]");
                return new Value(true);
        }
        System.err.println("[not even close]");
        return new Value(false);
    }

    @Override
    public Value visitIfStatement(Example2Parser.IfStatementContext ctx) {
            if (visit(ctx.ifStat().expression().getChild(0)).asBoolean()){
                System.err.println("[in: " + ctx.ifStat().block().get(0).getText() + "]");
                visit(ctx.ifStat().block().get(0));
            }
        return(null);
    }

    @Override public Value visitUrl(Example2Parser.UrlContext ctx)
	{
		Value nA, nB, nC, nD;
		
		nA = visit(ctx.numberD());
		nB = visit(ctx.numberC());
		nC = visit(ctx.numberB());
		nD = visit(ctx.numberA());
		System.err.println("URL: " + nA + "." + nB + "." + nC + "." + nD);
		return (Value.VOID);
	}
	
	@Override public Value visitTerminal(TerminalNode node)
	{
//		System.err.println("[" + node.getText() + "]");
		return (new Value (node.getText()));
	}

//    @Override
//    public Value visitAndExpr(Example2Parser.AndExprContext ctx) {
//        return super.visitAndExpr(ctx);
//    }
}

public class Main {

    public static void main(String[] args) throws Exception {
		
        CharStream input = CharStreams.fromStream(System.in);
		Example2Lexer lexer = new Example2Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Example2Parser parser = new Example2Parser(tokens);

        ParseTree tree = parser.start2();
		
        Example2Visitor<Value> visitor = new MyVisitor();
        visitor.visit(tree);
    }
}