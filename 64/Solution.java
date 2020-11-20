public class Solution {

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i < m; i++) for(int j=0; j < n; j++)
            grid[i][j] += (i == 0 && j == 0
                    ? 0
                    : Math.min(
                        (i == 0 ? Integer.MAX_VALUE : grid[i - 1][j]),
                        (j == 0 ? Integer.MAX_VALUE : grid[i][j - 1])));

        return grid[m - 1][n - 1];
    }

}
