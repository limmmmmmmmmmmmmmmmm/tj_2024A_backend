package day02;  //현재 클래스 파일이 위치한 패키지/폴더명

public class step1 { // class start // 자바는 모든 코드를 클래스 안에 작성한다.


    public static void main(String[] args) {   //실행할 코드는 모두 main 함수 안에 작성한다.


        //p.61 : 상수 
        // final 예약어/키워드
        final int MAX_NUM = 100;
        System.out.println("MAX_NUM = " + MAX_NUM);
        
        
        
        
        //MAX_NUM = 1000;  //오류발생 :  상수이므로 수정이 불가능하다
        
        final int MIN_NUM;
        MIN_NUM = 0;
        System.out.println("MIN_NUM = " + MIN_NUM);
        // soutv + 엔터 : 가장 가까운 변수의 출력 함수 자동완성 해준다.
        
        
        
        
    } // main end
    
    
}






