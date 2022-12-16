package Arrays;

public class Array3Pointers {
    public static void main(String args[])
    {
        int[] A = {1, 4, 10};
        int[] B = {2, 15, 20};
        int[] C = {10, 12};

        int minA=Integer.MAX_VALUE;
        int minB=Integer.MAX_VALUE;
        int minC=Integer.MAX_VALUE;
        int a=0, b=0, c=0;

        int max=0;

        for(int i=0;i<A.length;i++)
        {

            for(int j=0;j<B.length;j++)
            {
                if((int)Math.abs(A[i]-B[j])< minA)
                {
                    minA =(int)Math.abs(A[i]-B[j]);
                    a= A[i];
                }

            }

        }


        for(int j=0;j<B.length;j++)
        {

            for(int k=0;k<C.length;k++)
            {
                if((int)Math.abs(C[k]-B[j])< minB)
                {
                    minB =(int)Math.abs(C[k]-B[j]);
                    b = B[j];
                }
            }

        }

        for(int k=0;k<C.length;k++)
        {

            for(int i=0;i<A.length;i++)
            {
                if((int)Math.abs(C[k]-A[i])< minC)
                {
                    minC =(int)Math.abs(C[k]-A[i]);
                    c = C[k];
                }
            }

        }

        max = (int) Math.max( Math.max(Math.abs(a-b), Math.abs(b-c)),  Math.abs(c-a));
        System.out.println(max);



    }
}
