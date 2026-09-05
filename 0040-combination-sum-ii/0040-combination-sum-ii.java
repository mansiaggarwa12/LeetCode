class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int []arr, int target, int ind, List<Integer> path, List<List<Integer>> ans)
    {
        if(target == 0){
            ans.add(new ArrayList<>(path));
            return ;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            path.add(arr[i]);
            backtrack(arr,target-arr[i],i+1,path,ans);
            path.removeLast();
        }
    }
}