package day08;

import java.util.Arrays;

public class step2 {

    public static void main(String[] args) {


        int[] array1= new int[3];
        array1[0]=30;
        array1[1]='A';
        array1[2]=(int) 3.14;
        //array1[3]='0'; 존재하지 않는 인덱스

        System.out.println(Arrays.toString(array1));

        book[] libary = new book[5];
        for (int i =0 ; i<libary.length;i++){
            System.out.println(libary[i]); //null 5개
           // System.out.println(libary[i].getBookName());    //null인데 . 사용해서
             }

        libary[0]=new book("책이름1","저자1");
        libary[1]=new book("책이름2","저자2");
        libary[2]=new book("책이름3","저자3");
        libary[3]=new book("책이름4","저자4");
        libary[4]=new book("책이름5","저자5");

        for (int i = 0; i < libary.length; i++){
            System.out.println(libary[i]);
            libary[i].showBookinfo();

        }

    }
}
