package Interview;

public class DungeonPrincess {
    public static void main(String[] args) {
        int[][]  A = {{-2, -3, 3},
                     {-5, -10, 1},
                     {10, 30, -5}};

        int minHealth=0;
//        for(int i=A.length-1;i>=0;i--)
//        {
//            for(int j=A[0].length;j>=0;j--)
//            {
//
//            }
//        }
        int i=A.length-1, j=A[0].length;
        // i row and j column
        while(i>=0 && j>=0)
        {
            if (i==A.length-1 && j==A[0].length)
            {
                minHealth = 1+A[i][j];
            }
            if(A[i][j-1] > 0 && A[i][j-1]<A[i-1][j])
            {
                j=j-1;
            }
            else
            {
                i=i-1;
            }

        }



    }
}
