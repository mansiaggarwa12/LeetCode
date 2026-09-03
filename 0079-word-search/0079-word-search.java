class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean [][] visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dfs(i,j,0,word,board,visited))return true;
            }
        }
        return false;
    }
    boolean dfs(int r, int c, int i,String word, char[][]board,boolean[][]visited){
        if(i==word.length())return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || word.charAt(i)!=board[r][c]|visited[r][c])return false;
        visited[r][c]=true;
        boolean res = dfs(r+1,c,i+1,word,board,visited)||
                      dfs(r-1,c,i+1,word,board,visited)||
                      dfs(r,c+1,i+1,word,board,visited)||
                      dfs(r,c-1,i+1,word,board,visited);
        visited[r][c]=false;
        return res;
    }
}