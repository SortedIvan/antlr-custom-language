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
    Map<String, Value> storageZ3 = new HashMap<String, Value>();
    Map<String, Example2Parser.DeclareFunctionContext> functionStorage = new HashMap<>();

    // MyVisitor doesn't contain visitAndExpr(), so Example2BaseVisitor.visitAndExpr()
    // is called when running the application
    // (see Example2BaseVisitor.java: this Example2BaseVisitor.visitAndExpr() calls visitChildren())


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
            value = this.visit(ctx.statement());
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }
        return value;
    }

    @Override
    public Value visitStringAssignment(Example2Parser.StringAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = null;
        if(ctx.statement() == null){
            value = new Value("");
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }else {
            value = this.visit(ctx.statement());
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
        if(ctx.statement() == null){
            value = new Value(0);
            storage.put(id, value);
            System.err.println("memory put: " + id + " = " + value);
        }else {
            value = this.visit(ctx.statement());
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
            value = this.visit(ctx.statement());
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

    /////////////// MATH operations

    @Override
    public Value visitADD(Example2Parser.ADDContext ctx) {
        Value first = visit(ctx.mathExpression(0));
        Value second = visit(ctx.mathExpression(1));

        return new Value((Integer.parseInt(first.asString())) + (Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitSUB(Example2Parser.SUBContext ctx) {
        Value first = visit(ctx.mathExpression(0));
        Value second = visit(ctx.mathExpression(1));

        return new Value((Integer.parseInt(first.asString())) - (Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitMUL(Example2Parser.MULContext ctx) {
        Value first = visit(ctx.mathExpression(0));
        Value second = visit(ctx.mathExpression(1));

        return new Value((Integer.parseInt(first.asString())) * (Integer.parseInt(second.asString())));
    }

    @Override
    public Value visitDIV(Example2Parser.DIVContext ctx) {
        Value first = visit(ctx.mathExpression(0));
        Value second = visit(ctx.mathExpression(1));
        if ((Integer.parseInt(second.asString()) == 0)){
            return new Value("CANNOT DIVIDE BY ZERO");
        }
        return new Value((Integer.parseInt(first.asString()) / (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitPOW(Example2Parser.POWContext ctx) {
        Value first = visit(ctx.mathExpression(0));
        Value second = visit(ctx.mathExpression(1));

        return new Value(Math.pow((Integer.parseInt(first.asString())), (Integer.parseInt(second.asString()))));
    }

    @Override
    public Value visitFACT(Example2Parser.FACTContext ctx) {
        Value first = visit(ctx.mathExpression());
        int result = 1;
        int i;
        for (i = 1; i <= Integer.parseInt(first.asString()); i ++){
            result *= i;
        }
        return new Value(result);
    }

    @Override
    public Value visitValueNumber(Example2Parser.ValueNumberContext ctx) {
        Value number = visit(ctx.NUMBER());
        return (number);
    }
    ////////////// BOOL

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

    ///////////// BOOL Expressions

    @Override
    public Value visitANDoperation(Example2Parser.ANDoperationContext ctx) {
        if(visit(ctx.mathExpression().get(0)).asBoolean() && visit(ctx.mathExpression().get(1)).asBoolean()){
            return new Value(true);
        }
        return new Value(false);
    }

    @Override
    public Value visitORoperation(Example2Parser.ORoperationContext ctx) {
        if(visit(ctx.mathExpression().get(0)).asBoolean() || visit(ctx.mathExpression().get(1)).asBoolean()){
            return new Value(true);
        }
        return new Value(false);
    }


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
    public Value visitNOToperation(Example2Parser.NOToperationContext ctx) {
        if(storage.containsKey(ctx.mathExpression().get(0).getText()) && storage.containsKey(ctx.mathExpression().get(1).getText()) ){
            if(storage.get(ctx.mathExpression().get(0).getText()) != storage.get(ctx.mathExpression().get(1).getText())){
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(storage.containsKey(ctx.mathExpression().get(0).getText())){       // a == 1 or a == 1+ 1 or a == b + 1
            if(!storage.get(ctx.mathExpression().get(0).getText()).asString().equals(visit(ctx.mathExpression().get(1)).toString())){ //a == 1+1
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(!visit(ctx.mathExpression().get(0)).toString().equals(visit(ctx.mathExpression().get(1)).toString())){    // 1 == 1
            System.err.println("[true]");
            return new Value(true);
        }
        System.err.println("[not even close]");
        return new Value(false);
    }

    @Override
    public Value visitSMALLOREQUALoperation(Example2Parser.SMALLOREQUALoperationContext ctx) {
        if(storage.containsKey(ctx.mathExpression().get(0).getText()) && storage.containsKey(ctx.mathExpression().get(1).getText()) ){
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString()) <=
                    Integer.parseInt(storage.get(ctx.mathExpression().get(1).getText()).asString())){
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(storage.containsKey(ctx.mathExpression().get(0).getText())){       // a == 1 or a == 1+ 1 or a == b + 1
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString())
                    <= Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){ //a == 1+1
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(Integer.parseInt(visit(ctx.mathExpression().get(0)).toString()) <= Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){    // 1 == 1
            System.err.println("[true]");
            return new Value(true);
        }
        System.err.println("[not even close]");
        return new Value(false);
    }

    @Override
    public Value visitBIGOREQUALoperation(Example2Parser.BIGOREQUALoperationContext ctx) {
        if(storage.containsKey(ctx.mathExpression().get(0).getText()) && storage.containsKey(ctx.mathExpression().get(1).getText()) ){
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString()) >=
                    Integer.parseInt(storage.get(ctx.mathExpression().get(1).getText()).asString())){
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(storage.containsKey(ctx.mathExpression().get(0).getText())){       // a == 1 or a == 1+ 1 or a == b + 1
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString())
                    >= Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){ //a == 1+1
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(Integer.parseInt(visit(ctx.mathExpression().get(0)).toString()) >= Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){    // 1 == 1
            System.err.println("[true]");
            return new Value(true);
        }
        System.err.println("[not even close]");
        return new Value(false);
    }

    @Override
    public Value visitBIGGERoperation(Example2Parser.BIGGERoperationContext ctx) {
        if(storage.containsKey(ctx.mathExpression().get(0).getText()) && storage.containsKey(ctx.mathExpression().get(1).getText()) ){
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString()) >
                    Integer.parseInt(storage.get(ctx.mathExpression().get(1).getText()).asString())){
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(storage.containsKey(ctx.mathExpression().get(0).getText())){       // a == 1 or a == 1+ 1 or a == b + 1
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString())
                    > Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){ //a == 1+1
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(Integer.parseInt(visit(ctx.mathExpression().get(0)).toString()) > Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){    // 1 == 1
            System.err.println("[true]");
            return new Value(true);
        }
        System.err.println("[not even close]");
        return new Value(false);
    }

    @Override
    public Value visitSMALLERoperation(Example2Parser.SMALLERoperationContext ctx) {
        if(storage.containsKey(ctx.mathExpression().get(0).getText()) && storage.containsKey(ctx.mathExpression().get(1).getText()) ){
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString()) <
                    Integer.parseInt(storage.get(ctx.mathExpression().get(1).getText()).asString())){
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(storage.containsKey(ctx.mathExpression().get(0).getText())){       // a == 1 or a == 1+ 1 or a == b + 1
            System.err.println("FIRST" + Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString()));
            if(Integer.parseInt(storage.get(ctx.mathExpression().get(0).getText()).asString())
                    < Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){ //a == 1+1
                System.err.println("[true]");
                return new Value(true);
            }
            System.err.println("[false]");
            return new Value(false);
        }
        else if(Integer.parseInt(visit(ctx.mathExpression().get(0)).toString()) < Integer.parseInt(visit(ctx.mathExpression().get(1)).toString())){    // 1 == 1
            System.err.println("[true]");
            return new Value(true);
        }
        System.err.println("[not even close]");
        return new Value(false);
    }

    ///////////// IF Statement

    @Override
    public Value visitIfStatement(Example2Parser.IfStatementContext ctx) {
        if (visit(ctx.ifStat().expression().getChild(0)).asBoolean()){
            System.err.println("[in: " + ctx.ifStat().statement().get(0).getText() + "]"); visit(ctx.ifStat().statement().get(0));
        }
        else if(ctx.ifStat().children.get(4).getText().equals("else")){
            System.err.println("[in: " + ctx.ifStat().statement().get(1).getText() + "]");
            visit(ctx.ifStat().statement().get(1));
        }
        return(Value.VOID);
    }


    ///////////// WHILE Statement


    @Override
    public Value visitLoopStatement(Example2Parser.LoopStatementContext ctx) {
        System.err.println("[in: " + ctx.loop().expression().getText() + "]");
        System.err.println("[in: " + ctx.loop().statement().getText() + "]");
        while(visit(ctx.loop().expression().getChild(0)).asBoolean()){
            visit(ctx.loop().statement());
        }
        return(Value.VOID);
    }

    ///////////// FOR LOOP



    ///////////// PRINT Statement


    @Override
    public Value visitPrintExpr(Example2Parser.PrintExprContext ctx) {
        System.err.println("[ print(" + visit(ctx.expression()) + ") ]");
        return(Value.VOID);
    }


    /////////////////////Declare Integer Function

    @Override
    public Value visitDeclareFunction(Example2Parser.DeclareFunctionContext ctx) {
        functionStorage.put(ctx.declareFunctions().ID().getText(),ctx);
        return (Value.VOID);
    }

    @Override
    public Value visitCallFunctions(Example2Parser.CallFunctionsContext ctx) {
        Value result = null;
        for (Map.Entry<String, Example2Parser.DeclareFunctionContext> entry : functionStorage.entrySet()) {
            if(entry.getKey().equals(ctx.call_functions().ID().getText())){
                for (int j = 0; j < entry.getValue().declareFunctions().function_parameters().size(); j++ ) {
                    storage.put(entry.getValue().declareFunctions().function_parameters().get(j).parameter_variables().ID().getText(),
                            visit(ctx.call_functions().expression().get(j)));
                }
                visit(entry.getValue().declareFunctions().statement());
                System.err.println(visit(entry.getValue().declareFunctions().expression()));
                result = visit(entry.getValue().declareFunctions().expression());
                System.err.println("[ return value: " + result + " ]");
            }
        }
        return result;
    }

    ///////////////////// Z3 Output

    @Override
    public Value visitZITEStatement(Example2Parser.ZITEStatementContext ctx) {
        String first = ctx.z3expression().get(0).z3and().getChild(2).getText();
        String second = ctx.z3expression().get(0).z3and().getChild(3).getText();
        System.err.println(first.charAt(5));
        System.err.println(second.charAt(5));
        System.err.println(ctx.z3expression().size());
//        System.err.println(" name1: " + ctx.z3expression().get(0).z3and().getChild(2).getText()+ " ");
//        System.err.println(" name2: " + ctx.z3expression().get(0).z3and().children.get(3).getText() + " ");
        System.err.println(" value: " + ctx.z3expression().get(1).getText() + " ");
        Value value = visit(ctx.z3expression().get(1));

        return (Value.VOID) ;
    }

//    @Override
//    public Value visitZ3Output(Example2Parser.Z3OutputContext ctx) {
//        storageZ3.clear();
//        for (int j = 0; j < ctx.z3Statement().z3value().size(); j++){
//            Value value = visit(ctx.z3Statement().z3value().get(j).getChild(6));
//            storageZ3.put(ctx.z3Statement().z3value().get(j).getChild(2).getText(), value);
//        }
//        if(storageZ3.size() == 81){
//            for (int i = 1; i <= 9; i++){
//                if(i == 4 || i == 7){
//                    System.err.println(" ---------------------");
//                }
//                for (int j = 1; j <= 9; j++) {
//                    if(j == 3 || j == 6){
//                        System.err.print(" " + storageZ3.get("a" + i + j) + " |");
//                    }
//                    else{
//                        System.err.print(" " + storageZ3.get("a" + i + j) + "");
//                    }
//                }
//                System.err.println();
//            }
//        }
//        return (Value.VOID);
//    }



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
        return (new Value (node.getText()));
    }

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