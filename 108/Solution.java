import java.util.*;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
    
        int n = nums.length;
        if(n == 0) return null;

        TreeNode res = new TreeNode(nums[n / 2]);
        res.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, n / 2));
        res.right = sortedArrayToBST(Arrays.copyOfRange(nums, n / 2 + 1, n));
    
        return res;
    }

}
