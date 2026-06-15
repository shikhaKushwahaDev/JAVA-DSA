public class Fibonacci{
    // Basic Recursion
    // Time Complexity : O(2^n)
    public static int fibonacciBasic(int n){
        // base case 
        if (n==0|| n==1){
            return n;
        }
        // Recursive Call
        return fibonacciBasic(n-1)+ fibonacciBasic(n-2);
    }
    public static void main (String [] args){
        int n = 11;
        System.out.println(fibonacciBasic(n));
    } 
}