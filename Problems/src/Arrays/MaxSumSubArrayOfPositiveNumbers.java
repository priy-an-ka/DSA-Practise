package Arrays;

import java.util.ArrayList;

public class MaxSumSubArrayOfPositiveNumbers {

    public static void main(String args[])
    {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1967513926);
        A.add(1540383426);
        A.add(-1303455736);
        A.add(-521595368);
//        A.add(77006);
//        A.add(-36098);
//
//
//        A.add(75319);
//        A.add(-45223);
//        A.add(-56760);
//        A.add(-86126);
//        A.add(-29506);
//        A.add(76770);
//
//        A.add(29094);
//        A.add(87844);
//        A.add(40534);
//        A.add(-15394);
//        A.add(18738);
//        A.add(59590);
//
//        A.add(-45159);
//        A.add(-64947);
//        A.add(7217);
//        A.add(-55539);
//        A.add(42385);
//        A.add(-94885);
//
//        A.add(82420);
//        A.add(-31968);
//        A.add(-99915);
//        A.add(63534);
//        A.add(-96011);
//        A.add(24152);
//        A.add(77295);




        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0;
        int max_start = 0, max_end = 0;
        int length=0;

        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)<0)
            {
                sum = 0;
                start = i+1;
            }
            else
            {
                sum = sum + A.get(i);
                end = i;
                if(sum>max_sum)
                {
                    max_sum = sum;
                    max_end = i;
                    max_start = start;
                    length = max_end-max_start+1;

                }
                else if(sum==max_sum)
                {

                    if(i-start+1>length)
                    {
                        max_end = i;
                        max_start = start;
                    }
                    else if((i-start+1)==length)
                    {
                          if(start<max_start)
                          {
                              max_end = i;
                              max_start = start;
                          }
                    }
                }
            }

        }
        System.out.println(max_sum);
        System.out.println(max_start);
        System.out.println(max_end);
        int[] output = new int[max_end-max_start+1];
        for(int i = 0; i<output.length; i++ )
        {
            output[i] = A.get(max_start+i);
        }
        System.out.println(max_end);
    }

}
