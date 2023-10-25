package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public  class DemoServlet extends HttpServlet {
   	
	 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		  out.print("<html><body>");
		   out.print("<h1>This is first Example of Servlet <h1>");
		  String uname =  (String)req.getAttribute("user");
		  out.print("<h1> User name is"+uname+"   <h1>");
		  out.print("<h1>Resoponse From service Method  <h1>");
		  out.print("</body></html> ");
	
		
	}
	 
	
	
}
