

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Visitas
 */
public class Visitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int visitantes = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Visitas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		visitantes = visitantes + 1;
		String name = request.getParameter("firstname");
		response.getWriter().write("¡Felicitaciones "+ name + "​! eres el visitante número " + visitantes + " de nuestro sitio y has sido seleccionado para el gran premio TTPS - Cursada APROBADA");
		
	}

}
