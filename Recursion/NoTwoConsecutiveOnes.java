/* Problem: Generate all binary strings of 
    length n 
    such that no two consecutive 1's appear.
   
   Time complexity : O(2^n) 
   Space complexity : O(n)
*/
public class NoTwoConsecutiveOnes{
    public static void printBinStrings(int n,int lastplace,String str){
        // Base case : If no more positions are left
        if(n==0){
            System.out.println(str);
            return;
        }
        // Always append '0'
        printBinStrings(n-1,0,str+"0");

        // Append '1' only if the previous bit is '0'
        if(lastplace==0){
            printBinStrings(n-1,1,str+"1");
        }
    }
    public static void main(String [] args){
        // Generate binary strings of length 3
        printBinStrings(3,0," ");
    }
}