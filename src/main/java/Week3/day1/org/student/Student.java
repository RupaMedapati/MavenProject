package Week3.day1.org.student;
import Week3.day1.org.department.Department;

public class Student extends Department {
    public void studentName(){
        System.out.println("xyzz");
    }
    public void studentDept(){
        System.out.println("ece");
    }
    public void studentId(){
        System.out.println("17yr4561");
    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.collegeName();
        obj.collegeCode();
        obj.collegeRank();
        obj.studentName();
        obj.studentDept();
        obj.studentId();
        obj.deptName();
    }
}
