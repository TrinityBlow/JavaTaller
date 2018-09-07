package custom_filters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FiltroLogDeAccesos
 */
@WebFilter(
		urlPatterns = { "/*"},
		initParams = @WebInitParam(name = "archivoLog", value = "log.txt")
		)

public class FiltroLogDeAccesos implements Filter {

	private FilterConfig config;
    /**
     * Default constructor. 
     */
    public FiltroLogDeAccesos() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String ipAddress = httpRequest.getHeader("X-FORWARDED-FOR");  
		if (ipAddress == null) {  
			ipAddress = httpRequest.getRemoteAddr();  
		}
		Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss -SS");
		String currentTime = format.format(now);
		
		config.getServletContext().log(ipAddress +" - " + httpRequest.getHeader("User-Agent") + " [" + currentTime + "] \"" + httpRequest.getMethod() + httpRequest.getRequestURI() + httpRequest.getProtocol() + "\"");
		System.out.println(ipAddress +" - " + httpRequest.getHeader("User-Agent") + " [" + currentTime + "] \"" + httpRequest.getMethod() + httpRequest.getRequestURI() + httpRequest.getProtocol() + "\"");
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
	}

}
