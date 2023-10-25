package scope1;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
  public class Demo3 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter pw = res.getWriter();
		  pw.print("<html><body>");
		   
		 ServletConfig config = getServletConfig();
		 ServletContext ctx = config.getServletContext();
		   
		 String url = (String)ctx.getInitParameter("url");
		 String drivername = (String)ctx.getInitParameter("drivername");
	     String username = (String)ctx.getInitParameter("username");
	     String password = (String)ctx.getInitParameter("password");
	     
		 pw.print("<html><body>");
      
		 pw.print("<a href='a'>clk</a>");
	     
		 
		 try{
			Class.forName(drivername);
			Connection conn =DriverManager.getConnection(url,username,password);
		    Statement stmt = conn.createStatement();
			
		    ResultSet rs = stmt.executeQuery("select * from nini");
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
		}
		catch(Exception e){
			System.err.print(e);
		}
	    
		 pw.print("</body></html>");
	}
}