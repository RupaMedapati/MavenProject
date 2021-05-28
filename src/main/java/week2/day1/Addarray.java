package week2.day1;


public class Addarray {
    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % n == 0) {
                sum = sum + i;
            }

            // System.out.println(sum);
            else
                j = j + i;

        }

        System.out.println(j - sum);
    }
}

