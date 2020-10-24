import java.util.*;

public class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        if(n < 2) return;

        int k = n - 2;
        while(k >= 0 && nums[k] >= nums[k + 1]) k--;

        if(k == -1) {
            Arrays.sort(nums);
            return;
        }

        int head = k + 1;
        int tail = n;

        while(head + 1 < tail) {
            int mid = (head + tail) / 2;
            if(nums[mid] <= nums[k]) tail = mid;
            else head = mid;
        }

        int temp = nums[head];
        nums[head] = nums[k];
        nums[k] = temp;

        head = k + 1;
        tail = n - 1;

        while(head < tail) {
            temp = nums[head];
            nums[head] = nums[tail];
            nums[tail] = temp;
            head++;
            tail--;
        }

    }

}

