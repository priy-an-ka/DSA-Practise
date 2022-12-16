package Trees;

public class BSTRecursion {
    private static Node root=null;

    public static void preorder(Node root)
    {
        if(root == null)
            return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);


    }
    public static void postorder(Node root)
    {
        if(root == null)
            return;

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");



    }
    public static void insert(int data)
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

        System.out.println("\nPre-order");
        System.out.println("=================================");
        preorder(root);

        System.out.println("\n\nPost-order");
        System.out.println("=================================");
        postorder(root);
    }
}
