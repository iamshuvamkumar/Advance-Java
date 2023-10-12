package text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class MySqle {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\JDBC\\MysqlEclips\\TestProperties\\rec\\sq.properties");
			System.out.println("File Read .....");
			Properties prop = new Properties();
			prop.load(fis);
			String namee = (String) prop.get("driverClassName");
			String url = (String) prop.get("url");
			String user = (String) prop.get("user");
			String pass = (String) prop.get("pass");
			System.out.println(namee + "\n " + url + "\n " + user + "\n" + pass);

			Class.forName(namee);
			System.out.println("step1............");	
			
			 Connection conn  = DriverManager.getConnection(url,user,pass); 
			System.out.println("st2.................");
				
			Statement stmt =conn.createStatement();
			System.out.println("Step3 ...............");
			
		//	int x = stmt.executeUpdate("create table  OMTable(Name varchar(255) Primary key,ID varchar(255),ROLE varchar(25),SALARY int)");
		//	System.out.println("The Table is created successully ....   "+x);
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter a name of Employee  ");
			String NAME= br.readLine();
			
			System.out.print("Enter a id of Employee  ");
			int ID= Integer.parseInt(br.readLine());
			
			System.out.print("Enter a Designation of Employee  ");
			String ROLE= br.readLine();
			
			System.out.print("Enter a Salary of Employee  ");
			int SALARY =Integer.parseInt(br.readLine());
			
			int x1 = stmt.executeUpdate("insert into OMTable values('"+NAME+"','"+ID+"','"+ROLE+"',"+SALARY+" )");
			System.out.println("The one records inserted  successully ....   "+x1);

			ResultSet  rs =  stmt.executeQuery("select * from OMTable");
			System.out.println("Step-4.................");
			System.out.println("Name\tId\tDesgination\tsalary ");
			while(rs.next()){
			    System.out.print(rs.getString(1));	
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t\t"+rs.getString(4));
			}
		   conn.close();
		   System.out.println("Step5  close connetion    ");

			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			}

		}
