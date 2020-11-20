public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        for(int i=0; i < m; i++) for(int j=0; j < n; j++)
            if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;
            else obstacleGrid[i][j] = (i == 0 && j == 0
                ? 1
                : (i == 0
                    ? 0
                    : obstacleGrid[i - 1][j])
                + (j == 0
                    ? 0 :
                    obstacleGrid[i][j - 1]));
    
        return obstacleGrid[m - 1][n - 1];
    }

}
