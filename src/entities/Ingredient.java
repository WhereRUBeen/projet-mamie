/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Ingredient implements Serializable {

	/*** attribut*/
	private String nom_ingredient;
	private double prix_unitaire;
	private String mesure;
	private double quantite_ingredient;
	private int id_ingredient;
	
	
	/*** Constructor*/
	public Ingredient() {
		super();
	}


	/*** Methiods*/
	/*** @return the nom_ingredient*/
	public String getNom_ingredient() {
		return nom_ingredient;
	}


	/*** @return the prix_unitaire*/
	public double getPrix_unitaire() {
		return prix_unitaire;
	}


	/*** @return the mesure*/
	public String getMesure() {
		return mesure;
	}


	/*** @return the quantite_ingredient*/
	public double getQuantite_ingredient() {
		return quantite_ingredient;
	}


	/*** @return the id_ingredient*/
	public int getId_ingredient() {
		return id_ingredient;
	}


	/*** @param nom_ingredient the nom_ingredient to set*/
	public void setNom_ingredient(String nom_ingredient) {
		this.nom_ingredient = nom_ingredient;
	}


	/*** @param prix_unitaire the prix_unitaire to set*/
	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}


	/*** @param mesure the mesure to set*/
	public void setMesure(String mesure) {
		this.mesure = mesure;
	}


	/*** @param quantite_ingredient the quantite_ingredient to set*/
	public void setQuantite_ingredient(double quantite_ingredient) {
		this.quantite_ingredient = quantite_ingredient;
	}


	/*** @param id_ingredient the id_ingredient to set*/
	public void setId_ingredient(int id_ingredient) {
		this.id_ingredient = id_ingredient;
	}
	

}
