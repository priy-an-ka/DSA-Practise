package Interview;

import java.util.*;

public class NonOverlappingInterval {

    public static void main(String[] args) {

        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        Arrays.sort(intervals,(a,b) -> (a[1] - b[1]));

        int count = 0;
        int endTime=Integer.MIN_VALUE;
        for(int i=0;i< intervals.length;i++)
        {
            if(intervals[i][0]<endTime)
                count++;
            endTime=intervals[i][0];
        }
        System.out.println(count);

    }
}
