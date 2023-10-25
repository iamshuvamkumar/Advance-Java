package myredirect;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DSendRedirect2 extends HttpServlet{
	    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		  out.print("<html><body>");
		  out.print("<h1>Before forward req of sservlet</h1>");
		  try{
			  req.setAttribute("username","shuvam");
			  RequestDispatcher rd = req.getRequestDispatcher("/sr");
			  rd.include(req,res);
		  }catch(Exception e){System.err.print(e);}
		  
		  out.print("<h1>After forward req of sservlet</h1>");
		  
		   
		  out.print("</body></html> ");
		}
}