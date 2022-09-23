package COM.STACK;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {

    Stack<Integer> auxStack = new Stack<>();

    void push(int x){
        if(super.isEmpty()){
            super.push(x);
            auxStack.push(x);
        }
        else{
            int y = auxStack.peek();
            super.push(x);
            if(x < y){
                auxStack.push(x);
            }
            else{
                auxStack.push(y);
            }
        }

    }

    public Integer pop(){
        auxStack.pop();
        return super.pop();
    }

    Integer getMin(){
        return auxStack.peek();
    }


}
