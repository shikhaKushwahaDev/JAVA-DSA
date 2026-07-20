import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]>result=new ArrayList<>();

        int prevStart= intervals[0][0];
        int prevEnd= intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int currStart=intervals[i][0];
            int currEnd=intervals[i][1];

            if(currStart<=prevEnd){
              prevEnd=Math.max(prevEnd,currEnd);
            }else{
              result.add(new int[]{prevStart,prevEnd});
              prevStart=currStart;
              prevEnd=currEnd;
            }
        }
        result.add(new int[]{prevStart,prevEnd});

        return result.toArray(new int[result.size()][]);
    }
}