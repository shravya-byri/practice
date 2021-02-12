package ad_hoc;
import java.util.ArrayList;
import java.util.Arrays;

public class maxNum {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1111, 3, 5, 7, 4, 9, 12, 24,101));
//        System.out.print(recMax(a));
    }
    static int maxNum1(ArrayList<Integer> a) {
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i< a.size(); i++) {
            if (a.get(i) > currentMax) {
                currentMax = a.get(i);
            }
        }
        return currentMax;
    }
    static int minNum1(ArrayList<Integer> a){
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i< a.size(); i++){
            if(a.get(i) < currentMin){
                currentMin = a.get(i);
            }

        }
        return currentMin;
    }
    static int oddMax(ArrayList<Integer> a){
        int currentMax = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++){
                if((a.get(i) > currentMax) && (a.get(i) %2 != 0)){
                    currentMax = a.get(i);
            }
        }
        return currentMax;
    }
    static int recMax(ArrayList<Integer> a  ){
        return 0;
    }

}
