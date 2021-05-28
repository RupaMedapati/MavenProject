package Week3.day1;

public class IOB   implements RBI,Andhra{
    @Override
    public void minimumBalance() {
        System.out.println("2000");
    }

    @Override
    public void maximumLoanAmount() {
        System.out.println(1000);
    }
    public void iT(){
        System.out.println("it loan");
    }

   // @Override
    //public void getStudentInfo(int id, String name) {
       // super.getStudentInfo(id, name);
   // }

    public static void main(String[] args) {
        IOB obj=new IOB();
        obj.maximumLoanAmount();
       // obj.getStudentInfo(1,"tyr");
    }
}
