package ttps.clasificados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classResources.Administrador;
import classResources.Publicador;
import classResources.Usuario;

/**
 * Servlet implementation class Login2
 */
@WebServlet("/Login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>() ; 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login2() {
        super();
        usuarios.add(new Publicador("Franco" ,"asd"));
        usuarios.add(new Publicador("Carlos","qwe"));
        usuarios.add(new Administrador("Admin","asd"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String psw = request.getParameter("psw");
		ArrayList<String> operaciones;
		Usuario ingresando = new Usuario(uname, psw);
		Iterator<Usuario> it = usuarios.iterator();
		Usuario user = null;
		boolean encontrado = false;
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/mostrar");
		
		
		/*
		PrintWriter out = response.getWriter();
		out.println(ingresando.getName());
		out.println(ingresando.getPass());
		*/
		
		while (it.hasNext()) {
			user = it.next();
			//out.println(ingresando.equals(user));
			if(ingresando.equals(user)) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) {
			operaciones = user.getOperaciones();
			request.setAttribute("operaciones",operaciones);
			request.setAttribute("tipoUsuario", user.soyUn());
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("/clasificados30/error2.html");		
		}
	}

}
