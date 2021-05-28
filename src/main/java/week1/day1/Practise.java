package week1.day1;

import org.apache.commons.lang3.StringUtils;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Practise {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        ArrayList<String> ls=new ArrayList<String>();
        ArrayList<String> ls1=new ArrayList<String>();
           ls1.add("rupa");
           ls1.add("bha");
           ls1.add("hi");
           for(int k=0;k<ls1.size();k++){
               System.out.println(ls1.get(k));
           }
        ls.add("red");
        ls.add("blue");
        ls.add("green");
        ls.add(0,"yellow");
       ls.set(0,"black");
       ls.remove(3);
       // System.out.println(ls.c);
        System.out.println(ls.contains("red"));
        System.out.println( ls.get(1));
        System.out.println("--------");
        System.out.println(ls);
        Collections.copy(ls1,ls);
        System.out.println(ls1);
        Collections.reverse(ls1);
        System.out.println(ls1);
        System.out.println(ls1.subList(1,2));
        Collections.sort(ls);
        System.out.println(ls);


        }
        }

















