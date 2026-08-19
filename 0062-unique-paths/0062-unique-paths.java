class Solution {
    public int uniquePaths(int rows, int cols) {
        int [][] dp = new int [rows][cols];
        for(int r=0;r<rows;r++){
            dp[r][0]=1;
        }
        for(int c=0;c<cols;c++){
            dp[0][c]=1;
        }
        for(int r=1;r<rows;r++){
            for(int c=1;c<cols;c++){
                dp[r][c]=dp[r-1][c]+dp[r][c-1];
            }
        }
        return dp[rows-1][cols-1];
    }
}