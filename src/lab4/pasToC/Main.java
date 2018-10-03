package lab4.pasToC;

import lab4.Tree;
import java.io.*;
import java.text.ParseException;
public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		InputStream is = new FileInputStream(new File("src/lab4/pasToC/input.txt"));
		String result = (new pasToCParser()).parse(is);
PrintWriter p = new PrintWriter(new FileOutputStream(new File("src/lab4/pasToC/out.c")));
        p.write(result);
        p.close();
	}
}
