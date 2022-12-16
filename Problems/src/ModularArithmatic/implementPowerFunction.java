package ModularArithmatic;

public class implementPowerFunction {
    public static long calcPower(int A, int B)
    {
        if(B==1)
            return A;
        if(B%2==0)
            return calcPower(A,B/2)*calcPower(A,B/2);
        else
            return A*calcPower(A,B/2)*calcPower(A,B/2);
    }
    public static void main(String args[])
    {
        int A=2,B=3,C=3;
        if(A==0)
            System.out.println( 0 );
        if(B==0)
            System.out.println( 1 );

        long power = calcPower(A,B)%C;
        System.out.println( power );


    }
}
