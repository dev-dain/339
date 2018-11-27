//package from S
package db;

import java.io.*;
import java.sql.*;
 
public class DataBaseImageExample {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student_db","root","duksung");
            
            File file=new File("C:\\Users\\DS\\eclipse-workspace\\images.gif");
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

