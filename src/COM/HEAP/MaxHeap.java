package COM.HEAP;

import java.util.ArrayList;

public class MaxHeap {
    ArrayList<Integer> array;

    MaxHeap(){
        array = new ArrayList<>();
    }

    void heapify(int i) {
        int size = array.size();
        int parent = i;
        int lchild = 2 * i + 1;
        int rchild = 2 * i + 2;
        if (lchild < size && array.get(lchild) > array.get(parent))
            parent = lchild;
        if (rchild < size && array.get(rchild) > array.get(parent))
            parent = rchild;

        if (parent != i) {
            int temp = array.get(parent);
            array.set(parent, array.get(i));
            array.set(i, temp);

            heapify(parent);
        }
    }

    void insert(int newNum) {
        int size = array.size();
        if (size == 0) {
            array.add(newNum);
        } else {
            array.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(i);
            }
        }
    }

    void deleteNode( int num)
    {
        int size = array.size();
        int i;
        for (i = 0; i < size; i++)
        {
            if (num == array.get(i))
                break;
        }

        int temp = array.get(i);
        array.set(i, array.get(size-1));
        array.set(size-1, temp);

        array.remove(size-1);
        for (int j = size / 2 - 1; j >= 0; j--)
        {
            heapify(j);
        }
    }

    int getmax(){
        int temp = array.get(0);
        array.set(0,array.get(array.size()-1));
        array.remove(array.size()-1);
        heapify(0);
        return temp;
    }

    void printArray() {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.insert(3);
        heap.insert(4);
        heap.insert(9);
        heap.insert(5);
        heap.insert(2);
        System.out.println(heap.getmax());
        heap.printArray();
        heap.insert(11);
        heap.printArray();


    }
}
