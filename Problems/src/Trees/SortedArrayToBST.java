package Trees;


public class SortedArrayToBST {
    private static Node root=null;

    public static void inorder(Node root)
    {
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static Node createBalancedBST(int[] arr, int start, int end)
    {
        if(start>end)
            return null;
        int mid = start + (end-start)/2;
        root = new Node(arr[mid]);

        root.left =  createBalancedBST(arr,start,mid-1);
        root.right =  createBalancedBST(arr,mid+1,end);
        return root;
    }

    public static void main(String args[])
    {
        int[] arr=new int[]{-10,-3,0,5,9};
        createBalancedBST(arr, 0, arr.length-1);
        inorder(root);

    }
}
