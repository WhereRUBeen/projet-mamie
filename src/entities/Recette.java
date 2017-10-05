/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Recette implements Serializable{
	
	
	/*** attributs*/
	private int id_recette;
	private String nom_recette;
	private String categorie_recette;
	private String recettecol;
	private String url_recette;
	private int produit_id_produit;
	private int produit_recette_id_recette;
	
	/*** constructor*/
	public Recette() {
		super();
	}
	
	
	/*** Methods*/
	/*** @return the id_recette*/
	public int getId_recette() {
		return id_recette;
	}

	/*** @return the nom_recette*/
	public String getNom_recette() {
		return nom_recette;
	}

	/*** @return the categorie_recette*/
	public String getCategorie_recette() {
		return categorie_recette;
	}

	/*** @return the recettecol*/
	public String getRecettecol() {
		return recettecol;
	}

	/*** @return the url_recette*/
	public String getUrl_recette() {
		return url_recette;
	}

	/*** @return the produit_id_produit*/
	public int getProduit_id_produit() {
		return produit_id_produit;
	}

	/*** @return the produit_recette_id_recette*/
	public int getProduit_recette_id_recette() {
		return produit_recette_id_recette;
	}

	/*** @param id_recette the id_recette to set*/
	public void setId_recette(int id_recette) {
		this.id_recette = id_recette;
	}

	/*** @param nom_recette the nom_recette to set*/
	public void setNom_recette(String nom_recette) {
		this.nom_recette = nom_recette;
	}

	/*** @param categorie_recette the categorie_recette to set*/
	public void setCategorie_recette(String categorie_recette) {
		this.categorie_recette = categorie_recette;
	}

	/*** @param recettecol the recettecol to set*/
	public void setRecettecol(String recettecol) {
		this.recettecol = recettecol;
	}

	/*** @param url_recette the url_recette to set*/
	public void setUrl_recette(String url_recette) {
		this.url_recette = url_recette;
	}

	/*** @param produit_id_produit the produit_id_produit to set*/
	public void setProduit_id_produit(int produit_id_produit) {
		this.produit_id_produit = produit_id_produit;
	}

	/*** @param produit_recette_id_recette the produit_recette_id_recette to set*/
	public void setProduit_recette_id_recette(int produit_recette_id_recette) {
		this.produit_recette_id_recette = produit_recette_id_recette;
	}
	
	

}
