class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> min = new ArrayDeque<>();
        Deque<Integer> max = new ArrayDeque<>();
        int left = 0;
        int ans = 0;
        for(int right = 0; right<nums.length; right++){
            while(!max.isEmpty() && 
                nums[max.peekLast()]<=nums[right]){
                max.pollLast();
            }
            max.offerLast(right);
            while(!min.isEmpty() && 
                nums[min.peekLast()]>=nums[right]){
                min.pollLast();
            }
            min.offerLast(right);
            while(nums[max.peekFirst()]-nums[min.peekFirst()]>limit){
                if(max.peekFirst()==left){
                    max.pollFirst();
                }
                if (min.peekFirst()==left){
                    min.pollFirst();
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}