package Arrays;

public class luckyNumbers {
    public static boolean lucky(int N){
        int count = 0;
        int i=2;
        int flag=0;
        while(N>0)
        {
            if(N%i==0)
            {
                N=N/i;
                flag=1;
            }
            else
            {
                i++;
                if(flag==1){
                    count++;
                    flag=0;
                }
                if(N==1) {
                    break;
                }
            }
        }
        if(count==2)
            return true;
        else
            return false;

    }

    public static void main(String args[]){
        int A=21;
        if(A<6){
            System.out.println(0);
            return;
        }

        int count = 0;
        for(int i=6;i<=A;i++)
        {
            if(lucky(i)==true)
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

    }

}
