package lab4;

import java.util.ArrayList;
import java.util.List;

public class Produce {
    private List<Node> nodes = new ArrayList<>();
    private String code = "";
    private String attrs = "";

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }

    public void add(Node node) {
        nodes.add(node);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String aCode) {
        code += aCode;
    }

    public int size() {
        return nodes.size();
    }

    public Node get(int i) {
        return nodes.get(i);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}
