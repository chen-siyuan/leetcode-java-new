import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3) return new ArrayList<>();

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;

        while(i < n) {

            if(i > 0 && nums[i - 1] == nums[i]) {
                i++;
            } else {

                int head = i + 1;
                int tail = n - 1;
                
                while(head < tail) {

                    int sum = nums[i] + nums[head] + nums[tail];

                    if(sum == 0) {

                        res.add(Arrays.asList(nums[i], nums[head], nums[tail]));

                        int left = nums[head];
                        while(head < n && nums[head] == left) head++;
                        int right = nums[tail];
                        while(tail >= 0 && nums[tail] == right) tail--;

                    } else {

                        if(sum < 0) {
                            int left = nums[head];
                            while(head < n && nums[head] == left) head++;
                        } else {
                            int right = nums[tail];
                            while(tail >= 0 && nums[tail] == right) tail--;
                        }

                    }
            
                }

                i++;

            }
        
        }

        return res;
    }

}
