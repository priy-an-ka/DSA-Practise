package ModularArithmatic;

public class pairSumDivisibleByM {
    public static int fact(int number) {
        int f = 1;
        int j = 1;
        while(j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }
    public static void main(String args[])
    {
        int A[]= {169, 291, 899, 864, 809, 102, 755, 715, 216, 933, 625, 33, 648, 305, 38, 160, 290, 684, 343, 607, 26, 303, 985, 328, 36, 940, 690, 635, 125};
        int B = 16;
        int arr[] = new int[B];
        int sum = 0;
        int start = 1, end = B-1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0)
                arr[A[i]%B]++;
            else
                arr[(A[i]%B)+B]++;
        }

        sum =  sum + fact(arr[0])/(fact(2) * fact(arr[0]-2));
        while(start<end)
        {
            sum=  sum + (arr[start]*arr[end]);
            start++;
            end--;
        }
        if(start == end)
        {
            sum =  sum + fact(arr[start])/(fact(2) * fact(arr[start]-2));
        }

        System.out.println(sum) ;
    }
}
