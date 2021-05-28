package week1.day1;

public class OccurenceChar {
    public static void main(String[] args) {
        String str="rupareddy";
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='r'){
                count++;
            }
        }
        System.out.println("occurence of char r is " + count +" times ") ;
    }
}
