package day14.step3;

public class Customer implements Buy,Sell{
    //추상메소드 구현
    @Override
    public void sell() {
        System.out.println("판매하기");
    }
    @Override
    public void buy() {
        System.out.println("구매하기");
    }
    //두 인터페이스에 디폴트 메소드 명이 동일해서 오버라이드
        //동일하지 않으면 굳이 안해도됨
    @Override
    public void order(){
        System.out.println("고객 판매 주문");
    }
}
