public class findMissingAndRepeatedValues{
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid[0].length;
        int n=m*m;

        long expectedSum=1L*n*(n+1)/2;
        long sqSum=1L*n*(n+1)*(2L*n+1)/6;

        long actualSum=0;
        long actualSqSum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
               actualSum+=grid[i][j];
               actualSqSum+=1L*grid[i][j]*grid[i][j];
            }
        }
        long diff=expectedSum-actualSum;
        long sqDiff=sqSum-actualSqSum;
        
        long sum=sqDiff/diff;
        long missing=(diff+sum)/2;
        long repeated=missing-diff;

        return new int[]{(int)repeated,(int)missing};
    }
}