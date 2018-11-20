    import java.sql.*;
    import java.io.*;

    public class InsertImage{
     public static void main(String[] args) {
      System.out.println("Insert Image Example!");
      String driverName = "com.mysql.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/";;
      String dbName = "student_db";
      String userName = "root";
      String password = "duksung";
      Connection con = null;

      try{
       Class.forName(driverName);
       con = DriverManager.getConnection(url+dbName,userName,password);
       Statement st = con.createStatement();
       File imgfile = new File("images.gif");
       FileInputStream fin = new FileInputStream(imgfile);
       PreparedStatement pre = con.prepareStatement("insert into Tablename values(?)");
       pre.setBinaryStream(1,fin,(int)imgfile.length());
       pre.executeUpdate();
       System.out.println("Inserting Successfully!");
       pre.close();
       con.close(); 
     }
     catch (Exception e){
      System.out.println(e.getMessage());
     }
    }
   }