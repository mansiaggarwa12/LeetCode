class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    void backtrack(int []nums , List<List<Integer>> ans , List<Integer> curr, int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backtrack(nums,ans,curr,i+1);
        curr.remove(curr.size()-1);
        backtrack(nums,ans,curr,i+1);
    }
}