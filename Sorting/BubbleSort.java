/** Problem : Bubble Sort

    Time Complexity:
    Best:O(n)
    worst:O(n^2)
    
    Space Complexity:O(1)
    */
public class BubbleSort{
    public static void modifiedBubble_sort(int arr[]){
        int n = arr.length;

        // Outer loop for passes 
        for(int i=0;i<n-1;i++){
            boolean swapped = false; // Track if any swap happens
            
             for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped=true;
                }
            }
            // Stop if array is already sorted
            if(swapped==false){
                break;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        modifiedBubble_sort(arr);
        printArr(arr);
    }
}
