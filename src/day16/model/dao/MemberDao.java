package day16.model.dao;

import day16.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
    // 0.
    public static MemberDao mdao = new MemberDao();
    // 0. DB연동
    // - JDBC 인터페이스 변수  3개
    Connection conn;
    PreparedStatement ps;
    ResultSet rs; //비교 출력할때 쓰임

    // - 생성자에 연동 코드
    MemberDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day06",
                    "root", "1234"
            );
        } catch (Exception e) {
            System.out.println(">>연동실패" + e);
        }
    }

    // 1. 회원가입 화면 함수
    public boolean signup(MemberDto memberDto) {
        try {
            // 1. SQL 작성한다.
            String sql = "INSERT INTO member( mid , mpwd , mname , mphone ) VALUES( ? , ? , ? , ? )";
            // 2. SQL 기재한다
            ps = conn.prepareStatement(sql);
            // 2. SQL 문법의 ?(와일드카드) 매개변수 기재한다
            ps.setString(1, memberDto.getMid());        // .setString( ?순서번호 , 값또는변수명 )
            ps.setString(2, memberDto.getMpwd());
            ps.setString(3, memberDto.getMname());
            ps.setString(4, memberDto.getMphone());
            // 3. SQL 실행한다. // 4. SQL 실행결과
            int count = ps.executeUpdate(); // executeUpdate() 등록된 레코드수 반환 ,
            if (count == 1) {
                return true;
            } //  1개 레코드 등록되면 성공
        } catch (Exception e) {
            System.out.println(e);
        }
        return false; // 5. 메소드 반환
    }// m end


    // 2. 로그인 화면 함수
    public boolean login(MemberDto memberDto) {
        try {
            // 1. SQL 작성한다.
            String sql = "select *from member where mid = ? and mpwd = ?";
            // 2. SQL 기재한다
            ps = conn.prepareStatement(sql);
            // 2. SQL 문법의 ?(와일드카드) 매개변수 기재한다
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpwd());
            // 3. SQL 실행한다. // 4. SQL 실행결과
            rs = ps.executeQuery(); // Select만  반환타입이 좀 다름
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false; // 로그인 실패
    } // m end


    // 3. 아이디찾기 화면 함수
    public String findId(MemberDto memberDto) {
        try {
            String sql = "select *from member where mname = ? and mphone = ?;";
            ps = conn.prepareStatement(sql);
            ps.setString(1, memberDto.getMname());
            ps.setString(2, memberDto.getMphone());
            rs = ps.executeQuery();
            if (rs.next()) {
                String findId = rs.getString("mid");
                return findId;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    } // m end


    // 4. 비밀번호찾기 화면 함수
    public String findPwd(MemberDto memberDto) {
        try {
            String sql = "select *from member where mid = ? and mphone = ?;";
            ps = conn.prepareStatement(sql);
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMphone());
            rs = ps.executeQuery();
            if (rs.next()) {
                String findpwd = rs.getString("mpwd");
                return findpwd;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    } // m end
}
