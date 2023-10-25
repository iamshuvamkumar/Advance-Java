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
<title>Data</title>
</head>
<style>
a {
	text-decoration: none;
	border: 2px solid white;
	border-radius: 3px;
	color: white;
	box-shadow: 3px 3px 5px white;
}

.update:hover {
	background-color: rgb(12, 123, 12);
	box-shadow: 3px 3px 5px rgb(12, 123, 12);
}

.ChangePassword:hover {
	background-color: rgba(158, 129, 14, 0.773);
	box-shadow: 3px 3px 5px rgba(158, 129, 14, 0.773);
}

.delete:hover {
	background-color: rgb(193, 6, 6);
	box-shadow: 3px 3px 5px rgb(193, 6, 6);
}

.container {
	display: flex;
	width: 100vw;
	height: 100vh;
	background: aquamarine;
	align-content: center;
	justify-content: center;
	align-items: center;
}

.table-box {
	background: bisque;
	width: 98%;
	height: 98%;
	display: flex;
	align-items: flex-start;
	justify-content: center;
}

table {
	border-radius: 10px;
	width: 100%;
	background: white;
	/* color: white; */
	padding: 15px;
	margin-top: 10px;
}

tr {
	height: 50px;
}

th {
	background-color: teal;
	color: white;
	font-size: 20px;
}

td {
	font-size: 20px;
	background-color: black;
	color: white;
	text-align: center;
}

h1 {
	text-align: center;
}
</style>

<body>
	<%
	String uname = request.getParameter("username");
	%>
	<h1><%=uname%>
		Recoard Add In DataBase
	</h1>
	<%
	try {
		Connection conn = DbConnect.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from empid");
	%>
	<table border="1">
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Moblie No</th>
			<th>Email</th>
			<th>PassWord</th>
			<th>Action</th>
		</tr>
		<%
		int i=1;
		while (rs.next()) {
		%>
		<tr>
		<td> <%= i++ %></td>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><a class="update" href="update.html">Update</a>&nbsp;|&nbsp;<a
				class="delete" href="delete.html">Delete</a>&nbsp;|&nbsp;<a
				class="ChangePassword" href="changePassword.html">Change
					Password</a></td>

			<%
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>
		
</body>

</html>