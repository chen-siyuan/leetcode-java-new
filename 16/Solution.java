import java.util.*;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for(int i=0; i < n - 2; i++) {

            int head = i + 1;
            int tail = n - 1;

            while(head < tail) {

                int sum = nums[i] + nums[head] + nums[tail];

                if(sum == target) return target;
                else if(Math.abs(min) > Math.abs(sum - target)) min = sum - target;
                
                if(sum < target) head++;
                else tail--;

            }
       
        }

        return target + min;
    }

}
