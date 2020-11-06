public class Solution {

    public int trap(int[] height) {

        int n = height.length;
        int res = 0;
        int l = 0;
        int r = n - 1;
        int lm = 0;
        int rm = 0;

        while(l <= r) if(lm < rm) {
            if(height[l] >= lm) lm = height[l++];
            else res += lm - height[l++];
        } else {
            if(height[r] >= rm) rm = height[r--];
            else res += rm - height[r--];
        }

        return res;
    }

}
