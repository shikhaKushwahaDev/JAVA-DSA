import java.util.*;

public class BinomialCoefficient{
    public static int Calfactorial(int n){
        int f=1;
        for(int i=1; i<=n ; i++){
            f=f*i;
        }
        return f;
    }
    public static int Calbincoeff(int n,int r){
        int fac_n = Calfactorial(n);  
        int fac_r = Calfactorial(r);
        int fac_nmr = Calfactorial(n-r);

        int bincoeff = fac_n/(fac_r*fac_nmr);

        return bincoeff;
    }
    public static void main (String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.print(Calbincoeff(a,b));
    }
}