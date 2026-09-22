class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
             if(nums[i]%2==0)nums[i] = 0;
            else nums[i] = 1;
            sum+=nums[i];
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}