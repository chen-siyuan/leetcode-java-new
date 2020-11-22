public class Solution {

    public int removeDuplicates(int[] nums) {
         
        int n = nums.length;
        if(n < 3) return n;

        int s = 0;
        int f = 0;
        int cache = 0;
        for(; f < n; f++) if(f < 2 || !(nums[f] == nums[f - 1] && nums[f - 1] == nums[f - 2])) {
            if(f != 0) nums[s++] = cache;
            cache = nums[f];
        }

        nums[s++] = cache;

        return s;
    }

}
