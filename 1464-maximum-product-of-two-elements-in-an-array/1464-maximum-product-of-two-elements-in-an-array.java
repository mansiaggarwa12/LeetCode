class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int n:nums){
            if(n>max){
                max2=max;
                max = n;
                }
            else if(n>max2)max2 = n;
        }
        return (max-1)*(max2-1);
    }
}