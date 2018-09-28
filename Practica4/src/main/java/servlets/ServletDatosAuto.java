package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cotizacion;

/**
 * Servlet implementation class ServletDatosAuto
 */
public class ServletDatosAuto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDatosAuto() {
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

		RequestDispatcher dispacher = request.getRequestDispatcher("/comprador.jsp");		

		request.setAttribute("titulo","Seguros S.A");
		request.setAttribute("subtitulo","Formulario de Cotización");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        int añoVehiculo = Integer.valueOf(request.getParameter("añoVehiculo"));
        int kmVehiculo = Integer.valueOf(request.getParameter("kmVehiculo"));

        // you may check if the answers exist and validate them

        Cotizacion answersBean = new Cotizacion();
        answersBean.setMarca(marca);
        answersBean.setModelo(modelo);
        answersBean.setAñoVehiculo(añoVehiculo);
        answersBean.setKmVehiculo(kmVehiculo);       

        // store bean in session
        request.getSession().setAttribute("answers", answersBean);


        // you now can forward to some view, for example some results.jsp
		dispacher.forward(request, response);
	}

}
