package COM.LINKEDLIST;

public class CLL {


    class Node{
        int data;
        Node next;

        Node(){data = 0; next = null;}
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node last;

    CLL(){
        this.head = null;
        this.last = null;
    }

    void displayIterative(){
        if(head==null) return;
        Node temp = head;
        do{
            System.out.print(temp.data +"->");
            temp = temp.next;
        }while(temp != head);
    }

    void insertLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            last = head;
            last.next = head;
        }
        else{
            last.next = node;
            last = node;
            last.next = head;
        }

    }



    public static void main(String[] args) {

        CLL cl = new CLL();
        cl.insertLast(10);


    }
}
