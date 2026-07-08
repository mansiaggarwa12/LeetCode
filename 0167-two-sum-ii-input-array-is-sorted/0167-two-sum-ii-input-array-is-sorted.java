class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0, right = n-1;
        while(left<right){
            int s = numbers[left]+numbers[right];
            if(s==target){
                return new int[]{left+1,right+1};
            }
            if(s<target)left++;
            else right--;
        }
        return new int[]{};
    }
}