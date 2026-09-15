class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int []> al = new ArrayList<>();
        int currStart = intervals[0][0], currEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(currEnd>=start){
                currEnd = Math.max(currEnd,end);
            }
            else {
                al.add(new int[]{currStart,currEnd});
                currStart = start;
                currEnd = end;
            }
        }
        al.add(new int[]{currStart, currEnd});
        return al.toArray(new int[0][]);
    }
}