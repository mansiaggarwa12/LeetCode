class Solution {
    public int mySqrt(int x) {
        if (x<2) return x;
        int left = 1, right = x/2;
        int mid = -1;
        while(left<=right)
        { mid = left+(right-left)/2;
        long s = (long)mid*mid;
            if(s== x)return mid;
        else if(s<x)left = mid+1;
        else right = mid-1;}
        return right;
    }
}