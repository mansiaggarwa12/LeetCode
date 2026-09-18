class Solution {
    public double myPow(
        double x, int n) {
        double ans = 1;
        long power = n;
        if(power<0){
            power=-power;
            x=1/x;
        }
        while(power>0){
            if(power%2==1)ans = ans*x;
            x*=x;
            power/=2;
        }
        return ans;
    }
}