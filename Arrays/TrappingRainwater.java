public class TrappingRainwater{
    // By Prefix and Suffix method
    // Time complexity:O(n)
    // Space complexity:O(n)
    public static int trapped_rainwater(int height[],int width[]){
        int n = height.length;
        if( n==0 || width.length != n){
            return 0;
        }

       // Build left max array
        int leftmax[] = new int [n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
 
        //Build right max array
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trapwater = 0;
        // Calculate trapped water
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapwater +=( waterlevel-height[i])*width[i];
        }
        return trapwater;
    }
    // By Two pointer Approach
    // Time complexity:O(n)
    // Space complexity:O(1)
    public static int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int waterTrap=0;
        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }else{
                    waterTrap+=leftmax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }else{
                    waterTrap+=rightmax-height[right];
                }
                right--;
            }
        }
        return waterTrap;
    }
}