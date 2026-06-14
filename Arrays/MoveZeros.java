public class MoveZeros{
    // Moves all zeroes to the end while preserving the order of non-zero elements  
    // Time complexity :  O(n)
    // Space complexity : O(1)
    public static void move_zeros(int arr[]){
        int j = 0; //postion for non zero element
        
        for(int i=0; i<arr.length; i++){
            // Place non-zero elements at the front
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
