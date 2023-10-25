package myServlet1;

import javax.servlet.*;
import java.io.*;
public class MyFirstServlet1 implements Servlet{
	 public void init(ServletConfig config){
		 System.out.println("From initi Method Load the Servlet class ");
	 }
	 public void service(ServletRequest req ,ServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html"); 
		PrintWriter ps =  res.getWriter();
		ps.print("<html><body>");
		ps.print("<h1 Style=color:red;>Hello I'm Under the water <h1>");
		ps.print("<h2 Style=color:blue;>Hello I'm Under the water <h2>");
		ps.print("<h3 Style=color:#7DC95E;>Hello I'm Under the water <h3>");
		ps.print("<h4 Style=color:#e0607e;>Hello I'm Under the water <h4>");
		ps.print("<h5 Style=color:#F6C5AF;>Hello I'm Under the water <h5>");
		ps.print("<h6 Style=color:#D72483;>Hello I'm Under the water <h6>");
		ps.print("</body></html>"); 
	 }
	 public void destroy(){
		 System.out.println("Undeployment .. fron destroy   ");
	 }
	 public  ServletConfig getServletConfig(){return null;}
	 public String  getServletInfo(){return null;} 
}