package Level1;

import java.util.Scanner;

public class Level1_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input boolean : " ); boolean b1 = scanner.nextBoolean();
        System.out.print("input byte : "); byte by1 = scanner.nextByte();
        System.out.print("input char : "); char c1 = scanner.next().charAt(0);
        System.out.print("input short : "); short s1 = scanner.nextShort();
        System.out.print("input int : "); int i1 = scanner.nextInt();
        System.out.print("input long : "); long l1 = scanner.nextLong();
        System.out.print("input float : "); float f1 = scanner.nextFloat();
        System.out.print("input double : "); double d1 = scanner.nextDouble();


        System.out.print("output boolean : " +b1 );
        System.out.print("\noutput byte : " +by1);
        System.out.print("\noutput char : " +c1);
        System.out.print("\noutput short : " +s1);
        System.out.print("\noutput int : " +i1);
        System.out.print("\noutput long : " +l1);
        System.out.print("\noutput float : " +f1);
        System.out.print("\noutput double : " +d1);


    }
}
