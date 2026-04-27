public class LargestString{
    // function to find largest string
    // TC is O(n) and SC is O(1)
    public static void main (String args[]){
        String fruits[]={"apple","mango","banana"};
        // Assume first element is largest initially
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            // compare strings using compareTo()
            if(largest.compareTo(fruits[i])< 0){
                // update largest if bigger string found
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
