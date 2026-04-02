public class PairsInArray{
    public static void printpairs(int arr[]){
        int n = arr.length;
        int totalpairs = 0;

        for(int i=0;i<n;i++){
            int current = arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.print("Total pairs :"+ totalpairs);
    }
    public static void main (String args[]){
        int arr[] = {2,4,6,8,10};
        printpairs(arr);
    }
}