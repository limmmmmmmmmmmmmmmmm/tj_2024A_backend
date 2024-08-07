package main.java.example.day03;

@SuppressWarnings("ALL")
public class step2 {
    public static void main(String[] args) {

        //1. 2개의 문자열 객체 생성
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";

        int i1 = 100;
        int i2 = 100;
        Integer i3 = 100;
        //래퍼클래스 : int형 기본타입은 메소드를 사용할수 없으므로 int 타입도 메소드를 사용하기 위해 만들어진 참조타입
            // JAVA : Integer.parseInt() : 문자열 타입을 정수타입 반환 "10"vs10 은 다르다.
            // vs js : parseInt()

        System.out.println(str1.hashCode()); //96354 (멤버변수 -> 502번지)
        System.out.println(str2.hashCode()); //96354 (멤버변수 -> 502번지)
        System.out.println(str3.hashCode()); //96354

        System.out.println(str1 == str2);   //false
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1 == str3);   //false
        System.out.println(str1.equals(str3));  //true

        System.out.println("int i");
        System.out.println(i1 ==  i2); //true
        //System.out.println(i1.equals); int는 참조타입이 아니므로 object클래스로부터 상속받지 못했다
        System.out.println(i3.equals(i1)); // Integer는 참조타입 이므로 Object 클래스로부터 상속 받았으므로 .equals() 사용가능

        //
        //str1.clone(); // 기본적으로 clone() 메소드 사용이 불가능
        Object object = new Object();
        // object.clone();



    }

}

/*
    스택 메모리              힙 메모리
        str1                 new String() : 302번지 주소값을 가지는 객체 생성

        str2                 new String() : 402번지 주소값을 가지는 객체 생성

     1. == : 다르다 . 302번지와 402번지를 가지는 두 스택변수는 다르다.
     2. equals() : 302번지와 402번지가 가지는 객체는 같다.

    [2]
          메소드 메모리               스택 메모리              힙 메모리
                                         str1                 new String() : 302번지 주소값을 가지는 객체 생성
             리터럴                                                멤버변수 : 502번지 주소값을 가진다.
                                         str2                 new String() : 402번지 주소값을 가지는 객체 생성
                                                                   멤버변수 : 502번지 주소값을 가진다.

 */