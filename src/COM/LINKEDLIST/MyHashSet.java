package COM.LINKEDLIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashSet {

    ArrayList<LinkedList<Integer>> list ;
    int size = 11;

    MyHashSet(){
        list = new ArrayList<>(size);
        for(int i = 0; i<size; i++){
            list.add(null);
        }
    }

    int hash(int key){
        return key%size;
    }

    void add(int key){
        if(contains(key)) return;
        int index = hash(key);
        if(list.get(index)==null){
            LinkedList<Integer> childList = new LinkedList<>();
            childList.addLast(key);
            list.set(index,childList);

        }else{
            list.get(index).addLast(key);
        }
    }

    void remove(int key){
        if(!contains(key)) return;
        int index = hash(key);
        LinkedList<Integer> ll = list.get(index);
        ll.remove(Integer.valueOf(key));

    }
    boolean contains(int key){
        int index = hash(key);
        if(list.get(index)==null) return false;
        LinkedList<Integer> ll = list.get(index);
        if(!(ll.contains(key))){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(11);
        set.add(12);
        set.add(22);
        set.remove(11);
        set.add(15);
    }
}
