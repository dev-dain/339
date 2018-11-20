import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DeleteTest {
  public static void main(String[] args) {
	  new DeleteTest("20171095");
  }
	 
  private Connection conn = null;
  private Statement stmt = null;
  private ResultSet rs = null;
   
 
  public DeleteTest(String number){
     
    try{
      Class.forName("com.mysql.jdbc.Driver");
       
      String url = "jdbc:mysql://localhost/student_db?useSSL=false";
      conn = DriverManager.getConnection(url, "root", "duksung");

      System.out.println("DB 연결 성공");
      
      String sql = "delete from grade where number="+number;
      
      stmt = conn.createStatement();
      
      int result = stmt.executeUpdate(sql);
       
     
      System.out.println("처리된 레코드의 개수 :"+result);
      System.out.println();
      
      stmt.close();
      conn.close();
      
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
      }
      catch( SQLException e){
        e.printStackTrace();
      }
    }
  }
}
