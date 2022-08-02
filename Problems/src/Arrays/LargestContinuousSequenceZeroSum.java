package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestContinuousSequenceZeroSum {

    public static void checkLargestContinuousSequenceZeroSum(ArrayList<Integer> array)
    {
        ArrayList<Integer> prefixSum =  new ArrayList<>();
        prefixSum.add(array.get(0));

        for(int i=1;i<array.size();i++)
        {
            prefixSum.add(prefixSum.get(i-1)+ array.get(i));
        }

        HashMap<Integer, ArrayList> hs = new HashMap<>();

        for(int i=0;i<array.size();i++)
        {


            if(!hs.containsKey(prefixSum.get(i)))
            {
                ArrayList<Integer> index = new  ArrayList<>();
                index.add(i);
                hs.put(prefixSum.get(i), index);
            }
            else
            {
                hs.get(prefixSum.get(i));
                ArrayList<Integer> index =  hs.get(prefixSum.get(i));
                index.add(i);
                hs.put(prefixSum.get(i), index);
            }
        }
        int start=0,end=0, hstart=0, hend=0;
        int maxLength = Integer.MIN_VALUE;
        int flag = 0;

        for (Map.Entry mapElement : hs.entrySet()) {

            if((Integer) mapElement.getKey()==0)
            {
                 start = 0;
                 end = (int)((ArrayList) mapElement.getValue()).get(0);
                if((end-start)>maxLength)
                {
                    hstart = start;
                    hend= end;
                    flag = 1;
                }
            }
            int valueListSize = ((ArrayList) mapElement.getValue()).size();
            if(valueListSize>1)
            {
                start = (int)((ArrayList) mapElement.getValue()).get(0);
                end = (int)((ArrayList) mapElement.getValue()).get(valueListSize-1);
                if((end-start)>maxLength)
                {
                    hstart = start;
                    hend= end;
                }

            }
        }
        ArrayList<Integer> output =  new ArrayList<>();
        if(flag==0)
        {
            for(int i=hstart+1;i<=hend;i++)
            {
                output.add(array.get(i));
            }
        }
        else
        {
            for(int i=hstart;i<=hend;i++)
            {
                output.add(array.get(i));
            }
        }

        System.out.println("output");

    }

    public static void main(String arsg[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        arr.add(3);
//        arr.add(-4);

        checkLargestContinuousSequenceZeroSum(arr);


    }
}
