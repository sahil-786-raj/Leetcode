class Solution {
    public static int uniqueways(int i, int j, int m, int n, int obstacleGrid[][] ,int dp[][]){
        if(obstacleGrid[m-1][n-1] == 1){
            return 0;
        } 
        if(i == m || j == n){
            return 0;
        }

        if(i == m-1 && j == n-1){
            return 1;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }

        if(obstacleGrid[i][j] != 1){
            dp[i][j] = uniqueways(i+1, j, m, n, obstacleGrid, dp) + uniqueways(i, j+1, m, n, obstacleGrid, dp);
        }

        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp[][] = new int[m][n];
        return uniqueways(0, 0, m, n, obstacleGrid, dp); 
    }
}