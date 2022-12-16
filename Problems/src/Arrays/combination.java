package Arrays;

public class combination {
    public static void main(String args[]){
        int A= 96;
        int B= 21;
        int C= 123;
        long[][] res = new long[A+1][B+1];

        for(int i=0;i<A+1;i++){ //n
            for(int j=0;j<B+1;j++){ //r
                if(j==0 || i==j)
                    res[i][j]=1;
                else if(i<j)
                    res[i][j]=0;
                else{
                    res[i][j]=((res[i-1][j-1]+res[i-1][j])%((long)C));
                }
            }
        }
        System.out.println((res[A][B]%(long)C));
    }
}
