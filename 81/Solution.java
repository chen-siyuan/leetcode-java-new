public class Solution {

    public boolean search(int[] nums, int target) {

        int n = nums.length;
        if(n == 0) return false;

        int l = 0;
        int r = n - 1;

        if(target == nums[0]) return true;
        while(l + 2 <= r && nums[l] == nums[r]) {l++; r--;}

        int flag = nums[l];
        if(target == flag) return true;

        while(l <= r) {

            int m = (l + r) / 2;
            if(target == nums[m]) return true;

            if(nums[m] < flag && flag < target) {r = m - 1; continue;}

            if(target < flag && flag <= nums[m]) {l = m + 1; continue;}

            if(target < nums[m]) r = m - 1;
            else l = m + 1;
        
        }

        return false;
    }

}
