package day02;

public class step3 { // class s

    public static void main(String[] args) { // main s

        int x= 10; int y = -3;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);


        System.out.println("x+y="+x+y); //x+y=10-3 문자 들어가서 연결돼서 나옴
        System.out.println("x+y="+(x+y));  //x+y=7


        System.out.println(x==y); //false
        System.out.println(x!=y); //true
        System.out.println(x>y); //true
        System.out.println(x>=y); //true
        System.out.println(x<y); //false
        System.out.println(x<=y); //false


        System.out.println(x> 5 && x< 20); //true
        System.out.println(y == -5 || y < 0); //true
        System.out.println(!(x>=20));


        int z = 30; // 오른쪽 값을 왼쪽에 대입
        z += 1;
        z = z +1 ;


        System.out.println(x++); //출력후에 증가 //10
        System.out.println(x);   // 11
        System.out.println(++x);  //12

        System.out.println(x--); //12
        System.out.println(x); //11
        System.out.println(--x); //10

        z++; //중감 우선순위는 하나의 ; 세미클론 안에서 결정
        System.out.println(z);

        char result = z >= 30 ? 'T' : 'F';
        System.out.println("result = " + result);
        char result2 = z >= 50 ? 'T' : z>=30? 'M' : 'F';
        System.out.println("result2 = " + result2);




    } // main e


}// class e
