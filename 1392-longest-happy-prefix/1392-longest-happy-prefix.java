class Solution {
    public String longestPrefix(String s) {
        int []lps = new int[s.length()];
        int len = 0;
        for(int i=1;i<s.length();){
            if(s.charAt(i)==s.charAt(len))lps[i++] = ++len;
            else if (len>0)len = lps[len-1];
            else lps[i++] = 0;
        }
        return s.substring(0,lps[s.length()-1]);
    }
}