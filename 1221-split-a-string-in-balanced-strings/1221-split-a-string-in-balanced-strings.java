class Solution {
    public int balancedStringSplit(String s) {
        int bal = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')bal++;
            else bal--;
            if(bal==0)count++;
        }
        return count;
    }
}