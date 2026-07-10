public class Solution {
    public static int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            
            int prevMax=max;
            int prevMin=min;
            
            max=Math.max(curr,Math.max(curr*prevMax,curr*prevMin));

            min=Math.min(curr,Math.min(curr*prevMax,curr*prevMin));
            
            ans=Math.max(max,ans);
            
        }
        return ans;
    }
    public static void main(String args[]){
        int []nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}