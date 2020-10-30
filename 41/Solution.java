public class Solution {

    public int firstMissingPositive(int[] nums) {
    
        int n = nums.length;
        
        for(int i=0; i < n; i++) while(1 <= nums[i] && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
            int k = nums[i] - 1;
            nums[i] += nums[k];
            nums[k] = nums[i] - nums[k];
            nums[i] -= nums[k];
        }

        for(int i=0; i < n; i++) if(nums[i] != i + 1) return i + 1;
    
        return n + 1;
    }

}
