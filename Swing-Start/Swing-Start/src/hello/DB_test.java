package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB_test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Connection conn = null;
		try{
			String url = "jdbc:mysql://localhost:3306/jspbookdb?serverTimezone=UTC";
			String user = "root";
			String password = "123456";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB connection success");
		} catch(SQLException ex){
			System.out.println("DB connection is failed<br>");
			System.out.println("SQLException: " + ex.getMessage());
		} finally{
			if (conn != null){
				conn.close();
			}
		}
	}
	
}
