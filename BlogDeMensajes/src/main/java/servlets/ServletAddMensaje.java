package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeanMensajeUsuario;
import resources.BaseMensajes;
import resources.Mensaje;

/**
 * Servlet implementation class ServletAddMensaje
 */
public class ServletAddMensaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAddMensaje() {
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
		BeanMensajeUsuario user = (BeanMensajeUsuario) request.getSession().getAttribute("usuario");
		String contenido = request.getParameter("contenido");
		BaseMensajes baseMensajes = (BaseMensajes) request.getServletContext().getAttribute("baseMensajes");
		Mensaje nuevoMensaje = new Mensaje(user.getNombre(),contenido);
		
		baseMensajes.addMensaje(nuevoMensaje);
		
		dispacher.forward(request, response);
	}

}
