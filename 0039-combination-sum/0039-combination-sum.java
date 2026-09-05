class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    void solve(int []arr, int target, int index, List<Integer> path, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(path));
            return ;
        }
        for(int i=index;i<arr.length;i++){
            if(target>0){
                path.add(arr[i]);
                solve(arr,target-arr[i],i,path,ans);
                path.removeLast();
            }
        }
    }
}