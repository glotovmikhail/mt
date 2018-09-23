package lab2;

import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.layout.HierarchicalLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    private static SingleGraph graph;
    private static PrintWriter p;

    public static void main(String[] args) throws FileNotFoundException, LexicalException, ParseException {
        String tests[] ={"a or b or c",
                "a xor b or c",
                "a or b and c",
                "a or (b and c)",
                "(((a or (((b)) and c))))",
                "  b    or (  a    and   (    not                geez)        and \na and c \t)      ",
                "not not a and not (not b or c and (not not e)))"
        };


        graph = new SingleGraph("");
        graph.setNullAttributesAreErrors(true);
        graph.addAttribute("ui.stylesheet", "node {size: 5px; fill-color: black;} " +
                                                    "node.marked {size: 7px; fill-color: red, blue;}");
        graph.addAttribute("ui.quality");
        graph.addAttribute("ui.antialias");



        Node root = Parser.parse(tests[3]);
        p = new PrintWriter(new File("output.txt"));
        org.graphstream.graph.Node rootNode = print(root, "");
        p.close();

        rootNode.setAttribute("ui.class", "marked");
        rootNode.setAttribute("ui.color", 0.5);


        Viewer viewer = graph.display();
        HierarchicalLayout layout = new HierarchicalLayout();
        layout.shake();
        viewer.enableAutoLayout(layout);
//        viewer.getDefaultView().getCamera().resetView();
//        graph.addAttribute("ui.screenshot", "./screenshot.png");
    }

    private static org.graphstream.graph.Node print(Node parserNode, String tab) {
        org.graphstream.graph.Node node = graph.addNode(parserNode.id.toString());
        node.setAttribute("ui.label", parserNode.interp);

        p.println(tab + parserNode.interp + " : ");
        for (Node i : parserNode.children) {
            print(i, tab + "\t");
            graph.addEdge(parserNode.id + "|" + i.id, parserNode.id.toString(), i.id.toString());
        }
        return node;
    }
}
