class Solution {
    public static int minsum(int i, int j, int m, int n, int grid[][], int dp[][]){
        if(i == m || j == n){
            return Integer.MAX_VALUE;
        }

        if(i == m-1 && j == n-1){
            return grid[i][j];
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }

        dp[i][j] = grid[i][j] + Math.min(minsum(i+1, j, m, n, grid, dp) , minsum(i, j+1, m, n, grid, dp));  

        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];
        return minsum(0, 0, m, n, grid, dp); 
    }
}