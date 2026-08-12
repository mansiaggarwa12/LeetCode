class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0, right = 0;
        int max = Integer.MIN_VALUE;
        int n= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = 0;
        while(right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            len++;
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                len--;
                left++;

            }
            max = Math.max(max,len);
            right++;
        }
        return max;
    }
}