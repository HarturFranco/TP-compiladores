import antlr.AlgumaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import antlr.AlgumaBaseListener;

public class MyListener extends AlgumaBaseListener{

    Map<String, String> tabSimbolos = new HashMap<String, String>();

    @Override
    public void enterNPrograma(AlgumaParser.NProgramaContext ctx) {
        super.enterNPrograma(ctx);
    }

    @Override
    public void exitNPrograma(AlgumaParser.NProgramaContext ctx) {
        super.exitNPrograma(ctx);
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
        if(tabSimbolos.containsKey(nome)){
            System.out.println("Erro: já foi declarado uma variavel de id: " + nome + "!");
//            throw new Error("Variavel já declarada!");
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
        /* TODO - Verificar numero de filhos do valor
         *   - Verificar existencia da variavel
         *   - Verificar o tipo da variavel
         *   - Verificar tipo do volor
         *   - Verificar compatibilidade de tipos
         * */
        ParseTree valor = ctx.getChild(1);
        String variavel = ctx.getChild(3).getText();

        super.enterNAtribuicao(ctx);
    }

    @Override
    public void enterNOperacaoArit(AlgumaParser.NOperacaoAritContext ctx) {
        super.enterNOperacaoArit(ctx);
    }

    @Override
    public void exitNOperacaoArit(AlgumaParser.NOperacaoAritContext ctx) {
        super.exitNOperacaoArit(ctx);
    }

    @Override
    public void enterNOperacaoLog(AlgumaParser.NOperacaoLogContext ctx) {
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
}
