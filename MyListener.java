import antlr.AlgumaParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import antlr.AlgumaBaseListener;

public class MyListener extends AlgumaBaseListener{

    private Map<String, String> tabSimbolos = new HashMap<>();
    private List<String> errorList = new ArrayList<>();

    @Override
    public void exitNPrograma(AlgumaParser.NProgramaContext ctx){

        String errorMessage = "";

        if (getNumberSemanticError() > 0){
            errorMessage = "";
            for (String error : errorList) {
                errorMessage += error + "\n";
            }
        }
        super.exitNPrograma(ctx);
        throw new Error(errorMessage);
    }

    @Override
    public void enterNBlocoDeclaracao(AlgumaParser.NBlocoDeclaracaoContext ctx) {
        super.enterNBlocoDeclaracao(ctx);
    }

    @Override
    public void exitNBlocoDeclaracao(AlgumaParser.NBlocoDeclaracaoContext ctx) {
        super.exitNBlocoDeclaracao(ctx);
    }

    @Override
    public void enterNDeclaracao(AlgumaParser.NDeclaracaoContext ctx) {
        String tipo = ctx.getChild(0).getText();
        String nome = ctx.getChild(1).getText();
        if(checkDeclaration(nome)){
            errorList.add("linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Variavel já declarada!");
        } else {
            tabSimbolos.put(nome, tipo);
        }
        super.enterNDeclaracao(ctx);
    }

    @Override
    public void enterLer(AlgumaParser.LerContext ctx) {
        String variavel = ctx.getChild(1).getText();
        if (!checkDeclaration(variavel)){ // Variavel não declarada

            errorList.add("linha " + ctx.getStart().getLine() + ":"
                    + ctx.getStart().getCharPositionInLine()
                    + " A variavel " + variavel + " ainda não foi declarada!");
        }
        super.enterLer(ctx);
    }

    @Override
    public void enterNAtribuicao(AlgumaParser.NAtribuicaoContext ctx) {
        /* Fazendo:
         * Verificar compatibilidade de tipos
         * Verificar numero de filhos do valor
         * Verificar existencia da variavel
         * Verificar o tipo da variavel
         * Verificar tipo do volor
         */
        ParseTree valor = ctx.getChild(1);
        String variavel = ctx.getChild(3).getText();
        if (!checkDeclaration(variavel)){ // Variavel não declarada

            errorList.add("linha " + ctx.getStart().getLine() + ":"
                    + ctx.getStart().getCharPositionInLine()
                    + " A variavel " + variavel + " ainda não foi declarada!");
        } else { // Variavel declarada, verifica tipo
            String tipoVar = tabSimbolos.get(variavel);
            String tipoVal;

            if (valor.getChildCount() == 1){ // valor tem um noh filho
                String valorTexto = valor.getChild(0).getText();
                tipoVal = checkValueType(valorTexto); // tipo de valor
                if (!tipoVar.equals(tipoVal)){ // nao tem mesmo tipo
                    errorList.add("linha " + ctx.getStart().getLine() + ":"
                            + ctx.getStart().getCharPositionInLine()
                            + " Valor do tipo '" + tipoVal +
                            "' não pode ser atribuido à variavel '" +
                            variavel + "' de tipo '" + tipoVar + "'!");
                }

            } else if (valor.getChildCount() > 1){
                String op = valor.getChild(1).getText();
                tipoVal = switch (op) {
                    case "<=", ">=", "=", "<", ">" -> "Bool";
                    case "+", "-", "*", "/" -> checkOpAritType(valor);
                    default -> "";
                };
                if(!tipoVal.equals(tipoVar)){
                    errorList.add("linha " + ctx.getStart().getLine() + ":"
                            + ctx.getStart().getCharPositionInLine()
                            + " Valor do tipo '" + tipoVal +
                            "' não pode ser atribuido à variavel '" +
                            variavel + "' de tipo '" + tipoVar + "'!");
                }
            }

        }
        super.enterNAtribuicao(ctx);
    }

    @Override
    public void enterNOperacaoArit(AlgumaParser.NOperacaoAritContext ctx) {
        String val1 = ctx.getChild(0).getText();

        for (int i = 0; i < ctx.getChildCount(); i++){
            if (checkValueType(ctx.getChild(i).getText()).equals("Bool")
                || checkValueType(ctx.getChild(i).getText()).equals("string")){
                errorList.add("linha " + ctx.getStart().getLine() + ":"
                        + ctx.getStart().getCharPositionInLine()
                        + " Não é possivel realizar operações aritmeticas valores do tipo: " + checkValueType(ctx.getChild(i).getText())  + "!");
            }
        }
        super.enterNOperacaoArit(ctx);
    }

    @Override
    public void exitNOperacaoArit(AlgumaParser.NOperacaoAritContext ctx) {
        super.exitNOperacaoArit(ctx);
    }

    @Override
    public void enterNOperacaoLog(AlgumaParser.NOperacaoLogContext ctx) { // TODO - STR/STR?
        super.enterNOperacaoLog(ctx);
    }

    @Override
    public void enterOperando(AlgumaParser.OperandoContext ctx) {
        if (ctx.VAR() != null){
            if(!checkDeclaration(ctx.VAR().getText()))
                errorList.add("linha " + ctx.getStart().getLine() + ":"
                        + ctx.getStart().getCharPositionInLine()
                        + " A variavel " + ctx.VAR() + " ainda não foi declarada!");
        }
        super.enterOperando(ctx);
    }

    private boolean checkDeclaration(String nome){
        return tabSimbolos.containsKey(nome);
    }

    private String checkOpAritType(ParseTree op){
        String type = "int";
        for (int i = 0; i < op.getChildCount(); i++){
            if (i%2 == 0){
                if(checkValueType(op.getChild(i).getText()).equals("float"))
                    type = "float";
            }
        }

        return type;
    }
    private String checkValueType(String value){
        String type = tabSimbolos.get(value);
        if (type != null){
            return type;
        }

        if (value.contains("\"")){
            type = "string";
        } else if (value.contains(",")) {
            type = "float";
        } else if (value.equals("true") || value.equals("false")){
            type = "Bool";
        } else {
            type = "int";
        }
        return type;
    }
    public int getNumberSemanticError(){
        return errorList.size();
    }
}