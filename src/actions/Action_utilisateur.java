/**
 * 
 */
package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import entities.Utilisateur;
import managers.Manager_utilisateur;

/**
 * @author Been WhereU
 *
 */
public class Action_utilisateur {
	
	public static void afficherutilisateurParId(HttpServletRequest request , int id_user) {
		ArrayList<Utilisateur> utilisateurId = Action_utilisateur.getById(id_user);
		request.setAttribute("utilisateurById", utilisateurId);
	}
	
	public static void showByName(HttpServletRequest request, String name) {
		ArrayList<Utilisateur> utilisateurName = Action_utilisateur.getBynom(name);
		request.setAttribute("utilisateurByname", utilisateurName);
	}
	
	
	public static void showBylastName(HttpServletRequest request, String lastname) {
		ArrayList<Utilisateur> utilisateurlastName = Action_utilisateur.getByprenom(lastname);
		request.setAttribute("utilisateurByname", utilisateurlastName);
	}
	
	public static void ajouterUtilisateur(HttpServletRequest request,int id_user, Utilisateur utilisateurToAdd){
		Manager_utilisateur.add(utilisateurToAdd);
		afficherutilisateurParId(request, id_user);
	}
	
}
