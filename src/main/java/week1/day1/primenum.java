package week1.day1;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be checked");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("given number is prime number");
            }
            else
                System.out.println("given number is not a prime number");


        }
    }

