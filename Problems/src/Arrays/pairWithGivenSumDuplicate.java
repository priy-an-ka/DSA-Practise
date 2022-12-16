package Arrays;

public class pairWithGivenSumDuplicate {
    public static void main(String args[])
    {
        int mod = 1000000007;
        int count = 0;
        int A[] = { 2, 4, 4, 5, 6, 8, 10  };
        int B = 6;


        int i=0, j=A.length-1;
        while(i<j)
        {
            if(A[i]+A[j]>B)
            {
                j--;
            }
            else if(A[i]+A[j]<B)
            {
                i++;
            }
            else
            {
                if(A[i]==A[j])
                {
                    int total = j-i+1;
                    count = (count + ((total * (total-1))/2)) % mod;
                    break;
                }
                else
                {
                    int left = A[i];
                    int right = A[j];
                    int lc = 1;
                    int rc = 1;
                    i++;

                    while(i<A.length-1)
                    {
                        if(A[i]!=left)
                            break;
                        else
                        {
                            lc++;
                            i++;
                        }
                    }
                    j--;
                    while(j>0)
                    {
                        if(A[j]!=right)
                            break;
                        else
                        {
                            rc++;
                            j--;
                        }
                    }

                    count = (count + (lc*rc)) % mod;

                }

            }
        }
        System.out.println(count) ;
    }
}
