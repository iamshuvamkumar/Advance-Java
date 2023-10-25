package MyCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.print("<html><body>");
		 Cookie[] ca = req.getCookies();
		 if(ca==null) {
			Cookie c1 = new Cookie("user", "Shuvam"); 
			Cookie c2 = new Cookie("pass", "admin"); 
			 res.addCookie(c1);
			 res.addCookie(c2);
			 pw.print("Cookies Edit...");
		 }
		 else {
			 pw.print("<form action='second' method='post'>");
				
				pw.print("User <input type='text' value='"+ca[0].getValue()+"' name='"+ca[0].getName()+"'><br>");
				pw.print("Password <input type='password' value='"+ca[1].getValue()+"' name='"+ca[0].getName()+"'><br>");
				pw.print(" <input type='submit' value='next'>");
				pw.print("</form>");
		 }
		 

		pw.print("</body></html>");
	}

}
