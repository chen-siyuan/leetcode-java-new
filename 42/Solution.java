public class Solution {

    public int trap(int[] height) {

        int n = height.length;
        if(n == 0) return 0;

        int[] rs = new int[n];

        rs[n - 1] = 0;
        for(int i=n-2; i >= 0; i--) rs[i] = Math.max(rs[i + 1], height[i + 1]);

        int l = 0;
        int res = 0;
        for(int i=1; i < n - 1; i++) {
            l = Math.max(l, height[i - 1]);
            if(height[i] < Math.min(l, rs[i])) res += Math.min(l, rs[i]) - height[i];
        }
    
        return res;
    }

}
