package Week3.day1;

public class Student {
    public int getStudentInfo(int id){
        return id;
    }
    public void getStudentInfo(int id,String name){
        System.out.println(id+" "+name);
    }
    public void getStudentInfo(String email,long phonenum){
        System.out.println(email+" "+phonenum);
    }

    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println(obj.getStudentInfo(1));
        obj.getStudentInfo(2,"xyz");
        obj.getStudentInfo("ry@gmail.com",2345678);
    }

}
