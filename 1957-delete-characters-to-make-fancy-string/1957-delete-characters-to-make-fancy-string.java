class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = '#' , pToprev = '$';
        for(int i=0;i<s.length();i++){
            if(prev == pToprev && s.charAt(i)==prev)continue;
            else sb.append(s.charAt(i));
            pToprev = prev;
            prev = s.charAt(i);
        }
        return sb.toString();
    }
}