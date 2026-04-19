public class DiagonalSum{
    // Brute Force approach- O(n^2)
    public static int diagonalSumBrute(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j || i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }
    // optimized approach - O(n)
    public static int diagonalSumOptimized(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i]; //primary diagonal
            sum+=matrix[i][matrix.length-i-1]; // secondary diagonal
        }
        //if odd matrix,subtract center element once(double counted)
        if(matrix.length%2 == 1){
            sum-=matrix[matrix.length/2][matrix.length/2];
        }
        return sum;
    }

    public static void main (String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println("Brute Force :"+diagonalSumBrute(matrix));

        System.out.println("optimized :"+ diagonalSumOptimized(matrix));
    }
}