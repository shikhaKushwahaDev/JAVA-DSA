/* Problem: Rotate Array

 Approach : Reverse he entire array,then reverse the first k elements and the remaining elements

 Time Complexity : O(n)
 Space Complexity : O(1)
*/
public class RotateArray{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
     
      // Handle cases where k is greater than the array length
        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
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
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

        for(int num : nums){
          System.out.print(num+" ");
        }
    }
}
