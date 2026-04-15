public class MajorityElement{
    public static int majorityElement(int nums[]){
        int n = nums.length;
        int freq = 0;
        int answer = 0;

        for(int i=0;i<n;i++){
            if(freq == 0){
                answer = nums[i];
            }
            if(answer == nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        freq=0;
        for(int num :nums){
            if(num == answer){
                freq++;
            }
        }
        return (freq>n/2)? answer:-1;
    }
    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums)); 
    }
}