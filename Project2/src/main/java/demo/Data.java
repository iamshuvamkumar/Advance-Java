package demo;
 
	import java.io.*;

	import java.sql.*;
	import java.util.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	import dbconnection.*;

	@WebServlet("/data")
	public class Data extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			try {
				pw.print("<html><body>");

				Connection conn = DbConn.getConnection();
				Statement stmt = conn.createStatement();
				 
				 ResultSet rs = stmt.executeQuery("select * from empid");
		    	    pw.print("<table border='5'> ");
				    pw.print("<tr> "); 
				    pw.print("<th>No.</th><th>name</th><th>Phone No</th><th>Email</th><th>Password</th><th>Action</th>");
		            pw.print("</tr> ");
					int i = 1;
				while(rs.next()){
				   pw.print("<tr> "); 
				   pw.print("<td>"+i+"</td>");
				   pw.print("<td>"+rs.getString(1)+"</td>");
				   pw.print("<td>"+rs.getString(2)+"</td>");
				   pw.print("<td>"+rs.getString(3)+"</td>");
				   pw.print("<td>"+rs.getString(4)+"</td>");
				   pw.print("<td><a href='Update.html'>Update</a> | <a href='Delete.html'>Delete</a> </td>");
				    
		           pw.print("</tr>");	
		           i++;
				 }
			       pw.print("</table> ");	
			       pw.print("<a href='Login.html'>Login</a>");

			} catch (Exception e) {
				e.printStackTrace();
			}
			pw.print("</body></html>");
		}
	}

 
