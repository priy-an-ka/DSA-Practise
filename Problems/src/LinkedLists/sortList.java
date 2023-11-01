package LinkedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
public class sortList {
    public static void  sortList(ListNode head)
    {
        if(head==null)
            System.out.println("empty");
        ListNode node = head;
        ListNode nextp = null;
        int temp = 0;
        while(node.next!=null)
        {
            nextp = node.next;
            while(nextp!=null)
            {
                if(nextp.val < node.val)
                {
                    temp = nextp.val;
                    nextp.val = node.val;
                    node.val = temp;
                }
                nextp=nextp.next;

            }
            node=node.next;
        }
        node  = head;
        while(node!=null)
        {
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next =  new ListNode(2);
        head.next.next =  new ListNode(1);
        head.next.next.next =  new ListNode(3);;
        sortList(head);


    }
}
