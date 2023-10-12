package myservlet;

 
import java.io.*;
import java.sql.*;
import java.util.*;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.*;
import javax.servlet.http.*;

import dbconnection.DbConn;
import dbconnection.Emp;

import javax.servlet.annotation.WebServlet;


 
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter pw = response.getWriter();
		try { pw.print("<html><body>"); 
		String uname = (String) request.getParameter("username"); 
		String mob =  (String) request.getParameter("mobno");
		String email =  (String) request.getParameter("email"); 
		String pass =  (String) request.getParameter("password");
		
		Emp ep = new Emp();
		
		ep.setUsername(uname);
		ep.setMobno(mob);
		ep.setEmail(email);
		ep.setPass(pass);

		Connection conn = DbConn.getConnection();
		Statement stmt = conn.createStatement();
		
		int rs =  stmt.executeUpdate("insert  into empid values('"+uname+"','"+mob+"','"+email+"','"+pass+"')"); 
		System.out.println(rs); 
 	
		pw.print("<a href='Login.html'><button>Login</button></a>");
		pw.print("<a href='data'><button>Show Data</button></a>");
		}catch(Exception e){
			e.printStackTrace();
		} 
		pw.print("</body></html>"); 
		}
	}


