package week1.day1;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 7, 5, 3};
       // int count=1;
        for (int i = 0; i < arr.length; i++) {
          int count=1;
            for (int j = i + 1; j < arr.length; j++) {
                //int count = 1;
                if (arr[i] == arr[j] ) {
                    count++;
                }
            }

                if (count > 1)
                    System.out.println(arr[i]);
            }
        }
    }



