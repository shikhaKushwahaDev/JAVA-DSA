/** Generate all possible subsets of a given string using Backtracking */
public class FindSubsets{
    public static void findSubsets(String str, String ans, int i){
       // Base Case
        if(i==str.length()){
            // Print "null" or empty subset
            if(ans.length()==0){
             System.out.println("null");
            }else{
              System.out.println(ans);
            }
            return;
        }
        // If Choice is Yes : Include current character
        findSubsets(str,ans+str.charAt(i),i+1);
        // If Choice is No : Exclude current character
        findSubsets(str,ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        findSubsets(str," ",0);
    }
   
}
