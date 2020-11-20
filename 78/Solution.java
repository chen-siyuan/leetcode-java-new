import java.util.*;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        
        int n = nums.length;
        int[] states = new int[n];
        states[0] = -1;

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i < Math.pow(2, n); i++) {

            int temp = 0;
            while(states[temp]++ == 1) states[temp++] = 0;

            List<Integer> cache = new ArrayList<>();
            for(int j=0; j < n; j++) if(states[j] == 1) cache.add(nums[j]);
            res.add(cache);

        }

        return res;
    }

}
