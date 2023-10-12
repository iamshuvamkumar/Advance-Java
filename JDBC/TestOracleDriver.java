package myoracel;
import java.sql.*;
import java.util.Scanner;
public class TestOracleDriver{
	public static void main(String[]args){
		System.out.println("Start in Main");
		int id =0;
		String name = " ";
		String address = " ";
		String course = " ";
		float marks = 0.0f;
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Start in try");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("setp 1 load driver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","5265374");
			System.out.println("setp 2 connerct object");
			
			Statement st = con.createStatement();
			System.out.println("setp 3 connerct stmt ");
			
			//int x = st.executeUpdate("create table student (id number primary key,name varchar(20),address varchar(30),course varchar(50),marks float)");
			//System.out.println("setp 4 create table"+x);
			
			//int y = st.executeUpdate("insert into student values(101,'Shuvam','Badarpur','Java',9.9)");
			//System.out.println("Student Info"+y);
			
			System.out.println("Student ID");
		     id = sc.nextInt();
			
			System.out.println("Student Name");
			 name = sc.next();

			System.out.println("Student Address");
			 address = sc.next();
			
			System.out.println("Student Course");
			 course = sc.next();
			
			System.out.println("Student Mrak");
			 marks = sc.nextFloat();
			
		    String insertqry ="insert into student values("+id+",'"+name+"','"+address+"','"+course+"',"+marks+")" ;
             System.out.println("insert qry  :=>   "+insertqry);
		    int x1  = st.executeUpdate(insertqry);
			System.out.println("The records insert into successfully   "+x1);
			ResultSet rs = st.executeQuery("select * from student");
			  System.out.println("Get the ResultSet obj3 step4 ");
			System.out.println("Id\tName\tAddress\tMarks");
		    while(rs.next()){
				System.out.print(rs.getInt("id"));
				System.out.print("\t"+rs.getString("name"));
				System.out.print("\t"+rs.getString("address"));
				System.out.print("\t"+rs.getString("course"));
				System.out.println("\t"+rs.getInt("marks"));
			}
		    con.close();
			  System.out.println("close Conneection step5  ");
		     System.out.println("End of   try ");

	}catch(ClassNotFoundException e){
		System.err.println(e);
		} catch(SQLException e){
		   e.printStackTrace();
	   }
		
		
		System.out.println("End of Main");
	}
}