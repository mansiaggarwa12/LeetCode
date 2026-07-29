class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int a = 0;
        // for(int i=1;i<matrix.length;i++){
        //     if(matrix[i][0]>target && matrix[i-1][0]<target) a = i-1;
        // }
        int top = 0, bottom = matrix.length-1;
        while(top<=bottom){
            int mid = top+(bottom-top)/2;
            if(target<matrix[mid][0])bottom = mid-1;
            else if(target>matrix[mid][matrix[0].length-1])top=mid+1;
            else{
                int left = 0, right = matrix[0].length-1;
                while(left<=right){
                int m = left+(right-left)/2;
                if(matrix[mid][m]==target)return true;
                else if(matrix[mid][m]<target)left = m+1;
                else right = m-1;
        }
        return false;
            }
        }
        return false;
    }
}