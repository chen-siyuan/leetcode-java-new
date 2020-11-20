public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        if(m == 0) return false;
        int n = matrix[0].length;
        if(n == 0) return false;

        int l = -1;
        int r = m * n - 1;

        while(l != r) {
            int temp = (l + r + 1) / 2;
            if(target < matrix[temp / n][temp % n]) r = temp - 1;
            else l = temp;
        }

        return l != -1 && target == matrix[l / n][l % n];
    }

}
