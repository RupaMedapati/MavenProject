package week1.day1;

public class AddDigits {
    public static void main(String[] args) {
        int n=576;
        int sum=0;
        while(n!=0){
           int a =n%10;
           sum=sum+a;
           n=n/10;
        }
        System.out.println("sum of digits is:"+sum);
        //sout

    }
}
