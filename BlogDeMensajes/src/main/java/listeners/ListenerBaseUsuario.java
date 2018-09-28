package listeners;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import resources.BaseMensajes;
import resources.BaseUsuarios;
import resources.Usuario;

/**
 * Application Lifecycle Listener implementation class ListenerBaseUsuario
 *
 */
public class ListenerBaseUsuario implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerBaseUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    	usuarios.add(new Usuario("qwe","ewq"));
    	usuarios.add(new Usuario("asd","dsa"));
    	usuarios.add(new Usuario("zxc","cxz"));
    	usuarios.add(new Usuario("Franco","dsa"));
    	BaseUsuarios baseUsuarios = new BaseUsuarios(usuarios);
    	sce.getServletContext().setAttribute("baseUsuarios", baseUsuarios);
    	sce.getServletContext().setAttribute("baseMensajes", new BaseMensajes());
    }
	
}
