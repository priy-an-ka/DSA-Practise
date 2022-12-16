package Arrays;
import java.util.Arrays;
public class chocolateDistribution {
    public static void main(String args[]){
        int A[]= { 4547984, 2276552, 223468, 6374830, 4289349, 4827619, 5113068, 920366, 851921,
                9445006, 1542337, 1746634, 478009, 7002419, 5929919, 1325546, 4311613, 4791456,
                5697579, 3035013, 8032855, 4140209, 8514679, 7591144, 3660693, 2030528, 4991531,
                6297861, 7598069, 69648, 9390270, 4662405, 2346200, 9613737, 1037234, 6635548, 6957707,
                6150301, 7555913, 7809627, 5595306, 1614602, 2072612, 8589666, 8617020, 518882, 2431563,
                5444984, 5310337, 645494, 996349, 5859543, 7302054, 9511027, 3450687, 3479098, 1541555, 958569};
        int B= 21;
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
       // int window = A.length - B + 1;
        int left, right;

        for(int i=0;i+B-1 < A.length;i++)
        {
            left = A[i];
            right = A[i+B-1];
            if((right-left)<min)
                min=right-left;

        }
        System.out.println(min) ;
    }
}
