import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> record = new HashMap<>();
        int n = nums.length;

        for(int i=0; i < n; i++) {
            if(record.containsKey(target - nums[i])) return new int[]{record.get(target - nums[i]), i};
            record.put(nums[i], i);
        }

        return null;
    }

}
