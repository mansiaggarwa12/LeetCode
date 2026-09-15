class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            rev(nums,0);
            return;
        }
        int j = nums.length-1;
        while(nums[j]<=nums[pivot])j--;

        swap(nums,pivot,j);
        rev(nums,pivot+1);
    }
    void swap(int[]nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    void rev(int []nums, int start){
        int left = start ;
        int right = nums.length - 1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
} 