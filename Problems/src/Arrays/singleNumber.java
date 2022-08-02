package Arrays;

public class singleNumber {

    public static void main(String args[])
    {
        int[] A = {2,3,2,3,3,2,5};
        int ans=0;
        int count=0;
        for(int i=0;i<=31;i++)
        {
            count = 0;
            for(int j=0;j<A.length;j++)
            {
                if((A[j]&(1<<i)) > 0)
                    count++;

            }
            if(count%3!=0)
                ans = (ans|(1<<i));

        }
        System.out.println (ans);

    }

}
