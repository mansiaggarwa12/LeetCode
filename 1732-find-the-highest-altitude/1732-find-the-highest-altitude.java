class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[]pre = new int[n+1];
        pre[0]=0;
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+gain[i-1];
        }
        int max = pre[0];
        for(int i:pre){
            if(i>max)max =i;
        }
        return max;
    }
}