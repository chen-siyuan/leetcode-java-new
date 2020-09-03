import java.util.*;

public class Solution {

    public static int count;
    public static TreeNode prev;
    public static TreeNode first;
    public static TreeNode second;

    public void recoverTree(TreeNode root) {

        count = 0;
        prev = new TreeNode(Integer.MIN_VALUE);

        traverse(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    
    }

    public static void traverse(TreeNode node) {
    
        if(count == 2 || node == null) return;

        traverse(node.left);
        
        if(node.val < prev.val) {
        
            if(count == 0) first = prev;

            count++;
            second = node;
        
        }

        prev = node;
    
        traverse(node.right);
    
    }

}
