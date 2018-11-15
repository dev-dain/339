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
      // 1. ����̹� �ε�
      Class.forName("com.mysql.jdbc.Driver");
       
      // 2. �����ϱ�
      String url = "jdbc:mysql://localhost/student_db?useSSL=false";
      conn = DriverManager.getConnection(url, "root", "duksung");
       
       
      // 3. ���� ������ ���� Statement ��ü ����
      stmt = conn.createStatement();
       
      // 4. SQL ���� �ۼ�
      // ���ǻ���
      // 1) JDBC���� ������ �ۼ��� ���� �����ݷ�(;)�� ���� �ۼ��Ѵ�.
      // 2) SELECT �� �� * ���� ��� Į���� �������� �ͺ���
      //    �����;� �� Į���� ���� �������ִ� ���� ����.
      // 3) ���ϴ� ����� �����ν� ������ ����, java �ڵ�� ���۾� �ϴ� ���� ������ ����
      // 4) ������ �� �ٷ� ���� ����� ��� �鿩���⸦ ����ص� ������ ���⿡ ���� !!
      String sql = "SELECT number from grade";
       
       
      // 5. ���� ����
      // ���ڵ���� ResultSet ��ü�� �߰��ȴ�.
      rs = stmt.executeQuery(sql);
       
      // 6. ������ ����ϱ�
      while(rs.next()){
        // ���ڵ��� Į���� �迭�� �޸� 0���� �������� �ʰ� 1���� �����Ѵ�.
        // �����ͺ��̽����� �������� �������� Ÿ�Կ� �°� getString �Ǵ� getInt ���� ȣ���Ѵ�.
        String number= rs.getString(1);
        String grade = rs.getString(2);
        String score = rs.getString(3);
         
         
        System.out.println(number + " " + grade + " " + score);
      }
    }
    catch( ClassNotFoundException e){
      System.out.println("����̹� �ε� ����");
    }
    catch( SQLException e){
      System.out.println("���� " + e);
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
      catch( SQLException e){
        e.printStackTrace();
      }
    }
  }
}