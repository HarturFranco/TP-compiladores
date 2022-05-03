import antlr.AlgumaLexer;
import antlr.AlgumaParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        AlgumaParser parser = getParser(args[0]);
        ParseTree ast = parser.programa();

        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        try{
            walker.walk(listener, ast);
        }catch (Error e){
            System.err.println(e.getMessage());
        }
        System.err.println("Total erros léxicos: " + (parser.numberLexicalError));
        System.err.println("Total erros sintáticos: " + (parser.getNumberOfSyntaxErrors() - parser.numberLexicalError));
        System.err.println("Total erros semanticos: " + (listener.getNumberSemanticError()));
        System.err.println("Total de erros: " + (parser.getNumberOfSyntaxErrors() + listener.getNumberSemanticError()));

    }
    public static AlgumaParser getParser(String nomeArquivo){
        AlgumaParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(nomeArquivo);
            AlgumaLexer algumaLexer = new AlgumaLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(algumaLexer);
            parser = new AlgumaParser(tokenStream);
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        return parser;
    }
}

