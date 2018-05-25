package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import platform.constants.PlatformConstants;

public class DbConnection {
	static Connection con = null;
	static String dbUserName = PlatformConstants.DB_USERNAME;
	static String dbPassword = PlatformConstants.DB_PASSWORD;
	static String dbUrl = PlatformConstants.DB_URL;
	static String driver = PlatformConstants.DB_DRIVER;
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(String dbName) {
		try {
			dbUrl = dbUrl+dbName;
			con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) throws SQLException {
		Connection con = DbConnection.getConnection("ems");
		Connection con2 = DbConnection.getConnection("ems");
		if(con!=null) {
			System.out.println("yo!");
		}
		if(con2!=null) {
			System.out.println("yo!");
		}
		System.out.println(con+"   "+con2);
		System.out.println("finish");
		con.close();
		con2.close();
	}
	
	
	
	
}
