package week1.day1;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mam";

        String b = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            b = b + str.charAt(i);

        }
        System.out.println(b);
        if (str.equalsIgnoreCase(b)) {

            System.out.println("given string is palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
