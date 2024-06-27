package day14.step2;

public class step2 {
    public static void main(String[] args) {

        //인터페이스 타입의 변수 선언
        stepInterface si ;
        //인터페이스는 스스로 객체/인스턴스를 생성 불가능
            //구현안한 메소드가 있으니까 -> 추상메소드
            //구현[implement]을 해준 클래스가 필요하다.
            //implement 한 클래스로 객체 생성한다. -> 구현(객)체
        new ImplementClass(); // <---- (인터페이스 구현된)객체
        si = new ImplementClass();

        si.method1(3);
        si.method3(3);
        si.method4("h");
       // si.method5(3); static 객체없이 사용하는 메소드
        stepInterface.method5(3);
        //si.method7(3); //private 이므로 외부 클래스로부터 사용불가능
        //si.method7("5");  //private 이므로 외부 클래스로부터 사용불가능
        //인터페이스 안에서 내부적으로 사용할때 private 사용

        //si.method9(4); //private이랑 다른이유 : static 끼리는 미리 할당돼서 사용가능함
        //si.method10("h");




    }
}
