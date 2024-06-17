package Level1;

import java.util.Scanner;

public class Level1_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("회원명 String : " ); String st1 = scanner.next();
        System.out.print("상태 boolean : " ); boolean bl1 = scanner.nextBoolean();
        System.out.print("회원번호 byte : " ); byte by1 = scanner.nextByte();
        System.out.print("성별 char : " ); char c1 = scanner.next().charAt(0);
        System.out.print("나이 short : " ); short s1 = scanner.nextShort();
        System.out.print("포인트 int : " ); int i1 = scanner.nextInt();
        System.out.print("예금액 long : " ); long l1 = scanner.nextLong();
        System.out.print("키 float : " ); float f1 = scanner.nextFloat();
        System.out.print("몸무게 double : " ); double d1 = scanner.nextDouble();

        System.out.println("===========회원개인정보=============");
        System.out.println("|              "+st1+"              |");
        System.out.println("|                 "+by1+"               |");
        System.out.println("|                 "+c1+"                |");
        System.out.println("|                 "+s1+"               |");
        System.out.println("|                "+i1+"             |");
        System.out.println("|               "+l1+"            |");
        System.out.println("|               "+f1+"               |");
        System.out.println("|                "+d1+"             |");
        System.out.println("===================================");







    }


}
