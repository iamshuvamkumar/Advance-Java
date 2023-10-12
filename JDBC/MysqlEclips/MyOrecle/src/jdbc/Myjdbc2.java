package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Myjdbc2 {
	public static void main(String[] args) {
		System.out.println("Start main");
		try {

//	  Class.forName("oracle.jdbc.driver.OracleDriver");
			OracleDriver oracleDriver = new OracleDriver();
			DriverManager.registerDriver(oracleDriver);
			
			System.out.println("Setp-1................");
			Properties prop = new Properties();
			prop.put("user", "System");
			prop.put("password", "5265374");
				
			Connection conn = oracleDriver.connect("jdbc:oracle:thin:@localhost:1521:xe", prop);
			
//			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "5265374");
		
			System.out.println("Step-2.............");
			Statement stmt = conn.createStatement();
			
			// int x = stmt.executeUpdate("Create table emp2(id Number,name varchar(20))");
			// System.out.println("Table Is Created "+x);
			int x = stmt.executeUpdate("insert into emp2 values(12 ,'Shuvam')");
			x = stmt.executeUpdate("insert into emp2 values(1 ,'Shuva')");
			System.out.println("Table Is insert " + x);
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
