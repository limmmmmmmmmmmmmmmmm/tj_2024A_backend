package 과제_Level.Level3;

public class Level3_3 {
    public static void main(String[] args) {
        //[샘플]
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;

        int count = 0;
        int july = 0;

        for (int i = 1; i <5 ; i++) {
            System.out.print(i+"주차 : ");

            if (i == 1){
                july = july1/1000000;
                for (int j = 0; j <july ; j++) {
                    System.out.print("■ ");
                }
                System.out.println(july1/10000+"만원");
            }
            if (i == 2){
                july = july2/1000000;
                for (int j = 0; j <july ; j++) {
                    System.out.print("■ ");
                }
                System.out.println(july2/10000+"만원");
            }if (i == 3){
                july = july3/1000000;
                for (int j = 0; j <july ; j++) {
                    System.out.print("■ ");
                }
                System.out.println(july3/10000+"만원");
            }if (i == 4){
                july = july4/1000000;
                for (int j = 0; j <july ; j++) {
                    System.out.print("■ ");
                }
                System.out.println(july4/10000+"만원");
            }





        }




    }
}
