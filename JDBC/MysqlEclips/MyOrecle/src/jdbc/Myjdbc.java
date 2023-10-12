package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Myjdbc {
	public static void main(String[] args) {
		System.out.println("Start main");
		try {

//	  Class.forName("oracle.jdbc.driver.OracleDriver");
			OracleDriver oracleDriver = new OracleDriver();
			System.out.println("Setp-1................");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "5265374");
			System.out.println("Step-2.............");
			Statement stmt = conn.createStatement();
			// stmt.executeUpdate("Create table emp2(Id int primary key, Name varchar(15) , Course varchar(50))");
			 //stmt.executeUpdate(" insert into emp2 values(121,'Shuvam','Kumar')");
			
			ResultSet rs = stmt.executeQuery("select * from emp2");
			System.out.println(" select * from emp2" + rs);
			while (rs.next()) {
				System.out.print(" " + rs.getInt(1));
				System.out.println(" " + rs.getString(2));
				System.out.println(" " + rs.getString(3));
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
