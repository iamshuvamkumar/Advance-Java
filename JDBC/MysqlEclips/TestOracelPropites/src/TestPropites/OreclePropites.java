package TestPropites;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class OreclePropites {

	public static void main(String[] args) {
		try {
		
			FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\JDBC\\MysqlEclips\\TestOracelPropites\\src\\TestPropites\\db.properties");
			System.out.println("File Read .....");
		    Properties prop = new Properties();
		    prop.load(fis);
		    String namee = (String)prop.get("driverClassName");
			String url = (String)prop.get("url");
		    String user = (String)prop.get("user");
		    String pass = (String)prop.get("pass"); 
			
		    Class.forName(namee);
		    System.out.println("step1............");
		    Connection conn  = DriverManager.getConnection(url,user,pass);
			System.out.println("st2.................");
			Statement stmt =conn.createStatement();
			System.out.println("Step3 get stmt object    ");
			int x = stmt.executeUpdate("create table  OMTable(name varchar(255),id varchar(255),design varchar(255),salary int)");
			System.out.println("The Table is created successully ....   "+x);
			
			 
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter a name of Employee  ");
			String name= br.readLine();
			
			System.out.print("Enter a id of Employee  ");
			String id= br.readLine();
			
			System.out.print("Enter a Designation of Employee  ");
			String design= br.readLine();
			
			System.out.print("Enter a Salary of Employee  ");
			int sal =Integer.parseInt(br.readLine());
			int x1 = stmt.executeUpdate("insert into employee4pm values('"+name+"','"+id+"','"+design+"',"+sal+" )");
			System.out.println("The one records inserted  successully ....   "+x1);
			
			ResultSet  rs =  stmt.executeQuery("select * from employee4pm");
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
		
		
			 
			
			
			System.out.println("End of try  ");
			
		} catch (Exception e) {  e.printStackTrace(); }
		System.out.println("End of main  ");
	}

}