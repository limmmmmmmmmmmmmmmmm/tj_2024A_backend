package day14.step2;

public class ImplementClass implements stepInterface {
    //오류가 사라진 이유 : 구현했기 때문에 -> 인터페이스는 구현해야함

    @Override//오버라이딩
    public void method1(int a) {
        System.out.println("ImplementClass.method1");
    }

    @Override
    public int nethod2(String a) {
        System.out.println("ImplementClass.nethod2");
        return 0;
    }



}
