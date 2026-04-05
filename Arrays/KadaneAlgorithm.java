public class KadaneAlgorithm{
    public static void kadane_algorithm(int arr[]){
        int cursum = 0;
        int Maxsum = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            cursum = cursum + arr[i];
            if(cursum<0){
                cursum = 0;
            }
            Maxsum = Math.max(cursum,Maxsum);
        }
        System.out.println("Maxsum is" +" "+ Maxsum);
    }
    public static void main (String args[]){
        int arr[] = {1,-2,6,-1,-3};
        kadane_algorithm(arr);
    }
}