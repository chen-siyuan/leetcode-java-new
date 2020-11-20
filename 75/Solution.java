public class Solution {

    public void sortColors(int[] nums) {

        int n = nums.length;

        int s = 0;
        int f = 0;

        for(; f < n; f++) if(nums[f] == 0) {
            int swap = nums[s];
            nums[s++] = nums[f];
            nums[f] = swap;
        }

        for(f = s; f < n; f++) if(nums[f] == 1) {
            int swap = nums[s];
            nums[s++] = nums[f];
            nums[f] = swap;
        }

    }

}
