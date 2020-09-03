import java.util.*;

public class Solution {

    public static List<TreeNode>[] dp;

    public List<TreeNode> generateTrees(int n) {

        if(n == 0) return new ArrayList<>();

        dp = new ArrayList[n + 1];
        for(int i=0; i < n + 1; i++) dp[i] = new ArrayList<>();
        dp[0].add(null);

        for(int size=1; size < n + 1; size++) {

            for(int val=1; val < size + 1; val++) {

                for(int left=0; left < dp[val - 1].size(); left++) {
                
                    for(int right=0; right < dp[size - val].size(); right++) {

                        TreeNode root = new TreeNode(val);

                        root.left = standardize(dp[val - 1].get(left), 0);
                        root.right = standardize(dp[size -val].get(right), val);

                        dp[size].add(root);
                    
                    }
                
                }
            
            }
        
        }

        return dp[n];
    }

    public static TreeNode standardize(TreeNode node, int value) {

        if(node == null) return null;

        TreeNode res = new TreeNode(node.val + value);

        res.left = standardize(node.left, value);
        res.right = standardize(node.right, value);

        return res;
    }

}
