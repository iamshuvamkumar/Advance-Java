package JDBC;
import java.sql.*;
 class TestOracel{

	public static void main(String[] args) {
			System.out.println("Main Start ");	
		try {
		     System.out.println("try Start ");
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	 	     Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","5265374");
		     System.out.println("connection   "+conn);
		     Statement stmt = conn.createStatement();
			//int x = stmt.executeUpdate("Create table emp2(id Number,name varchar(20))");
		    // System.out.println("Table Is Created "+x);
		     int x = stmt.executeUpdate("insert into emp2 values(12 ,'Shuvam')");
		     x = stmt.executeUpdate("insert into emp2 values(1 ,'Shuva')");
			 System.out.println("Table Is insert "+x);
		     ResultSet rs = stmt.executeQuery("select * from emp2");
		     System.out.println(" select * from emp2"+rs);
		       while(rs.next()){
		        System.out.print(" "+rs.getString(1));	
		        System.out.println(" "+rs.getString(2));	
		       }
		      conn.close();
		
		System.out.println("try End ");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}	
	 catch(SQLException e){
		   e.printStackTrace();
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
	
 		System.out.println("Main End ");

	}

}
