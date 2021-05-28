package week1.day1;

public class FindTypes {
    public static void main(String[] args) {


        String str = "hello1all   876*/(";
        int letter=0;
        int space=0;
        int digit=0;
        int specialchar=0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length;i++){
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                letter++;
            }
                else if (Character.isSpaceChar(ch[i])){
                  space++;}
                else if(Character.isDigit(ch[i])) {
                digit++;
            }
                else{
                    specialchar++;

                }
            }
        System.out.println("letters in given string:" +letter);
        System.out.println("space in given string:" +space);
        System.out.println("digits in given string:" +digit);
        System.out.println("specialchar in given string:" +specialchar);

    }
}
