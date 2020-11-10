public class Solution {

    public boolean canJump(int[] nums) {

        int n = nums.length;
        int m = 0;

        for(int i=0; i <= m; i++) {
            m = Math.max(m, i + nums[i]);
            if(m >= n - 1) return true;
        }

        return false;
    }

}
