package week1.day1;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6};
        Arrays.sort(arr);
        int n=arr.length-1;
        int sumofdigits=(arr[n]*(arr[n]+1))/2;
        System.out.println(sumofdigits);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("missing num is"+ (sumofdigits-sum));
    }



}
