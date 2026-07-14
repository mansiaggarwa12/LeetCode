class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int []low = new int[n];
        int []eq = new int[n];
        int []high = new int[n];
        int l=0, e = 0, h=0;
        for(int i:nums){
            if(i<pivot)low[l++]=i;
            else if (i==pivot)eq[e++]=i;
            else high[h++]=i;
        }
        int c =0;
        for(int i=0;i<l;i++){
            nums[c++]=low[i];
        }
        for(int i=0;i<e;i++){
            nums[c++]=eq[i];
        }
        for(int i=0;i<h;i++){
            nums[c++]=high[i];
        }
        return nums;
    }
}