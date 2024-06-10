package day03;

import java.util.Scanner;

public class step3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
        //        계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

        /*
        System.out.print("윗변 : " ); int 윗변 = scanner.nextInt();
        System.out.print("밑변 : " ); int 밑변 = scanner.nextInt();
        System.out.print("높이 : " ); int 높이 = scanner.nextInt();

        float 넓이 = (윗변 + 밑변) * 높이 / 2.0f;

        System.out.printf("넓이: %.1f\n",넓이);*/

/*
        System.out.print("1번째 정수 : " ); int 정수1 = scanner.nextInt();
        System.out.print("2번째 정수 : " ); int 정수2 = scanner.nextInt();
        System.out.print("3번째 정수 : " ); int 정수3 = scanner.nextInt();

        int 큰정수 = 정수1>정수2 && 정수1>정수3 ? 정수1 : 정수2>정수3 ? 정수2 : 정수3;
        System.out.println("큰정수 = " + 큰정수);*/


        System.out.print("ID : " ); String id = scanner.next();
        System.out.print("PW : " ); String pw = scanner.next();

        System.out.println(id.equals("admin") && pw.equals("1234")? "로그인성공" : "로그인실패");
        System.out.println(id.equals("admin") && pw.equals("1234")? "로그인성공" : "로그인실패");






    }




}
