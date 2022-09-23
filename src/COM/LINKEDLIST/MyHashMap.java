package COM.LINKEDLIST;

import java.util.*;

public class MyHashMap {

    private List<LinkedList<Node>> parentList;
    private final int SIZE = 11;
    private class Node{
        int key,value;
        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap(){
        parentList = new ArrayList<>();
        for(int i = 0; i<SIZE; i++){
            parentList.add(null);
        }
    }

    int hash(int key){
        return key%SIZE;
    }

    public void put(int key, int value){
        int index = hash(key);
        if(parentList.get(index)==null){
            LinkedList<Node> childList = new LinkedList<>();
            childList.addLast(new Node(key,value));
            parentList.set(index,childList);
        }
        else{
            LinkedList<Node> childList = parentList.get(index);
            int size = childList.size();
            for(int i = 0; i<size; i++){
                Node node = childList.get(i);
                if(node.key==key){ node.value = value; return;}
            }

            childList.addLast(new Node(key,value));

        }

    }

    public int get(int key){
        int index = hash(key);
        if(parentList.get(index) == null) return -1;
        LinkedList<Node> childList = parentList.get(index);
        int size = childList.size();
        for(int i = 0; i<size; i++){
            Node node = childList.get(i);
            if(node.key==key) return node.value;
        }

        return -1;
    }

    public void remove(int key){
        int index = hash(key);
        if(parentList.get(index) == null) return;
        LinkedList<Node> childList = parentList.get(index);
        int size = childList.size();
        int eleIndx = -1;
        for(int i = 0; i <size; i++){
            Node pair = childList.get(i);
            if(pair.key == key){
                eleIndx = i;
                break;
            }
        }
        if(eleIndx!=-1){
            childList.remove(eleIndx);
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        map.put(2,1);
        map.remove(2);

    }
}
