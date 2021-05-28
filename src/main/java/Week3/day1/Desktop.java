package Week3.day1;

public class Desktop implements Hardware,Software{

    @Override
    public void hardwareResources() {
        System.out.println("this is hardwareresources");
    }

   // @Override
   // public void hardwareResources() {
       // System.out.println("this is softwareresources");
   // }

    public static void main(String[] args) {
        Hardware obj=new Desktop() ;



        obj.hardwareResources();
       // obj.softwareResources();
    }
}
