package Trees;

public class BST {
    private static Node root=null;
    public static void insert(int data)
    {
       if(root == null)
       {
           root = new Node(data);
           return;
       }
       Node temp = root;
       while(temp!=null)
       {
           if(data<temp.data && temp.left == null)
           {
               temp.left = new Node(data);
               return;
           }
           else if (data<temp.data && temp.left != null)
           {
               temp = temp.left;
           }
           else if (data>temp.data && temp.right == null)
           {
               temp.right = new Node(data);
               return;
           }
           else
           {
               temp = temp.right;
           }
       }


    }
    public static void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);


    }

    public static void main(String args[])
    {

        System.out.println("Building tree");
        System.out.println("=================================");
        insert( 10);
        insert(7);
        insert(15);
        insert( 4);
        insert( 11);
        insert(8);
        insert( 17);
        insert( 5);
        insert(3);

        inorder(root);


    }


}

