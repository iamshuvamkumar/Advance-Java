package myservlet;

import java.io.*;

import java.sql.*;
import java.util.*;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import dbconnection.*;

@WebServlet("/login1")
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try {
			pw.print("<html><body>");

			Connection conn = DbConn.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select password from empid");

			ArrayList<String> password = new ArrayList<String>();

			while (rs.next()) {
				String p = rs.getString(1);
				password.add(p);
				 
			}

			String pass = (String) request.getParameter("password");

			boolean flag = false;

			for (int i = 0; i < password.size(); i++) {
				if ((password.get(i).equals(pass))) {
					flag = true;
					i = password.size();
				}

				else {
					flag = false;
				}
			}

			if (flag) {
				RequestDispatcher rd = request.getRequestDispatcher("/Music.html");
				rd.forward(request, response);

			} else {
				pw.print("<br>");
				pw.print("<br><p style='position: relative;color:red;left: 84px;top: -51px;'>Passwaord Error !</p>  ");
				RequestDispatcher rd = request.getRequestDispatcher("/Login1.html");
				rd.include(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.print("</body></html>");
	}
}
