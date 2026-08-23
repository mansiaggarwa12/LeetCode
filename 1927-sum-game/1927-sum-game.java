class Solution {
    public boolean sumGame(String num) {
        int c1 = 0, c2 = 0, s1 = 0, s2 = 0;
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
            if(i<num.length()/2){
                if(c=='?')c1++;
                else s1+=c-'0';
            }
            else{
                if(c=='?')c2++;
                else s2+=c-'0';
            }
        }
        return (c1+c2)%2==1 || s1-s2!=9*(c2-c1)/2;
    }
}