package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String uname = req.getParameter("username");
		pw.print("<html><body>");
		pw.print("<h1>Hello Servlet  ReWrating = "+uname+"</h1>");
		
		pw.print("</body></html>");
	}

}
