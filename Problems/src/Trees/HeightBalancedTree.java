

class HeightBalancedTree {
    NodeT root;

    boolean heightBalanced()
    {
        return heightBalanced(root);
    }

    int height(NodeT root)
    {
        if(root==null)
            return 0;
        int left = height (root.left);
        int right = height (root.right);
        return (int)Math.max(left, right)+1;
    }

    boolean heightBalanced(NodeT NodeT)
    {
        if (NodeT == null)
            return true;

        int left_height= height(NodeT.left);
        int right_height= height(NodeT.right);
        if((int)Math.abs(left_height-right_height)>1)
            return false;
        else
            return true;


    }



    /* testing for example NodeTs */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the NodeTs */
        HeightBalancedTree tree = new HeightBalancedTree();
        tree.root = new NodeT(1);
        tree.root.left = new NodeT(2);
        tree.root.right = new NodeT(3);
        tree.root.left.left = new NodeT(4);
        tree.root.left.right = new NodeT(5);


        System.out.println(tree.heightBalanced());

    }
}