public class  CountAndSay {
    public static String countAndSay(int n) {
        String curr="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int count=1;
            for(int j=1;j<curr.length();j++){
                if(curr.charAt(j)==curr.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(curr.charAt(j-1));
                    count=1;
                }
            }
            sb.append(count);
            sb.append(curr.charAt(curr.length()-1));
            curr=sb.toString();
        }
        return curr;
    }
}