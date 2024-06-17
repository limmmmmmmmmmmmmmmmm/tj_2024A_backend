package day06.step8;

import java.util.Scanner;

public class step8 {
    public static void main(String[] args) {

        계산기 c = new 계산기(); //이거 호출 안하면 밑에 값에 대입이 안됨

        int result = c.sumMethod1(3,5);
        System.out.println("result = " + result);


        int result2 = c.sumMethod2();
        System.out.println("result2 = " + result2);

        c.point = 10;
        c.sumMethod3();

        c.sumMethod4(3,5);
        
    }

}
