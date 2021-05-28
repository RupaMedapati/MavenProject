package week1.day1;

import java.util.Arrays;
import java.lang.String;

public class Anagaram {

static boolean   res=true;
    public static void main(String[] args) {
        Anagaram obj = new Anagaram();
      //  obj.anagaram("silen", "listen");
        if( obj.anagaram("silen", "listen")){
            System.out.println("anagaram");
        }
        else
            System.out.println("not anagaram");

       // else{
           // System.out.println("not anagaram");
      //  }



    }

    public  boolean  anagaram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean res = Arrays.equals(ch1, ch2);
return res;

    }
}

