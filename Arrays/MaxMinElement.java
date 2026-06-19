public class MaxMinElement{
    
    public static void main (String args[]){
        int num[] = {2,5,1,9,3};
        
     // Assume the first element is both maximum and minimum
        int max = num[0];
        int min = num[0];
        
     // Traverse the array from the second element
        for(int i=1; i<num.length; i++){
            // Update maximum element if a larger value is found
            if(num[i]>max){
                max=num[i];
            }
            // Update minimum element if a smaller value is found
            if(num[i]<min){
                min=num[i];
            }
        } 
        System.out.println("Maximum element is"+" " +max); 
        System.out.println("Minimum element is"+" "+min); 
    }
}
// Time Complexity : O(n)
// Space Complexity :O(1)
