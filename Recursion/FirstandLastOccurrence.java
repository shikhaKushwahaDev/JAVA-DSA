public class FirstandLastOccurrence{
    // Finds the first occurrence of key in the array
    public static int firstOccurrence(int arr[],int key, int i){
        // base case
        if(i==arr.length){
            return -1;
        }
        // if current element matches the key, return its index 
        if(arr[i]==key){
            return i;
        }
        // recursively search in the remainning array
        return firstOccurrence(arr,key,i+1);
    }
    // Finds the last occurrence of key in the array
    public static int lastOccurrence(int arr[],int key,int i){
        // Base case
         if(i==arr.length){
            return -1;
        }
        // Recursively search in the remianing array first
        int isFound = lastOccurrence(arr,key,i+1);

        // if key is not found ahead and current element matches
        // current index is the last occurrence
        if(isFound ==-1 && arr[i]==key){
            return i;
        }
        // otherwise,return the index found is deeper recursive calls
        return isFound;
    }
    public static void main (String [] args){
        int arr[] ={8,3,6,9,5,10,2,5,3};
        System.out.println("First Occuernce at index"+ " " +firstOccurrence(arr,5,0));
        System.out.println("Last Occuernce at index"+ " " +lastOccurrence(arr,5,0));
    }
}