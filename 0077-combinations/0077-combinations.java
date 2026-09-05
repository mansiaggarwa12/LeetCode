class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(n,k,1,ans,new ArrayList<>());
        return ans;
    }
    void backtrack(int n, int k, int i, List<List<Integer>> ans, List<Integer> curr){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        int needed = k-curr.size();
        for(int val = i;val<=n-needed+1;val++){
            curr.add(val);
            backtrack(n,k,val+1,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}