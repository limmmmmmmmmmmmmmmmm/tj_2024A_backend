package day08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class step1 {

    public static void main(String[] args) {

        // 배열선언
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(num));


        int[] num2 = new int[10];
        System.out.println(Arrays.toString(num2));

        int num3;
       //System.out.println(num3);

        int sum = 0;
        //배열내 요소 하나씩 호출
        for (int i = 0; i<num.length; i++){
            System.out.println(num[i]);
            sum += num[i];
        }
        System.out.println("sum = " + sum);

        // 문자 여러개를 저장하는 문자 배열 만들기 ===> 문자열 만들기
            // -String 클래스 이해 도움
        char [ ] alphabets = new char[26];
        char ch = 'A';
        for (int i = 0 ; i < alphabets.length; i++){
            alphabets[i] = ch;
            ch++;
        }

        System.out.println(Arrays.toString(alphabets));

        for (int i = 0; i <alphabets.length ; i++){
            System.out.println(alphabets[i]+"."+(int)alphabets[i]);
        }


    }

}
