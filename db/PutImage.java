//package from K
package db;

import java.sql.*;
import java.io.*;

public class PutImage {
    private Connection con;
    
	public PutImage() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/student_db?serverTimezone=Asia/Seoul";
            String db_id ="root";
            String db_pw ="project339";
            con = DriverManager.getConnection(url, db_id, db_pw);
            System.out.println("DB 연결 성공");
            
            File file = new File("C:\\Users\\Bud\\Documents\\Visual Studio 2015\\1701122108_0000001.jpg");
            FileInputStream fis=new FileInputStream(file);
            
            PreparedStatement ps=con.prepareStatement("insert into image_table (name,photo) values(?,?)"); 
            ps.setString(1,"img");
            ps.setBinaryStream(2,fis,(int)file.length());
            ps.executeUpdate();
 
            ps.close();
            fis.close();
            
            con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new PutImage();
	}

}
