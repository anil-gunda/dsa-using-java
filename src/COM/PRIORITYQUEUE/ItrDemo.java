package COM.PRIORITYQUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ItrDemo {
    public static void main(String[] args) {
        Queue<Node> qu = new LinkedList<>();
        qu.add(new Node(10));
        qu.add(new Node(20));
        qu.add(new Node(30));
        qu.add(new Node(40));
        qu.add(new Node(50));

        Iterator itr =qu.iterator();
        while (itr.hasNext()){

        }


    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}