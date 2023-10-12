package myjdbc;
import java.sql.*;
class TestOracle1{
  
   public static void main(String ...s)  {
	   System.out.println("start in main  ");
	   try{
		   System.out.println("start in  try   ");
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Step1 Load the Driver class   ");
           Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		    System.out.println("Step2 get connection   "+conn);
			Statement stmt = conn.createStatement();
			System.out.println("Step3 get stmt object    ");
			//int x = stmt.executeUpdate("create table  employee(name varchar(255),id varchar(255),design varchar(255),salary number)");
			//System.out.println("The Table is created successully ....   "+x);
			
			int x1 = stmt.executeUpdate("insert into employee values('Ajay','O2TCS','Soft-Er',32000 )");
			System.out.println("The one records inserted  successully ....   "+x1);
			ResultSet rs =  stmt.executeQuery("select * from employee");
			System.out.println("Step4 get rs object    ");
			System.out.println("Name\tId\tDesgination\tsalary ");
			while(rs.next()){
			    System.out.print(rs.getString(1));	
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t\t"+rs.getString(4));
			}
		   conn.close();
		   System.out.println("Step5  close connetion    ");
		   System.out.println("end of   try   ");
	   }
	   catch(ClassNotFoundException e){
		   e.printStackTrace();
	   }
	   catch(SQLException e){
		   e.printStackTrace();
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
	   System.out.println("End of main  ");
   }
	
}