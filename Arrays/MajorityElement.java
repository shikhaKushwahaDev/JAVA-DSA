// Problem:  Majority Element using Moore's voting Algorithm
// Time Complexity: o(n)
// Space Complexity:O(1)
public class MajorityElement{
    
    public static int majorityElement(int nums[]){
        int n = nums.length;
        int freq = 0;
        int answer = 0;
       //  Find the possible majority element
        for(int i=0;i<n;i++){
            // Choose a new candidate
            if(freq == 0){
                answer = nums[i];
            }
            // Increase or decrease the count
            if(answer == nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        // Check if candidate is really the majority
        freq=0;
        for(int num :nums){
            if(num == answer){
                freq++;
            }
        }
        // Return the majority element, else return -1
        return (freq>n/2)? answer:-1;
    }
    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums)); 
    }
}
