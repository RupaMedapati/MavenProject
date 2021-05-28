package Week3.day1;

public class Calculator {
    public void add(int a,int b){
        System.out.println(a+b);}
    public void add(int a ,int b,double c){
        System.out.println(a+b+c);}
    public void multiply(int a,double b){
        System.out.println(a*b);}
    public void multiply(int a,int b){
        System.out.println(a*b);}
    public void sub(int a,int b){
        System.out.println(a-b);}
    public void sub(int a,double b){
        System.out.println(a-b);}
    public void div(int a,double b){
        System.out.println(a*b);}



    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(1, 2);
        obj.add(2,3,4.8);
        obj.multiply(2,2.3);
        obj.multiply(3,4);
        obj.sub(2,3);
        obj.sub(4,4.5);
        obj.div(3,1.5);
    }
    }

