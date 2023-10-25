package NewWeb;
import javax.servlet.*;
import java.io.*;
public class NewWebApp implements Servlet{
	
public void init(ServletConfig config){
	System.out.print("Init ServantConfig");
}	
public void destroy(){
	System.out.print("Destroy");
}
public void service(ServletRequest req ,ServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html"); 
		PrintWriter ps =  res.getWriter();
		ps.print("<html><body>");
		ps.print("<h1 Style=color:#D72483;>Hello Friend <h1>");
		ps.print("</body></html>"); 
	 }
	  public  ServletConfig getServletConfig(){return null;}
	 public String  getServletInfo(){return null;} 
	
}