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
		ArrayList<Utilisateur> utilisateurId = Manager_utilisateur.getById(id_user);
		request.setAttribute("utilisateurById", utilisateurId);
	}
	
	public static void afficherUtilisateurParNom(HttpServletRequest request, String nom) {
		ArrayList<Utilisateur> utilisateurName = Manager_utilisateur.getBynom(nom);
		request.setAttribute("utilisateurByname", utilisateurName);
	}
	
	
	public static void afficherUtilisateurParPrenom(HttpServletRequest request, String prenom) {
		ArrayList<Utilisateur> utilisateurlastName = Manager_utilisateur.getByprenom(prenom);
		request.setAttribute("utilisateurByname", utilisateurlastName);
	}
	
	public static void ajouterUtilisateur(HttpServletRequest request,int id_user, Utilisateur utilisateurToAdd){
		Manager_utilisateur.add(utilisateurToAdd);
		afficherutilisateurParId(request, id_user);
	}
	
}
