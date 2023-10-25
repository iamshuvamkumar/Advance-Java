package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String uname = req.getParameter("username");
		pw.print("<html><body>");
		pw.print("<h1>Hello Servlet1 ReWrating </h1>");
		
		pw.print(" <a href='servlet2?username="+uname+"'>click</a>");
		
		pw.print("</body></html>");
	}

}
