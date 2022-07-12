/* Implement stack using linked list
Approach: Insert at head and delete at head
 */

package Stacks;
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
public class StackUsingLList{
    static Node head=null;
    public static void push(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head= temp;
        }
        else{
            temp.next = head;
            head= temp;
        }


    }

    public static int pop()
    {
        if(head==null)
        {
            System.out.println("Stack is empty!!");
            return -1;
        }
        Node temp=head;
        head= head.next;
        return temp.data;
    }

    public static int peek()
    {
        if(head==null)
        {
            System.out.println("Stack is empty!!");
            return -1;
        }
        return head.data;

    }

    public static void show()
    {
        if(head==null)
        {
            System.out.println("Stack is empty!!");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("\n");

    }

    public static void main(String args[])
    {
        System.out.println("---Stack using Linked List---");

        push(10);
        push(20);

        show();

        System.out.println("Top peek: "+ peek());

        System.out.println("Top removed: "+ pop());

        show();

        push(30);

        show();

        System.out.println("Top removed: "+ pop());
        System.out.println("Top removed: "+ pop());
        System.out.println("Top removed: "+ pop());

        show();



    }
}
