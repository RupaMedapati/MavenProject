package week2.day1;

import java.util.*;

public class Practice10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int[] b = new int[n];
int i;
int count;
        for ( i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> ls=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            if(ls.containsKey(arr[j])){
               count= ls.get(arr[i]);
               count++;
            }
            else{
                ls.put(arr[i],1);
            }
        }
        System.out.println(ls);
    }
}








