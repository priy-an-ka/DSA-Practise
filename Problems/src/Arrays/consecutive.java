package Arrays;

public class consecutive {
    public static void main(String args[])
    {
        // this approach fails if array elements are repeated
        int[] A = {3,1,2,4,5};
        int max = (int)Integer.MIN_VALUE;
        int min = (int)Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
                max = A[i];
            if(A[i]<min)
                min = A[i];
        }


        if((max-min+1)!=A.length)
        {
            System.out.print("not consecutive");
            return;
        }


        int B[] = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if((B[A[i]-min])==A[i])
            {
                System.out.print("not consecutive");
                return;
            }
            else
            {
                B[A[i]-min]=A[i];
            }
        }
        System.out.print("consecutive");

    }
}
