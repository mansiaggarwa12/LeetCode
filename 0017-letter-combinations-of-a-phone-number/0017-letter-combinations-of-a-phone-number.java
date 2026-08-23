class Solution {
    final String []map={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(!digits.isEmpty()){
            backtrack(digits,0,new StringBuilder(),ans);
        }
        return ans;
    }
    void backtrack(String digits, int index, StringBuilder path, List<String> ans){
        if(index==digits.length()){
            ans.add(path.toString());
            return;
        }
        String letters = map[digits.charAt(index)-'0'];
        for(char ch:letters.toCharArray()){
            path.append(ch);
            backtrack(digits,index+1,path,ans);
            path.deleteCharAt(path.length()-1);
        }
    }
}