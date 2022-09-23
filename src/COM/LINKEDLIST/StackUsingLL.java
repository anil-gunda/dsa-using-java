package COM.LINKEDLIST;

public class StackUsingLL {

    Node top;

    StackUsingLL(){
        top = null;
    }

    void push(int data){
        Node node = new Node(data);
        if(top == null) top = node;

        else{
            node.next = top;
            top = node;
        }
    }


    int  pop(){
        int x = -1;
        if(top == null) return x;
        x = top.data;
        top = top.next;
        return x;
    }

    boolean isEmpty(){
        if(top==null) return true;
        return false;
    }

    public static void main(String[] args) {

        StackUsingLL st = new StackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.print(st.pop());
        System.out.print(st.isEmpty());

    }
}


class Node{
    int data;
    Node next;

    Node(int data){ this.data = data;}
}