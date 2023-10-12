package demo;
 
	import java.io.*;

	import java.sql.*;
	import java.util.*;
	import javax.security.auth.message.callback.PrivateKeyCallback.Request;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	import dbconnection.*;

	@WebServlet("/delete")
	public class Delete extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			try {
				pw.print("<html><body>");

				Connection conn = DbConn.getConnection();
				Statement stmt = conn.createStatement();
				 String password = request.getParameter("password");
				 System.out.println(password);
				 String query = "delete from empid where password='" + password + "'"; 
			        int a = stmt.executeUpdate(query); 
			    	if (a != 0) {
						RequestDispatcher rd = request.getRequestDispatcher("data");
						rd.forward(request, response);
					} else {
						pw.print("<br>");
						pw.print("<br><p>Password Error !</p>  ");
						RequestDispatcher rd = request.getRequestDispatcher("/Delete.html");
						rd.include(request, response);
					}

			} catch (Exception e) {
				e.printStackTrace();
			}
			pw.print("</body></html>");
		}
	}

 
