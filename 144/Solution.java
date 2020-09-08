import java.util.*;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {

            TreeNode node = stack.pop();
            if(node == null) continue;

            res.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        
        }

        return res;
    }

}
