import java.util.ArrayList;
import java.util.Arrays;

public class binarysearch {

    public static int searchNumber(ArrayList<Integer> a, int k) {
        int current1 = 0;
        int current2 = a.size();
        int m = (current1 + current2) / 2;
        while( k != a.get(m)) {
                   if (k > a.get(m)) {
                       current1 = m;
                  } else {
                     current2 = m;
                     }
            m = (current1 + current2) / 2;

        }
        return m;
    }

    public static void main(String[] args) {
            ArrayList<Integer> search = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
          System.out.println(searchNumber(search,10));

    }
}
