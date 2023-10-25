package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginBin;

 
@WebServlet("/login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter pw = response.getWriter(); 
		 pw.print("<html><body>"); 

		 String uname = request.getParameter("username");
		 String pass = request.getParameter("password");
		 LoginBin lb = new LoginBin(); 

		 lb.setUsername(uname);
		 lb.setPassword(pass);
		 
		 if(lb.logingVerify()) {
				HttpSession session = request.getSession();
				session.setAttribute("uname", lb.getUsername());
				RequestDispatcher rd = request.getRequestDispatcher("/logout");
				rd.forward(request, response);
		 }
		 else {
			  pw.print("<br>User and Password Error ! <br>  ");
			  RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			  rd.include(request, response);
		 }
		
		 
		 
		 pw.print("</body></html>");
	}

}
