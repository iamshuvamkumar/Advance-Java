package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Myjdbc4 {
	public static void main(String[] args) {
		System.out.println("Start main");
		try {

//	  Class.forName("oracle.jdbc.driver.OracleDriver");
			OracleDriver oracleDriver = new OracleDriver();
			DriverManager.registerDriver(oracleDriver);
			
			System.out.println("Setp-1................");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "5265374");
		
			System.out.println("Step-2.............");
			Statement stmt = conn.createStatement();
			
		
			ResultSet rs = stmt.executeQuery("select * from emp2");
			System.out.println(" select * from emp2" + rs);
			while (rs.next()) {
				System.out.print(" " + rs.getString(1));
				System.out.println(" " + rs.getString(2));
			}
			conn.close();

			System.out.println("try End ");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Main End ");

	}

}
