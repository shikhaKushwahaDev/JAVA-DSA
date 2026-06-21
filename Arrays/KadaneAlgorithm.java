public class KadaneAlgorithm{
    // Function to Find the maximum subarray sum
    public static void kadane_algorithm(int arr[]){
        int cursum = 0;
        int Maxsum = Integer.MIN_VALUE;

        // Traverse the array
        for(int i=0;i<arr.length;i++){
            cursum = cursum + arr[i]; // Add current element
            Maxsum = Math.max(cursum,Maxsum);  // Update maximum sum

            // If current sum becomes negative ,reset it 
            if(cursum<0){
                cursum = 0;
            }
        }
        System.out.println("Maxsum is" +" "+ Maxsum);
    }
    public static void main (String args[]){
        int arr[] = {1,-2,6,-1,-3};
        kadane_algorithm(arr);
    }
}
// Time Complexity:O(n)
// Space Complexity:O(1)
