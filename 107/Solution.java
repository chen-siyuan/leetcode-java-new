import java.util.*;

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
        
            List<Integer> cache = new ArrayList<>();
            TreeNode node = queue.poll();

            while(node != null) {
            
                cache.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                node = queue.poll();
            
            }

            if(!cache.isEmpty()) {
                res.add(0, cache);
                queue.add(null);
            }
        
        }
    
        return res;
    }

}
