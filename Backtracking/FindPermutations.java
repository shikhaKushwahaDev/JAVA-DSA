/** Problem : Find all Permutations of a String 
 * 
 *  Time Complexity : O(n*n!)
 * Space complexity : O(n)
*/
public class FindPermutations{
    public static void findPermutations(String str,String ans){
        // Base case : permutation is complete
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // Try every character as the next choice
        for(int i=0;i<str.length();i++){ 
            // Current Character
            char curr= str.charAt(i);

           // Remaining string after removing current character
            String newStr= str.substring(0,i)+str.substring(i+1);

            // Generate permutations for the remaining characters
            findPermutations(newStr,ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        findPermutations(str,"");
    }
}