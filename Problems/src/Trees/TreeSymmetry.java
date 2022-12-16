package Trees;


public class TreeSymmetry {
    private static Node root=null;
    public boolean isSymmetric() {
        return isMirror(root, root);
    }

    public boolean isMirror(Node tree1, Node tree2) {
        if(tree1== null && tree2== null)
            return true;


        if(tree1!=null && tree2!=null && tree1.data == tree2.data ) {
            return isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
        }

        return false;

    }

    public static void main(String args[])
    {
        TreeSymmetry tree = new TreeSymmetry();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = tree.isSymmetric();
        if (output == true)
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
    }
}
