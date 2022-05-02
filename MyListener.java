import antlr.AlgumaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import antlr.AlgumaBaseListener;

public class MyListener extends AlgumaBaseListener{

    Map<String, String> tabSimbolos = new HashMap<>();
    List<String> errorList = new ArrayList<>();

    @Override
    public void enterNPrograma(AlgumaParser.NProgramaContext ctx) {
        super.enterNPrograma(ctx);
    }

    @Override
    public void exitNPrograma(AlgumaParser.NProgramaContext ctx){

        String errorMessage = "Não foram encontrados nenhum erro semântico!";
        int nErro = errorList.size();

        if (nErro > 0){
            errorMessage = "Erros semânticos(" + nErro + "): \n";
            for (String error : errorList) {
                errorMessage += "\n" + error;
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
//            System.out.println("Erro: já foi declarado uma variavel de id: " + nome + "!");
//            throw new Error("linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Variavel já declarada!");
            errorList.add("linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Variavel já declarada!");
        } else {
            tabSimbolos.put(nome, tipo);
        }
        System.out.println(nome);
        super.enterNDeclaracao(ctx);
    }

    @Override
    public void enterNBlocoAlgoritmo(AlgumaParser.NBlocoAlgoritmoContext ctx) {
        super.enterNBlocoAlgoritmo(ctx);
    }

    @Override
    public void enterLer(AlgumaParser.LerContext ctx) {
        super.enterLer(ctx);
    }

    @Override
    public void enterNImprimir(AlgumaParser.NImprimirContext ctx) {
        super.enterNImprimir(ctx);
    }

    @Override
    public void enterNCondicao(AlgumaParser.NCondicaoContext ctx) {
        super.enterNCondicao(ctx);
    }

    @Override
    public void enterNRepeticao(AlgumaParser.NRepeticaoContext ctx) {
        System.out.println(ctx.getText());
        super.enterNRepeticao(ctx);
    }

    @Override
    public void enterNAtribuicao(AlgumaParser.NAtribuicaoContext ctx) {
        /* Fazendo:
         * Verificar compatibilidade de tipos
         * Verificar numero de filhos do valor
         * Verificar existencia da variavel
         * Verificar o tipo da variavel
         * Verificar tipo do volor
         * */
        ParseTree valor = ctx.getChild(1);
        String variavel = ctx.getChild(3).getText();
        if (!checkDeclaration(variavel)){ // Variavel não declarada
//            System.out.println("Erro: a variavel " + variavel + " ainda não foi declarada!");
//            throw new Error("Variavel nao declarada");
            errorList.add("linha " + ctx.getStart().getLine() + ":"
                    + ctx.getStart().getCharPositionInLine()
                    + " A variavel " + variavel + " ainda não foi declarada!");
        } else { // Variavel declarada, verifica tipo
            String tipoVar = tabSimbolos.get(variavel);
            String tipoVal;
            System.out.println(valor.getChildCount());
            if (valor.getChildCount() == 1){ // valor tem um noh filho
                String valorTexto = valor.getChild(0).getText();
                tipoVal = checkValueType(valorTexto); // tipo de valor
                if (!tipoVar.equals(tipoVal)){ // nao tem mesmo tipo
//                    throw nerrorListew Error("Valor do tipo '" + tipoVal +
//                            "' não pode ser atribuido à variavel '" +
//                            variavel + "' de tipo '" + tipoVar + "'!");
                    errorList.add("linha " + ctx.getStart().getLine() + ":"
                            + ctx.getStart().getCharPositionInLine()
                            + " Valor do tipo '" + tipoVal +
                            "' não pode ser atribuido à variavel '" +
                            variavel + "' de tipo '" + tipoVar + "'!");
                }

            } else if (valor.getChildCount() > 1){
                String op = valor.getChild(1).getText();
                System.out.println(op);
                tipoVal = switch (op) {
                    case "<=", ">=", "=", "<", ">" -> "Bool";
                    case "+", "-", "*", "/" -> checkOpAritType(valor);
                    default -> "";
                };
                if(!tipoVal.equals(tipoVar)){ // TODO - Logica:
                    errorList.add("linha " + ctx.getStart().getLine() + ":"
                            + ctx.getStart().getCharPositionInLine()
                            + " Valor do tipo '" + tipoVal +
                            "' não pode ser atribuido à variavel '" +
                            variavel + "' de tipo '" + tipoVar + "'!");
//                    throw new Error("Valor do tipo '" + tipoVal +
//                            "' não pode ser atribuido à variavel '" +
//                            variavel + "' de tipo '" + tipoVar + "'!");
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
//                throw new Error("linha " + ctx.getStart().getLine() + ":"
//                        + ctx.getStart().getCharPositionInLine()
//                        + " Não é possivel realizar operações aritmeticas valores do tipo: " + checkValueType(ctx.getChild(i).getText())  + "!");
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
    public void exitNOperacaoLog(AlgumaParser.NOperacaoLogContext ctx) {
        super.exitNOperacaoLog(ctx);
    }

    @Override
    public void enterOperando(AlgumaParser.OperandoContext ctx) {
        super.enterOperando(ctx);
    }

    @Override
    public void exitOperando(AlgumaParser.OperandoContext ctx) {
        super.exitOperando(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
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
}
