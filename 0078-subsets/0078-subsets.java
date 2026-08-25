class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    void solve(int []nums,int index, List<Integer> path, List<List<Integer>> ans){
        if(nums.length==index){
            ans.add(new ArrayList<>(path));
            return;
        }
        solve(nums,index+1,path,ans);
        path.add(nums[index]);
        solve(nums,index+1,path,ans);
        path.remove(path.size()-1);
    }
}