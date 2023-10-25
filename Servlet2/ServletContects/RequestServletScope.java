package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public  class RequestServletScope extends HttpServlet {
   	
	 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		  out.print("<html><body>");
		  String uname =(String)  req.getParameter("username");
		  out.print("<h1> User name is"+uname+"   <h1>");
		  req.setAttribute("user name is => ",uname);
		  out.print("<a href='servlet2'>Clicked</a>");
		  out.print("</body></html> ");
	}

}
