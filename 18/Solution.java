import java.util.*;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        if(n < 4) return res;

        Arrays.sort(nums);

        int i = 0;
        while(i < n - 3) {

            if(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if(nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] >= target) {

                int j = i + 1;
                while(j < n - 2) {

                    if(nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                    if(nums[i] + nums[j] + nums[n - 2] + nums[n - 1] >= target) {

                        int head = j + 1;
                        int tail = n - 1;

                        while(head < tail) {

                            int sum = nums[i] + nums[j] + nums[head] + nums[tail];

                            if(sum == target) {

                                res.add(Arrays.asList(nums[i], nums[j], nums[head], nums[tail]));

                                int temp = nums[head];
                                while(head < n - 1 && nums[head] == temp) head++;
                                temp = nums[tail];
                                while(tail > j + 1 && nums[tail] == temp) tail--;

                            } else if(sum < target) {
                                int temp = nums[head];
                                while(head < n - 1 && nums[head] == temp) head++;
                            } else {
                                int temp = nums[tail];
                                while(tail > j + 1 && nums[tail] == temp) tail--;
                            }

                        }

                    }

                    int temp = nums[j];
                    while(j < n && nums[j] == temp) j++;

                }

            }

            int temp = nums[i];
            while(i < n && nums[i] == temp) i++;

        }

        return res;
    }

}
