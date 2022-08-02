package Arrays;

public class minSwaps {

    public static void main(String args[])
    {
        int[] A = {52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70};
        int B=19;
        int window=0;
        int fav=0, nonfav=0;
        int min=0;
        int i;

        for(i=0;i<A.length;i++)
        {
            if(A[i]<=B)
                window++;
        }


        for(i=0;i<window;i++)
        {
            if(A[i]<=B)
                fav++;
            else
                nonfav++;
        }

        min= nonfav;
        i=1;

        while(i<=A.length-window)
        {
            if(A[i-1]<=B)
                fav--;
            else
                nonfav--;
            if(A[window-1+i]<=B)
                fav++;
            else
                nonfav++;

            min=(int)Math.min(nonfav,min);
            i++;
        }

        System.out.println(min) ;
    }
}
