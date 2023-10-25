package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletListener
 */
public class MyServletListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		res.setContentType("text/html");  
	    PrintWriter pw  = res.getWriter();
	    pw.print("<html><body>");
		ServletContext ctx = getServletContext();
	    try {
	    	 Connection conn = (Connection) ctx.getAttribute("conn");
			 System.out.println("Get conn in  Servlet..2");
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from emp2");
			 System.out.println("Get rs stmt  Servlet..2");
	    	    pw.print("<table border='5'> ");
			    pw.print("<tr> "); 
			    pw.print("<th>Id</th><th>Name</th><th>Course</th>");
	            pw.print("</tr> ");
				
			while(rs.next()){
			   pw.print("<tr> "); 
			   pw.print("<td>"+rs.getInt(1)+"</td>");
			   pw.print("<td>"+rs.getString(2)+"</td>");
			   pw.print("<td>"+rs.getString(3)+"</td>");
	           pw.print("</tr>");	
			 }
		       pw.print("</table> ");	
	    		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	    pw.print("</body></html>");
	}
	}
