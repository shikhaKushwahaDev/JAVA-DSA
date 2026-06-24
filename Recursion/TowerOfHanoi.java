// Problem: Solves Tower of Hanoi using Recursion
// Time Complexity :O(2^n)
// Space Complexity :O(n)

public class TowerOfHanoi{
    
    public static void towerOfHanoi(int n,String src,String helper,String dest){

        // Base case
        if(n==1){
            System.out.println("Transfer disk " + n +" from " + src+" to "+dest);
            return;
        }
        // Move top (n-1) disks from source to helper
        towerOfHanoi(n-1,src,dest,helper);

        // Move nth disk to destination
        System.out.println("Transfer disk " +n+" from " + src+" to "+dest);

        // Move (n-1) disks from helper to destination
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main (String [] args){
        int n=3;
       towerOfHanoi(n,"S","H","D");
    }
}