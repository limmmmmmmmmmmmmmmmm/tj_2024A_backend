package day10.step2;

import java.util.ArrayList;

public class Student {
    int studentID ;
    String name;
    ArrayList<Subject> subjectList; //더하기용



    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void ShowStudentInfo(){
        int total = 0;
        for (Subject s : subjectList){
            total+= s.getScore(); //총점 더하기
            System.out.println("학생"+ name +"의"+s.getName()+"과목성적은"
            +s.getScore()+"입니다.");
        }
        System.out.println("학생"+name+"의 총점은"+total+"입니다.");
        System.out.println(subjectList);
    }


}
