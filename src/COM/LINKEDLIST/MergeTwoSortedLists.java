package COM.LINKEDLIST;

public class MergeTwoSortedLists {
    private static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }
    public static Node mergeTwoSortedList(Node l1, Node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoSortedList(l1.next,l2);
            return l1;
        }
        else{
            l2.next = mergeTwoSortedList(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(4);
        n1.next = n2;
        n2.next = n3;

        Node n4 = new Node(1), n5 = new Node(3), n6 = new Node(6);
        n4.next = n5;
        n5.next = n6;

        Node res =  mergeTwoSortedList(n1,n4);

    }
}
