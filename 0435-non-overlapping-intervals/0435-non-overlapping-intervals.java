class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)return 0;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
        int kept = 1;
        int last = intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=last){
                kept++;
                last = intervals[i][1];
            }
        }
        return intervals.length-kept;
    }
}