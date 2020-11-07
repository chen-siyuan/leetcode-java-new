public class Solution {

    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int num: nums) {
            curr += num;
            max = Math.max(max, curr);
            if(curr < 0) curr = 0;
        }

        return max;
    }

}
