class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans =  new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),ans);
        return ans;
    }

    static void backtrack(int n, int k, int start, List<Integer> path, List<List<Integer>> ans){
        if(path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        int needed = k-path.size();
        for(int value = start ;value<=n-needed+1;value++){
            path.add(value);
            backtrack(n,k,value+1,path,ans);
            path.remove(path.size()-1);
        }
    }
}