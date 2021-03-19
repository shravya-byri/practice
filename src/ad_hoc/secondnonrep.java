package ad_hoc;

import java.util.ArrayList;
import java.util.Arrays;

public class secondnonrep {
    public static void main(String[] args) {
//        ArrayList<String> sri = new ArrayList<>(Arrays.asList("aaaabbcdffhhh"));
        System.out.println(nonRep("ahhihhm"));

    }

    static Character nonRep(String sri) {
        int i = 0;
        int c = 0;
        int counter = 0;
        for (int j = 0; j < sri.length(); j++) {
            if (sri.charAt(i) == sri.charAt(j)) {
                c++;
            }
            //if(j == sri.length()-1 && i < j) return sri.charAt(j);
            else {
                if (c == 1) {
                    if (counter == 1)  return sri.charAt(i);
                    else counter++;
                }
                  if(j == sri.length()-1 && i < j) return sri.charAt(j);
                   else {
                       i = j;
                       c = 1;
                   }
                }
        }
            return ' ';
        }

    }



