package MyPrepard;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class PrepardStmt3{

	public static void main(String[] args) {
		System.out.println("Start Main");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("Start Try Block .......................");

			FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\JDBC\\MysqlEclips\\TestPrepaidStmt\\src\\Resource\\Postpred.properties");
			System.out.println("Read File");

			Properties prop = new Properties();
			prop.load(fis);

			String DriverName = (String) prop.getProperty("driverClassName");
			String url = (String) prop.getProperty("url");
			String user = (String) prop.getProperty("user");
			String pass = (String) prop.getProperty("pass");

//			System.out.println(DriverName+"\n "+url+"\n "+user+" \n"+pass);
			Class.forName(DriverName);
			System.out.println("Step-1.......Load the Driver Class");

			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("step-2.......GetConnection ");

			Statement stmt = conn.createStatement();
			System.out.println("Step-3.......Connect Statement ");

//			stmt.executeUpdate("Create Table PrepardStmt(ID int primary key,NAME varchar(20),ROAL varchar(20))");
//			System.out.println("Step-4 .......Create Table");

			System.out.println("===========Insert into DB=====================");

//						System.out.print("Enter a id of Employee  ");
//						int ID= Integer.parseInt(br.readLine());
//						
//						System.out.print("Enter a name of Employee  ");
//						String NAME= br.readLine();
//						
//						System.out.print("Enter a Designation of Employee  ");
//						String ROLE= br.readLine();
//					
//						PreparedStatement ps = conn.prepareStatement("insert into PrepardStmt values(?,?,?)");
//						ps.setInt(1, ID);
//						ps.setString(2, NAME);
//						ps.setString(3, ROLE);
//						
//						int x = ps.executeUpdate();
			System.out.println("Insert SuccesFull...........");

			System.out.println("===========Update into DB=====================");

//			System.out.print("Enter a id of Employee  ");
//			int ID= Integer.parseInt(br.readLine());
//			
//			System.out.print("Enter a name of Employee  ");
//			String NAME= br.readLine();
//			
//			System.out.print("Enter a Designation of Employee  ");
//			String ROAL= br.readLine();
//			
//			PreparedStatement ps1 = conn.prepareStatement("update  PrepardStmt set NAME=?, ROAL=? where ID=?");
//			
//			ps1.setString(1, NAME);
//			ps1.setString(2, ROAL);
//			ps1.setInt(3, 1003);

//			int x1  = ps1.executeUpdate();
//			System.out.println("Updated is Susccesfully");

//			stmt.executeUpdate("insert into PrepardStmt values(100,'Ram','God' )");
//			stmt.executeUpdate("insert into PrepardStmt values(101,'Radha','God' )");
//			stmt.executeUpdate("insert into PrepardStmt values(102,'Krishna','God' )");
			
//			String s1 =" Update PrepardStmt set name='Raja' where id = 10002 ";
//			String s2 =" insert into PrepardStmt values(1000,'Human','God')";
//			String s3 =" Delete from PrepardStmt where name = 'aarti'";
//			stmt.addBatch(s1);
//			stmt.addBatch(s2);
//			stmt.addBatch(s3);
//			stmt.executeBatch();
			
			ResultSet rs =  stmt.executeQuery("Select * from PrepardStmt");
			System.out.println("Id\tName\tRoal");
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("\t"+rs.getString(2));
				System.out.println("\t"+rs.getString(3));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End Main");
	}

	private static void PreparedStatement(String string) {
		// TODO Auto-generated method stub

	}
}
