public class RomanToInteger{
    public static int romanToInt(String s) {
        char[] symbol={'M','D','C','L','X','V','I'};
        int[] value={1000,500,100,50,10,5,1};

        int count=0;
        for(int i=0;i<s.length();i++){
            int current=0;
            int next=0;

            for(int j=0;j<symbol.length;j++){
                if(s.charAt(i)==symbol[j]){
                    current=value[j];
                    break;
                }
            }
            if(i+1<s.length()){
                for(int j=0;j<symbol.length;j++){
                    if(s.charAt(i+1)==symbol[j]){
                        next=value[j];
                        break;
                    }
                }
            }
            if(current<next){
                count-=current;
            }else{
                count+=current;
            }
        }
        return count;
    }
}