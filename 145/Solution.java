import java.util.*;

public class Solution {

    public static List<Integer> res;

    public List<Integer> postorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        search(root);
        return res;
    }

    public static void search(TreeNode node) {
        if(node == null) return;
        search(node.left);
        search(node.right);
        res.add(node.val);
    }

}
