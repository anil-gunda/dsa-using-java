package COM.TREES;

import COM.TreeNode;

import java.util.Stack;

public class isBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(5);

        System.out.println(isBST(root));

    }
    static  boolean isBST(TreeNode root)
    {
        // code here.
        boolean res = true;
        Stack<TreeNode> st = new Stack<>();

        while(root != null || st.isEmpty()){

            if(root != null){
                if(root.left != null && root.left.data > root.data){
                    res = false;
                    break;
                }

                if(root.right != null && root.right.data <  root.data){
                    res = false;
                    break;
                }
                st.push(root);
                root = root.left;
            }
            else{
                root = st.pop();
                root = root.right;
            }
        }
        return res;
    }
}
