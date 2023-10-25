package scope1;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
 
  public class Demo1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter pw = res.getWriter();
		   ServletContext ctx = getServletContext();
		  pw.print("<html><body>");
          String name = (String)ctx.getAttribute("user");
		  pw.print("<h1>Hello Servlet 1 "+name+"</h1>");
		  
		  pw.print("</body></html> ");	
	}
}