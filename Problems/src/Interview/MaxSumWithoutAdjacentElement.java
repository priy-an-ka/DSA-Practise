package Interview;

public class MaxSumWithoutAdjacentElement {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4, 1},
                {2, 3, 4, 5, 6}}
                ;
        int[] B = new int[A[0].length];
        for(int i=0;i<B.length;i++)
        {
            B[i]=(int)Math.max(A[0][i],A[1][i]);
        }

        int prev2=0, cur=0;
        int prev=B[0];



        for(int i=1;i<B.length;i++)
        {
            int take = B[i];
            if(i>1)
                take+=prev2;
            int notTake= 0 + prev;
            cur=(int)Math.max(take, notTake);
            prev2=prev;
            prev=cur;

        }
        System.out.println(prev);

    }
}
