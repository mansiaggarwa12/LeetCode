class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int sum = 0;
        while (n>0){
            int digit= n%10;
            sum=sum*10+digit;
            n/=10;
        }
        if (x==sum){
            return true;
        }
        else{
            return false;
        }
    }
}