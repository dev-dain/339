//package from K
package db;

import java.sql.*;

public class DBManager {
	public static void main(String[] args) {
		DBManager db = new DBManager();
		
	}
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://localhost/student_db";

	private final String USER_NAME = "root";
	private final String PASSWORD = "project339";

	public DBManager() {
		Connection conn = null;
		Statement state = null;

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("[MySQL Connection ]\n");
			state = conn.createStatement();

			String sql;
			sql = "SELECT * from student";
			ResultSet rs = state.executeQuery(sql);

			while (rs.next()) {
				String number = rs.getString("_number");
				String name = rs.getString("name");
				String major = rs.getString("major");
				String id = rs.getString("id");
				String email = rs.getString("email");
				String pw = rs.getString("pw");
				System.out.println("Number: "+number+"\nName: "+name+"\nmajor: "+major);
				System.out.println("id : "+id+"\ne-mail: "+email);
			}
			rs.close();
			state.close();
			conn.close();
		} catch (Exception e) {
			//예외 발생 시 처리
		} finally {
				try {
					if (state!=null)
						state.close();
				} catch (SQLException ex1) {
			//
			} 
			try {
				if (conn!=null)
					conn.close();
			} catch (SQLException ex1) {
			//
			}
		}
		System.out.println("MySQL Close");
	}
}	