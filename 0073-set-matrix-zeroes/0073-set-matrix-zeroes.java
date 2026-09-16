class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColZero = false;
        int n = matrix.length;
        int w = matrix[0].length;
        for(int i=0;i<n;i++){
                if(matrix[i][0]==0){
                    firstColZero=true;
                }
        }
        for(int i=0;i<w;i++){
                if(matrix[0][i]==0){
                    firstRowZero=true;
                }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<w;j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<w;j++){
                if(matrix[i][0]==0){
                    matrix[i][j] = 0;
                } 
                if(matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowZero){
            for(int i=0;i<w;i++){
                matrix[0][i] = 0;
            }
        }
        if(firstColZero){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
    }
}