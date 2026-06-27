// Quick sort
// Time Complexity:
// Best case: O(n log n)
// Worst Case: O(n^2)

// Space Complexity:
// O(logn)-Recursive stack(average)
// O(n)- Worst case
public class QuickSort{
    // Function to perform Quick sort
    public static void quickSort(int arr[],int si, int ei){
        // Base Case
        if(si>=ei){
            return;
        }
        int pIdx= partition(arr,si,ei);
        // sort left part
        quickSort(arr,si,pIdx-1);
        // sort right part
        quickSort(arr,pIdx+1,ei);
    }
    // Place the pivot at correct position
    public static int partition(int arr[],int si,int ei){
        int pivot= arr[ei];
        int i=si-1;
         
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        
        return i;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= {6,3,9,8,2,5,-2};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
