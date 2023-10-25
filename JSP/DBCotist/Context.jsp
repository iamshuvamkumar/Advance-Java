<%@ page import="java.sql.*" %>
<html><body>
<%
String driverName =(String)application.getInitParameter("drivername"); 
String url = (String)application.getInitParameter("url"); 
String name = (String)application.getInitParameter("user"); 
String password = (String)application.getInitParameter("pass");
 
System.out.print("driverName "+driverName+"url "+url+"name "+name+"password "+password);
%>
<%
try{
	Class.forName(driverName);
	 Connection conn = DriverManager.getConnection(url,name,password);
	 Statement stmt = conn.createStatement();
	 ResultSet rs = stmt.executeQuery("select * from nini");

%>
<table border="1">
<tr><th>Id</th><th>name</th><th>data</th></tr>
 <%
 while(rs.next()){

  %>
  
 <tr>
 <td><%=rs.getInt(1)%></td>
 <td><%=rs.getString(2)%></td>
 <td><%=rs.getString(3)%></td>
 </tr>
 
 	
	<%	}		
		}catch(Exception e){e.printStackTrace();}
	%>
	</table>
 
</body></html>