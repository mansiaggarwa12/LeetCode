class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = wage.length;
        Integer [] arr = new Integer[n];
        for(int i=0;i<n;i++)arr[i]=i;
        Arrays.sort(arr,(a,b)->
        Double.compare(
            (double) wage[a]/quality[a],
            (double) wage[b]/quality[b]
        )
        );
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int qSum = 0;
        double ans = Double.MAX_VALUE;
        for(int i:arr){
            pq.add(quality[i]);
            qSum+=quality[i];
            if(pq.size()>k){
                qSum-=pq.poll();
            }
            if(pq.size()==k){ 
                double ratio = (double) wage[i]/quality[i];
                ans = Math.min(ans,qSum*ratio);
            }
        }

        return ans;
    }
}