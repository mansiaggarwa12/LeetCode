class Solution {
    public int[] findErrorNums(int[] nums) {
        long sum = 0, sqSum = 0;
        long n = nums.length;
        long aSum = n*(n+1)/2;
        long aSqSum = n*(n+1)*(2*n+1)/6;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            sqSum+=(long)nums[i]*nums[i];
        }
        long diff = aSum - sum;
        long sqDiff = aSqSum - sqSum;
        long rplusm = sqDiff/diff;
        long missing = (diff+rplusm)/2;
        long rep = (rplusm-diff)/2;
        return new int[]{(int)rep,(int)missing};
    }

}