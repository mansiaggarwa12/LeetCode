class Solution {
    public int longestCommonSubsequence(String a, String b) {
        if(b.length()>a.length()) {String temp = a; a=b; b= temp;}
        int[]dp = new int[b.length()+1];
        for(int i=1;i<=a.length();i++){
            int diagonal = 0;
            for(int j=1;j<=b.length();j++){
                int oldTop = dp[j];
                if(a.charAt(i-1)==b.charAt(j-1))dp[j]=diagonal+1;
                else dp[j] = Math.max(dp[j],dp[j-1]);
                diagonal=oldTop;
            }
        }
        return dp[b.length()];
    }
}