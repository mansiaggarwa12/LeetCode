class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s,0,0,new StringBuilder(),ans);
        return ans;
    }
    static void backtrack(String s, int index, int parts, StringBuilder path, List<String> ans){
        if(parts==4){
            if(index==s.length())ans.add(path.substring(0,path.length()-1));
            return ;
        }
        int remChar = s.length()-index;
        int remParts = 4-parts;
        if(remChar<remParts||remChar>3*remParts)return ;
        int val = 0;
        for(int end = index; end<s.length()&&end<index+3;end++){
            if(end>index && s.charAt(index)=='0')break;
            val = val*10+(s.charAt(end)-'0');
            if(val>255)break;
            int oldLen = path.length();
            path.append(val).append('.');
            backtrack(s,end+1,parts+1,path,ans);
            path.setLength(oldLen);
        }
    }
}