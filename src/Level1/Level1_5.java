package Level1;

public class Level1_5 {

    public static void main(String[] args) {

        byte b1 = 100;
        short s1 = b1;
        System.out.println("byte -> short : "+s1);

        short s2 = 30000;
        int i1 = s2;
        System.out.println("short -> int : "+i1);

        int i2 = 2000000000;
        long l1 = i2;
        System.out.println("int -> long : "+l1);

        long l2 = 4000000000l;
        float f1 = l2;
        System.out.println("long -> float : "+f1);

        float f2 = 3.1231231686453125f;
        double d1 = f2;
        System.out.println("float -> double : "+d1);




    }
}
