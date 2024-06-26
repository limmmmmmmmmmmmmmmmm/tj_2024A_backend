package day01;

public class Step3 {

    public static void main(String[] args) {

        byte b1 = -128;
        System.out.println("b1 : "+b1);
        byte b2 = 127;
        System.out.println("b2 : "+b2); //soutv +엔터

        // byte b3 = 200; 허용범위 넘어감

        //[2] short  -32,768 ~ 32,767
        short s1 = 32000 ;
        System.out.println("s1 = " + s1);
        short s2 = -32000;
        System.out.println("s2 = " + s2);
        // short s3 = 40000; // 저장가능한 허용범위 벗어남

        //[3] int : 대략 +-21억정도, 자바는 모든 정수 값을 기존으로 int
        int i1 = 2100000000;
        System.out.println("i1 = " + i1);
        // int i2 = 3000000000; // 저장 가능한 허용범위 벗어남


        //[4] long : 대략 +-21억 이상, 21억 이상의 자료는 뒤에 L 붙입니다.
        long l1 = 3000000000l;   System.out.println("l1 = " + l1); //뒤에 l 붙이면 가능함


        //2. 문자자료형, 문자1개만 저장 가능, ''작은따음표 사용, 65536개 문자 표현가능.
        //[5]. char
        char c1 = 'A';        System.out.println("c1 = " + c1);
        int i3 = 'A';         System.out.println("i3 = " + i3);
        char c2 = '가';        System.out.println("c2 = " + c2);
        int i4 = '가';         System.out.println("i4 = " + i4);
        //char c3 = '안녕';  // char 문자열 불가능

        //[6] string 클래스, 기본자료형이 아닌 클래스를 사용하므로 첫글자 대문자 String
        String str1 = "안녕하세요" ;
        System.out.println("str1 = " + str1);

        //3. 논리자료형
        //[7] boolean : true 혹은 false
        boolean boll1 = true;
        System.out.println("boll1 = " + boll1);
        boolean boll2 = false;
        System.out.println("boll1 = " + boll2);
        //boolean bool3 = 't' //허용범위 벗어남

        //4. 실수 자료형
        //[8]. double : [소수점 17자리 표현], 자바는 모든 실수 값을 기본으로 double
        double d1 = 0.1234567890123456789;
        System.out.println("d1 = " + d1);

        //[9]. float : [소수점 8자리 표현], 뒤에 F를 붙여야한다
        float f1 = 0.1234567890123456789f;
        System.out.println("f1 = " + f1);
        


    }

}
