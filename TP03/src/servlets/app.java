	package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App
 */
@WebServlet("/ajoutePersonne")
public class app extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public app() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/ajoutePersonne.jsp" ).forward( request, response ); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
	    String prenom = request.getParameter("prenom");
	    String societe = request.getParameter("societe");
	    String ville = request.getParameter("ville");
	    String adresse = request.getParameter("adresse");

	    request.setAttribute("nom", nom);
	    request.setAttribute("prenom", prenom);
	    request.setAttribute("societe", societe);
	    request.setAttribute("ville", ville);
	    request.setAttribute("adresse", adresse);

	    request.getRequestDispatcher("/WEB-INF/ajoutePersonne.jsp").forward(request, response);
		doGet(request, response);		
	}

}