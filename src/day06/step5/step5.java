package day06.step5;

import java.util.Scanner;

public class step5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int speed = 0;
//        String color = "빨강";
//        String carNumber = "123가4567";
        //변수 3개 대신에 Car 클래스/설계도 정의하기
        // 정의한 Car 클래스로 객체 생성
        Car myCar = new Car();
        myCar.speed = 0;
        myCar.color= "빨강" ;
        myCar.carNumber = "123가4567";



        while (true){;
            System.out.println("");
            System.out.print(">>>1.증속 2.감속 3.중지 :");

            int ch = scanner.nextInt();
            //조건문
            if (ch==1){
                myCar.speed++;
                System.out.println(">>증속(속도증가) 현재속도 : " + myCar.speed ); }
            else if (ch==2) {
                myCar.speed--;
                System.out.println(">>증속(속도감소)현재속도 : " + myCar.speed ); }
            else if (ch==3) {
                System.out.println(">>중지");
                myCar.speed = 0;
                break;
            }
            else {System.out.println("알수없는 입력번호 입니다.");}

        }

    }
}
