package step2;

import java.util.ArrayList;

public class step2 {
    public static void main(String[] args) {

        ArrayList<String> s1 = new ArrayList<String>();

        s1.add("asdasd");
        s1.add("123");
        s1.add("234234");


        System.out.println(s1.indexOf("234234"));

        System.out.println(s1);




        ArrayList<Book> library = new ArrayList<Book>();

        Book b1 = new Book("태백산맥","조정래");

        library.add(b1);
        library.add(new Book("데미안","dddd"));
        library.add(new Book("어떻게 살 것인가","d"));
        library.add(new Book("토지","zddddd"));
        library.add(new Book("어린왕자","zddfdddd"));

        //리스트 순회하는 방법
        for (int i = 0; i <library.size() ; i++) {
            Book book = library.get(i);
            System.out.println(book);
        }

        //리스트 순회하는 방법 (향상된 for문)
        //for (타입 반환변수명 : 리스트){}  ,리스트내 요소를 하나씩 변수에 대입하면서 반복
        for (Book book : library){
            System.out.println(book);
        }





        //리스트 순회하는 방법3 (forEach 함수- 스트링 함수)


    }

}

