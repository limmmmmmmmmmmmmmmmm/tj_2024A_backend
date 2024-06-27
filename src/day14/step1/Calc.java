package day14.step1;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    default void description(){
        System.out.println("정수계산기를 구현합니다.");
    }
    static int total(int[] arr){
        int total = 0;

        for (int i : arr){
            total +=1;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod(){
        System.out.println("private 메소드입니다.");
    }
    private static void myStaticMethod(){
        System.out.println("private static 메소드입니다.");
    }

}
