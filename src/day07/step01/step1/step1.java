package day07.step01.step1;


public class step1 {


        public static void main(String[] args) {

                //[1] 객체 만들기
                //1. 타입/ 클래스명(설계도 선택) 작성한다.

                //Person
                //2. 객체를 담을 임의 의 변수명을 작성한다
                //Person personlee;
                //3. 객체/인스턴스를 생성해서 변수에 담는다.
                // new 생성자명();


                //직접 접근
                Person personlee = new Person();
                personlee.name="이강인";


                //간접 접근
                Person personkim = new Person("임형경");

                Person personpark = new Person(
                        "박지성", 123, 21
                );



        } //m en
}