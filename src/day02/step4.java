package day02;

public class step4 {

    public static void main(String[] args) {

        // 콘솔 입력
        System.out.print("JAVA"); // system : 시스템 관련 기능 제공하는 클래스
                                //out : 출력 관련 객체 제공
                                    // print(리터럴 또는 변수명 또는 연산식) : 출력 함수
                                    // println() : 출력함수 + 줄바꿈처리
        System.out.println("JAVA2");
        System.out.println("JAVA3");
        System.out.printf("%s" ,"JAVA4"); //문자열 // 출력함수+ 형식문자 지원
        System.out.printf("%d", 123);   //정수
        System.out.printf("%f", 3.14);  //실수


        System.out.print("\n줄바꿈 \t 들여쓰기 \"큰따음표출력 \\백슬래시출력 \'작은따음표 출력 \n");

        int price = 1500;
        String name = "콜라";

        System.out.printf("상품의 가격 : "+price+"원 입니다.\n" );
        System.out.printf("상품의 가격 : %d원 입니다. \n", price);
        System.out.printf("%s의 가격 : %d원 입니다. \n", name,price);
        System.out.printf("%s의 가격 : %6d원 입니다. \n", name,price);
        System.out.printf("%s의 가격 : %-6d원 입니다. \n", name,price);
        System.out.printf("%s의 가격 : %06d원 입니다. \n", name,price);
        System.out.printf("%s의 가격 : %3.1f원 입니다. \n", name,3.14);

        System.out.println();
        System.out.printf("");
        System.out.println("step4.main");


        // 콘솔 출력










    }

}
