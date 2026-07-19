// Problem : Next Permuttion
// Time Complexity : O(n)
// Space Complexity : O(1)
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=n-2;
        // Find the pivot
        while(pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }
        // Find the Smallest element greater than the pivot
        if(pivot>=0){
            int j=n-1;
            while(nums[j]<=nums[pivot]){
                j--;
            }
            int temp=nums[pivot];
            nums[pivot]=nums[j];
            nums[j]=temp;
        }
        // Reverse the suffix
        reverse(nums,pivot+1,n-1);
    }
    // Function to reverse a part of the array
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int[] nums={1,2,3};
        nextPermutation(nums);

        for(int num : nums){
            System.out.print(num +" ");
        }
    }
}