package week1.day1;

public class SumOfDigitsFromString {
    public static void main(String[] args) {
        String str="rupa12r45";
        int sum=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){

            if(Character.isDigit(ch[i])){
           int n=     Integer.parseInt(String.valueOf(ch[i]));
           // int n=    Character.getNumericValue(ch[i]);
            sum=sum+n;

            }

        }
        System.out.println("sum of digits from string is" + sum);
    }
}
