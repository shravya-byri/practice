package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class maxheap {
    public static void insertHeap(ArrayList<Integer> heap, int k) {
        heap.add(k);
//         while(parent is less than child)
        int current = heap.size() - 1;
        while (heap.get(parent(current)) < heap.get(current)) {
            int t = heap.get(current);
            heap.set(current, heap.get(parent(current)));
            heap.set(parent(current), t);
            current = parent(current);
        }


    }
    static int parent(int child) {
        return ((child - 1) / 2);
    }
    public static void deleteHeap(ArrayList<Integer> heap, int k) {

    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,5,4,3,6,7));
        ArrayList<Integer> h = new ArrayList<>();
        for (int i =0;i < a.size();i++) {
            insertHeap(h, a.get(i));
        }
        insertHeap(h, 0);
        for (int i=0; i<h.size();i++) {
            System.out.print(h.get(i) + " ");
        }
    }
}


