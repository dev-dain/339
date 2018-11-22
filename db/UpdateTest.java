//package from K
package db;
     
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
     
public class UpdateTest {
       
    private Connection con;
    private Statement st; //DB로 명령전달하는 객체
    private ResultSet rs;
          
    //기본생성자
    public UpdateTest(String name, String id, String email){ 
        try {           
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost/student_db?serverTimezone=Asia/Seoul";
            String db_id ="root";
            String db_pw ="project339";
               
            con = DriverManager.getConnection(url, db_id, db_pw);
               
            System.out.println("DB 연결 성공");
               
            String sql= "update student set id='"+id+"', email='"+email+"' where name='"+name+"';";
           
            st = con.createStatement();   
            int result = st.executeUpdate(sql); //처리된 레코드의 개수를 int형으로 반환
            //select를 제외한 update, insert, delete는 executeUpdate()메소드를 사용함.
               
     
            System.out.print("처리된 레코드의 개수: "+ result);
            System.out.println();
                           
            st.close();
            con.close();
               
        } catch(ClassNotFoundException e){
            System.out.println(e + "=> 드라이버 로드 실패");
        } catch(SQLException e){
            System.out.println(e+ "=> Sql 예외 ");
        } catch(Exception e){
            System.out.println(e + "=> 일반 예외");
               
        }
    }
        
    public static void main(String args[]){
            new UpdateTest("김다인", "davenport33", "davenport33@duksung.ac.kr");
           
        }
       
    }