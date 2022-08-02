package Arrays;

public class SearchInSorted2DArray {
    public static void main(String args[])
    {
        int[][] A = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        int B = 10;
        int val = 0;
        int j=A[0].length-1;
        int i=0;
        while(i<A.length-1 && j>=0)
        {
            if(A[i][j]==B)
            {
                val = ((i+1)*1009)+(j+1);
                j--;
            }
            else if(B>A[i][j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        System.out.println(val);
    }
}
