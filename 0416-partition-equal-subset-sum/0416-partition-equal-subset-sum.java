class Solution {
    boolean canPartition(int[] nums, int idx, int target,Boolean [][]dp) {
        if (target == 0)
            return true;
        if (idx == nums.length || target < 0)
            return false;
        if(dp[idx][target]!=null)return dp[idx][target];
        return dp[idx][target]=canPartition(nums, idx + 1, target,dp) ||
               canPartition(nums, idx + 1, target - nums[idx],dp);
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums)
            total += n;
        if (total % 2 != 0)
            return false;
        int target = total/2;
        Boolean[] []dp = new Boolean[nums.length][target+1];
        return canPartition(nums, 0, target, dp);
    }
}