package ctci;

import java.util.HashMap;
import java.util.Map;

public class uniqueCharsInString {
    public static void main(String[] args) {
        String sampleString = "shravya";
        System.out.println(isUnique(sampleString));
    }
    static boolean isUnique(String str) {
        HashMap<Character, Integer> counters = new HashMap<>();
        //System.out.println(counters);
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            //System.out.println(currentChar);
            System.out.println(counters);
            if (counters.get(currentChar) == null) {
                counters.put(currentChar, 1);
            } else {
                counters.put(currentChar, counters.get(currentChar) + 1);
            }
        }
        for (Map.Entry<Character, Integer> e: counters.entrySet()) {
            if (e.getValue() > 1) {
                return false;
            }
        }
        return true;
    }
}
