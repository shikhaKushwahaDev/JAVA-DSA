public class Power{
    public static int power(int x,int n){
        // Base case
        if(n==0){
            return 1;
        }
        // Recursive call
        int halfpower = power(x,n/2);

        // Square the half result
        int halfpowersq = halfpower * halfpower;
        
        // if n is odd,multiply one more x
        if(n%2 != 0){
            halfpowersq = x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String [] args){
        System.out.println(power(2,10));
    }
}