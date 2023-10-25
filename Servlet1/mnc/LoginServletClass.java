package MyHttpSession;
    
   	 import javax.servlet.*;
     import javax.servlet.http.*;
	 import java.io.*;
	 
   public class LoginServletClass extends HttpServlet{
	   
	 public void service(HttpServletRequest req , HttpServletResponse res)throws IOException,ServletException{
		 res.setContentType("text/html");
		PrintWriter ps = res.getWriter();
		ps.print("<html><body>");
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		HttpSession session = req.getSession();
		 
		if(session != null){
			session.setAttribute("user",uname);
			RequestDispatcher rd = req.getRequestDispatcher("/logout");
			rd.forward(req,res);
		}
        else{
			ps.print("<h1> Invalid User & password Error!!   </h1>");
		   RequestDispatcher rd = req.getRequestDispatcher("form.html");
		   rd.include(req,res);
		}		
		ps.print("</body></html>");
	}
}