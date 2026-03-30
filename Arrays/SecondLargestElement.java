import java.util.*;

public class SecondLargestelement{
    public static int second_largest(int arr[]){
        int largest = arr[0];
        int secondlargest = -1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest = arr[i]; 
            }
        }
        return secondlargest;
    }
    public static void main (String args []){
        int arr[] = {4,2,9,9,7};

        int result = second_largest(arr);
        if(result == -1){
            System.out.println("second largest not found ");
        }else{
            System.out.println("second largest element : "+" "+result);
        }
    }
}