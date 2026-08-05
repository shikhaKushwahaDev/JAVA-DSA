 public class RansomNote{
    public static  boolean canConstruct(String ransomNote, String magazine) {
      int freq[]=new int[26];
      
        for(int i=0;i<magazine.length();i++){
          freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
           char ch=ransomNote.charAt(i);

           freq[ch-'a']--;
            if(freq[ch-'a']<0){
             return false;
            }
        }
        return true;
    }
}