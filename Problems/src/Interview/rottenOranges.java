package Interview;

import java.util.LinkedList;
import java.util.Queue;

class coor{
    int i;
    int j;
    int time;
    coor(int i,int j, int time)
    {
        this.i=i;
        this.j=j;
        this.time=time;

    }
}
public class rottenOranges {
    public static void rottenCount(int [][] A)
    {
        Queue<coor> queue= new LinkedList<>();
        coor p;
        int count=0;
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++) {
                if(A[i][j]==2)
                {
                    p=new coor(i,j,0);
                    queue.add(p);
                }

            }
        }

        while(!queue.isEmpty())
        {
            p = queue.poll();
            int i=p.i;
            int j=p.j;
            int time=p.time;

            if(j-1 >=0 && A[i][j-1] == 1){
                A[i][j-1] = 2;
                queue.add(new coor(i, j-1, time+1));
                count=(int)Math.max(count, time+1);

            }
            if(j+1 < A[i].length && A[i][j+1] == 1)
            {
                A[i][j+1] = 2;
                queue.add(new coor(i, j+1, time+1));
                count=(int)Math.max(count, time+1);


            }
            if(i-1 >=0 && A[i-1][j] == 1)
            {
                A[i-1][j] = 2;
                queue.add(new coor(i-1, j, time+1));
                count=(int)Math.max(count, time+1);

            }
            if(i+1 < A.length && A[i+1][j] == 1) {
                A[i + 1][j] = 2;
                queue.add(new coor(i + 1, j, time+1));
                count=(int)Math.max(count, time+1);
            }


        }



        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                if(A[i][j]==1)
                {
                    count= -1;
                    break;
                }


            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int[][] A=
                {{2,0,2,2,2,0,2,1,1,0},
                 {0,1,2,0,2,0,0,1,0,1},
                 {0,1,1,1,2,0,1,1,2,1},
                 {2,0,2,0,1,1,2,1,0,1},
                 {1,0,1,1,0,1,2,0,2,2},
                 {0,2,1,1,2,2,0,2,1,2},
                 {2,1,0,2,0,0,0,0,1,1},
                 {2,2,0,2,2,1,1,1,2,2}};

        rottenCount(A);


    }
}



