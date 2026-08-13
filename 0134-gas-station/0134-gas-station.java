class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tank = 0;
        int start = 0;
        for(int i=0;i<n;i++){
            if(gas[i]+tank>=cost[i]){
                tank += gas[i]-cost[i];
            }
            else {
                tank = 0;
                start = i+1;
            } 
        }
        int total = 0;
        for(int i=0;i<n;i++){
            total += gas[i] - cost[i];
        }
        if(total<0)return -1;
        return start;
    }
}