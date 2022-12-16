package Bitwise;

public class reverseBits {
    public static void main(String args[])
    {
        long A= 3;
        long rev = 0;
        for(int i=0;i<=31;i++)
        {
            if((A&(1<<i))>0)
            {
                rev=rev+(long)Math.pow(2,(31-i));
            }
        }
        System.out.println(rev);
    }
}
