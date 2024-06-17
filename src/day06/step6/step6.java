package day06.step6;


import java.util.Scanner;

public class step6 {

    public static void main(String[] args) {


        //입력 객체 : 입력기능을 사용할려고
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        account.balance = 0;
        account.number = "123-123";




        while (true) { //무한반복

            //출력
            System.out.println("====================");
            System.out.print("1.예금 2.출금 3.잔고 4.종료 :");

            //입력
            int ch = scanner.nextInt();
            System.out.println("ch = " + ch);





            // 조건문
            if (ch==1){
                System.out.println("예금처리");
                System.out.println("예금한 금액 입력 : ");
                int money = scanner.nextInt(); System.out.println("money = " + money);
                account.balance+=money;  System.out.println("balance = " + account.balance);

            }
            else if (ch==2) {
                System.out.println("출금처리");
                System.out.println("출금한 금액 입력 : ");
                int money = scanner.nextInt();
                account.balance-=money; System.out.println("balance = " + account.balance);

            }
            else if (ch==3) {
                System.out.println("잔고확인처리");
                System.out.println("balance = " + account.balance);
            }
            else if (ch==4) {
                System.out.println("종료"); break;
            }
            else {
                System.out.println("알수없는 번호 입니다.");
            }
        }
    }
}
