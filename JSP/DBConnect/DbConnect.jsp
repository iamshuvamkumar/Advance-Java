<html><body>

<%= "This is Jsp" %>
 
 <%
  out.print("Hello Jsp <br>");
  %>
 <%=" user name "+request.getParameter("username") %>
 <br>
 <%=" user pass "+request.getParameter("password") %>
   
 
</body></html>