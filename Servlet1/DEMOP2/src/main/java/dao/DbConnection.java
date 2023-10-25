package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	private static Connection conn = null;

	public static Connection getConnection() {
		System.out.println("get Connection ");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System", "5265374");
			System.out.println("Connection to connect");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void main(String[] args) {
		System.out.println(DbConnection.getConnection());
	}

}
