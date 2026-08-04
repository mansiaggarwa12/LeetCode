class Solution {
    int solve(int[]nums,int ind, int target,HashMap<String,Integer> dp){
        if(ind == nums.length){
            if(target==0)return 1;
            return 0;
        }
        String s = String.valueOf(ind)+","+String.valueOf(target);
        if(dp.containsKey(s))return dp.get(s);
        int plus = solve(nums,ind+1,target-nums[ind],dp);
        int minus = solve(nums,ind+1,target+nums[ind],dp);
        String newKey = String.valueOf(ind)+","+String.valueOf(target);
        dp.put(newKey,plus+minus);
        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String,Integer> dp = new HashMap<>();
        return solve(nums,0,target,dp);
    }
}