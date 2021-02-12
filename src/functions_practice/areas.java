package functions_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class areas {
    public static void main(String[] args) {

        int r1 = 7;
        int r2 = 8;
        int r3 = 9;
        int a = 3;
        int b = 5;
       double result = areaOfCircle(r1) + areaOfCircle(r2) + areaOfCircle(r3) - areaOfRectangle(a,b);
        System.out.println(result);


    }
    static Double areaOfCircle(int radius){
         Double area;
         area = 3.14 * radius * radius;
         return area;
    }
    static int areaOfRectangle(int length, int breadth) {
        int area;
        area = length * breadth;
        return area;

    }
}
