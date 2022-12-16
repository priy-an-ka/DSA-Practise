package Bitwise;

public class strangeEquality {
    public static void main(String args[]){
        int A=4;
        int pos=0;
        int x=0; //smaller than X
        int y=0; //larger than X

        //get position of MSB for A
        for(int i=0;i<=31;i++)
        {
            if((A&(1<<i))>0)
                pos=i;
        }

        if((A&(1<<pos))==0)
        {
            y =(y | (1<<pos));
        }
        else
        {
            y =(y | (1<<(pos+1)));
        }

        for(int i=pos;i>=0;i--)
        {
            if((A&(1<<i))>0){
              continue;
            }
            else{
                x =(x | (1<<i));
            }
        }
        System.out.println (x^y);

    }
}
