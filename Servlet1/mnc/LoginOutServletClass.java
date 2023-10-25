package MyHttpSession;
    
   	 import javax.servlet.*;
     import javax.servlet.http.*;
	 import java.io.*;
	 
   public class LoginOutServletClass extends HttpServlet{
	   
	 public void service(HttpServletRequest req , HttpServletResponse res)throws IOException,ServletException{
		   res.setContentType("text/html");
		PrintWriter ps = res.getWriter();
		ps.print("<html><body>");
		HttpSession session = req.getSession(false);
		 
		if(session != null){
			String uname = (String)session.getAttribute("user");
		    ps.print("<h1>Welcome "+uname +" </h1>");
			ps.print("<a href='form.html'>Logout</a>");
		}
        else{
			ps.print("<h1> please Login   </h1>");
		   RequestDispatcher rd = req.getRequestDispatcher("/form.html");
		   rd.include(req,res);
		}		
		ps.print("</body></html>");
	}
}