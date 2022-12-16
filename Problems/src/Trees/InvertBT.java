class NodeT {
    int data;
    NodeT left, right;

    public NodeT(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    NodeT root;

    void mirror() { root = mirror(root); }

    NodeT mirror(NodeT NodeT)
    {
        if (NodeT == null)
            return NodeT;

        /* do the subtrees */
        NodeT left = mirror(NodeT.left);
        NodeT right = mirror(NodeT.right);

        /* swap the left and right pointers */
        NodeT.left = right;
        NodeT.right = left;

        return NodeT;
    }

    void inOrder() { inOrder(root); }

    /* Helper function to test mirror(). Given a binary
       search tree, print out its data elements in
       increasing sorted order.*/
    void inOrder(NodeT NodeT)
    {
        if (NodeT == null)
            return;

        inOrder(NodeT.left);
        System.out.print(NodeT.data + " ");

        inOrder(NodeT.right);
    }

    /* testing for example NodeTs */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the NodeTs */
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeT(1);
        tree.root.left = new NodeT(2);
        tree.root.right = new NodeT(3);
        tree.root.left.left = new NodeT(4);
        tree.root.left.right = new NodeT(5);

        /* print inorder traversal of the input tree */
        System.out.println(
                "Inorder traversal of the constructed tree is");
        tree.inOrder();
        System.out.println("");

        /* convert tree to its mirror */
        tree.mirror();

        /* print inorder traversal of the minor tree */
        System.out.println(
                "Inorder traversal of the mirror tree is");
        tree.inOrder();
    }
}