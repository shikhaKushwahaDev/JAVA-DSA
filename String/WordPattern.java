public class WordPattern{
    public static boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }
        String[] map=new String[26];

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];

            int idx=ch-'a';
            
            // Character is already mapped
            if(map[idx]!=null){
                if(!map[idx].equals(word)){
                    return false;
                }

            }
            // Character is not mappped yet
            else{
                // check whether this word is already mapped to another character
                for(int j=0;j<26;j++){
                    if(map[j]!=null && map[j].equals(word)){
                        return false;
                    }
                }
                map[idx]=word;
            }
        }
        return true;
    }
} 