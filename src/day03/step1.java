package day03;

import java.util.Scanner;

public class step1 {
    public static void main(String[] args) {

        //System.out : 시스템 출력, console 출력창
        //System.im : 시스템입력, 키보드


        // 입력 객체 만들기
        //1. new Scanner();            Scanner 클래스 :입력에 관련된 객체 생성
        //2. new Scanner(System.in);
        //3. Scanner scan = new Scanner(System.in); : Scanner 타입으로 변수에 생성된 입력객체를 저장한다.
        //4. 입력객체의 메소드를 이용한 입력값 가져오기

        // 1. next() : 키보드 입력받은 바이트/자료 을 문자열 타입으로
        /*
            next() : 띄어쓰기 포함된 문자열도 입력받기 불가능
            nextLine() : 띄어쓰기 포함된 문자열도 입력받기 가능
         */


        Scanner scan = new Scanner(System.in);

        //1.
        scan.next();//입력
        String str1 = scan.next(); //저장
        System.out.println("str1 = " + str1);  //출력
        //2.
        scan.nextLine(); //의미없는 입력 메소드

        String str2 = scan.nextLine();
        System.out.println("str2 = " + str2);

        
        //3. 논리
        boolean b1= scan.nextBoolean();
        System.out.println("b1 = " + b1);
        
        //4. 바이트 : 허용범위내 입력
        byte by2 = scan.nextByte();
        System.out.println("by2 = " + by2);
        
        //5. 쇼트
        short sh1 = scan.nextShort();
        System.out.println("sh1 = " + sh1);

        //6. 인트
        int int1 = scan.nextInt();
        System.out.println("int1 = " + int1);
        
        //7. 롱
        long long1 = scan.nextLong();
        System.out.println("long1 = " + long1);
        
        //8. 플룻
        float f1 = scan.nextFloat();
        System.out.println("f1 = " + f1);
        
        //8. 더블
        double d1 = scan.nextDouble();
        System.out.println("d1 = " + d1);
    }

}
