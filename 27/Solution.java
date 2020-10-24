public class Solution {

    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int slow = 0;
        int fast = 0;

        while(true) {
            while(fast < n && nums[fast] == val) fast++;
            if(fast == n) return slow;
            nums[slow++] = nums[fast++];
        }

    }

}
