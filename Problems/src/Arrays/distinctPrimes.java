package Arrays;

import java.util.HashSet;

public class distinctPrimes {
    public static void main(String args[]){
        int[] A={63, 52, 28, 72, 9, 62, 79, 71, 43, 15, 82, 21, 10, 12, 38, 96, 58, 99, 59, 100, 10, 38, 92, 30, 24, 3, 49, 17, 2, 63,
                54, 18, 71, 7, 65, 87, 82, 31, 48, 39, 100, 82, 15, 60, 44, 84, 43, 5, 63, 17, 100, 94, 62, 26, 35, 29};

        HashSet<Integer> set = new HashSet<>();
        int index;
        int flag,num;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
                max=A[i];
        }

        int sievePrime[]=new int[max+1];
        //0 in sieve-prime means it is prime, 1 means it is false
        sievePrime[0]=1;
        sievePrime[1]=1;
        for(int i=2;i<sievePrime.length;i++)
        {
            if(sievePrime[i]==0){
                for(int j=i*2;j<sievePrime.length;j=j+i){
                    sievePrime[j]=1;
                }
            }
        }

        for(int i=0;i<A.length;i++){
            index=2;
            num=A[i];
            flag=0;
            while(num>1)
            {
                if(sievePrime[index]==0 && num%index==0){
                    if(set.contains(index)==false)
                        set.add(index);
                    num=num/index;
                    flag=1;

                }
                else
                {
                    if(flag==0)
                    {
                        index++;
                    }
                    else
                    {
                        index++;
                        flag=0;
                    }

                }

            }

        }
        System.out.println (set.size());
    }

}
