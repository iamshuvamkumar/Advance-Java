package MyHttpSession;
    
   	 import javax.servlet.*;
     import javax.servlet.http.*;
	 import java.io.*;
	 
   public class DemoHttpSession extends HttpServlet{
	   
	 public void service(HttpServletRequest req , HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		HttpSession session = req.getSession();
		Integer count = (Integer) session.getAttribute("Count_var");
		if(session.isNew()){
			count = new Integer(0);
		}
		pw.print("<h1>"+count.intValue());
		count = new Integer(count.intValue()+1);
		pw.print(" "+count.intValue()+"</h1>");
		session.setAttribute("Count_var",count);
		pw.print("<h1>"+session.getId()+"</h1>");
		pw.print("</body></html>");
	}
}