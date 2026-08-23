class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(n,0,0,new StringBuilder(), ans);
        return ans;
    }
    void backtrack(int n, int open, int close, StringBuilder path, List<String> ans){
        if(path.length()==2*n){
            ans.add(path.toString());
            return;
        }
        if(open<n){
            path.append('(');
            backtrack(n,open+1,close,path,ans);
            path.deleteCharAt(path.length()-1);
        }
        if(close<open){
            path.append(')');
            backtrack(n,open,close+1,path,ans);
            path.deleteCharAt(path.length()-1);
        }
    }
}