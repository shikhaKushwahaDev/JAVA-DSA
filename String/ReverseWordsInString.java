public class ReverseWordsInString {
    public static String reverseWords(String s) {
      StringBuilder sb=new StringBuilder("");
      int right=s.length()-1;
      int left=right;

        while(left>=0){
            while(left>=0 && s.charAt(left)==' '){
              left--;
            }
            if(left<0){
               break;
            }
            right=left;

            while(left>=0 && s.charAt(left)!=' '){
               left--;
            }
           sb.append(s.substring(left+1,right+1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}