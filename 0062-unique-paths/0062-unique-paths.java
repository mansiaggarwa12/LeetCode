class Solution {
    public int uniquePaths(int rows, int cols) {
        int [] dp = new int[cols];
        for(int c=0;c<cols;c++)dp[c]=1;
        for(int r=1;r<rows;r++){
            for(int c=1;c<cols;c++){
                dp[c] = dp[c] + dp[c-1];
            }
        }
        return dp[cols-1];
    }
}