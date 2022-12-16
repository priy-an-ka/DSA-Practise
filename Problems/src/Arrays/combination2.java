package Arrays;

public class combination2 {
    public static int power(int A, int B, int C)
    {
        if(B==1)
            return A;
        int p = power(A,B/2,C);
        if(B%2==0)
            return (p*p)%C;
        else
            return (A*p*p)%C;
    }
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        int C = 13;
        int fact[] = new int[A+1];
        fact[0]=1;
        int res=0;
        for(int i=1;i<A+1;i++)
        {
            fact[i]=i*fact[i-1];
        }

        res = fact[A]%C;
        res = (res * power(fact[A-B],C-2,C))%C;
        res = (res * power(fact[B],C-2,C))%C;

        System.out.println(res) ;

    }
}
