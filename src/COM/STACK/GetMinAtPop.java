package COM.STACK;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GetMinAtPop {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Stack<Integer>st = GetMinAtPop.push(arr, 5);
        GetMinAtPop._getMinAtPop(st);
        Queue<Integer> qu = new LinkedList<>();


    }
    public static Stack<Integer> push(int arr[], int n)
    {
        // your code here
        int min = Integer.MAX_VALUE;
        int DEMO_VAL = 100;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            if(st.isEmpty() || arr[i] <  min){
                min = arr[i];
            }

            st.push((arr[i] * DEMO_VAL) + min);
        }

        return st;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        int DEMO_VAL = Integer.MAX_VALUE;
        while(!s.isEmpty()){
            System.out.print(s.pop() % DEMO_VAL);
        }

    }
}
