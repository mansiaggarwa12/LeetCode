class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int ans[] = {-1,-1};
        ans[0]=first(nums,target);
        ans[1]=last(nums,target);
        return ans;
    }
    int first(int []arr, int target){
        int n=arr.length;
        int low = 0, high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target==arr[mid]){
                ans = mid;
                high = mid-1;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
            return ans;
    }
    int last(int []arr, int target){
        int n=arr.length;
        int low = 0, high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
       
         if(target == arr[mid]){
            ans = mid;
            low=mid+1;
        }
        else if(target<arr[mid]){
            high = mid-1;
        }
        else low=mid+1;}
        return ans;

    }
}