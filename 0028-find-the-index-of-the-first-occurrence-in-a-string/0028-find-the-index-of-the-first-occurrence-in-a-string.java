class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<=h.length()-n.length();i++){
            if(check(h,n,i,0))return i;

        }
        return -1;
    }
    boolean check(String h, String n, int i, int j){
        if(j==n.length())return true;
        if(h.charAt(i)!=n.charAt(j))return false;
        return check(h,n,i+1,j+1);
    }
}