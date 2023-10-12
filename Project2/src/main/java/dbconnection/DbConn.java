package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
    private static Connection conn=null;
    public static Connection getConnection() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver"); 
    	  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nini?useSSL=false","root","5265374");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return conn;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
