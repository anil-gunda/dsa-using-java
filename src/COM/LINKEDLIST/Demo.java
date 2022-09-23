package COM.LINKEDLIST;
import java.util.*;

public class Demo {

    String checkBraces(String input1){
        Stack<Character> st = new Stack<>();
        int len = input1.length();
        for(int i = 0 ;i <len; i++){
            char ch = input1.charAt(i);
            if(ch == '{'){
                st.push(ch);
            }
            else if(ch == '}' && st.peek() =='{'){
                st.pop();
            }

        }

        if(st.empty()){
            return "correct";
        }else {
            return "error";
        }
    }


    public static void main(String[] args) {
       System.out.println(Math.round(15/2));
    }

    public static char maxElement(String input1){
        int len = input1.length();
        int maxFreq = -1;
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<len; i++){
            char ch = input1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.replace(ch,map.get(ch)+1);
            }
        }
        char ch = '0';
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                ch = entry.getKey();
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxFreq){
                count++;
            }
        }
        if(count > 1){
            return '0';
        }
        else{
            return ch;
        }


    }


}
