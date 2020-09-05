import java.util.*;

public class Solution {

    public static boolean flag;

    public boolean isBalanced(TreeNode root) {
        flag = true;
        getHeight(root);
        return flag;
    }

    public static int getHeight(TreeNode node) {

        if(node == null || !flag) return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        if(Math.abs(leftHeight - rightHeight) > 1) flag = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
