package COM.ARRAYS.EASY;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

            for(int i = 0; i<n; i++){
                int doll = sc.nextInt();
                if(map.containsKey(doll)){
                    map.replace(doll,map.get(doll)+1);
                }
                else{
                    map.put(doll,1);
                }
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(!(entry.getValue() % 2 == 0)){
                    System.out.println(entry.getKey());
                }
            }

        }
    }

    static void displayIterative(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    static void displayRecurisive(Node head){
        if(head != null){
            displayRecurisive(head.next);
            System.out.println(head.data);
        }
    }
}

class Node{
    int data;
    Node next;
    Node(){
        data = 0;
        next = null;
    }

    Node(int data){
        this.data = data;
        next  = null;
    }
}

