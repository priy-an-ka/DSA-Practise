package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class nextNumber {

    public static void main(String args[])
    {
        ArrayList<Integer> A = new  ArrayList<>();

        A.add(9);
        A.add(9);
        A.add(9);

        int carry = 1;
        ArrayList<Integer> output = new  ArrayList<>();
        int pos = 0;
        int count = 0;
        for(int i=0;i<A.size();)
        {
            if(i==count && A.get(i)==0)
            {
                A.remove(i);

            }
            else
            {
                i++;
            }
        }
        for(int i=A.size()-1;i>=0;i--)
        {

            if(i==0 && A.get(i)!=9)
            {
                output.add(pos,A.get(i)+carry);
                carry = 0;
                break;
            }
            if(i==0 && A.get(i)==9 && carry ==0)
            {
                output.add(pos,A.get(i));

            }

            else if(i!=0 && A.get(i)+carry<10)
            {
                output.add(pos,A.get(i)+carry);
                carry=0;
            }
            else
            {
                output.add(pos,0);
                carry=1;
            }
            pos++;
        }
        if(carry == 1)
            output.add(pos,1);

        Collections.reverse(output);
        System.out.println();
        for(int i=0;i<output.size();i++)
            System.out.print(output.get(i));
    }
}
