import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.tree.TreeNode;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

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

    Set<Integer> array = new HashSet<Integer>();

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
        array.add(NodeT.data);

        inOrder(NodeT.right);
    }
    public int t2Sum(NodeT A, int B) {

        inOrder(A);
        for (Integer arr : array) {

            System.out.println(arr);


        }
        for (Integer arr : array) {

            System.out.println(arr);

            if(arr < B && array.contains((int)Math.abs(arr-B)) && arr!= (int)Math.abs(arr-B))
                return 1;
        }

        return 0;


    }

    /* testing for example NodeTs */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the NodeTs */
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeT(7);
        tree.root.left = new NodeT(5);
        tree.root.right = new NodeT(20);
//        tree.root.left.left = new NodeT(4);
//        tree.root.left.right = new NodeT(7);

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

        System.out.println("sum " + tree.t2Sum(tree.root, 13));
    }
}