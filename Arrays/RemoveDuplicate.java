public class RemoveDuplicate{
    public static int removeduplicate(int arr[]){
        if(arr.length ==0){
            return 0;
        }
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,4,4};

        int newlength = removeduplicate(arr);

        System.out.println("New length :"+ newlength);
        System.out.print("Array :");
        for(int k=0;k<newlength;k++){
            System.out.print(arr[k]+" ");
        }
    }
}