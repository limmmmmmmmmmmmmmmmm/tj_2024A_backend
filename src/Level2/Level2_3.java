package Level2;

public class Level2_3 {

    public static void main(String[] args) {


        int 국어 = 89;
        int 영어 = 49;
        int 수학 = 72;
        int 총점 = 국어+영어+수학;
        float 평균 = 총점/3;
        boolean 배수3 ;
        if (총점%3==0){
            배수3=true;
        }else { 배수3=false; }

        boolean 배수7 ;
        if (총점%7==0){
            배수7=true;
        }else { 배수7=false; }

       String 홀짝;
        if (총점%2==0){
            홀짝="짝수";
        }else { 홀짝="홀수"; }

        String 결과;
        if (총점>=65){
            결과="합격";
        }else { 결과="탈락"; }

        System.out.printf("국어  영어  수학  합계  평균  3배수  7배수  홀짝  결과\n");
        System.out.printf("%d    %d    %d   %d   %.1f  %b  %b  %s  %s",국어,영어,수학,총점,평균,배수3,배수7,홀짝,결과);



    }

}
