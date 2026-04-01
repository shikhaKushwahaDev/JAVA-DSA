public class LeftRotate{
    public static void reverse(int arr[], int first, int end){
        while(first<end){
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;

            first++;
            end--;
        }
    }
    public static void left_rotate(int arr[],int k){
        int n = arr.length;
        k = k % n;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int key = 2;

        left_rotate(arr,key);
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}