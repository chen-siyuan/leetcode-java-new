import java.util.*;

public class Solution {

    public static List<Integer> res;

    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        search(root, 0);
        return res;
    }

    public static void search(TreeNode node, int level) {

        if(node == null) return;

        if(res.size() == level) res.add(node.val);
        else res.set(level, node.val);

        search(node.left, level + 1);
        search(node.right, level + 1);

    }

}
