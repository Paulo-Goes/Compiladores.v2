package CompiladorAH;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("analise.txt");
        Scanner input2 = new Scanner(arquivo);
        String expression= "";
        while(input2.hasNext()){
            expression += input2.nextLine();
            expression += '\n';
        }
        InputStream inputStream = new ByteArrayInputStream(expression.getBytes(StandardCharsets.UTF_8));
        CharStream inputAux = CharStreams.fromStream(inputStream);
        ExpressaoLexer lexer = new ExpressaoLexer(inputAux);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressaoParser parser = new ExpressaoParser(tokens);
        ParseTree tree = parser.declarar();
        System.out.println(tree.toStringTree(parser));

    }
}