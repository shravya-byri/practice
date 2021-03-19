package ad_hoc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class permutation {
    public static void main(String[] args) {
        String sampleString1 = "shravya";
        String sampleString2 = "ayvarhs";
       System.out.println(compare(sampleString1,sampleString2));
    }


    static boolean compare(String str1, String str2) {

        HashMap<Character, Integer> counters1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character currentChar = str1.charAt(i);

            if (counters1.get(currentChar) == null) {
                counters1.put(currentChar, 1);
            } else
                counters1.put(currentChar, counters1.get(currentChar) + 1);

        }
        System.out.println(counters1);

//        HashMap<Character, Integer> counters2 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            Character currentChar1 = str2.charAt(i);

            if (counters1.get(currentChar1) == null) {
                counters1.put(currentChar1, 1);
            } else
                counters1.put(currentChar1, counters1.get(currentChar1) - 1);

        }
        System.out.println(counters1);

        for (Map.Entry<Character, Integer> e: counters1.entrySet()) {
            if (e.getValue() != 0) {
                return false;
            }
          //  System.out.println(e);
        }
        return true;
    }

    static boolean isPermuation(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.compare(a1, a2) == 0;
    }
}
