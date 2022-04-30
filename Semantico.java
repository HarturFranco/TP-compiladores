import antlr.AlgumaLexer;
import antlr.AlgumaParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Semantico {
    public static void main(String[] args) {
        AlgumaParser parser = getParser(args[0]);
        ParseTree ast = parser.programa();

        System.out.println(ast.toStringTree());

        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, ast);
    }
    public static AlgumaParser getParser(String nomeArquivo){
        AlgumaParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(nomeArquivo);
            AlgumaLexer algumaLexer = new AlgumaLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(algumaLexer);
            parser = new AlgumaParser(tokenStream);
        } catch (IOException e){
            e.printStackTrace();
        }
        return parser;
    }
}
