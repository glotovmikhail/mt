package lab4;

import java.io.*;
import java.util.*;

public class Tree {
    private String node;
    private List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
    }

    public void printTree(int level, BufferedWriter out) throws IOException {
        if (level == 0) out.write("graph g {" + System.lineSeparator());
        out.write("\t" + "\"" + this.hashCode() + node + level + "\"" + " [shape=circle, style=filled, fillcolor=\"" + Colorize() + "\", label=\""+node+"\"];" + System.lineSeparator());
        if (children != null) {
            for (Tree t : children) {
                t.printTree(level + 1, out);
            }
            out.write(generateEdges(node, level));
            out.write(generateChildRanks(level + 1));
        }
        if (level == 0) out.write("}" + System.lineSeparator());
    }

    private String Colorize() {
        return "lightblue";
    }

    private String generateEdges(String currNode, int level) {
        String res = "";
        for (Tree t : children) {
            res += "\t" + "\"" + this.hashCode() + currNode + level + "\"" + " -- " + "\"" + t.hashCode() + t.node + (level + 1) + "\"" + ";" + System.lineSeparator();
        }

        return res;
    }

    private String generateChildRanks(int level) {
        String res = "\t{ rank=same";
        StringJoiner joiner = new StringJoiner(",");
        for (Tree t : children) {
            joiner.add("\"" + t.hashCode() + t.node + level + "\"");
        }
        res += joiner.toString();
        res += " }" + System.lineSeparator();
        return res;
    }
}
