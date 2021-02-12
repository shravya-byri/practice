import java.util.ArrayList;

public class functions {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        for(int i = 0; i< nums.size(); i++) {
//            System.out.print(nums.get(i) + " ");
//            System.out.print(nums.get(i) * nums.get(i) * nums.get(i) + " ");
//            System.out.print(nums.get(i) * nums.get(i) * nums.get(i) * nums.get(i) + " ");
//           System.out.println(nums.get(i) * nums.get(i) * nums.get(i) * nums.get(i) * nums.get(i));
           System.out.print(power(nums.get(i), 1) + " ");
            System.out.print(power(nums.get(i), 3) + " ");
            System.out.println(power(nums.get(i), 5));
        }
    }

    static int power(Integer element, Integer exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++ ) {
            result = result * element;
        }
        return result;
    }

}
