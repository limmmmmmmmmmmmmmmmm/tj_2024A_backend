package Level1;

public class Level1_6 {
    public static void main(String[] args) {
        short s1 = 48;
        byte b1 =(byte) s1;
        System.out.println("byte <- short : "+b1 );

        int i1 = -27648;
        short s2 = (short)i1;
        System.out.println("short <- int : "+s2 );

        long l1 = 1234529436l;
        int i2 =(int)l1 ;
        System.out.println("int <- long : "+i2 );

        float f1 = 3;
        long l2 =(long) f1;
        System.out.println("long <- float : "+l2 );

        double d1 = 3.1231322;
        float f2 = (float) d1;
        System.out.println("float <- double : "+f2 );




    }
}
