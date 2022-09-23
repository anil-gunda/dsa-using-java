package COM.STACK;

import java.util.Stack;

public class deleteMidELeOfStack {
    public static void main(String[] args) {

        deleteMidELeOfStack obj = new deleteMidELeOfStack();
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        obj.deleteMid(stack,4);




    }
    public void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here

        double d = (sizeOfStack+1)/(double)2;
        int midEle  = (int)Math.ceil(d);
        Stack<Integer>st = new Stack<>();

        while(midEle-- > 0){
            st.add(s.pop());
        }

        st.pop();

        while(!st.isEmpty()){
            s.add(st.pop());
        }

    }
}
