package ModularArithmatic;

import java.util.ArrayList;

public class rearrangeArray {
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(0);
        a.add(4);
        int actual,replace;

        for(int i=0;i<a.size();i++)
        {
            a.set(i,(a.get(i)*a.size()));
        }
        for(int i=0;i<a.size();i++)
        {
           actual = a.get(i)/a.size();
           replace = a.get(actual)/a.size();
           a.set(i, a.get(i) + replace);

        }
        for(int i=0;i<a.size();i++)
        {
            a.set(i,(a.get(i)%a.size()));
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }



    }
}
