package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergesort {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, int lb, int mid, int ub){
        int i = lb;
        int j = mid+1;
        int k = 0;
        ArrayList<Integer> b = new ArrayList<>();
        while (i <= mid && j <= ub) {
            if (a.get(i) <= a.get(j)) {
                b.add(a.get(i));
                i++;
            } else {
                b.add(a.get(j));
                j++;
            }
            k++;
        }
        if ( i > mid) {
            while ( j <= ub) {
                b.add(a.get(j));
                j++;
                k++;
            }
        }else {
            while (i <= mid){
                b.add(a.get(i));
                i++;
                k++;
            }
        }
        return b;

    }
      public static void printMerge(ArrayList<Integer> a){
        for( int i = 0; i <= a.size()-1; i++){
           System.out.print( a.get(i) + " ");
        }
      }
    public static ArrayList mergeSort(ArrayList<Integer> a, int lb, int ub ){
        ArrayList res = a;
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid + 1, ub);
            res = merge(a, lb, mid, ub);
        }
        return res;

    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,3,22,90,45,33,21,99,22));
        int lb = 0;
        int ub = a.size()-1;
        printMerge(mergeSort(a,lb,ub));
    }
}
