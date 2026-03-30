import java.util.*;

public class MoveZeros{
    public static void move_zeros(int arr[]){
        int j = 0; //postion for non zero element
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main (String args[]){
        int arr[] = {0,1,0,3,12};

        move_zeros(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}