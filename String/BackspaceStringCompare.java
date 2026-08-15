public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
       int l=s.length()-1;
       int m=t.length()-1;
       
        int count=0;
        int count1=0;
        while(l>=0||m>=0){
            while(l>=0){
                if(s.charAt(l)=='#'){
                  count++;
                  l--;
                }else if(count>0){
                  count--;
                   l--;
                }else{
                  break;
                }
            }
            while(m>=0){
                if(t.charAt(m)=='#'){
                  count1++;
                  m--;
                }else if(count1>0){
                   count1--;
                    m--;
                }else{
                  break;
                }
            }
            if(l>=0 && m>=0){
                if(s.charAt(l)!=t.charAt(m)){
                 return false;
                }
                l--;
                m--;
            }else if(l>=0||m>=0){
              return false;
            }
        }
        return true;
    }
}