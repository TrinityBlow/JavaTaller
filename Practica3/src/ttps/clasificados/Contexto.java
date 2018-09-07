package ttps.clasificados;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Contexto
 *
 */
@WebListener
public class Contexto implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Contexto() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	String siteName = sce.getServletContext().getInitParameter("siteName");
    	String email = sce.getServletContext().getInitParameter("email");
    	String phone = sce.getServletContext().getInitParameter("phone");
    	ServletContext contexto = sce.getServletContext();
    	contexto.setAttribute("siteName", siteName);
    	contexto.setAttribute("email", email);
    	contexto.setAttribute("phone", phone);
    }
	
}
