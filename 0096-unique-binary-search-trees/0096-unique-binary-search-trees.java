class Solution {
    public int numTrees(int n) {
        int []dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int node = 2;node<=n;node++){
            for(int root = 1; root<=node;root++){
                int leftNodes = root-1;
                int rightNodes = node-root;
                dp[node] += dp[leftNodes]*dp[rightNodes];
            }
        }
        return dp[n];
    }
}