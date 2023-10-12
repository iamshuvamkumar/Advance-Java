package MyPrepard;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.CallableStatement;

public class Callp {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\JDBC\\MysqlEclips\\TestPrepaidStmt\\src\\Resource\\MyOracel.properties");
			System.out.println("Read File");

			Properties prop = new Properties();
			prop.load(fis);

			String DriverName = (String) prop.getProperty("driverClassName");
			String url = (String) prop.getProperty("url");
			String user = (String) prop.getProperty("user");
			String pass = (String) prop.getProperty("pass");

//		System.out.println(DriverName+"\n "+url+"\n "+user+" \n"+pass);
			Class.forName(DriverName);	
			Connection conn = DriverManager.getConnection(url, user, pass);

			Statement stmt = conn.createStatement();
			CallableStatement cs = (CallableStatement) conn.prepareCall("{call emp2(?,?)}");
			cs.setString(1, "Ajit");
			cs.setInt(2, 700);
			cs.executeUpdate();

			ResultSet result1 = stmt.executeQuery("select * from emp");
			while (result1.next()) {
				System.out.println(result1.getString(1));
				System.out.println(result1.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
