import java.util.*;

public class BinarytoDecimal{
    public static void bintodec(int binnum){
        int num = binnum;
        int power = 0;
        int decimal = 0;

        while(binnum>0){
            int lastdigit= binnum % 10;
            decimal= decimal+ lastdigit * (int) Math.pow(2,power);
            power++;
            binnum= binnum/10;
        }
        System.out.println("decimal of "+ num + " = " + decimal);
    } 
    public static void main(String args[]){
        Scanner Sc = new Scanner (System.in);
        int binarynum= Sc.nextInt();
        bintodec(binarynum);
    }
}