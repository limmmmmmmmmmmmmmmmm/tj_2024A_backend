package main.java.example.day04;

public class step01 {

    public static void main(String[] args) {

        //[1] 문자열[불변] 선언하는 두가지 방법
        String str1 = new String("abc"); //힙영역 ,    302번지참조(객체) -> 상수풀 참조
        String str2 = "test"; //상수풀, 메소드영역 ,    상수풀 참조
        String str3 = "test"; //상수풀, 메소드영역 ,    상수풀 참조
        String str4 = new String("abc"); //힙영역 ,    402번지참조(객체) -> 상수풀 참조

        System.out.println(str2==str3); //true //참조변수의 참조주소가 같다
        System.out.println(str2.equals(str3));  //true

        System.out.println(str1==str4); //false //참조변수의 참조주소가 다르다.
        System.out.println(str1.equals(str4)); //true

        //[2] 두 문자열 연결하는 방법
            // [2-1] 문자열.concat(문자열2)       : 두 문자열을 연결한 새로운 문자열 반환 함수
        String javaStr = new String("java");
        String androidStr = new String("androidStr");
        System.out.println(System.identityHashCode(javaStr));   // 연결 전
        javaStr = javaStr.concat(androidStr);
        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr));   //연결 후

            //[2-2] 문자열1 += 문자열2            : 변수 = 변수 + 값
        String html1 = "<div>";
        String html2 = "하하</div>";
        System.out.println(System.identityHashCode(html1)); // 연결 전
        html1+=html2;
        System.out.println(html1);
        System.out.println(System.identityHashCode(html1)); //연결 후

            // [2-3] StringBuilder :  기존 메모리 문자열을 사용하는 연결 클래스
        String javaStr2 = new String("java");
        String androidStr2 = new String("androidStr2");
        System.out.println(System.identityHashCode(javaStr2));

        StringBuilder buffer = new StringBuilder(javaStr2);
        System.out.println("연결전 : "+System.identityHashCode(buffer)); // 주소값 동일
        buffer.append(androidStr2);
        System.out.println("연결후 : "+System.identityHashCode(buffer)); // 주소값 동일


        javaStr2 = buffer.toString();
        System.out.println(javaStr2);
        System.out.println(System.identityHashCode(javaStr2));



    }




}
