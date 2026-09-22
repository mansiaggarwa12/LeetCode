class Solution {
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;
        for(int m:nums){
            int take = m+prev2;
            int skip = prev1;
            int curr = Math.max(take,skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}