package Level2;

import java.util.Random;
import java.util.Scanner;

public class Level2_4 {
    public static void main(String[] args) {

        int random = new Random().nextInt(3);


        Scanner scan = new Scanner(System.in);
        System.out.print("가위 바위 보 선택 : "); String player = scan.next();
        System.out.print("comran : ");
        if (random==0){
            System.out.println("가위");
        } else if (random==1) {
            System.out.println("바위");
        } else if (random==2) {
            System.out.println("보");
        }

        if (player.equals("가위") && random == 1 ||
                player.equals("바위") && random == 2 ||
                player.equals("보") && random == 0) {
            System.out.println("result) com 승리");
        } else if (player.equals("가위") && random == 2 ||
                player.equals("바위") && random == 0 ||
                player.equals("보") && random == 1) {
            System.out.println("result) player 승리");
        } else {
            System.out.println("result) 무승부");
        }




    }
}
