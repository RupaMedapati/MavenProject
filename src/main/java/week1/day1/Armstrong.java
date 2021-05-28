package week1.day1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter number:");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
           int a = n%10;
            sum=sum+(a*a*a);
            n=n/10;

        }
        if(sum==temp){
            System.out.println("Given number is armstrong number");
        }
        else
            System.out.println("Given number is not armstrong");
    }
}
