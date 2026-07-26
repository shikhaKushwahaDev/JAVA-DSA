import java.util.*;
public class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
        // Store all unique triplets
        List<List<Integer>>ans=new ArrayList<>();
        int n= nums.length;
       // apply Sorting + Two Pointers Approach
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){  // Fix one element
            // Skip duplicate 
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           int first=i+1;
           int last=n-1;

            while(first<last){ // For remaining two numbers
                int sum=nums[i]+nums[first]+nums[last];

                if(sum==0){
                  // Triplet found
                  ans.add(Arrays.asList(nums[i],nums[first],nums[last]));
                  first++;
                  last--;
                    // Skip duplicate second element
                    while(first<last && nums[first]==nums[first-1]){
                      first++;
                    }
                    // Skip duplicate third element
                    while(first<last && nums[last]==nums[last+1]){
                        last--;
                    }
                
                }else if(sum<0){
                    first++;
                }else{
                    last--;
                }
            }
           
        }
        return ans;
    }
}