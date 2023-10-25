package scope1;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
 
  public class Demo3 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter pw = res.getWriter();
		  pw.print("<html><body>");
          Integer count = (Integer)req.getAttribute("count_var");
		  if(count==null)
		  count = new Integer(0);
		  pw.print("<h1>Hello Servlet3 count  "+count+"</h1>");
		  count = new Integer(count+1);
		  req.setAttribute("count_var",count);
		  pw.print("<h1>Hello Servlet3 count  "+count+"</h1>");

		  pw.print("</body></html> ");	
	}
}