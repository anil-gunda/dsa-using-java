package COM.STACK;

import java.util.*;
public class InfixToPostfix{

    public static void main(String[] args) {
        String infix = "((a+b)*c)-d^e^f";
        System.out.println(infixToPostfix(infix));
    }

    static String infixToPostfix(String infix){
        Stack<Character> st = new Stack<>();
        String postfix = "";
        int len = infix.length();
        int i  = 0;

        while(i < len){
            char ch = infix.charAt(i);

            if(!isOperator(ch)){
                postfix+=ch;
                i++;
            }
            else{
                if(st.isEmpty()){
                    st.push(ch);
                    i++;
                }

                else if(outStackPrece(ch) == inStackPrece(st.peek())){
                    st.pop();
                    i++;
                }

                else if(outStackPrece(ch) > inStackPrece(st.peek())){
                    st.push(ch);
                    i++;
                }
                else{
                    postfix+=st.pop();
                }
            }
        }

        while(!st.isEmpty()){
            postfix+=st.pop();
        }

        return postfix;
    }

    static boolean isOperator(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch =='(' || ch == ')') return true;
        return false;
    }

    static int outStackPrece(char ch){
        if(ch == '+' || ch =='-') return 1;
        else if(ch == '*' || ch == '/') return 3;
        else if(ch == '^') return 6;
        else if(ch=='(') return 7;
        else return 0;

    }

    static int inStackPrece(char ch){
        if(ch == '+' || ch =='-') return 2;
        else if(ch == '*' || ch == '/') return 4;
        else if(ch == '^') return 5;
        else  return 0;

    }


    // static String infixToPostfix(String infix){
    // 	Stack<Character> st = new Stack<>();
    // 	int len = infix.length();
    // 	String postfix ="";
    // 	int i = 0;

    // 	while(i < len){
    // 		char ch = infix.charAt(i);
    // 		if(!isOperand(ch)){
    // 			postfix+=ch;
    // 			i++;
    // 		}
    // 		else{
    // 			if(st.isEmpty()){
    // 				st.push(ch);
    // 				i++;
    // 			}
    // 			else if(precedence(ch) > precedence(st.peek())){
    // 				st.push(ch);
    // 				i++;
    // 			}else{
    // 				postfix+=String.valueOf(st.pop());
    // 			}
    // 		}
    // 	}

    // 	while(!st.isEmpty()){
    // 		postfix+=String.valueOf(st.pop());
    // 	}

    // 	return postfix;
    // }

    // static boolean isOperand(char ch){
    // 	if(ch == '+' || ch=='-' || ch=='*' || ch=='/') return true;
    // 	return false;
    // }

    // static int precedence(char ch){
    // 	if(ch == '+' || ch == '-') return 1;
    // 	else if(ch == '*' || ch == '/') return 2;
    // 	return 0;
    // }
}