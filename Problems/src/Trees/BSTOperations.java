package Trees;

public class BSTOperations {

    private static Node root=null;

    public static void preorder(Node root)
    {
        if(root == null)
            return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);


    }
   
    public static void create(int data)
    {
        root = createBST(root,data);
    }
    public static Node createBST(Node root, int data)
    {
        if(root==null)
        {
            root = new Node(data);
            return root;
        }
        if(data<root.data)
            root.left = createBST(root.left, data);
        else
            root.right =  createBST(root.right, data);
        return root;

    }
    public static void search(int data)
    {
        Node temp = root;
        while(temp!=null)
        {
            if(temp.data == data)
            {
                System.out.println("\nNode found: " + data);
                return;
            }
            else if (data < temp.data)
            {
                temp=temp.left;
            }
            else
            {
                temp=temp.right;
            }

        }
        System.out.println("\nNode not found: " + data);
        return;

    }
    public static void main(String args[])
    {

        System.out.println("Building tree");
        System.out.println("=================================");
        create( 10);
        create(7);
        create(15);
        create( 4);
        create( 11);
        create(8);
        create( 17);
        create( 5);
        create(3);

        System.out.println("\nPre-order");
        System.out.println("=================================");
        preorder(root);

        search(8);
        search(88);

    }
}
