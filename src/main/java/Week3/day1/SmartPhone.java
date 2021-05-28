package Week3.day1;

public class SmartPhone extends AndroidPhone {
    public void connectWhatsApp(){
        System.out.println("connected to whatsapp");
    }

    public static void main(String[] args) {
        SmartPhone obj=new SmartPhone();
        obj.makeCall();
        obj.saveContact();
        obj.takeVideo();
        obj.connectWhatsApp();
    }
}
