package lab4;

import java.util.*;

public class Node {
    private String name;
    private String returnType = "void";
    private List<Produce> productList = new ArrayList<>();

    private List<String> callAttrs = new ArrayList<>();
    private final Map<String, String> declAttrs = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void putDeclAttrs(String name, String type) {
        declAttrs.put(name, type);
    }

    public String getDeclAttrs(boolean withTypes) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> iterator = declAttrs.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (withTypes) {
                sb.append(entry.getValue()).append(" ");
            }
            sb.append(entry.getKey());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void setCallAttrs(List<String> callAttrs) {
        this.callAttrs = callAttrs;
    }

    public String getCallAttrs() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = callAttrs.iterator();
        while (iterator.hasNext()) {
            String entry = iterator.next();
            sb.append(entry);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        return (getClass() == o.getClass() && name.equals(((Node) o).name));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> ");
        for (Produce cur : productList) {
            sb.append(cur.toString()).append(" | ");
        }
        sb.delete(sb.length() - 3, sb.length());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return this.returnType;
    }

    public void setReturnType(String type) {
        this.returnType = type;
    }

    public void add(Produce production) {
        productList.add(production);
    }

    public List<Produce> getProductList() {
        return productList;
    }

    public Produce get(int i) {
        return productList.get(i);
    }
}
