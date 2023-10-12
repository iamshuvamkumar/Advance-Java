package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.DbConn;

@WebServlet("/update")
public class Update extends HttpServlet {
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
			String uname = request.getParameter("username");
			String mob = request.getParameter("mobno");
			String email = request.getParameter("email");
			String query = "UPDATE empid SET username ='" + uname + "', mob= '" + mob + "',email= '"+email +"' WHERE password ='" + password+ "'";
			int a = stmt.executeUpdate(query);
			if (a != 0) {
				RequestDispatcher rd = request.getRequestDispatcher("data");
				rd.forward(request, response);
			} else {
				pw.print("<br>");
				pw.print("<br><p>Password Error !</p>  ");
				RequestDispatcher rd = request.getRequestDispatcher("/Update.html");
				rd.include(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.print("</body></html>");
	}

}
