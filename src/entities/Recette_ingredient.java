/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Recette_ingredient implements Serializable {
	
	/*** attributt*/
	private int recette_id_recette;
	private int ingredient_id_ingredient;
	private double quantite_ingredient;
	
	
	/*** constructor*/
	public Recette_ingredient() {
		super();
	}


	/*** Methods*/
	/*** @return the recette_id_recette*/
	public int getRecette_id_recette() {
		return recette_id_recette;
	}

	/*** @return the ingredient_id_ingredient*/
	public int getIngredient_id_ingredient() {
		return ingredient_id_ingredient;
	}

	/*** @return the quantite_ingredient*/
	public double getQuantite_ingredient() {
		return quantite_ingredient;
	}

	/*** @param recette_id_recette the recette_id_recette to set*/
	public void setRecette_id_recette(int recette_id_recette) {
		this.recette_id_recette = recette_id_recette;
	}


	/*** @param ingredient_id_ingredient the ingredient_id_ingredient to set*/
	public void setIngredient_id_ingredient(int ingredient_id_ingredient) {
		this.ingredient_id_ingredient = ingredient_id_ingredient;
	}

	/*** @param quantite_ingredient the quantite_ingredient to set*/
	public void setQuantite_ingredient(double quantite_ingredient) {
		this.quantite_ingredient = quantite_ingredient;
	}
	

}
