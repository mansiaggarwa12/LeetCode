class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c))sb.append(c);
        }
        sb.reverse();
        int ptr = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i)))ans.append(s.charAt(i));
            else ans.append(sb.charAt(ptr++));
        }
        return ans.toString();
    }
}