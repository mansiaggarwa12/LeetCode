import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int currDiff = Math.abs(sum-target);
                if(currDiff<diff){
                    ans = sum;
                    diff = currDiff;
                }
                int sign = sum-target;
                if(sign<0)j++;
                else k--;
            }
        }
        return ans;
    }
}