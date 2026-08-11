public class PermutationInString{
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int[] freq1=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }

        int[] windowfreq=new int[26];
        int left=0;
        for(int right=0;right<s2.length();right++){
            windowfreq[s2.charAt(right)-'a']++;
            
            if(right-left+1>s1.length()){
                windowfreq[s2.charAt(left)-'a']--; 
                left++;
            }
            boolean same=true;
            for(int j=0;j<26;j++){
                if(freq1[j]!=windowfreq[j]){
                    same=false;
                    break;
                }
            }
            if(same){
                return true;
            }
        }
        return false;
    }
}