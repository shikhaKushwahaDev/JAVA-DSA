public class DetectCapital{
    public static boolean detectCapitalUse(String word) {
        int capitalCount=0;

        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capitalCount++;
            }
        }
        if(capitalCount==word.length()){
            return true; // all uppercase
        }
        if(capitalCount==0){
            return true;// all lowercase
        }
        if(capitalCount==1 && Character.isUpperCase(word.charAt(0))){
            return true; // only first letter uppercase
        }
        return false;
    }
    public static void main(String [] args){
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("AaA"));
    }
}