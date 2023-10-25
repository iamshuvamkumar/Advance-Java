<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Connecter.DbConnect"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String uname = request.getParameter("username");
	String pass = request.getParameter("password");
	 
	%>
	<%=uname+" "+pass  %>
	<%
	try {
		Connection conn = DbConnect.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select username , password from empid");
		
		Map<Object, String> map = new HashMap<Object, String>();
	
		while (rs.next()) {
			map.put(rs.getString(1), rs.getString(2));
		}
		boolean flag = false;
		
		for (Map.Entry m : map.entrySet()) {	
			if ((m.getKey().equals(uname)) && (m.getValue().equals(pass))) {
				flag = true;
				}  			 
		   }
	 if(flag == true){
		 System.out.println("this is true ");
		 RequestDispatcher rd = request.getRequestDispatcher("Data.jsp"); 
		 	rd.forward(request, response);
	 }
	 else{		 
		 System.out.println("this is false ");
		 RequestDispatcher rd = request.getRequestDispatcher("login.html"); 
		 	rd.include(request, response); 
	 }
	
	

		 
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>