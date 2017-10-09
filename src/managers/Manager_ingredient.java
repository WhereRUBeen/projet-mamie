/**
 * 
 */
package managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entities.Ingredient;

;

/**
 * @author Been WhereU
 *
 */
public class Manager_ingredient {
	
	private static String showIngredientById ="";
	private static String ShowingredientByName = "";
	private static String deletedIngredientById ="";
	private static String addIngredientById = "";
	
	
	public static  ArrayList<Ingredient> showIngredientById(int id_ingredient){
		ArrayList<Ingredient> ingredient = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(showIngredientById);
			ResultSet resultat = pstetment.executeQuery();
			
			if (resultat.isBeforeFirst()) {
				ingredient = new ArrayList<>();
				while (resultat.next()) {
					Ingredient i = new Ingredient();
					i.setId_ingredient(resultat.getInt("id_ingredient"));
					i.setNom_ingredient(resultat.getString("nom_ingredient"));
					i.setPrix_unitaire(resultat.getDouble("prix_unitaire"));
					i.setQuantite_ingredient(resultat.getDouble("quantite_ingredient"));
					i.setMesure(resultat.getString("mesure"));
					ingredient.add(i);
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ingredient;
	}
	
	public static  ArrayList<Ingredient> ShowingredientByName(String nom_ingredient){
		ArrayList<Ingredient> ingredient = null;
		try {
			PreparedStatement pstetment = ConnectionBDD.petPs(showIngredientById);
			ResultSet resultat = pstetment.executeQuery();
			
			if (resultat.isBeforeFirst()) {
				ingredient = new ArrayList<>();
				while (resultat.next()) {
					Ingredient i = new Ingredient();
					i.setId_ingredient(resultat.getInt("id_ingredient"));
					i.setNom_ingredient(resultat.getString("nom_ingredient"));
					i.setPrix_unitaire(resultat.getDouble("prix_unitaire"));
					i.setQuantite_ingredient(resultat.getDouble("quantite_ingredient"));
					i.setMesure(resultat.getString("mesure"));
					ingredient.add(i);
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ingredient;
	}
	
	


}
