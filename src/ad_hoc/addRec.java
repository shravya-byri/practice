package ad_hoc;

import java.util.ArrayList;
import java.util.Arrays;

public class addRec {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3 , 5, 7));
        System.out.println(sumAll1(a, a.size()-1));
//        System.out.print(a);
//        String j = "as";
//        printer(j);
//        System.out.print(j);
    }
    static void printer(String k) {
//        System.out.print(k);
        k = k+"a";
    }
    static int sumAll(ArrayList<Integer> p) {
        int sum = 0;
        for( int i = 0; i < p.size(); i++){
            sum = sum + p.get(i);
        }
        return sum;
    }
    static int sumAll1(ArrayList<Integer> p, int i){
        if(i < 0) return 0;
        else return p.get(i) + sumAll1(p, i-1);
    }
}
