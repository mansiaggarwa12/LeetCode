class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,Comparator.comparingInt(a->a[0]));
        int ans = 0;
        int day = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        while(i<events.length || !pq.isEmpty()){
            if(pq.isEmpty())day=events[i][0];
            while(i<events.length && events[i][0]<=day){
                pq.offer(events[i][1]);
                i++;
            }
            while(!pq.isEmpty()&&pq.peek()<day)pq.poll();
            if(!pq.isEmpty()){
                pq.poll();
                ans++;
                day++;
            }
        }
        return ans;
    }
}