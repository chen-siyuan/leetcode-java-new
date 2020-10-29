public class Solution {

    public int searchInsert(int[] nums, int target) {

        int n = nums.length;

        int l = -1;
        int r = n - 1;

        while(l < r) {
            int m = (l + r + 1) / 2;
            if(nums[m] < target) l = m;
            else r = m - 1;
        }

        return l + 1;
    }

}
