package day02;

public class step2{

    public static void main(String[] args) {

        //형변환 : 자료형 변환
        //1. 묵시적/자동 형변환 : 메모리 크기가 작은것부터 큰 순으로
        //2. 데이터 손실 없음
        // byte -> int -> long -> float -> double
        byte byteValue = 10; //바이트(1)에 변수 10대입
        int intValue = byteValue; //바이트(1) -> 인트(4) 묵시적 형변환
        System.out.println("intValue = " + intValue);

        char charValue = '가'; //차(2) 가 대입
        intValue = charValue; //차(2) -> 인트(4) 묵시적 형변환
        System.out.println("intValue = " + intValue);


        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 100;
        float floatVlaue = longValue;

        floatVlaue = 100.5f;
        double doubleValue = floatVlaue;
        System.out.println("doubleValue = " + doubleValue);
        
        byte b1 = 10; byte b2 = 20;
        int result1 = b1 + b2;
        System.out.println("result1 = " + result1);

        byte b3 = 30; long l1 = 100;
        long result2 = b3 + l1;

        char c1 = 'A'; char c2 = 'B';
        int result = c1+c2;     //char + char => int

        int i1 = 10; double d1 = 4.0;
        double result4 = i1+d1;


                //2. 명시적/강제 형변환
            //1. 메모리 크기가 큰것부터 작은 순으로
            //2. 데이터 손실 있을수도 있다
        // byte < int <long <float <double

        int intValue2 = 10;
        //byte byteValue2 = intValue2; //오류 명시적 형변환 4->1
        byte byteValue2 = (byte)intValue2;
        System.out.println("byteValue2 = " + byteValue2);

        long longValue2 = 300;
        int intValue3 = (int)longValue2;

        int intValue4 = 65;
        char charValue2 = (char) intValue4;
        System.out.println("charValue2 = " + charValue2);

        double doubleValue2 = 3.14;
        int intValue5 = (int) doubleValue2;
        System.out.println("intValue5 = " + intValue5);

        char ch1 = 'A';
        int intValue6 = ch1;
        System.out.println("intValue6 = " + intValue6);
        
        int value1 = 10; double value2 =2.0;
        int result7 = (int) (value1+value2); //더하기 하고 나서 형변환
        System.out.println("result7 = " + result7);
    
    }

}
