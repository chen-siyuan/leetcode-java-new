public class Solution {

    public int removeDuplicates(int[] nums) {

        int slow = 0;
        int fast = 0;

        while(true) {
            while(fast < nums.length && nums[fast] == nums[slow]) fast++;
            if(fast == nums.length) return slow + 1;
            nums[++slow] = nums[fast];
        }

    }

}
