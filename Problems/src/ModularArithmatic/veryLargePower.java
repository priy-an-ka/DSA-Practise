package ModularArithmatic;

public class veryLargePower {
    public static long factorial(int B, int mod)
    {
        if(B==1)
            return 1;
        else
            return (B*factorial(B-1, mod))%mod;
    }
    public static long pow(int A, long fact, int mod)
    {
        if(A==0)
            return 0;
        if(fact==1)
            return 1;

        long p = pow(A,fact/2,mod);
        if(fact%2==0)
        {
            return ((p%mod)*(p%mod)+mod)%mod;
        }
        else
        {
            return ((A%mod)*(p%mod)*(p%mod)+mod)%mod;
        }

    }
    public static void main(String args[])
    {
        int A = 2;
        int B = 2;
        int mod = 1000000007;
        if(B==1)
            System.out.println(A%mod);

        long fact = factorial(B,mod);

        int power = (int)pow(A,fact,mod);
        System.out.println(power);
    }
}
