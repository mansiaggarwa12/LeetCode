class Solution {
    public int minTaps(int n, int[] ranges) {
        int []f = new int[n+1];//f=farthest
        for(int i=0;i<=n;i++){
            int left = Math.max(0,i-ranges[i]);
            int right = Math.min(n,i+ranges[i]);
            f[left] = Math.max(f[left],right);
        }
        int taps = 0, curr = 0, nextEnd = 0;
        for(int point = 0; point<n;point++){
            nextEnd = Math.max(nextEnd,f[point]);
            if(point==curr){
                if(nextEnd<=point)return -1;
                taps++;
                curr = nextEnd;
            }
        }
        return taps;
    }
}