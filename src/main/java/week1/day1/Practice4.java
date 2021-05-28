package week1.day1;

import java.util.ArrayList;


public class Practice4 {
    public static void main(String[] args) {
        String str="we learn java basics as part of java session in java week1";
        int count=0;
        String[] splitstr=str.split(" ");
        for(int i=0;i<splitstr.length;i++) {
            for (int j = i + 1; j < splitstr.length; j++) {
                if (splitstr[i] .equals(splitstr[j])) {
                    count++;
                }
            }
            if (count > 1) {
              str=str.replace(splitstr[i],"");
            }
            count=0;
        }

       System.out.println(str.replace(" "," "));
        }
    }