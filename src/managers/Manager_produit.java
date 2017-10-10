/**
 * 
 */
package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entities.Produit;


/**
 * @author Been WhereU
 *
 */
public class Manager_produit {
	
	
	
	public static ArrayList<Produit> afficherProduitParId(int id_produit) {
		ArrayList<Produit> produit = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(id_produit);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Produit p = new Produit();
					p.setId_produit(resultat.getInt("id_produit"));
					p.setNom_produit(resultat.getString("nom_produit"));
					p.setCategorie_produit(resultat.getString("categorie_produit"));
					p.setQuantite(resultat.getInt("quantite_produit"));
					produit.add(p);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return produit;
	}
	
	
	public static ArrayList<Produit> afficherProduitParNom(String nom_produit) {
		ArrayList<Produit> produit = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(nom_produit);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Produit p = new Produit();
					p.setId_produit(resultat.getInt("id_produit"));
					p.setNom_produit(resultat.getString("nom_produit"));
					p.setCategorie_produit(resultat.getString("categorie_produit"));
					p.setQuantite(resultat.getInt("quantite_produit"));
					produit.add(p);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return produit;
	}
}
