package Connecter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
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
}
