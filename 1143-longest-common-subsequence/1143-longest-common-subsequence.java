class Solution {
    int fxn(String s1, String s2, int i, int j, int [][]dp){
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return dp[i][j] = 1+fxn(s1,s2,i-1,j-1,dp);
        return dp[i][j] = Math.max(fxn(s1,s2,i-1,j,dp),fxn(s1,s2,i,j-1,dp));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int [][]dp = new int[n][m];
for (int[] row : dp) {
    java.util.Arrays.fill(row, -1);
}        return fxn(s1,s2,n-1,m-1,dp);
    }
}