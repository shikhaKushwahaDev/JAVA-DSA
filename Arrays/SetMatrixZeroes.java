/** Problem : Set Matrix Zeroes
 * 
 * Time Complexity : O(m*n)
 * Space Complexity : O(m+n)
 */
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] r =new int[m];
        int[] c= new int[n];
        // Start from the first element
        int j=0;
        int i=0;
        // If currrent element is 0, mark its row and column
        while(i<m && j<n){
           if( matrix[i][j]==0){
               r[i]=1;
               c[j]=1;
            }  
            j++; // Move to the next column

            // If end of the row is reached, move to the next row
            if(j==n){
             j=0;
             i++;
            }
        }
        // Reset indices for second traversal       
        i=0;
        j=0;
        // Second traversal: Set elements to 0 if their row or column is marked
        while(i<m && j<n){
            if(r[i]==1 || c[j]==1){
              matrix[i][j]=0;
            }
            // Move to the next column
            j++;
            // If end of the row is reached, move to the next row
            if(j==n){
                j=0;
                i++;
            }
        }
        
    }
    public static void main (String args[]){
        int[][] matrix= {{1,1,1},
                          {1,0,1,},
                          {1,1,1}
                        };
        setZeroes(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
           System.out.println();
        }
        
    }
}
