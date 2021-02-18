package ad_hoc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RecMax {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(500,1, 3, 6, 8, 99,89,104));
        int current_max = Integer.MIN_VALUE;
        System.out.print(recurMax(a,current_max,0));
        System.out.print(a.size());
    }
    static int recurMax(ArrayList<Integer> a,int current_max, int i) {
        if( i == a.size()) return current_max;
        else{
            if(a.get(i) > current_max)
               current_max = a.get(i);
            return recurMax(a, current_max, i+1);
        }

    }
}
