// Problem : Word Search
// Time Complexity : O(m*n*4^L)
// Space Complexity : O(m*n+L)
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n= board[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(check(board,word,i,j,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean check(char[][] board,String word,int row, int col,int index,boolean[][]visited){
        if(index==word.length()){
            return true;
        }
        if(row<0|| row>=board.length||col<0||col>=board[0].length){
            return false;
        }
        if(visited[row][col]|| board[row][col]!=word.charAt(index)){
            return false;
        }
        visited[row][col]=true;

        boolean found=check(board,word,row-1,col,index+1,visited)||
        check(board,word,row+1,col,index+1,visited)|| 
        check(board,word,row,col-1,index+1,visited)||
        check(board,word,row,col+1,index+1,visited);

        visited[row][col]=false;
        return found;

    }
    public static void main(String args[]){
        char[][] board={{'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}};
        String word="ABCCED";
        System.out.println("Word Found:"+exist(board,word));
    }
}