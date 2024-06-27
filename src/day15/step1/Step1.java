package day15.step1;

public class Step1 {
    public static void main(String[] args) {

        // [1]. 일반 예외 : 발생할수도 있고 안할수도 있고, 컴파일러 무조건 예외처리 검사
        try {
            //예외가 발생할것 같은=======
        Class.forName("java.lang.String");                        // .forName(클래스명) : 해당 클래스명이 존재하는지 검사해주는 함수
        Class.forName("java.lang.String2");
        // =================================
        }catch (ClassNotFoundException e){
            //예외가 발생 했을떄=============
            System.out.println(e); // 로그를 남기고 추후에 개발자가 코드 수정
            //=============================
        }

        // [2]. 실행 예외 : 발생 할수도 있고 안할수도 있고 (방지)
        try {
            String str1 = "ThisIsJava";
            System.out.println(str1.length());  // 문자열.length() : 문자열길이
            String str2 = null;
            System.out.println(str2.length()); // .(도트/접근)연산자 , 객체내 멤버변수 메소드 접근
        }catch (NullPointerException e){
            System.out.println(e);
        }



    }
}
