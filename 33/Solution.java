public class Solution {

    public int search(int[] nums, int target) {

        int n = nums.length;

        if(n == 1) return nums[0] == target ? 0 : -1;

        int l = 0;
        int r = n;

        while(l + 1 < r) {
            int m = (l + r) / 2;
            if(nums[m] > nums[0]) l = m;
            else r = m;
        }

        int res;

        if(l == n - 1) {
            if((res = binarySearch(nums, 0, n, target)) != -1) return res;
        } else {
            if((res = binarySearch(nums, 0, l + 1, target)) != -1) return res;
            if((res = binarySearch(nums, l + 1, n, target)) != -1) return res;
        }

        return -1;
    }

    public int binarySearch(int[] nums, int l, int r, int target) {

        while(l + 1 < r) {
            int m = (l + r) / 2;
            if(nums[m] == target) return m;
            if(nums[m] < target) l = m;
            else r = m;
        }
        
        if(nums[l] == target) return l;
        else return -1;
    }

}
