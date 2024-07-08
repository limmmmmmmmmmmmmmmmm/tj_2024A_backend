package 과제_Level.Level3;

import java.util.Scanner;

public class Level3_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;

        while (true){
            count++;
            System.out.println(count + "회입력 : "); String ch = scan.nextLine();
            System.out.println(count + "회입력 : "+ch);

            if (ch.equals("end")||ch.equals("END")){break;}
        }
    }
}
