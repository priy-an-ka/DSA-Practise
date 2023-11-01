package Interview;

import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    int x;
    int y;
    int distance;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
        this.distance= (x*x) + (y*y);
    }

    @Override
    public int compareTo(Pair point) {
       if (this.distance <= point.distance)
           return -1;
       else
           return 1;
    }
}

public class KClosestPoints {
    public static void kClosest(int[][] points, int k) {

        PriorityQueue<Pair> close = new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            close.add(new Pair(points[i][0], points[i][1]));
        }

        while(k>0)
        {
            Pair p = close.poll();
            System.out.println(p.x + " "+ p.y + "= "+ p.distance);
            k--;
        }

    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2},{0,1},{4,-3}};
        int k=2;
        kClosest(points, k);
    }
}

