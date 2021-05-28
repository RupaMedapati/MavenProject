package week1.day1;

public class MyCalculator {
    public static void main(String[] args) {
       Calculator obj=new Calculator();
        System.out.println("sum" +" " +obj.add(3,5,6));
        System.out.println("sub" + "="+ obj.sub(6,5));
        System.out.println("mul" + obj.mul(60.0,7.9));
        System.out.println("div" + obj.div(6,3));
    }

}
