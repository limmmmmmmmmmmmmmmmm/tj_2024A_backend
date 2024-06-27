package day15.step1;


public class Step2 {
    public static void main(String[] args){
        try {
            method1();
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }


        // static 함수가 아니라서
        // main 함수가 static 이므로 우선할당 되서 실행되는데 그때 method1 메소드를 모른다


    }

    static void method1() throws ClassNotFoundException{

        //예외[해당 함수를 호출했던 곳으로 - 리턴과 비슷] 던지기/떠넘기기
        Class.forName("java.lang.String");
        Class.forName("java.lang.String2");
        //1. 직접처리 : try{}catch{} 2.떠넘기기 : throws

    }




}
