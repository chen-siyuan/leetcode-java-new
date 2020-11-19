import java.util.*;

public class Solution {

    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];

        int i = 0;
        int j = 0;
        int mm = n;
        int nn = n;

        int count = 0;

        int k = (n - 1) / 2;
        for(; k > 0; k--) {

            for(int l=0; l < nn - 1; l++) res[i][j++] = count++;
            for(int l=0; l < mm - 1; l++) res[i++][j] = count++;
            for(int l=0; l < nn - 1; l++) res[i][j--] = count++;
            for(int l=0; l < mm - 1; l++) res[i--][j] = count++;

            i++;
            j++;
            mm -= 2;
            nn -= 2;

        }

        if(n % 2 == 0) {
            res[i][j++] = count++;
            res[i++][j] = count++;
            res[i++][j] = count++;
            i--;
            j--;
            res[i--][j] = count++;
        } else res[i++][j] = count++;

        return res;
    }

}

