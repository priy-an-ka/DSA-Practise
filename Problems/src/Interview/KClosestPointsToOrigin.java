package Interview;

import java.util.PriorityQueue;
class Point implements Comparable<Point> {
    int x, y;
     Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point other) {
        return Integer.compare(distance(other), distance(this));
    }
    public static int distance(Point p) {
        return p.x*p.x + p.y*p.y;
    }

}

public class KClosestPointsToOrigin {

    public static void kClosest(int[][] points, int k) {
        PriorityQueue<Point> q = new PriorityQueue<>();

        for (int[] i: points) {
            Point newP = new Point(i[0], i[1]);
            if(q.size() < k) q.offer(newP);
            else {
                Point lowP = q.peek();
                if (Point.distance(lowP) > Point.distance(newP)) {
                    q.poll();
                    q.offer(newP);
                }
            }
        }
        int[][] ans = new int[q.size()][2];
        int i = 0;
        while(!q.isEmpty()) {
            Point p = q.poll();
            ans[i] = new int[]{p.x, p.y};
            i++;
        }


    }
    public static void main(String[] args) {
        int[][] points={{1,3},{-2,2}};
        int k=1;

        kClosest(points, k);

    }
}
