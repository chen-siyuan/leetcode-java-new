import java.util.*;

public class Solution {

    public static int max;

    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        search(root);
        return max;
    }

    public int search(TreeNode node) {

        if(node == null) return 0;

        int left = Math.max(0, search(node.left));
        int right = Math.max(0, search(node.right));

        max = Math.max(max, node.val + left + right);

        return node.val + Math.max(left, right);
    }

}
