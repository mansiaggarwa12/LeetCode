class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int [] dp = new int[cols];
        dp[0] = grid[0][0];
        for(int c=1;c<cols;c++){
            dp[c] = dp[c-1] + grid[0][c];
        }
        for(int r=1; r<rows; r++){
            dp[0]+=grid[r][0];
            for(int c=1;c<cols;c++){
                dp[c] = grid[r][c] + Math.min(dp[c],dp[c-1]);
            }
        }
        return dp[cols-1];
    }
}