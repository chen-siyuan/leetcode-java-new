public class Solution {

    public void flatten(TreeNode root) {
    
        if(root == null) return;

        flatten(root.left);
        flatten(root.right);

        if(root.left != null) {
            TreeNode node = root.left;
            while(node.right != null) node = node.right;
            node.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return;
    }

}
