package Arrays;

import java.util.HashMap;

public class largestContiguosZeroSum {
    public static void main(String args[])
    {
        int[] A={1, 2, -3, 3};
        int[] prefix = new int[A.length];
        prefix[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            prefix[i]=A[i]+prefix[i-1];
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        int start=0,end=0;

        for(int i=0;i<prefix.length;i++)
        {
            if(!map.containsKey(prefix[i]))
            {
                map.put(prefix[i],i);
            }
            else
            {
                if ((int)(Math.abs((map.get(prefix[i]))-i)) > max)
                {
                    max = (int)Math.max(max,(int)(Math.abs((map.get(prefix[i]))-i)));
                    start =  map.get(prefix[i])+1;
                    end = i;
                }


            }
        }
        int arr[] = new int[end-start+1];
        int index=0;
        for(int i=start;i<=end;i++)
        {
            arr[index++]=A[i];

        }
        System.out.println("zzzz");
    }
}
