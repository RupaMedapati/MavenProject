package Week3.day1;

public class MyBank {
    public static void main(String[] args) {
        IOB obj=new IOB();
        obj.maximumLoanAmount();
        obj.iT();
        obj.minimumBalance();
        SBI obj1=new SBI();
        obj1.minimumBalance();
        obj1.maximumLoanAmount();
        RBI bank=new SBI();
        bank.maximumLoanAmount();
        bank.minimumBalance();
    }
}
