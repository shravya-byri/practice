import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList();
        cars.add(1);
        cars.add(4);
        cars.add(7);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) * cars.get(i));
        }
    }

}
