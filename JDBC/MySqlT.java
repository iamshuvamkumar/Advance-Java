package MySqlPak;
import java.sql.*;
import java.util.*;
public class MySqlT{
	public static void main(String[]args){
	System.out.println("Hello");	
	
	try{
	  System.out.println("Start Try block ");
	
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  System.out.println("setp 1 load driver");
	
	  Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata4pm?useSSL=false","root","5265374");
      System.out.println("Get the Connection object  step2  ");

      Statement stmt = cont.createStatement();
	  System.out.println("Get the Stmt obj3 step3  ");
	
	 // int x =stmt.executeUpdate("Create table 4pmtable(Id int primary key, Name varchar(15) , Course varchar(50))");
     // System.out.println(x);
	   
	   //int y = stmt.executeUpdate("insert into 4pmtable value(101,'abc','Data')");
	  //System.out.println(y);
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Id ");
	   int Id = sc.nextInt();
	   
	   System.out.println("Enter Name ");
	   String Name = sc.next();

	   System.out.println("Enter Course ");
	   String Course = sc.next();
	   
	   String insqry = "insert into 4pmtable values("+Id+",+'"+Name+"','"+Course+"')";
   	   System.out.println("End Try block ");
       System.out.println("Insret data "+insqry);
	   int x1  = stmt.executeUpdate(insqry);
	   System.out.println("The records insert into successfully   "+x1);
	   ResultSet rs = stmt.executeQuery("select * from 4pmtable");
	   System.out.println("Get the ResultSet obj3 step4 ");
	   System.out.println("Id\tName\tCourse");
	   while(rs.next()){
				System.out.print(rs.getInt("id"));
				System.out.print("\t"+rs.getString("Name"));
				System.out.println("\t"+rs.getString("Course"));
			}
		    cont.close();
			  System.out.println("close Conneection step5  ");
			  
	 }
	 catch(ClassNotFoundException e){
		 e.printStackTrace();
	}
	 catch(SQLException e){
		   e.printStackTrace();
	   }
	
	
	
	}
}