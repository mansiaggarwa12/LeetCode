class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips,(a,b)->{
            if(a[0]!=b[0])return Integer.compare(a[0],b[0]);
            return Integer.compare(b[1],a[1]);
        });
        int used = 0, i=0;
        int curr = 0, farthest = 0;
        while(curr<time){
            while(i<clips.length && clips[i][0]<=curr){
                farthest = Math.max(farthest,clips[i][1]);
                i++;
            }
            if(farthest == curr )return -1;
            used++;
            curr = farthest;
        }
        return used;
    }
}