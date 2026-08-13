class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int max = 0;
        for(int i=0;i<boxTypes.length;i++){
            int n = boxTypes[i][0];
            int u = boxTypes[i][1];
            int take = Math.min(n, truckSize);
            max += take * u;
            truckSize -= take;
            if (truckSize == 0) {
                break;
            }
        }
        return max;
    }
}