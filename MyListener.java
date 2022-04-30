import antlr.AlgumaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
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
        System.out.println(ctx.getText());
        super.enterNBlocoDeclaracao(ctx);
    }

    @Override
    public void exitNBlocoDeclaracao(AlgumaParser.NBlocoDeclaracaoContext ctx) {
        super.exitNBlocoDeclaracao(ctx);
    }

    @Override
    public void enterNDeclaracao(AlgumaParser.NDeclaracaoContext ctx) {
        super.enterNDeclaracao(ctx);
    }

    @Override
    public void exitNDeclaracao(AlgumaParser.NDeclaracaoContext ctx) {
        super.exitNDeclaracao(ctx);
    }

    @Override
    public void enterNBlocoAlgoritmo(AlgumaParser.NBlocoAlgoritmoContext ctx) {
        super.enterNBlocoAlgoritmo(ctx);
    }

    @Override
    public void exitNBlocoAlgoritmo(AlgumaParser.NBlocoAlgoritmoContext ctx) {
        super.exitNBlocoAlgoritmo(ctx);
    }

    @Override
    public void enterNComando(AlgumaParser.NComandoContext ctx) {
        super.enterNComando(ctx);
    }

    @Override
    public void exitNComando(AlgumaParser.NComandoContext ctx) {
        super.exitNComando(ctx);
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
