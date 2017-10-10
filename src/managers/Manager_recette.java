/**
 * 
 */
package managers;

import java.util.ArrayList;

import actions.HttpServletRequest;
import entities.Ingredient;

/**
 * @author Been WhereU
 *
 */
public class Manager_recette {
	
	
	public static void showIngredientById(HttpServletRequest request , int id_ingredient) {
		ArrayList<Ingredient> ingredientId = Manager_ingredient.getIngredientById(id_ingredient);
		request.setAttribute("ingredientId", ingredientId);
	}
	
	public static void ShowingredientByName(HttpServletRequest request, String nom_ingredient) {
		ArrayList<Ingredient> IngredientName = Manager_utilisateur.getIngredientByname(nom_ingredient);
		request.setAttribute("IngredientName", IngredientName);
	}
	
	
	public static void deletedIngredientById(HttpServletRequest request, String prenom) {
		ArrayList<Ingredient> ingredientId = Manager_ingredient.getByprenom(prenom);
		request.setAttribute("utilisateurByname", utilisateurlastName);
	}
	
	public static void addIngredientById(HttpServletRequest request,int id_ingredient, Ingredient ingredientToAdd){
		Manager_utilisateur.add(ingredientToAdd);
		showIngredientById(request, id_ingredient);
	}

}
