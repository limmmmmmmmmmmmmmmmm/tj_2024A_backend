package day15.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("<<드라이버 호출 성공>>");

            //2.
            Connection conn; //
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");
            System.out.println("<<DB 연동성공>>");

        }
        catch (Exception e){System.out.println("연동실패"+e);}

    }



}
/*
    JDBC : JAVA DATABASE CONNECT : 자바 데이터베이스 연동
        - JDBC 관련 클래스





* */