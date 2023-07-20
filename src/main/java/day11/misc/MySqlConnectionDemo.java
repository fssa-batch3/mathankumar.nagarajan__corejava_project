package day11.misc;

import java.sql.*;


public class MySqlConnectionDemo {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String password = "123456";
		
		String query = "SELECT * FROM users";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("connection created...");
	       con.close();
		
	}

}
