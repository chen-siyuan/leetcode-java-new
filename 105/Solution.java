import java.util.*;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
    
        if(preorder.length == 0) return null;

        int pos = 0;
        while(inorder[pos] != preorder[0]) pos++;

        TreeNode res = new TreeNode(preorder[0]);
        res.left = buildTree(Arrays.copyOfRange(preorder, 1, pos + 1), Arrays.copyOfRange(inorder, 0, pos));
        res.right = buildTree(Arrays.copyOfRange(preorder, pos + 1, preorder.length), Arrays.copyOfRange(inorder, pos + 1, inorder.length));

        return res;
    }

}
