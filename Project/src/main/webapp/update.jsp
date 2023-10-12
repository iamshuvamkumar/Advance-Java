
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
	String uname = request.getParameter("username");
	String mob = request.getParameter("mobile");
	String eml = request.getParameter("email");
	String pass = request.getParameter("password");
%>

<%
	try {
		Connection conn = DbConnect.getConnection();
		Statement stmt = conn.createStatement();
		String query = "UPDATE empid SET username ='" + uname + "', mob= '" + mob + "',email= '"+eml+"' WHERE password ='" + pass+ "'";
		int a = stmt.executeUpdate(query);
		if (a != 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Data.jsp");
			rd.forward(request, response); 
		 } else {
			RequestDispatcher rd = request.getRequestDispatcher("update.html");
			rd.include(request, response);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
</body>
</html>