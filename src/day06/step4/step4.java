package day06.step4;

import java.util.Scanner;

public class step4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int speed = 0;
        String color = "빨강";
        String carNumber = "123가4567";


        while (true){;
            System.out.println("");
            System.out.print(">>>1.증속 2.감속 3.중지 :");

            int ch = scanner.nextInt();
            //조건문
            if (ch==1){
                speed++;
                System.out.println(">>증속(속도증가) 현재속도 : " + speed ); }
            else if (ch==2) {
                speed--;
                System.out.println(">>증속(속도감소)현재속도 : " + speed ); }
            else if (ch==3) {
                System.out.println(">>중지");
                speed = 0;
                break;
            }
            else {System.out.println("알수없는 입력번호 입니다.");}

        }

    }

}
