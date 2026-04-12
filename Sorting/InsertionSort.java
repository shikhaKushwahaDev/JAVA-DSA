public class InsertionSort{
    public static void insertion_sort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int cur = arr[i];
            int prev= i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]= cur;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        printArr(arr);
    }
}