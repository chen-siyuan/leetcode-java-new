public class Solution {

    public int search(int[] nums, int target) {

        int n = nums.length;

        int l = 0;
        int r = n;

        while(l + 1 < r) {

            int m = (l + r) / 2;
            if(nums[m] == target) return m;

            if(nums[m] <= nums[0] && nums[0] <= target) {r = m; continue;}
            if(nums[m] > nums[0] && nums[0] > target) {l = m; continue;}

            if(nums[m] > target) r = m;
            else l = m;
        
        }

        if(nums[l] == target) return l;
        else return -1;

    }

}
