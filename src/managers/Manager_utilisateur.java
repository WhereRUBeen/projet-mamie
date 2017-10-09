/**
 * 
 */
package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Utilisateur;

/**
 * @author Been WhereU
 *
 */
public class Manager_utilisateur {
	
	private static String getById = "SELECT * FROM utilisateur";
	private static String getBynom = "SELECT * FROM utilisateur";
	private static String getByprenom = "SELECT * FROM utilisateur";
	private static String add = "";
	
	
	public static  ArrayList<Utilisateur> getById(int id_user){
		ArrayList<Utilisateur> identite = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getById);
			ResultSet resultat = pstetment.executeQuery();
			
			if (resultat.isBeforeFirst()) {
				identite = new ArrayList<>();
				while (resultat.next()) {
					Utilisateur u = new Utilisateur();
					u.setId(resultat.getInt("id_user"));
					u.setNom(resultat.getString("nom"));
					u.setPrenom(resultat.getString("prenom"));
					u.setAdresse(resultat.getString("adresse"));
					u.setEmail(resultat.getString("email"));
					u.setId_role(resultat.getInt("role_id_role"));
					u.setId_magasin(resultat.getInt("magasin_id_magasin"));
					u.setIdentifiant(resultat.getString("identifiantUser"));
					identite.add(u);
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return identite;
	}
	
	public static ArrayList<Utilisateur> getBynom(String nom){
		ArrayList<Utilisateur> identite = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getById);
			ResultSet resultat = pstetment.executeQuery();
			
			if (resultat.isBeforeFirst()) {
				identite = new ArrayList<>();
				while (resultat.next()) {
					
					Utilisateur u = new Utilisateur();
					u.setId(resultat.getInt("id_user"));
					u.setNom(resultat.getString("nom"));
					u.setPrenom(resultat.getString("prenom"));
					u.setAdresse(resultat.getString("adresse"));
					u.setEmail(resultat.getString("email"));
					u.setId_role(resultat.getInt("role_id_role"));
					u.setId_magasin(resultat.getInt("magasin_id_magasin"));
					u.setIdentifiant(resultat.getString("identifiantUser"));
					identite.add(u);
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return identite;
	}

	
	public static ArrayList<Utilisateur> getByprenom(String prenom){
		ArrayList<Utilisateur> identite = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getById);
			ResultSet resultat = pstetment.executeQuery();
			
			if (resultat.isBeforeFirst()) {
				identite = new ArrayList<>();
				while (resultat.next()) {
					
					Utilisateur u = new Utilisateur();
					u.setId(resultat.getInt("id_user"));
					u.setNom(resultat.getString("nom"));
					u.setPrenom(resultat.getString("prenom"));
					u.setAdresse(resultat.getString("adresse"));
					u.setEmail(resultat.getString("email"));
					u.setId_role(resultat.getInt("role_id_role"));
					u.setId_magasin(resultat.getInt("magasin_id_magasin"));
					u.setIdentifiant(resultat.getString("identifiantUser"));
					identite.add(u);
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return identite;
		
	}
}
