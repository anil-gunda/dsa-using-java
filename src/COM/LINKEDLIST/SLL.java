package COM.LINKEDLIST;

public class SLL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }

    SLL(){
        this.head = null;
    }

    void insertFirst(int val){
        Node node = new Node(val);
        if(this.head == null){
            head = node;
            return;
        }

        Node temp = head;
        head = node;
        node.next  = temp;
    }


    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        int a = 11, b= 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.print(c);

    }

}
