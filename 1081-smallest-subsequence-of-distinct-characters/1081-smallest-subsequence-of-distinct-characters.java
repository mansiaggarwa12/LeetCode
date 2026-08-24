class Solution {
    public String smallestSubsequence(String s) {
        boolean [] visited = new boolean[26];
        Stack<Character> st = new Stack<>();
        int[]last = new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(visited[ch-'a'])continue;
            while(!st.isEmpty() && st.peek()>ch && last[st.peek()-'a']>i) 
            visited[st.pop()-'a']=false;
            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}