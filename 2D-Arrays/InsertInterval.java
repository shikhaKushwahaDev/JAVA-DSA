import java.util.*;
public class InsertInterval{
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        int prevS=newInterval[0];
        int prevE=newInterval[1];

        for(int i=0;i<intervals.length;i++){
            int currS=intervals[i][0];
            int currE=intervals[i][1];

            if(currE<prevS){
                ans.add(new int[]{currS,currE});
            }
            else if(currS>prevE){
                ans.add(new int[]{prevS,prevE});
                prevS=currS;
                prevE=currE;
            }
            else{
                prevS=Math.min(prevS,currS);
                prevE=Math.max(prevE,currE);
            }
            
        }
        ans.add(new int[]{prevS,prevE});
        return ans.toArray(new int[ans.size()][]);
    }
}