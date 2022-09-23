package COM.TREES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Tree {
    private static class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(){
            data = 0;
            leftChild=null;
            rightChild=null;
        }
        Node(int data){
            this.data = data;
            leftChild=null;
            rightChild=null;
        }

    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(8);
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(4);
        Node n4 = new Node(9);
        Node n5 = new Node(7);
        Node n6 = new Node(2);

        root.leftChild = n1;
        root.rightChild = n2;
        n1.leftChild = n3;
        n1.rightChild = n4;
        n2.leftChild = n5;
        n2.rightChild =n6;

       System.out.print(tree.countNodes(root));

    }


    int countNodes(Node root){
        int x,y;
        if(root !=null){
            x = countNodes(root.leftChild);
            y = countNodes(root.rightChild);
            return x+y+1;
        }
        return 0;
    }

    void levelOrderTraversal(Node root){
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        System.out.print(root.data);
        while (!queue.isEmpty()){
            root = queue.poll();
            if(root.leftChild !=null){
                System.out.print(root.leftChild.data);
                queue.addLast(root.leftChild);
            }

            if(root.rightChild != null){
                System.out.print(root.rightChild.data);
                queue.addLast(root.rightChild);
            }
        }
    }

    void preOrderIterative(Node root){
        Stack<Node> st = new Stack<>();
        while (root != null || !st.isEmpty()){
            if(root != null){
                System.out.print(root.data);
                st.push(root);
                root = root.leftChild;
            }
            else{
                root = st.pop();
                root = root.rightChild;
            }
        }
    }

    void preOrderTraversal(Node root){
        if(root!=null) {
            System.out.print(root.data);
            preOrderTraversal(root.leftChild);
            preOrderTraversal(root.rightChild);
        }
    }

    void inorderTravsersal(Node root){
        if(root != null){
            inorderTravsersal(root.leftChild);
            System.out.print(root.data);
            inorderTravsersal(root.rightChild);
        }
    }

    void postorderTraversal(Node root){
        if(root != null){
            postorderTraversal(root.leftChild);
            postorderTraversal(root.rightChild);
            System.out.print(root.data);
        }
    }

    void createTree(){
        Node root = new Node();
        Node p,child;
        Scanner sc = new Scanner(System.in);
        Queue<Node> queue = new LinkedList<>();
        System.out.println("Enter root value ");
        int x = sc.nextInt();
        root.data = x;
        queue.add(root);

        while (!queue.isEmpty()){
            p = queue.poll();
            System.out.println("Enter left child ");
            x  = sc.nextInt();
            if(x!=-1){
               child = new Node(x);
               p.leftChild = child;
               queue.add(child);
            }
            System.out.println("Enter right child ");
            x  = sc.nextInt();
            if(x!=-1){
                child = new Node(x);
                p.rightChild = child;
                queue.add(child);
            }

        }


    }
}


