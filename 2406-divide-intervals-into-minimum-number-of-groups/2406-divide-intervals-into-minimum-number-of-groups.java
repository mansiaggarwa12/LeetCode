class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        PriorityQueue<Integer> ends = new PriorityQueue<>();
        for(int []in : intervals){
            if(!ends.isEmpty() && ends.peek()<in[0])ends.poll();
            ends.offer(in[1]);
        }
        return ends.size();
    }
}