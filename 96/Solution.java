import java.util.*;

public class Solution {

    public static int[] dp;

    public int numTrees(int n) {
    
        dp = new int[n + 1];
        dp[0] = 1;

        for(int size=1; size < n + 1; size++)
            for(int val=1; val < size + 1; val++)
                dp[size] += dp[val - 1] * dp[size - val];

        return dp[n];
    }

}
