public class Solution {

    public int maxArea(int[] height) {

        int head = 0;
        int tail = height.length - 1;
        int max = 0;

        while(head != tail) if(height[head] < height[tail]) {
            max = Math.max(max, height[head] * (tail - head));
            int temp = height[head];
            while(head < tail && height[head] <= temp) head++;
        } else {
            max = Math.max(max, height[tail] * (tail - head));
            int temp = height[tail];
            while(head < tail && height[tail] <= temp) tail--;
        }

        return max;
    }

}
