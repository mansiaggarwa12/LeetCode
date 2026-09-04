class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean []used = new boolean[nums.length];
        backtrack(nums,used,ans,new ArrayList<>());
        return ans;
    }
    void backtrack(int[]nums, boolean[]used,List<List<Integer>> ans,List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            curr.add(nums[i]);
            used[i]=true;
            backtrack(nums,used,ans,curr);
            curr.remove(curr.size()-1);
            used[i] = false;
        }
    }
}