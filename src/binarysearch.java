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

        ArrayList<Integer> search = new ArrayList<>(Arrays.asList(0,2,8,44,10,15,88,117,138,109,210));

        System.out.println(searchNumber(search,210));

    }
}
