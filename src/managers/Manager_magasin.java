/**
 * 
 */
package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Magasin;
import entities.Utilisateur;

/**
 * @author Been WhereU
 *
 */
public class Manager_magasin {

	private static String getMagasinId = "";
	private static String getMagasinName = "";
	private static String getMagasinCategory = "";
	
	

	public static ArrayList<Magasin> getMagasinId(int id_magasin) {
		ArrayList<Magasin> store = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getMagasinId);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Magasin m = new Magasin();
					m.setId_magasin(resultat.getInt("id_magasin"));
					m.setNom_magasin(resultat.getString("nom_magasin"));
					m.setAdresse_magasin(resultat.getString("adresse_magasin"));
					m.setType_magasin(resultat.getInt("type_magasin"));
					store.add(m);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return store;
	}

	
	
	public static ArrayList<Magasin> getMagasinName(String nom_magasin) {
		ArrayList<Magasin> store = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getMagasinName);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Magasin m = new Magasin();
					m.setId_magasin(resultat.getInt("id_magasin"));
					m.setNom_magasin(resultat.getString("nom_magasin"));
					m.setAdresse_magasin(resultat.getString("adresse_magasin"));
					m.setType_magasin(resultat.getInt("type_magasin"));
					store.add(m);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return store;

	}

	public static ArrayList<Magasin> getMagasinCategory( String type_magasin) {
		ArrayList<Magasin> store = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(getMagasinCategory);
			ResultSet resultat = pstetment.executeQuery();
			if (resultat.isBeforeFirst()) {
				while(resultat.next()) {
					Magasin m = new Magasin();
					m.setId_magasin(resultat.getInt("id_magasin"));
					m.setNom_magasin(resultat.getString("nom_magasin"));
					m.setAdresse_magasin(resultat.getString("adresse_magasin"));
					m.setType_magasin(resultat.getInt("type_magasin"));
					store.add(m);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return store;

	}
	
	
	

}
