import java.util.*;

public class Solution {

    public int n;
    public int[] nums;
    public List<List<Integer>> res;
    public Stack<Integer> cache;

    public void dfs(int num, int index) {

        for(int i=index; i >= 0; i--) if(num - nums[i] >= 0) {
            cache.push(nums[i]);
            if(num == nums[i]) res.add(new ArrayList<>(cache));
            else dfs(num - nums[i], i);
            cache.pop();
        }
    
    }

    public List<List<Integer>> combinationSum(int[] candidates, int num) {

        n = candidates.length;
        nums = candidates;
        cache = new Stack<>();
        res = new ArrayList<>();

        Arrays.sort(nums);
        dfs(num, n - 1);

        return res;
    }

}
