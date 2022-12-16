package Strings;

public class binaryStringSum {

    public static void main(String args[])
    {
        String A="0011";
        String B="001";
        int carry = 0;
        int diff = A.length()-B.length();

        if(diff>0) // B has less chars
        {
            for(int i=0;i<diff;i++)
                B="0"+B;
        }
        else if(diff<0) // A has less chars
        {
            for(int i=0;i<(-1*diff);i++)
                A="0"+A;
        }
        else {}

        int index = A.length()-1;
        int sum=0;
        String output="";


        while(index>=0)
        {
            sum  = ((int)A.charAt(index)-48) + ((int)B.charAt(index)-48) +carry;
            if(sum==2||sum==3)
            {
                carry=1;

            }
            else
            {
                carry=0;
            }

            if(sum==1 || sum==3)
            {
                output="1"+output;
            }
            else
            {
                output="0"+output;
            }

            index--;


        }
        if(carry==1)
            output="1"+output;
        System.out.println(output) ;

    }
}
