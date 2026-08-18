class Solution {
    public List<Integer> partitionLabels(String s) {
        int []   last = new int[26];
        int start = 0, end = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            end = Math.max(end,last[s.charAt(i)-'a']);
            if(i==end){
                ans.add(i-start+1);
                start = i+1;
            }
        }
        return ans;
    }
}