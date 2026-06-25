/** Merge sort 
 * 
 * Time Complexity: O(n logn)
 * Space Complexity:O(n)
 */
public class MergeSort{
    // Function to divide the array into smaller subarrays
    public static void mergeSort(int arr[], int si , int ei){
        // Base case
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        // Sort left half
        mergeSort(arr,si,mid);

        // Sort right half
        mergeSort(arr,mid+1,ei);
        
        // Merge both sorted halves
        merge(arr,si,mid,ei);
    }
    // Function to merge two sorted merged elements
    public static void merge(int arr[],int si,int mid,int ei){

        // Temporary array to store merged elements
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        // Compare elements and store smaller one in temp
        while(i<=mid && j<=ei){ 
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // copy remaining elements of left subarray
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // copy remaining elements of right subarray
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // Copy merged elements back to original array
        for(k=0, i=si;k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]={6,3,9,5,2,8,-2};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}