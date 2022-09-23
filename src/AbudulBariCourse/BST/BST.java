package AbudulBariCourse.BST;

public class BST {


    public static void main(String[] args) {
        BST bst = new BST();
        Node root =  null;
        root = bst.insert(root,15);
        root = bst.insert(root,20);
        root = bst.insert(root,25);
        root = bst.insert(root,16);
        root = bst.insert(root,8);
        root = bst.insert(root,4);
        root = bst.insert(root,9);

        bst.inOrder(root);
        System.out.println();
        bst.delete(root,16);
        bst.inOrder(root);
    }

    int height(Node root){
        if(root==null) return 0;
        int x,y;
        x = height(root.leftChild);
        y = height(root.rightChild);
        return x>y?x+1:y+1;
    }

    Node inPre(Node root){
        while(root!=null &&root.rightChild!=null){
            root = root.rightChild;
        }
        return root;
    }
    Node inSuc(Node root){
        while(root!=null &&root.leftChild!=null){
            root = root.leftChild;
        }
        return root;
    }

    Node delete(Node root,int key){

        if(root==null) return null;
        if(root.leftChild==null && root.rightChild==null){
            root = null;
            return root;
        }

        Node q;
        if(key < root.data){
            root.leftChild = delete(root.leftChild,key);
        }
        else if(key>root.data){
            root.rightChild = delete(root.rightChild,key);
        }

        else{
            if(height(root.leftChild) > height(root.rightChild)){
                q = inPre(root.leftChild);
                root.data = q.data;
                root.leftChild = delete(root.leftChild,q.data);
            }
            else{
                q = inSuc(root.rightChild);
                root.data = q.data;
                root.rightChild = delete(root.rightChild,q.data);
            }
        }
        return root;
    }

    Node insert(Node root,int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.data){
            root.leftChild = insert(root.leftChild,key);
        }
        else if(key > root.data){
            root.rightChild = insert(root.rightChild,key);
        }
        return root;
    }

    void inOrder(Node root){
        if(root != null){

            inOrder(root.leftChild);
            System.out.print(root.data+"->");
            inOrder(root.rightChild);
        }
    }
}

class Node{
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