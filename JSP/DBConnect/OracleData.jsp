<html><body>
<%
String driverName =(String)config.getInitParameter("drivername"); 
String url = (String)config.getInitParameter("url"); 
String name = (String)config.getInitParameter("user"); 
String password = (String)config.getInitParameter("pass");
 
System.out.print("driverName "+driverName+"url "+url+"name "+name+"password "+password);
%>
<%
try{
	Class.forName(driverName);
	java.sql.Connection conn =java.sql.DriverManager.getConnection(url,name,password);
	java.sql.Statement stmt = conn.createStatement();
	java.sql.ResultSet rs = stmt.executeQuery("select * from nini");

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