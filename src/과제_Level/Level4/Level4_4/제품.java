package 과제_Level.Level4.Level4_4;


public class 제품 {

    String 제품코드 ;
    String 제품명 ;
    int 가격 ;
    String 등록일 ;

    public 제품(String 제품코드, String 제품명, int 가격, String 등록일) {
        this.제품코드 = 제품코드;
        this.제품명 = 제품명;
        this.가격 = 가격;
        this.등록일 = 등록일;
    }

    @Override
    public String toString() {
        return "제품{" +
                "제품코드='" + 제품코드 + '\'' +
                ", 제품명='" + 제품명 + '\'' +
                ", 가격=" + 가격 +
                ", 등록일='" + 등록일 + '\'' +
                '}';
    }
}