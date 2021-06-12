package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class practice5 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 3, 2, 10};
        int[] res = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i])
                    count = count + 1;
            }
            res[i] = count;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(res[k]);
            if (k != arr.length - 1) {
                System.out.println(",");
            }

        }
    }
}














