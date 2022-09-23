package COM.PRIORITYQUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator());
        pq.add(4);
        pq.add(2);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(3);
        System.out.println(pq);


    }
}


class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer number1, Integer number2){
        int value =  number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
