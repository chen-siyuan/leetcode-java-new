import java.util.*;

public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
    
        int n = inorder.length;
        if(n == 0) return null;

        int pos = 0;
        while(inorder[pos] != postorder[n - 1]) pos++;

        TreeNode res = new TreeNode(postorder[n - 1]);
        res.left = buildTree(Arrays.copyOfRange(inorder, 0, pos), Arrays.copyOfRange(postorder, 0, pos));
        res.right = buildTree(Arrays.copyOfRange(inorder, pos + 1, n), Arrays.copyOfRange(postorder, pos, n - 1));
    
        return res;
    }

}
