package day14.step3;

public interface Buy {
    //추상메소드 -> 동일한 목적하에 서로다른 기능 수행
        //1. 클래스 상속 1번 , 인터페이스 여러개
        //2. 어차피 오버라이드를 해야하면 부모가 구현할 필요가 X
    void buy();

    default void order(){
        System.out.println("구매주문");
    }
}
