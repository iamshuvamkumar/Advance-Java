package mydemo;
import java.sql.*;
import java.util.Scanner;
  public class Demo{
  public static void main(String[]args){
	
		System.out.println("Start in Main");
		int id =0;
		String name = " ";
		String address = " ";

		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Start in try");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("setp 1 load driver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","5265374");
			System.out.println("setp 2 connerct object");
			
			Statement st = con.createStatement();
			System.out.println("setp 3 connerct stmt ");
			
			//int x = st.executeUpdate("create table stud (id number primary key,name varchar(20),address varchar(30))");
			//System.out.println("setp 4 create table"+x);
			
			//int y = st.executeUpdate("insert into stud values(102,'Shuvam','Badarpur')");
			//System.out.println("Student Info"+y);
			
			/*System.out.println("Student ID");
		     id = sc.nextInt();
			
			System.out.println("Student Name");
			 name = sc.next();

			System.out.println("Student Address");
			 address = sc.next();
			
			
		     st.executeUpdate("insert into stud values("+id+",'"+name+"'+,'"+address+"')");
		
*/

		
			System.out.println("End of try");
	




	}
	   catch(ClassNotFoundException e){
		System.err.println(e);
		}
		catch(SQLException e){
		   e.printStackTrace();
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
		
		
		System.out.println("End of Main");
	}
}