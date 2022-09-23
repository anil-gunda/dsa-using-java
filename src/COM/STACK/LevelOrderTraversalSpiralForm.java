
/*
Write a function to print spiral order traversal of a tree.

      1
    2   3
   7 6 5 4
For below tree, function should print 1, 2, 3, 4, 5, 6, 7.
 */


package COM.STACK;
import java.util.*;

public class LevelOrderTraversalSpiralForm {


    int height(Node tree){
        if(tree == null) return 0;
        else{
            int lheight = height(tree.left);
            int rheight = height(tree.right);
            return lheight > rheight ? lheight+1 :rheight+1;
        }
    }

    void printSpiral(Node tree){
        boolean dir = false;
        int h = height(tree);
        for(int i = 1; i<=h;i++){
            printGivenLevel(tree,i,dir);
            dir=!dir;
        }
    }
    void printGivenLevel(Node tree,int level,boolean dir){
        if(tree == null) return;
        if(level == 1){
            System.out.print(tree.data+" ");
        }
        else if(level > 1){
            if(dir){
                printGivenLevel(tree.left,level-1,dir);
                printGivenLevel(tree.right,level-1,dir);
            }
            else{
                printGivenLevel(tree.right,level-1,dir);
                printGivenLevel(tree.left,level-1,dir);
            }
        }
    }

    ArrayList<Integer> findSpiral(Node root)
    {
        // Your code here

        ArrayList<Integer>al = new ArrayList<>();
        if(root == null) return al;
        Stack<Node>s1 = new Stack<>();
        Stack<Node>s2 = new Stack<>();
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node node = s1.pop();
                al.add(node.data);
                if(node.right !=null)
                    s2.push(node.right);
                if(node.left != null)
                    s2.push(node.left);
            }
            while(!s2.isEmpty()){
                Node node = s2.pop();
                al.add(node.data);
                if(node.left != null)
                    s1.push(node.left);
                if(node.right !=null)
                    s1.push(node.right);

            }
        }
        return al;
    }


    public static void main(String[] args) {

        LevelOrderTraversalSpiralForm tree = new LevelOrderTraversalSpiralForm();
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(7);
        head.left.right = new Node(6);
        head.right.right = new Node(4);
        head.right.left = new Node(5);

       System.out.println(tree.height(head));
        Queue<Integer> q1 = new LinkedList<Integer>();
    }
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}