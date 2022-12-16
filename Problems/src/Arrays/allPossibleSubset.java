package Arrays;

public class allPossibleSubset {
    public static void main(String args[])
    {
        int[] A={1,2,3,4};
        System.out.println("All possible subsets are as follows:");
        System.out.println("{}");
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
            for(int j=i+1;j<A.length;j++)
            {
                System.out.println(A[i]+" "+A[j] );
            }
            for(int j=i;j<A.length;j++)
            {

            }
        }
    }
}
