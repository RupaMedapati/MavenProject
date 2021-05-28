package Week3.day1;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicatePrintUseSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        for(Integer ar:arr){
            if(!hs.add(ar))
               hs1.add(ar) ;
        }
        System.out.println(hs1);
    }



}
