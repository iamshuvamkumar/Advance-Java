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


import myservlet.Loginservlet;


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");

		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("uname");
         System.out.println(username);
		pw.print("<h1>Welcome => " + username + "</h1></br>");
		pw.print("<a href='login.html'>Logout</a>");
		session.invalidate();

		pw.print("</body></html>");
	}

}
