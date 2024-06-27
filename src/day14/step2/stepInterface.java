package day14.step2;

public interface stepInterface {

    //1. 상수
    public static final int value1 = 10;
    int value2 = 20; //인터페이스 안에서는 변수 생성시 무조건 상수

    //2. 추상메소드 : abstract {}없는 메소드
    abstract void method1(int a);
    int nethod2(String a);

    //3. 디폴트메소드 : default
    default void method3(int a){
        System.out.println("method3");
    }
    default int method4(String a){
        System.out.println("method4");
        return 3;
    }

    //4. 정적메소드 : static
    static void method5(int a){
        System.out.println("mothod5");
    }

    static int method6(String a){
        System.out.println("mothod6");
        return 3;
    }

    //5. private 메소드
    private void method7(int a){
        System.out.println("mothod7");

    }
    private int method8(String a){
        System.out.println("mothod8");
        return 3;
    }

    //6. private 정적메소드
    private static void method9(int a){
        System.out.println("method9");
    }
    private static int method10(String a){
        System.out.println("method10");
        return 3;
    }

}


