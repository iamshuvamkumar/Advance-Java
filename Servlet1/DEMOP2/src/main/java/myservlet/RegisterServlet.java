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
import bean.RegisterBin;
 
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String String = null;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		 response.setContentType("text/html");
    		 PrintWriter pw = response.getWriter(); 
    		 pw.print("<html><body>"); 
    		 RegisterBin rb = new RegisterBin();
    		/* 
    		 String st_id = request.getParameter("id");
    		 String st_name = request.getParameter("name");
    		 String st_password = request.getParameter("password");
    		 String st_mob = request.getParameter("mob");
    		 String st_email = request.getParameter("email");
    		 */
    		 rb.setId(Integer.parseInt((String)request.getParameter("id")));
    		 rb.setName((String)request.getParameter("name"));
    		 rb.setPassword((String)request.getParameter("password"));
    		 rb.setMob(Integer.parseInt((String)request.getParameter("mob")));
    		 rb.setEmail((String)request.getParameter("email"));
    		 
    		 String id = request.getParameter("id");
    		 String pass = request.getParameter("password");
    		 LoginBin lb = new LoginBin(); 

    		 lb.setUsername(id);
    		 lb.setPassword(pass);
    		 
//    		 if(lb.logingVerify()) {
//    				HttpSession session = request.getSession();
//    				session.setAttribute("id", lb.getUsername());
//    				RequestDispatcher rd = request.getRequestDispatcher("/logout");
//    				rd.forward(request, response);
//    		 }
//    		 else {
//    			  pw.print("<br>User and Password Error ! <br>  ");
//    			  RequestDispatcher rd = request.getRequestDispatcher("/login.html");
//    			  rd.include(request, response);
//    		 }
//    		
    		 
    		 
    		 pw.print("</body></html>");
    	}

}
