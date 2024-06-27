package day15.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Step2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");

            String  sql = "insert into table1 values('유재석')";
            PreparedStatement ps = conn.prepareStatement(sql);         //SQL 기재 준비하다
            // 실행하다.
            ps.executeUpdate();

            sql = "insert into table1 values('강호동')";
            PreparedStatement ps2 = conn.prepareStatement(sql);
            ps2.executeUpdate();
        }
        catch (Exception e){System.out.println("연동실패"+e);}
    }
}
