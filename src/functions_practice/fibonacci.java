package functions_practice;

import java.util.ArrayList;

public class fibonacci {
    public static void main(String[] args) {
        System.out.print(fibo1(5));

    }

    static int fibo(int num) {
        ArrayList<Integer> var = new ArrayList();
        var.add(1);
        var.add(1);
        int x = 1;

                for (int i = 2; i <= num ; i++) {
                    x = var.get(i-1) + var.get(i-2);
                    var.add(x);
                }

            return  x;
    }
    static int fibo1(int num) {
        int a = 1;
        int b = 1;

        for ( int i = 2; i <= num; i++){
            b = a + b ;
            a = b - a ;
        }
        return b;
    }
    static int fibo3(int num) {
        if (num < 2) return 1;
        else return fibo3(num-1) + fibo3(num-2);
    }
}
