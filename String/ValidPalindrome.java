public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s==null||s.isEmpty()){
            return true;
        }
        String str=s.toLowerCase();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
              sb.append(ch);
            }
        }
        
        int first=0;
        int last=sb.length()-1;
        while(first<=last){
            if(sb.charAt(first)!=sb.charAt(last)){
               return false;
            }else{
                first++;
                last--;
            }
        }
        return true;
    }
    public static void main(String args[]){
       String s = "A man, a plan, a canal: Panama";
       System.out.println(isPalindrome(s));
    }
}