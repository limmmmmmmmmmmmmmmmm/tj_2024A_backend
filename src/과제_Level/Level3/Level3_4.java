package 과제_Level.Level3;

import java.util.Scanner;

public class Level3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("input : "); int ch = scan.nextInt();
            sum += ch;
            for (int i = 0; i <sum ; i++) {
                System.out.print("■ ");
            }
            System.out.println();
            if (sum<0){
                break;
            }
        }
    }
}
