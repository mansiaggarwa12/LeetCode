class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)return true;
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')st.push(c);
            else{
                if(st.isEmpty())return false;
                if(c==')' && st.peek()!='(')return false;
                if(c=='}' && st.peek()!='{')return false;
                if(c==']' && st.peek()!='[')return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}