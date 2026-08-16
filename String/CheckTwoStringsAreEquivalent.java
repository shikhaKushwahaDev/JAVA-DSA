public class CheckTwoStringsAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0;
        int j=0;
        int p=0;
        int q=0;
        while(i<word1.length && j<word2.length){
            if(word1[i].charAt(p)!=word2[j].charAt(q)){
              return false;
            }
            p++;
            q++;
            
            if(p==word1[i].length()){
                i++;
                p=0;
            }
            if(q==word2[j].length()){
                j++;
                q=0;
            }
        }
        return i==word1.length && j==word2.length;
    }
}