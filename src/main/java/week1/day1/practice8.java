package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice8 {
    public static void main(String[] args) {
        int[] evenandodd = {3, 4, 1, 7, 9};
        ArrayList<Integer> even = new ArrayList<>();
       ArrayList<Integer> odd = new ArrayList<>();
        for (int l = 0; l < evenandodd.length; l++) {

            if (l % 2 == 0) {
               even.add(evenandodd[l]);


            } else {
                odd.add(evenandodd[l]);

            }


        }
        System.out.println(even);
        System.out.println(odd);

    }
}
