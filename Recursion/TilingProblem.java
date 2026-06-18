public class TilingProblem{
    // Fuction to count the number of ways to tile a 2*n floor
    public static int tilingProblem(int n){
        // Base case
        if(n==0 || n==1){
            return 1;
        }
        // Vertical placement
        int verticalWays = tilingProblem(n-1);

        // Horizontal placement
        int horizontalWays = tilingProblem(n-2);

        // Total ways
        return verticalWays + horizontalWays;
    }
    public static void main (String [] args){
        int n=4;
        System.out.println(tilingProblem(n));
    }
}