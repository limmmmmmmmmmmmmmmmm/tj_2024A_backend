package day15.step3_MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {

    static Dao dao = new Dao();

    Connection coon;
    PreparedStatement ps;
    ResultSet rs;

    Dao(){ //연동코드 신규*
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           coon = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/day05",
                   "root","1234");

       }catch (Exception e){
           System.out.println("연동실패"+e);
       }
    }
    //각 기능별 함수 구현

    // 2. 등록제어 함수 , 매개변수 : 저장할이름 String , 리턴 : 등록성공여부 boolean
    public boolean signupC( String name ) {
        try {
            String sql = "insert into table1 values('" + name + "')";
            ps = coon.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }


    // 3. 출력제어 함수 , 매개변수 : x , 리턴 : 회원목록 ArrayList<String>
    public ArrayList<String> printC(){
        ArrayList<String> List = new ArrayList<>();
    try {
        String sql = "select * from table1";
        ps = coon.prepareStatement(sql);
        ps.executeUpdate();
        while (rs.next()){
            List.add(rs.getString("name"));
        }
    }catch (Exception e){System.out.println(e); }
        return List;
    }

    // 4. 수정제어 함수   , 매개변수 : 기존이름String,새로운이름String , 리턴 : 수정성공여부 boolean
    public boolean updateC( String oldName , String newName ){
        try {
            String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "' ";
            ps = coon.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    // 5. 삭제제어 함수   , 매개변수 : 삭제할이름 String , 리턴 : 삭제성공여부 boolean
    public boolean deleteC( String name ){
        try {
            String sql = "delete from table1 where name = '"+name+"'";
            ps = coon.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
    return false;
    }

}
