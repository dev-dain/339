//새로 만든 파일
package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DBConnect {
    private static DBConnect dbc;
    
    private DBConnect() { }
    
    public static DBConnect getInstanceCon() {
    	if (dbc==null) return new DBConnect();
    	else return dbc;
    }
    
    private Connection makeConnection() throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	    
    	String url = "jdbc:mysql://localhost/student_db?serverTimezone=Asia/Seoul";
    	Connection con = DriverManager.getConnection(url, "root", "project339");
        System.out.println("성공");
        return con;
    }
    
    public Vector selectSt() {
    	Connection con = null;
    	ResultSet rs = null;
		PreparedStatement pstmt = null;
		Vector friends = new Vector();
		try {
			con = makeConnection();
			String query = "select name from student";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()){
				friends.add(rs.getString(1));
			}
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
			if(con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return friends;
    }
    
    public int selectSt(int number) {
    	Connection con = null;
    	ResultSet rs = null;
		PreparedStatement pstmt = null;
		int friends_number = 1;
		try {
			con = makeConnection();
			String query = "select name from student where number=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,number);
			rs = pstmt.executeQuery();
			if(rs.next()){
				friends_number = rs.getInt(1);
			}
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
			if(con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return friends_number;
    }
    
    public void insertSt(String id, int number, String name, String pw,
    					String email, String question, String answer, String major) {
    	Connection con=null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			con = makeConnection();
			String query = "insert into student values(?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setInt(2,number);
			pstmt.setString(3,name);
			pstmt.setString(4,pw);
			pstmt.setString(5,email);
			pstmt.setString(6,question);
			pstmt.setString(7,answer);
			pstmt.setString(8, major);
			pstmt.executeUpdate();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
			if(con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    public void updatePW(String id, String pw) throws Exception {
    	Connection con = null;
        Statement st;
    	con = makeConnection();
    	String sql = "update student set pw='"+pw+"' where id='"+id+"';";
		st = con.createStatement();
		
		int result = st.executeUpdate(sql);
		
		System.out.println("처리된 레코드의 개수 : "+result);
		
		st.close();
    	con.close();
    }
    
    public void deleteSt(String number) throws Exception {
    	Connection con = null;
        Statement st;
    	con = makeConnection();
		String sql= "delete from student where _number='"+number+"'";
		st = con.createStatement();

        int result = st.executeUpdate(sql); //처리된 레코드의 개수를 int형으로 반환
        //select를 제외한 update, insert, delete는 executeUpdate()메소드를 사용함.
 
        System.out.print("처리된 레코드의 개수: "+ result);
        System.out.println();
                       
        st.close();
    	con.close();
    }
    
   public void putImg(String path) throws Exception {
    	Connection con = null;
    	PreparedStatement pstmt;
    	con = makeConnection();
    	File file = new File(path);
        try {
			FileInputStream fis=new FileInputStream(file);
			pstmt = con.prepareStatement("insert into img (id,number,photo) values(?,?,?)");
			pstmt.setString(1,"davenport");
			pstmt.setString(2,"20170163");
	        pstmt.setBinaryStream(3,fis,(int)file.length());
	        pstmt.executeUpdate();
            pstmt.close();
			fis.close();
			con.close();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
        	e.printStackTrace();
        } catch(FileNotFoundException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
   
   public void getImg(String path) {
       try{
           Connection con;
           con=makeConnection();
           File file=new File(path);
           FileOutputStream fos=new FileOutputStream(file);
           byte b[];
           Blob blob;
           
           PreparedStatement ps=con.prepareStatement("select * from Tablename"); 
           ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               blob=rs.getBlob("photo");
               b=blob.getBytes(1,(int)blob.length());
               fos.write(b);
           }
           
           ps.close();
           fos.close();
           con.close();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
    
}