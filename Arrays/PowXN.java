public class PowXN{
    // Function to calculate x^n
    // Time Complexity : o(logn)
    // Space complexity : O(1)
    public static double myPow(double x, int n) {
        long power=n;
        
        if(power<0){
            x=1/x;
            power=-power;
        }
        double ans=1;
        while(power>0){
            if(power%2==1){
              ans=ans*x;
            }
            x=x*x;
            power=power/2;
        }
        return ans;
    }
    public static void main(String args[]){
        double x=2.0;
        int n=10;
        System.out.println(myPow(x,n));
    }
}