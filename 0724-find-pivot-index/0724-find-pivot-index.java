class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int a:nums){
            totalSum+=a;
        }
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum)return i;
            leftSum +=nums[i];
        }
        return -1;
        
    }
}