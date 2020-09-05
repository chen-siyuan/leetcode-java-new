import java.util.*;

public class Solution {

    public static int max;

    public int maxDepth(TreeNode root) {
        max = 0;
        search(root, 1);
        return max;
    }

    public static void search(TreeNode node, int level) {
        if(node == null) return;
        max = Math.max(max, level);
        search(node.left, level + 1);
        search(node.right, level + 1);
    }

}
