package lab4.pascal;

import lab4.Tree;
import java.io.*;
import java.text.ParseException;
public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		InputStream is = new FileInputStream(new File("src/lab4/pascal/input.txt"));
		Tree result = (new pascalParser()).parse(is);
BufferedWriter bw = new BufferedWriter(new FileWriter("src/lab4/pascal/pascal.dot"));
result.printTree(0, bw);
bw.flush();
	}
}
