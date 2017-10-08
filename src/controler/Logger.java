package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actions.ActionUtilisateur;
import utils.AuthManager;

/**
 * Servlet implementation class loggin
 */
@WebServlet("/loggin")
public class Logger extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logger() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = (String) request.getAttribute("login");
		int userId = -1;
		String psw = (String) request.getAttribute("password");
		
		if (AuthManager.userExist(user)){
			userId = ActionUtilisateur.getIdByName(user);
			if (AuthManager.pwsIsGood(psw, userId)){
				AuthManager.setUserSession(userId, request);
				
				switch (ActionUtilisateur.getRoleId(userId)){
					case 1 : response.sendRedirect("administration/adminAccueil.jsp"); break;
					case 2 : response.sendRedirect("corporate/corporateAccueil.jsp"); break;
					case 3 : response.sendRedirect("autre/autreAccueil.jsp"); break;
					
					
				}
			}
		}
	
		
	
	}

}
