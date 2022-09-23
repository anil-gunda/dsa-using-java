// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{

    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int val = sc.nextInt();

            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }

            int m = sc.nextInt();
            val = sc.nextInt();

            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list

        first = reverse(first);
        second = reverse(second);

        int carry = 0;

        Node temp1 = first;
        Node temp2 = second;

        Node head = new Node(-1);
        Node tail = head;

        while(temp1 != null && temp2 != null){
            int sum = temp1.data + temp2.data + carry;

            if(sum > 9){
                int temp = sum;
                sum = sum%10;
                carry = temp/10;
            }else{
                carry = 0;
            }

            Node node  = new Node(sum);
            tail.next = node;
            tail = node;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1 != null){
            tail.next = new Node(temp1.data);
            tail = tail.next;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            tail.next = new Node(temp2.data);
            tail = tail.next;
            temp2 = temp2.next;
        }

        head = head.next;
        head = reverse(head);
        return head;
    }


    static Node reverse(Node head){
        if(head.next == null) return head;

        Node revHead =  reverse(head.next);
        head.next.next = head;
        head.next = null;
        return revHead;
    }
}