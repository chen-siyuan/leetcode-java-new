import java.util.*;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length == 0) return new int[][]{newInterval};

        List<int[]> res = new ArrayList<>();
        int state = 0;

        for(int[] interval: intervals) {

            if(state == 2) {
                res.add(interval);
            } else 

            if(interval[1] < newInterval[0] || interval[0] > newInterval[1]) {

            }

        }

                if(flag) {
                    res.add(newInterval);
                flag = false;
            }
            
            res.add(interval);

        } else {

            newInterval[0] = Math.min(newInterval[0], interval[0]);
            newInterval[1] = Math.max(newInterval[1], interval[1]);
            flag = true;

        }
        }

        if(flag) res.add(newInterval);

        return res.toArray(new int[0][0]);
    }

}
