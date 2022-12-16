package Bitwise;

public class differentBitSumPairwise {
    public static void main(String args[]){
        int A[]={1,3,5};
        int bitone=0, bitzero=0;
        int count = 0;
        for(int j=4;j>=0;j--)
        {
            bitone=0;
            bitzero=0;
            for(int i=0;i<A.length;i++)
            {
                if((A[i]&(1<<j))==0)
                    bitzero++;
                else
                    bitone++;


            }
            count=count+(bitzero*bitone);

        }
        System.out.println(count*2);
    }
}
