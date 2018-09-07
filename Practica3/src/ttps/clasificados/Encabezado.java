package ttps.clasificados;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Encabezado
 */
@WebServlet("/Encabezado")
public class Encabezado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Encabezado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext contexto = getServletContext();
		PrintWriter out = response.getWriter();
		String siteName = (String) contexto.getAttribute("siteName");
		String phone = (String) contexto.getAttribute("phone");
		String email = (String) contexto.getAttribute("email"); 

		out.println("<h1> Informacion del sitio </h1>");
		out.println();
		out.println("<h3>Nombre del sitio: " + siteName + "</h3>");
		out.println("<h3>Email del sitio: " + email + "</h3>");
		out.println("<h3>Numero del sitio: " + phone + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
