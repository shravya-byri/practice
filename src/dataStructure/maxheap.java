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
    static void swap(ArrayList<Integer> a, int i, int j) {
        int t = a.get(i);
        a.set(i, a.get(j));
        a.set(j, t);
    }
    public static int getMax(ArrayList<Integer> heap) {
        if (heap.isEmpty()) {
            System.out.println("Empty Heap");
            return -99;
        }
        int max = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int current = 0;
        while (
                ((2 * current + 2) < heap.size()) &&
                (
                        heap.get(current) < heap.get(2 * current + 1) ||
                        heap.get(current) < heap.get(2 * current + 2)
                )
        ) {
            int maxChildIndex;
            if (heap.get(2 * current + 1) > heap.get(2 * current + 2))
                maxChildIndex = 2 * current + 1;
            else
                maxChildIndex = 2 * current + 2;
            swap(heap, current, maxChildIndex);
            current = maxChildIndex;
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,5,4,3,6,7));
        ArrayList<Integer> h = new ArrayList<>();
        for (int i =0;i < a.size();i++) {
            insertHeap(h, a.get(i));
        }
        //insertHeap(h, 0);
        getMax(h);
        for (int i=0; i<h.size();i++) {
            System.out.print(h.get(i) + " ");
        }
    }
}


