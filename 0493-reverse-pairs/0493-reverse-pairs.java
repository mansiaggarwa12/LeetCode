class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    int countPairs(int []nums, int low, int mid, int high){
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>2L*nums[j])j++;
            count+=j-(mid+1);
        }
        return count;
    }
    int mergeSort(int []nums, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            int count = 0;
            count+=mergeSort(nums,low,mid);
            count+=mergeSort(nums,mid+1,high);
            count+=countPairs(nums,low,mid,high);
            int [] temp = new int [nums.length];
            merge(nums,low,mid,high,temp);
            return count;
        }
        return 0;
    }
    void merge(int []nums, int low, int mid, int high, int[]temp){
        int i=low,j=mid+1,k=low;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[k++] = nums[i++];
            }
            else temp[k++] = nums[j++];
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=high){
            temp[k++] = nums[j++];
        }
        for(int a = low; a <= high; a++){
            nums[a] = temp[a];
        }
    }
}