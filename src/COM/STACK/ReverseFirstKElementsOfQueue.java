package COM.STACK;

import java.util.*;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        ReverseFirstKElementsOfQueue onj = new ReverseFirstKElementsOfQueue();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> res = onj.modifyQueue(q,3);


    }

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> st = new Stack<>();
        Queue<Integer> res = new LinkedList<>();

        while(q.size() == k){
            st.push(q.poll());
        }


        while(!st.isEmpty()){
            res.add(st.pop());
        }

        while(!q.isEmpty()){
            res.add(q.poll());
        }

        return res;
    }
}
