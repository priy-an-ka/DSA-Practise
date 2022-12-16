package ModularArithmatic;

public class smallestXOR {

    public static void main(String args[])
    {
        int A=3;
        int B=3;
        int index=0;
        int answer=0;
        for(int i=31;i>=0;i--)
        {
            if((A&(1<<i))>0)
            {
                index=i;
                break;
            }

        }
        index = (index>(B-1))?index:(B-1);
        if(index==(B-1))
        while(index>=0 && B>0)
        {
            if((A&(1<<index))>0)
            {
                answer = answer | (1<<index);
            }
            index--;
            B--;
        }
        System.out.println(answer);

    }
}
