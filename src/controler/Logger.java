package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/logger")
public class Logger extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		
	}
	
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		String nom = request.getParameter("login");
		String mdp = request.getParameter("password");
		
		
		
	}
	

}
