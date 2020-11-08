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
        int mm = m;
        int nn = n;

        int k = (Math.min(m, n) - 1) / 2;
        for(; k > 0; k--) {

            for(int l=0; l < nn - 1; l++) res.add(matrix[i][j++]);
            for(int l=0; l < mm - 1; l++) res.add(matrix[i++][j]);
            for(int l=0; l < nn - 1; l++) res.add(matrix[i][j--]);
            for(int l=0; l < mm - 1; l++) res.add(matrix[i--][j]);

            i++;
            j++;
            mm -= 2;
            nn -= 2;

        }

        if(m < n) {

            if(m % 2 == 0) {
                for(int l=0; l < 2 + n - m; l++) res.add(matrix[i][j++]);
                i++;
                j--;
                for(int l=0; l < 2 + n - m; l++) res.add(matrix[i][j--]);
            } else for(int l=0; l < 1 + n - m; l++) res.add(matrix[i][j++]);
        
        } else {

            if(n % 2 == 0) {
                res.add(matrix[i][j++]);
                for(int l=0; l < 2 + m - n; l++) res.add(matrix[i++][j]);
                i--;
                j--;
                for(int l=0; l < 1 + m - n; l++) res.add(matrix[i--][j]);
            } else for(int l=0; l < 1 + m - n; l++) res.add(matrix[i++][j]);
        
        }

        return res;
    }

}
