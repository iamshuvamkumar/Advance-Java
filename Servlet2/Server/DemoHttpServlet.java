package MyHttp;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class DemoHttpServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Hello Http Servlet</h1>");
		out.println("</body></html>");
	}
	
}