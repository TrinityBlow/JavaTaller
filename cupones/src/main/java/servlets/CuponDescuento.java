package servlets;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CuponDescuento
 */
@WebServlet("/CuponDescuento")
public class CuponDescuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuponDescuento() {
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
		
		//inicializacion de variables
		String pathToWeb = getServletContext().getRealPath(File.separator);
		OutputStream out = response.getOutputStream();
		String apellido = request.getParameter("apellido");
		String nombre = request.getParameter("nombre");
		Integer dni = Integer.parseInt(request.getParameter("dni"));
		String email = request.getParameter("email");
		BufferedImage img = null;
		img = ImageIO.read(new File(pathToWeb + "\\WEB-INF\\classes\\solo.jpg"));//"C:\\Users\\Rats\\Workspace Taller\\cupones\\src\\main\\resources\\solo.jpg"));
		Graphics2D g2d = img.createGraphics();
        FontMetrics fm = g2d.getFontMetrics();
        int x = img.getWidth(); 
        int y = fm.getHeight();
		Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String currentTime = format.format(now);
        String nomApe = apellido + " " + nombre;        
        String bienvenida = "CUPON VALIDO PARA EL DÍA:";
        
        //configuracion de objectos
		response.setContentType("image/jpeg");
        g2d.setPaint(new Color(51,204,255));
        g2d.setFont(new Font("Impact", Font.PLAIN, 16));
        
        //insercion en la imagen
		g2d.drawString(bienvenida, (x - fm.stringWidth(bienvenida)) / 2, y + 5);
		g2d.drawString(currentTime, (x - fm.stringWidth(currentTime)) / 2, y + 21);
        g2d.setPaint(Color.YELLOW);
		g2d.drawString(nomApe , (x - fm.stringWidth(nomApe)) / 2, y + 50);
		g2d.drawString(String.valueOf(dni), (x - fm.stringWidth(String.valueOf(dni))) / 2, y + 79);
		g2d.drawString(email, (x - fm.stringWidth(email)) / 2, y + 105);
		
		//escritura de la respuesta
		ImageIO.write(img, "jpg", out);
		g2d.dispose();
		out.close();
		
	}

}
