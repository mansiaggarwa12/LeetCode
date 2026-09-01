class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0;
        for(int x: nums)total+=x;
        if(total%k!=0)return false;
        int target = total/k;
        Arrays.sort(nums);
        reverse(nums);
        if(nums[0]>target)return false;
        return fill(nums,new boolean[nums.length],k,0,0,target);
    }
    static boolean fill(int []nums, boolean[] used, int bucketsLeft, int start, int current, int target){
        if(bucketsLeft == 1)return true;
        if(current == target)return fill(nums,used,bucketsLeft-1,0,0,target);
        for(int i=start;i<nums.length;i++){
            if(used[i]||current+nums[i]>target)continue;
            used[i]=true;
            if(fill(nums,used,bucketsLeft,i+1,current+nums[i],target))return true;
            
            used[i]=false;
            if(current==0)break;
        }
        return false;
    }
    void reverse(int []nums){
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}