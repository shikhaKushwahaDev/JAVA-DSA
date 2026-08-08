import java.util.*;

public class IsomorphicString{
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] mapST=new int[256];
        int[] mapTS=new int[256];

        Arrays.fill(mapST,-1);
        Arrays.fill(mapTS,-1);

        for(int i=0;i<s.length();i++){
            int schar=s.charAt(i);
            int tchar=t.charAt(i);

            if(mapST[schar]==-1 && mapTS[tchar]==-1){
                mapST[schar]=tchar;
                mapTS[tchar]=schar;
            }
            else if(mapST[schar]!=tchar && mapTS[tchar]!=schar){
                return false;
            }
        }
        return true;
    }
}