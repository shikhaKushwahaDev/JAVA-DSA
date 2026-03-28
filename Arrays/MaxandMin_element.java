import java.util.*;

public class MaxMin_element{
    public static void main (String args[]){
        int num[] = {2,5,1,9,3};

        int max = num[0];
        int min = num[0];

        for(int i=0; i<num.length; i++){
            if(max<num[i]){
                max=num[i];
            }
            if(min>num[i]){
                min=num[i];
            }
        } 
        System.out.println("Maximum element is"+" " +max);
        System.out.println("Minimum element is"+" "+min);
    }
}