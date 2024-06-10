package day03;

import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //입력 받고 변수에 저장
      /*  System.out.print("작성자 = " ); String 작성자 = scanner.next();

        scanner.nextLine();
        System.out.print("방문록 = " ); String 방문록 = scanner.nextLine();

        System.out.print(" 나이 = " ); int 나이 = scanner.nextInt();

        //출력
        System.out.printf("작성자 : %s \t 나이 :%3d", 작성자, 나이);
        System.out.printf("방문록 : %s \n " , 방문록);

*/

        System.out.print("기본급 = " ); int 기본급 = scanner.nextInt();
        System.out.print("수당 = " ); int 수당 = scanner.nextInt();

        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);


        double 세금 = 기본급*0.1;

        System.out.println("실수령액 = " + (기본급+수당-세금));
        System.out.println("실수령액 = " + 실수령액);

    }
}
