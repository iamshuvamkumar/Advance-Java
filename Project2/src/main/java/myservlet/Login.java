package myservlet;

import java.io.*;

import java.sql.*;
import java.util.*;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import dbconnection.*;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try {
			pw.print("<html><body>");

			Connection conn = DbConn.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select username from empid");

			ArrayList<String> name = new ArrayList<String>();
			 

			while (rs.next()) {
				String n = rs.getString(1);	 
				name.add(n);
			}

			String uname = (String) request.getParameter("username");

			boolean flag = false;
			
			for (int i = 0; i < name.size(); i++) {
				if ((name.get(i).equals(uname))) {
					flag = true;
					i = name.size();
				}

				else {
					flag = false;
				}
			}

			if (flag) {
				RequestDispatcher rd = request.getRequestDispatcher("/Login1.html");
				rd.forward(request, response);

			} else {
				pw.print("<br>");
				pw.print("<br><p style='position: relative;color:red;left: 84px;top: -51px;'>User Error !</p>  ");
				RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
				rd.include(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.print("</body></html>");
	}
}
