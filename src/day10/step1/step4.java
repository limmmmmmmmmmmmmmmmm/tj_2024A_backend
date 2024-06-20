//package day10.step1;
//
//import java.util.Scanner;import java.util.Arrays;
//
//public class step4 {
//    public static void main(String[] args) {
//
//        //* 입력객체
//        Scanner scan = new Scanner(System.in);
//        // 1. 배열구성
//        int count = 0;
//        Product[] productArray = new Product[count];
//
//        // 2. 무한루프
//        while(true){ //
//
//            System.out.println( "배열상태확인함수 : "+ Arrays.toString( productArray ) );
//
//            System.out.print(" 1.등록 2.출력 3.수정 4.삭제 5.종료 선택] "); // 무한출력
//            int ch = scan.nextInt(); // 무한입력 , 입력받은 데이터로 기능을 구분짓기 위해
//            // - 입력값에 따라 논리/경우의수 판단
//            if( ch == 1 ){
//                // 1. 입력받고
//                System.out.print(">>제품코드 : ");    String code = scan.next();
//                System.out.print(">>제품명 : ");     String name = scan.next();
//                System.out.print(">>제품가격 : ");   int price = scan.nextInt();
//                // 2. 가공 ( 유효성검사 혹은 객체화 )
//                Product p = new Product(code,name,price);
//
//
//
//
//            }
//            else if( ch == 2 ){}
//            else if( ch == 3 ){}
//            else if( ch == 4 ){
//                    //1. 입력받기
//                    System.out.print(">>삭제할 제품코드 : "); String deleteCode = scan.next();
//                for (int i = 0; i < ; i++) {
//
//                }
//
//            }
//            else if( ch == 5 ){}
//        } // while end
//    } // main end
//} // class end
///*
//    [ 메모리 설계 ]
//    1. 객체의 추상적인 구성( 특성 , 행위) 하기
//    2. 구성한 개념을 클래스로 구현 하기
//    3. 해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정/만들기
//        - 배열 선언방법 : 타입[] 배열변수명 = new 타입[길이]
//    [ 화면 구현 설계 ]
//    1. 콘솔에 출력할 내용들을 구성
//    [ 기능 구현 ]
//
// */
//


