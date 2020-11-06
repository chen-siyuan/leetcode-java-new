public class Solution {

    public int jump(int[] nums) {

        int n = nums.length;
        int res = 0;
        int l = 0;
        int r = 1;

        while(r < n) {
            System.out.println(String.format("%d %d", l, r));
            res++;
            int temp = r;
            for(int i=l; i < temp; i++) r = Math.max(r, i + nums[i] + 1);
            l = temp;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().jump(new int[]{
            2, 3, 0, 1, 4
        }));
    }

}
