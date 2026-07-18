public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=n-2;

        while(pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }
        if(pivot>=0){
            int j=n-1;
            while(nums[j]<=nums[pivot]){
                j--;
            }
            int temp=nums[pivot];
            nums[pivot]=nums[j];
            nums[j]=temp;
        }
        reverse(nums,pivot+1,n-1);
    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}