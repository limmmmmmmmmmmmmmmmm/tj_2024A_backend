package day10.step2;

public class StudentTest {

    public static void main(String[] args) {

        Student studentlee = new Student(1001,"Lee"); //
        studentlee.addSubject("국어",100);
        studentlee.addSubject("수학",50);

        Student studentkim = new Student(1002, "Kim");
        studentkim.addSubject("국어",70);
        studentkim.addSubject("수학",85);
        studentkim.addSubject("영어",100);

        studentlee.ShowStudentInfo();
        System.out.println("====================");
        studentkim.ShowStudentInfo();


    }

}
