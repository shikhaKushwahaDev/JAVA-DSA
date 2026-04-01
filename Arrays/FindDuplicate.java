import java.util.*;

public class FindDuplicate{
    public static int find_duplicate(int arr []){

        for(int i=0;i<arr.length;i++){
            // keep swapping until the number is at coorect index
            while(arr[i] != i+1){
                // if the correct index already has the same numbers then it is duplicate
                if(arr[i] == arr[arr[i]-1]){
                    return arr[i];
                }
                // swap arr[i]with arr[arr[i]-1]
                int temp = arr[i];
                arr[i] = arr[temp -1];
                arr[temp -1] = temp;
            }
        }
        // if no duplicate found
        return -1;
    }
    public static void main (String args[]){
        int arr[] = {3,1,3,4,2};

        int duplicate = find_duplicate(arr);

        if(duplicate == -1){
            System.out.println("not duplicate found");
        }else{
            System.out.println("Duplicate :" +" "+ duplicate);
        }
    }
}