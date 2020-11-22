import java.util.*;

public class Solution {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        if(n == 0) return 0;
        int[] ns = new int[n];
        int max = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (heights[b] - heights[a]));
        pq.offer(new E(n, -1));

        for(int i=n-1; i >= 0; i--) {
            while(pq.peek().val >= heights[i]) pq.poll();
            ns[i] = pq.peek().index;
            pq.offer(new E(i, heights[i]));
        }

        pq.clear();
        pq.offer(new E(-1, -1));

        for(int i=0; i < n; i++) {
            while(pq.peek().val >= heights[i]) pq.poll();
            max = Math.max(max, (ns[i] - pq.peek().index - 1) * heights[i]);
            pq.offer(new E(i, heights[i]));
        }

        return max;
    }

}
