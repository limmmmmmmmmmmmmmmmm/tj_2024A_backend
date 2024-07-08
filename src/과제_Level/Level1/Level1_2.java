package 과제_Level.Level1;

public class Level1_2 {

    public static void main(String[] args) {

        boolean b1 = true;
        byte by1 = 100;
        char c1 = 'A';
        short s1 = 30000;
        int i1 =2000000000;
        long l1 = 4000000000l;
        float f1 = 3.12313212f;
        double d1 = 3.123132123;



        System.out.printf("boolean \t\t %s \t\t\ttrue or false \n",b1);
        System.out.printf("byte \t\t\t %d \t\t\t -128~127 \n",by1);
        System.out.printf("char \t\t\t %c \t\t\t\t 0~65535[chapter] \n",c1);
        System.out.printf("short \t\t\t %d \t\t\t -32768~32767 \n",s1);
        System.out.printf("int \t\t\t %d \t -+2000 million \n",i1);
        System.out.printf("long \t\t\t %d \t -+2000 million Excess \n",l1);
        System.out.printf("float \t\t\t %.3f \t\t\t 8 decimal places \n",f1);
        System.out.printf("double \t\t\t %.8f \t 17 decimal places \n",d1);

    }
}
