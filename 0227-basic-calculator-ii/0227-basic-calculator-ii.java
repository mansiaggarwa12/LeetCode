class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        char prev='+';
        for(int i=0;i<=s.length();i++){
            char ch = (i<s.length())?s.charAt(i):'\0';
            if(Character.isDigit(ch))num = num*10+(ch-'0');
            if(!Character.isDigit(ch)&&ch!=' '||i==s.length()){
                if(prev=='+')st.push(num);
                if(prev=='-')st.push(-num);
                if(prev=='*')st.push(st.pop()*num);
                if(prev=='/')st.push(st.pop()/num);
                prev = ch;
                num = 0;
            }
        }
        int res = 0;
        while(!st.isEmpty())res+=st.pop();
        return res;
    }
}