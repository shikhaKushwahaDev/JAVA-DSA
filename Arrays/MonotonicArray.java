// Problem : Monotonic Array

// Time Complexity : O(n)
// Space Complexity : O(1)
public class MonotonicArray{
    public static boolean isMonotonic(int[] nums) {
       
        boolean isInc=true;
        boolean isDec=true;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]<nums[j+1]){
               isDec=false;
            }
            else if(nums[j]>nums[j+1]){
                isInc=false;
            }
        }
        boolean monotone= isInc || isDec;
        return monotone;
    }
    public static void main (String args[]){
        int[] nums={6,5,4,4};
        System.out.println(isMonotonic(nums));
    }
}