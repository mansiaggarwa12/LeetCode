class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean []used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),used,ans);
        return ans;
    }
    void backtrack(int []nums ,List<Integer> path, boolean[]used,List<List<Integer>>ans ){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1])continue;
            if(used[i])continue;
            used[i]=true;
            path.add(nums[i]);
            backtrack(nums,path,used,ans);
            path.removeLast();
            used[i] = false;
        }
    }
}