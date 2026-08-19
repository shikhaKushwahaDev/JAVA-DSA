public class ZigZagConversion{
    public static String convert(String s, int numRows) {
        if(numRows==1 || numRows==s.length()){
            return s;
        }
        StringBuilder[]rows=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int j=0;
        boolean down=true;

        for(int i=0;i<s.length();i++){
            rows[j].append(s.charAt(i));
            
            if(j==numRows-1){
                down=false;
            }else if(j==0){
                down=true;
            }

            if(down){
                j++;
            }else{
                j--;
            }
        }
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<numRows;i++){
            ans.append(rows[i]);
        }
        return ans.toString();
    }
}