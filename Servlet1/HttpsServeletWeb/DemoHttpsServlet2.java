package DHS;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class DemoHttpsServlet2 extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	    res.setContentType("text/html");
		PrintWriter ps =  res.getWriter();
		String uname =(String) req.getParameter("username"); 
		String pass  =(String) req.getParameter("password"); 
		ps.print("<html><body>");
		ps.print("<h1 style=Color:white;text-align:center;background:navy;>I'm do Post</h1>");
		ps.print("</body></html>");
		ps.print("<h1 style=Color:white;text-align:center;background:#000000;>User Name "+uname+ "  </h1>");
		ps.print("<h1 style=Color:white;text-align:center;background:#707055;>Passwod "+pass + "  </h1>");
		if(uname.equals("abc") && pass.equals("123	"))
			ps.print("<h1 style=Color:white;text-align:center;background:green;> Valid User   </h1>");
	     else 
			 ps.print("<h1 style=Color:white;text-align:center;background:blue;> InValid User </h1>");
		ps.print("</body></html>");
		
	}
	
	
}