public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] r =new int[m];
        int[] c= new int[n];

        int j=0;
        int i=0;
        while(i<m && j<n){
           if( matrix[i][j]==0){
               r[i]=1;
               c[j]=1;
            }  
            j++;
            if(j==n){
             j=0;
             i++;
            }
        }
        i=0;
        j=0;
        while(i<m && j<n){
            if(r[i]==1 || c[j]==1){
              matrix[i][j]=0;
            }
            j++;
            
            if(j==n){
                j=0;
                i++;
            }
        }
        
    }
}
