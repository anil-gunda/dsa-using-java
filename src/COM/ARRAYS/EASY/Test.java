package COM.ARRAYS.EASY;

import java.util.*;
class Test{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.print(longestSubStrDistinctChar(str));
    }

    public  static int longestSubStrDistinctChar(String str){
        int maxLen = -1;
        String test = "";
        if(str.isEmpty()){
            return 0;
        }
        else if(str.length() == 1){
            return 1;
        }

        for(char ch : str.toCharArray()){
            String current  = String.valueOf(ch);
            if(test.contains(current)){
                test = test.substring(str.indexOf(current)+1);

            }
            test = test + ch;
            maxLen = Math.max(test.length(),maxLen);
        }

        return maxLen;
    }

    public static String reverseWords(String str){
        String arr[] = str.split("\\.",0);
        int len = arr.length;
        String res = "";
        res += arr[len-1];
        for(int i = len-2; i>=0; i--){
            res+=".";
            res+=arr[i];
        }

        return res;
    }

    public static boolean isPar(String str){
        int len = str.length();
        Stack<Character> st = new Stack<>();
        char ch = str.charAt(0);
        if(ch == '}' || ch == ']' || ch == ')'){
            return false;
        }
        st.push(ch);
        for(int i = 1; i<len; i++){
             ch = str.charAt(i);

             if(ch == '}' || ch == ']' || ch == ')'){
                 if(st.isEmpty()){
                     return false;
                 }
                 if(ch == '}' && st.peek() == '{'){
                     st.pop();
                 }
                 else if(ch == ']' && st.peek() == '['){
                     st.pop();
                 }
                 else if(ch == ')' && st.peek() == '('){
                     st.pop();
                 }
                 else{
                     st.push(ch);
                 }
             }
             else{
                 st.push(ch);
             }
        }

        if(st.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String printSequence(String S){
        String arr[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                        };
        String output = "";
        int len = S.length();
        for(int i = 0; i<len; i++){
            char ch = S.charAt(i);
            if(ch == ' '){
                output+="0";
            }else{
                int index = ch  - 'A';
                output+=arr[index];
            }
        }
        return output;
    }

    static String longestCommonPrefix(String arr[], int n){

        String minLenString = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i].length() < minLenString.length()){
                minLenString = arr[i];
            }
        }
        int minLen = minLenString.length();

        for(int i = 0; i<n && minLen>0;){
            String subString = arr[i].substring(0,minLen);
            if(!minLenString.equals(subString)){
                minLen--;
                minLenString = minLenString.substring(0,minLen);
                i = 0;
            }else{
                i++;
            }

        }
        if(minLen == 0){
            return "-1";
        }else{
            return minLenString;
        }
    }
}


class SortByLen implements Comparator<String>{

    public int compare(String a, String b){
        if(a.length() == b.length()){
            return 0;
        }
        else if(a.length() > b.length()){
            return 1;
        }else{
            return -1;
        }
    }
}