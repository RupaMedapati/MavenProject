package week1.day1;

import java.util.Locale;
import java.lang.Character;

public class OddIndexToUpper {
    public static void main(String[] args) {
        String str = "rupabhavani";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 != 0) {
                System.out.print(ch[i] = Character.toUpperCase(ch[i]));
            } else {
                System.out.print(ch[i]);
            }
        }
    }
}
