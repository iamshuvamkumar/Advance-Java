package myredirect;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DSendRedirect extends HttpServlet{
	    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		  out.print("<html><body>");
		  out.print("<h1>This is DSendRedirect <h1>");
		  String uname = (String)req.getAttribute("username");
		  out.print("<h1>"+uname+"<h1>");
		  
		  out.print("</body></html> ");
		}
}