import java.util.*;

public class Solution {

    public int n;
    public int[] nums;
    public List<List<Integer>> res;
    public Stack<Integer> cache;

    public void dfs(int num, int i) {

        int prev = Integer.MAX_VALUE;

        while(--i >= 0) if(num - nums[i] >= 0 && nums[i] != prev) {

            cache.push(nums[i]);
            prev = nums[i];

            if(num == nums[i]) res.add(new ArrayList<>(cache));
            else dfs(num - nums[i], i);

            cache.pop();

        }
    
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int num) {

        n = candidates.length;
        nums = candidates;
        cache = new Stack<>();
        res = new ArrayList<>();

        Arrays.sort(nums);
        dfs(num, n);

        return res;
    }

}
