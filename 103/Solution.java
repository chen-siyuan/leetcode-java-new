import java.util.*;

public class Solution {

    public static List<List<Integer>> res;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        res = new ArrayList<>();
        search(root, 0);
        return res;
    }

    public void search(TreeNode node, int level) {

        if(node == null) return;

        if(res.size() <= level) res.add(new ArrayList<>());
        res.get(level).add((level % 2 == 0 ? res.get(level).size() : 0), node.val);

        search(node.left, level + 1);
        search(node.right, level + 1);
    
    }

}
