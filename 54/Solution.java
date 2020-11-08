import java.util.*;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int m = matrix.length;
        if(m == 0) return res;
        int n = matrix[0].length;
        if(n == 0) return res;

        int i = 0;
        int j = 0;

        int k = (Math.min(m, n) + 1) / 2;
        for(; k >= 0; k--) {
            System.out.println(3);
        }

        return null;
    }

    public static void main(String[] args) {
        for(int i: new Solution().spiralOrder(new ))
    
    }

}
