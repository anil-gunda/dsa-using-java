package COM.STACK;
import java.util.*;


public class MaxxDifference {
    public static void main(String[] args) {

    }
}

//{ Driver Code Starts


class Solution
{
    int findMaxDiff(int a[], int n)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int LS[] = new int[n];
        int RS[] = new int[n];

        LS[0] = 0;
        RS[n-1] = 0;

        st.push(a[0]);
        for(int i =1; i<n; i++){
            if(st.peek() < a[i]){
                LS[i] = st.peek();
            }
            else{

                while(!st.isEmpty() && st.peek() > a[i]){
                    st.pop();
                }

                if(st.isEmpty()) LS[i] = 0;

                else LS[i] = st.peek();
            }

            st.push(a[i]);
        }

        while(!st.isEmpty()){
            st.pop();
        }

        st.push(a[n-1]);

        for(int i = n-2; i>=0; i--){
            if(st.peek() < a[i]){
                RS[i] = st.peek();
            }

            else{
                while(!st.isEmpty() && st.peek() > a[i]){
                    st.pop();
                }

                if(st.isEmpty()) RS[i] = 0;

                else RS[i] = st.peek();
            }

            st.push(a[i]);
        }

        int maxDiff = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            int diff = Math.abs(LS[i]-RS[i]);
            maxDiff = Math.max(diff,maxDiff);
        }

        return maxDiff;



    }
}