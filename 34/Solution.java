public class Solution {

    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int[] res = new int[]{-1, -1};

        int l = 0;
        int r = n;

        while(l < r) {
            int m = (l + r) / 2;
            if(nums[m] < target) l = m + 1;
            else r = m;
        }

        if(l == n || nums[l] != target) return res;
        res[0] = l;

        r = n - 1;

        while(l < r) {
            int m = (l + r + 1) / 2;
            if(nums[m] <= target) l = m;
            else r = m - 1;
        }
        res[1] = r;

        return res;
    }

}
