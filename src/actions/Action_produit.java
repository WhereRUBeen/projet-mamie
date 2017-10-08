/**
 * 
 */
package actions;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import entities.Produit;
import entities.Utilisateur;
import managers.Manager_produit;

/**
 * @author Been WhereU
 *
 */
public class Action_produit {
	
	
	public static void afficherProduitParId(HttpServletRequest request, int id_produit) {
		ArrayList<Produit> produitId = Manager_produit.getById(id_produit);
		request.setAttribute("produitId", produitId);
	}

	public static void afficherProduitParNom(HttpServletRequest request, String nom_produit) {
		ArrayList<Produit> produitname = Manager_produit.getBynom(nom_produit);
		request.setAttribute("produitname", produitname);
	}

	public static void ajouterProduitParId(HttpServletRequest request, int id_produit, Produit produitToAdd) {
		ArrayList<Produit> addProduit = Manager_produit.addProduit( int id_pro, Produit produit);
		request.setAttribute("addProduit", addProduit);
	}

	public static void supprimerProduitbyId(HttpServletRequest request, int id_produit, Produit produitToAdd) {
		Manager_produit.deletedProduit(produitToAdd);
		afficherProduitParId(request, id_produit);
	}

	public static void modifierProduit(HttpServletRequest request, int id_produit, Produit produitToAdd) {
		Manager_produit.modifyProduit(produitToAdd);
		afficherProduitParId(request, id_produit);
	}

}
