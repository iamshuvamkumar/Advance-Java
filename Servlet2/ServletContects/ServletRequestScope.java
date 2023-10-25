package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public  class ServletRequestScope extends HttpServlet {
   	
	 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		  res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		  out.print("<html><body>");
		  Integer count =  (Integer)req.getAttribute("count_var");
		  if(count == null)
			  count = new Integer(0);
		  out.print("<h1>   "+ count+"   ");
		   count = new Integer(count+1);
		  req.setAttribute("count_var",count);
		  out.print( count+"</h1>");
		  
		  out.print("</body></html> ");
	
		
	}
	 
	
	
}
