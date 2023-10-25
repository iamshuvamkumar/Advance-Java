package MyListener;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

 
public class ListnerServlet implements ServletContextListener {

	  public void contextInitialized(ServletContextEvent ctxe)  { 
   	   try {
  			Class.forName("oracle.jdbc.driver.OracleDriver");
  			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System", "5265374");			
  			System.out.println("Connet .. Connection .. ");
  			ServletContext ctx = ctxe.getServletContext();
  			ctx.setAttribute("conn", conn);
  			System.out.println("Context Is contextInitialized.... ");
  			
  			
  		} catch (Exception e) {
  			e.printStackTrace();
  			
  		}
   }
	
    public void contextDestroyed(ServletContextEvent ctx)  { 
    	System.out.println("Context Is contextDestroyed.... ");
    }
 
}
