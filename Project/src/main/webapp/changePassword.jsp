
<%@page
	import="org.apache.tomcat.jdbc.pool.interceptor.StatementCacheMBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Connecter.DbConnect"%>
<%@ page import="java.sql.*"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<%
	 String name = request.getParameter("username");
	String pass = request.getParameter("password");
	String npass = request.getParameter("newpassword");
%>
 <%= " "+pass+" "+npass %>
<%
	try {
		Connection conn = DbConnect.getConnection();
		Statement stmt = conn.createStatement();
		String query = "UPDATE empid SET password='"+npass+"'  WHERE username='"+name+"' and password ='" +pass+ "'";
		int a = stmt.executeUpdate(query);
		if (a != 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Data.jsp");
			rd.forward(request, response); 
		 } else {
			RequestDispatcher rd = request.getRequestDispatcher("changePassword.html");
			rd.include(request, response);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
</body>
</html>