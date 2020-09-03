import java.util.*;

public class Solution {

    public static boolean flag;

    public boolean isValidBST(TreeNode root) {

        flag = true;
        check(root, Long.MIN_VALUE, Long.MAX_VALUE);

        return flag;
    }

    public static void check(TreeNode node, long left, long right) {

        if(!flag || node == null) return;

        flag = (left < (long)node.val) && ((long)node.val < right);

        check(node.left, left, node.val);
        check(node.right, node.val, right);

    }

}
