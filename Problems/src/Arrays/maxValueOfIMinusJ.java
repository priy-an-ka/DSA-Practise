package Arrays;

public class maxValueOfIMinusJ {
    public static void main(String args[])
    {
        int A[] = {4, 1, 2, 14,1,3};
        int max = A[A.length-1];
        int suffix[] = new int[A.length];
        suffix[A.length-1]=0;
        int start = -1;
        int end = 0;

        if(A.length==1){
            System.out.println(0);
            return;
        }
        suffix[A.length-1]=A[A.length-1];


        for(int i=A.length-2;i>=0;i--)
        {

            suffix[i]=(int)Math.max(suffix[i+1],A[i]);

        }
        int i=0,j=0, ans=0;

        while(i<A.length && j<A.length ){
            if(A[i]<=suffix[j]){
                ans = (int)Math.max(ans, j-i);
                j++;
            }
            else
                i++;
        }

        System.out.println(ans);



    }
}
