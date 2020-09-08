import java.util.*;

public class Solution {

    public static Map<Integer, Node> map;

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        map = new HashMap<>();
        return cloneNode(node);
    }

    public Node cloneNode(Node node) {

        if(map.containsKey(node.val)) return map.get(node.val);

        Node res = new Node(node.val);
        map.put(res.val, res);
        for(Node neighbor: node.neighbors) res.neighbors.add(cloneNode(neighbor));

        return res;
    }

}
