package lab4;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("src/lab4/pascal");
        file.getParentFile().mkdirs();
        ParserGenerator parserGenerator = new ParserGenerator(file);
        try {
            parserGenerator.prepare(new File("src/lab4/pascal.in"));
            parserGenerator.generateFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
