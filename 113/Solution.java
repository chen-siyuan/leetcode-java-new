import java.util.*;

public class Solution {

    public static List<List<Integer>> res;
    public static List<Integer> cache;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        res = new ArrayList<>();
        cache = new ArrayList<>();
    
        search(root, sum);
    
        return res;
    }

    public static void search(TreeNode root, int sum) {
    
        if(root == null) return;

        cache.add(root.val);
        if(root.left == null && root.right == null && sum == root.val) res.add(new ArrayList<>(cache));
        
        search(root.left, sum - root.val);
        search(root.right, sum - root.val);

        cache.remove(cache.size() - 1);

    }

}
