package Week3.day1;

import java.util.Scanner;

public class Checknum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();

       System.out.println(Chechnums(n));

    }
   public static int Chechnums(int n){
      int sum=0;
      int y=0;
      int a;
      while(n!=0){
          a=n%10;
          n=n/10;
          sum=a+n;
      }
      y=n/sum;
        return y;

    }
}
