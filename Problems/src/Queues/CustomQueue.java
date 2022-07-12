/* Insertion of an item is done at the front of the queue and deletion takes place at the end of the queue.

Insertion operation -> enqueue
Deletion operation -> Dequeue

*/


package Queues;

import java.util.ArrayList;

public class CustomQueue {

    static ArrayList<Integer> queue = new ArrayList<>();
    static int front =-1;
    static int rear = -1;

    public static void enqueue(int data)
    {
        if(rear==-1 && front == -1)
        {
            queue.add(data);
            rear = front = 0;

        }
        else
        {
            queue.add(data);
            front++;
        }
    }

    public static int dequeue()
    {
        if(rear == front && front == -1)
        {
            System.out.println("Your queue is empty!");
            return -1;
        }

        int element =  queue.get(rear);


        //shift elements to the left
        // 10 -> 20 -> 30
        if(rear<front)
        {
            for(int i=rear;i<front;i++)
            {
                queue.set(i,queue.get(i+1) );
            }
            queue.remove(front);
            front--;
        }
        else
        {
            queue.remove(front);
            front=rear=-1;
        }

        return element;



    }

    public static void show()
    {

        if(rear == front && front == -1)
        {
            System.out.println("Your queue is empty!");
            return;
        }

        System.out.println("Your queue is: (from rear to front)");

        for(int i=rear;i<=front;i++)
        {
            System.out.println(queue.get(i));
        }

    }



    public static void main(String args[])
    {
        System.out.println("---Customer Queue---");

        enqueue(10);
        enqueue(20);

        show();

        enqueue(30);

        show();

        System.out.println("Removing: "+dequeue());
        show();

        System.out.println("Removing: "+dequeue());
        System.out.println("Removing: "+dequeue());

        show();

        System.out.println("Removing: "+dequeue());

        enqueue(10);

        show();

        System.out.println("Removing: "+dequeue());

        show();












    }
}
