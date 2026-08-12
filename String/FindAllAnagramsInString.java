import java.util.*;
public  class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
       int freq1[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        List<Integer> ans=new ArrayList<>();
        int windowfreq[]=new int[26];
        int left=0;

        for(int right=0;right<s.length();right++){
           windowfreq[s.charAt(right)-'a']++;
          
            if(right-left+1>p.length()){
               windowfreq[s.charAt(left)-'a']--;
               left++;
            }
            if(Arrays.equals(freq1,windowfreq)){
                ans.add(left);
            }
        }
        return ans;

    }
}