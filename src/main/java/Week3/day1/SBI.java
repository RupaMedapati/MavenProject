package Week3.day1;


public class SBI implements RBI{

    @Override
    public void minimumBalance() {
        System.out.println("6000");

    }

    @Override
    public void maximumLoanAmount() {
        System.out.println("100000");
    }

    public static void main(String[] args) {
        SBI obj=new SBI();
        obj.maximumLoanAmount();
        obj.minimumBalance();
    }
}
