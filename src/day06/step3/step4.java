package day06.step3;

public class step4 {

    public static void main(String[] args) {

        Americano A1 = new Americano();

        Americano A2 = new Americano();


        A1.size = "M사이즈";
        A1.price= 3500;

        System.out.println(A1.size);
        System.out.println(A1.price);

        A1.마시기();

        A2.size = "L사이즈";
        A2.price= 4000;

        System.out.println(A2.size);
        System.out.println(A2.price);

        A2.마시기();


    }


}
