package myfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class TextFilter
 */
public class TextFilter extends HttpFilter implements Filter {
       
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Init method of filter class in invoke"); 
	}


 
	public void doFilter(ServletRequest req , ServletResponse res, FilterChain chain) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1> Filter before servlet class</h1>");
		//pass the req along the filter chain
		chain.doFilter(req , res );
		pw.print("<h1> filter after servlet class</h1>");
		pw.print("</body></html>");
	}

	public void destroy() {
		 
	}
	

}
