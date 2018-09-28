package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cotizacion;

/**
 * Servlet implementation class ServletDatosCobertura
 */
public class ServletDatosCobertura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDatosCobertura() {
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

		RequestDispatcher dispacher = request.getRequestDispatcher("/cotizacion.jsp");		

        String tipoCobertura = request.getParameter("tipoCobertura");
		request.setAttribute("titulo","Seguros S.A");
    	request.setAttribute("subtitulo","Resultado de la Cotización");

        // you may check if the answers exist and validate them
        Cotizacion answers = (Cotizacion) request.getSession().getAttribute("answers");

        if (answers == null) {
            // no bean was set in session
                    // do something
        } else {
        	answers.setCovertura(tipoCobertura);
        }
        
        // you now can forward to some view, for example some results.jsp
        request.getRequestDispatcher("/cotizacion.jsp").forward(request, response);

		dispacher.forward(request, response);
	}

}
