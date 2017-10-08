package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import entities.Magasin;
import managers.Manager_utilisateur;

public class Action_magasin {
	
	public static void afficherMagasinParId(HttpServletRequest request, int id_magasin) {
		ArrayList<Magasin> magasinsId = Manager_utilisateur.getMagasinId(id_magasin);
		request.setAttribute("magasinsId", magasinsId);
	}
	
	public static void showMagasinByName(HttpServletRequest request, String nom_magasin ){
		ArrayList<Magasin> magasinsName = Manager_utilisateur.getMagasinName(nom_magasin);
		request.setAttribute("magasinsName", magasinsName);
	} 

	public static void showMagasinByCategiory(HttpServletRequest request, String type_magasin ){
		ArrayList<Magasin> magasinsCategory = Manager_utilisateur.getMagasinCategory(type_magasin);
		request.setAttribute("magasinsCategory", magasinsCategory);
	} 
	
}
