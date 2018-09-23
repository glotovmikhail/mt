package lab3;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

/**
 * Created by mikhail on 23.09.18.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = fromFileName("src/lab3/test.pas");
        PrintWriter p = new PrintWriter(new FileOutputStream(new File("src/lab3/test.c")));
        PascalToCLexer lexer = new PascalToCLexer(cs);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        PascalToCParser parser = new PascalToCParser(tokenStream);
        parser.wholeProgram();
        p.println(parser.code.toString());
        p.close();
    }
}
