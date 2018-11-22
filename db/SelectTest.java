//package from K
package db;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class SelectTest {
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
     
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
       
      String url = "jdbc:mysql://localhost/student_db?serverTimezone=Asia/Seoul";
      conn = DriverManager.getConnection(url, "root", "project339");
      stmt = conn.createStatement();
       
      String sql = "SELECT name, major, id from student";
              
      // 5. 쿼리 수행
      // 레코드들은 ResultSet 객체에 추가된다.
      rs = stmt.executeQuery(sql);
       
      // 6. 실행결과 출력하기
      while(rs.next()){
        // 레코드의 칼럼은 배열과 달리 0부터 시작하지 않고 1부터 시작한다.
        // 데이터베이스에서 가져오는 데이터의 타입에 맞게 getString 또는 getInt 등을 호출한다.
        String name = rs.getString(1);
        String major = rs.getString(2);
        String id = rs.getString(3);
         
        System.out.println(name + " " + major + " " + id);
      }
    }
    catch( ClassNotFoundException e){
      System.out.println("드라이버 로딩 실패");
    }
    catch( SQLException e){
      System.out.println("에러 " + e);
    }
    finally{
      try{
        if( conn != null && !conn.isClosed()){
          conn.close();
        }
        if( stmt != null && !stmt.isClosed()){
          stmt.close();
        }
        if( rs != null && !rs.isClosed()){
          rs.close();
        }
      }
      catch(SQLException e){
        e.printStackTrace();
      }
    }
  }
}