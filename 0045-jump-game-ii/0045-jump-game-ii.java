class Solution {
    int reach(int[]nums, int idx, int[]dp){
        int min = Integer.MAX_VALUE;
        if(idx>=nums.length-1){
            
            return 0;
        }
        if(dp[idx]!=-1)return dp[idx];
        for(int i=1;i<=nums[idx];i++){
        int ans = reach(nums,idx+i,dp);

            if(ans!=Integer.MAX_VALUE)
            min = Math.min(ans+1,min);
        }
            dp[idx] = min;

        return dp[idx];
    }
    public int jump(int[] nums) {
        int []dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return reach(nums,0,dp);
    }
}