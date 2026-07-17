// Problem : Game of life
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)

public class GameOfLife{
    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] next=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                //top
                if(i-1>=0 && board[i-1][j]==1){
                    count++;
                }
                // bottom
                if(i+1<m && board[i+1][j]==1){
                   count++;
                }
                // left
                if(j-1>=0 && board[i][j-1]==1){
                    count++;
                }
                // right
                if(j+1<n && board[i][j+1]==1){
                    count++;
                }
                // top left
                if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1){
                    count++;
                }
                // top right
                if(i-1>=0 && j+1<n && board[i-1][j+1]==1){
                    count++;
                }
                // bottom left
                if(i+1<m && j-1>=0 && board[i+1][j-1]==1){
                    count++;
                }
                // bottom right
                if(i+1<m && j+1<n && board[i+1][j+1]==1){
                    count++;
                }
                if(board[i][j]==1){
                    if(count<2){
                        next[i][j]=0;
                    }else if(count==2 || count==3){
                        next[i][j]=1;
                    }else{
                        next[i][j]=0;
                    }
                }else{
                    if(count==3){
                        next[i][j]=1;
                    }else{
                        next[i][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=next[i][j];
            }
        }  

    }
}