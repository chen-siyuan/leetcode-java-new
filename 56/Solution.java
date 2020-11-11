import java.util.*;

public class Solution {

    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        if(n == 0) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int k = intervals[0][1];

        Deque<int[]> res = new LinkedList<>();
        res.addLast(new int[]{intervals[0][0], 0});

        for(int i=1; i < n; i++) {

            if(k < intervals[i][0]) {
                res.getLast()[1] = k;
                res.addLast(new int[]{intervals[i][0], 0});
            }

            k = Math.max(k, intervals[i][1]);

        }

        res.getLast()[1] = k;

        return res.toArray(new int[0][0]);
    }

}
