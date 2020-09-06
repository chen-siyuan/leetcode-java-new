public class Solution {

    public static int sum;

    public int sumNumbers(TreeNode root) {
        sum = 0;
        if(root == null) return sum;
        search(root, 0);
        return sum;
    }

    public void search(TreeNode node, int cache) {
        if(node.left == null && node.right == null) sum += cache * 10 + node.val;
        if(node.left != null) search(node.left, cache * 10 + node.val);
        if(node.right != null) search(node.right, cache * 10 + node.val);
    }

}
