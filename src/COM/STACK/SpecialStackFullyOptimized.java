package COM.STACK;

import java.util.Stack;

public class SpecialStackFullyOptimized {
    int min = Integer.MIN_VALUE;
    static final int DEMO_VALUE = Integer.MAX_VALUE;
    Stack<Integer> st = new Stack<>();

    void push(int x){
        if(st.isEmpty() || x < min){

            min  = x;
        }
        st.push(x*DEMO_VALUE+min);
    }

    int pop(){
        return st.pop()/DEMO_VALUE;
    }

    int getMin(){
        return min;
    }
}
