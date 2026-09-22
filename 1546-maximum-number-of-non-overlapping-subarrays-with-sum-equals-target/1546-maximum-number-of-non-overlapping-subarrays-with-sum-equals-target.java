class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int res =0;
        int r = -2;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum-target) && r<=map.get(sum-target)){
                res++;
                r = i;
            }
            map.put(sum,i);
        }
        return res;
    }
}