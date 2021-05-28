package Week3.day1;

public class Movezero {
    public static void main(String[] args) {
        int arr[]={3,0,4,0,2,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
