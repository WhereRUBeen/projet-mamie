/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Produit implements Serializable{
	
	/*** attribut*/
	private int id_produit;
	private String nom_produit;
	private double quantite;
	private int recette_id_recette;
	
	/*** constructor*/
	public Produit() {
		super();
	}

	
	/*** Methods*/
	/*** @return the id_produit*/
	public int getId_produit() {
		return id_produit;
	}


	/*** @return the nom_produit*/
	public String getNom_produit() {
		return nom_produit;
	}


	/*** @return the quantite*/
	public double getQuantite() {
		return quantite;
	}


	/*** @return the recette_id_recette*/
	public int getRecette_id_recette() {
		return recette_id_recette;
	}


	/*** @param id_produit the id_produit to set*/
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}


	/*** @param nom_produit the nom_produit to set*/
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}


	/*** @param quantite the quantite to set*/
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}


	/*** @param recette_id_recette the recette_id_recette to set*/
	public void setRecette_id_recette(int recette_id_recette) {
		this.recette_id_recette = recette_id_recette;
	}
	

}
