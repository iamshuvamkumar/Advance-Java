 
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
<title>Insert title here</title>
</head>
<body>
<%
	String uname = request.getParameter("username");
	String mob = request.getParameter("mobile");
	String eml = request.getParameter("email");
	String pass = request.getParameter("password");
%>
	<%= " this is rigester "+uname+" "+mob+" "+eml+" "+pass+" "  %>
<%
	try {
		Connection conn = DbConnect.getConnection();
		Statement stmt = conn.createStatement();
	    int x = stmt.executeUpdate("insert into empid values('"+uname+"','"+mob+"','"+eml+"','"+pass+"')");
	    if(x !=0 ){ 	
	    	RequestDispatcher rs = request.getRequestDispatcher("login.html"); 
	    	rs.forward(request, response);
	     }
	    else {
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	%>
</body>
</html>