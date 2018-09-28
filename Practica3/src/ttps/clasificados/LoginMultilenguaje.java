package ttps.clasificados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginMultilenguaje
 */
@WebServlet("/LoginMultilenguaje")
public class LoginMultilenguaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginMultilenguaje() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lang = (String) request.getAttribute("lang");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HashMap<String,String> dictionary = new HashMap<String,String>();
		String[] parts;
		
		// pass the path to the file as a parameter 
		String line;	
		FileReader f = new FileReader("C:\\Users\\Rats\\Workspace Taller\\Practica3\\WebContent\\Resourses\\" + lang);
        BufferedReader bufferreader = new BufferedReader(f);
        while ((line = bufferreader.readLine()) != null) {     
        	parts = line.split("=");
        	dictionary.put(parts[0], parts[1]);
       // 	System.out.println(line + "   linea leida");
       // 	System.out.println(parts[1]);
        }
        bufferreader.close();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + dictionary.get("titulo") + "</p>");
		out.println("<form action=\"/Practica3/Login2\" method=\"post\">");
		out.println("<div class=\"container\">");
		out.println("<label for=\"uname\"><b>" + dictionary.get("labelusuario") + "</b></label>");
		out.println("<input type=\"text\" placeholder=\"" + dictionary.get("labelusuario") + "\" name=\"uname\" required>");
		out.println("<label for=\"psw\"><b>" + dictionary.get("labelpassword") + "</b></label>");
		out.println("<input type=\"password\" placeholder=\"" + dictionary.get("labelpassword") + "\" name=\"psw\" required>");
		out.println("<button type=\"submit\">" + dictionary.get("login") + "</button>");
		out.println("</div>");
		out.println("</form>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
