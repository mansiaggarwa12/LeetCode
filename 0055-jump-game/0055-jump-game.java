class Solution {
    boolean reach(int []nums, int n,int[]dp){
        if(n>=nums.length-1){
            dp[n]=1;
            return true;
        }
        if(dp[n]!=-1){
                
            return dp[n]==1;
            }
        for(int i=1;i<=nums[n];i++){
            
            if( reach(nums,n+i,dp)){
                dp[n] = 1;
                 return true;}
        }dp[n]=0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int []dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return reach(nums,0,dp);
    }
}