import antlr.AlgumaLexer;
import antlr.AlgumaParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Semantico {
    public static void main(String[] args) {
        AlgumaParser parser = getParser(args[0]);
        ParseTree ast = parser.programa();

//        System.out.println(ast.toStringTree());

        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        List errorMessages = new ArrayList();

        try{
            walker.walk(listener, ast);
        }catch (Error e){
            errorMessages.add(e.getMessage());
        }

        System.out.println(errorMessages);

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
//            e.printStackTrace();
        }
        return parser;
    }
}
