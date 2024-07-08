package 과제_Level.Level4.Level4_3;

public class 회원 {

    int 회원번호;
    String 아이디;
    String 비밀번호;
    String 이름;

    public 회원(int 회원번호, String 아이디, String 비밀번호, String 이름) {
        this.회원번호 = 회원번호;
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
    }

    @Override
    public String toString() {
        return "회원{" +
                "회원번호=" + 회원번호 +
                ", 아이디='" + 아이디 + '\'' +
                ", 비밀번호='" + 비밀번호 + '\'' +
                ", 이름='" + 이름 + '\'' +
                '}';
    }
}
