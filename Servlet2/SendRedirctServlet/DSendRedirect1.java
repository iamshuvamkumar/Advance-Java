package myredirect;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DSendRedirect1 extends HttpServlet{
	    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		  out.print("<html><body>");
		   //out.print("<h1>This is DSendRedirect1 SenRedircat <h1>");
		   //res.sendRedirect("http://192.168.0.113:7001/ax/sr");
		   //res.sendRedirect("http://localhost:8085/shk1/c");
		   res.sendRedirect("http://localhost:8085/ax/sr");
		   
		  out.print("</body></html> ");
		}
}