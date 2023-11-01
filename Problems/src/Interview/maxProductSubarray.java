package Interview;

public class maxProductSubarray {
    public static void main(String[] args) {
        int[] arr= {0, 2,  0, 8};
        int prod=1, maxProd=Integer.MIN_VALUE;
        int[] dp1 = new int[arr.length];
        int[] dp2 = new int[arr.length];
        dp1[0]=arr[0];
        dp2[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           dp1[i] = (int)Math.min(Math.min(arr[i], arr[i]*dp1[i-1]), arr[i]*dp2[i-1]);
           dp2[i] = (int)Math.max(Math.max(arr[i], arr[i]*dp1[i-1]), arr[i]*dp2[i-1]);
        }

        for(int i=0;i<arr.length;i++)
        {
            maxProd=(int)Math.max(maxProd, dp2[i]);
        }
        System.out.println(maxProd);

    }
}
/*
 1. [4, 2, -5, 1]
    [4, 8, -40, -40]
 2. [4, 2, -5, 4, 5, 6]
     [4, 8, -40, -160, -800, -4800]
 3. [4, 2, -5, 1, -6, 0, 8]
 4. [4, 2, 1, 0, 18]
 5. [1, 2, 3]


    [4, 2, -5,  1, -6,  0,  8]
dp1 4   2  -40 -40 -240 0   0
dp2 4   8  -5   1   -6  0   8
 */