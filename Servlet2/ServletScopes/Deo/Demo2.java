package scope1;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
 
  public class Demo2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter pw = res.getWriter();
		   ServletContext ctx = getServletContext();
		  pw.print("<html><body>");
		  String name = (String)req.getParameter("username");
		  pw.print("<h1>Hello Servlet 2 "+name+"</h1>");
		  ctx.setAttribute("user",name);
		  pw.print("<a href='c'>clk</a>");
		  pw.print("</body></html> ");	
	}
}