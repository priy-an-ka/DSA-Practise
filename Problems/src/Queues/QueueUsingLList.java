/* Implement stack using linked list
Approach: Insert at head and delete at tail
Insert 30, then 20 and then 10
 10 -> 20 -> 30 where 10 is head and 30 is tail
 */

package Queues;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}

public class QueueUsingLList {

    static Node head = null;
    static Node tail = null;



    public static void enqueue(int data)
    {
        Node temp = new Node(data);
        if(head==null && tail == null)
        {
            head = temp;
            tail = temp;

        }
        else
        {
            temp.next = head;
            head = temp;
        }

    }

    public static int dequeue()
    {
        if(head==null && tail == null)
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        int element = tail.data;

        if(head.next == null)
        {
            head=null;
            tail= null;
            return element;

        }

        Node temp = head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next = null;
        tail = temp;
        return element;

    }

    public static void show()
    {
        if(head==null && tail == null)
        {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Your Queue :");
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;

        }
        System.out.println();

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

        show();

        System.out.println("Removing: "+dequeue());

        show();

        System.out.println("Removing: "+dequeue());

        enqueue(10);

        show();

        System.out.println("Removing: "+dequeue());

        show();



    }
}
