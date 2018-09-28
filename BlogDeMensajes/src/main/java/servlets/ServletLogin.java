package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeanMensajeUsuario;
import resources.BaseUsuarios;

/**
 * Servlet implementation class ServletLogin
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
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
		RequestDispatcher dispacher = request.getRequestDispatcher("/visualizarMensajes.jsp");		
		BaseUsuarios baseUsuarios = (BaseUsuarios) request.getServletContext().getAttribute("baseUsuarios");
		String nom = request.getParameter("uname");
		String pass = request.getParameter("psw");
		
		
		BeanMensajeUsuario usuario = baseUsuarios.buscarUsuario(nom, pass);
        // store bean in session
        request.getSession().setAttribute("usuario", usuario);
        
		dispacher.forward(request, response);
	}

}
