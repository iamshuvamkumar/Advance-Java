package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class textOracle {
public static void main(String[] args) {
	System.out.println("First way to load driver");


	try{
	  System.out.println("Start Try block ");
	
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  System.out.println("setp 1 load driver");
	
	  Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata4pm?useSSL=false","root","5265374");
      System.out.println("Get the Connection object  step2  ");

      Statement stmt = cont.createStatement();
	  System.out.println("Get the Stmt obj3 step3  ");
	
	
	 }
	 catch(ClassNotFoundException e){
		 e.printStackTrace();
	}
	 catch(SQLException e){
		   e.printStackTrace();
	   }
	
	
	
	}
}