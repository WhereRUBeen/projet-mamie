/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Commande_produit implements Serializable{
	
	
	/*** attributs*/
	private int commande_id_commande;
	private int produit_id_produit;
	private double quantite;
	
	
	/***constructor*/
	public Commande_produit() {
		super();
	}

	
	
	/*** Methods*/
	/**
	 * @return the commande_id_commande
	 */
	public int getCommande_id_commande() {
		return commande_id_commande;
	}


	/**
	 * @return the produit_id_produit
	 */
	public int getProduit_id_produit() {
		return produit_id_produit;
	}


	/**
	 * @return the quantite
	 */
	public double getQuantite() {
		return quantite;
	}


	/**
	 * @param commande_id_commande the commande_id_commande to set
	 */
	public void setCommande_id_commande(int commande_id_commande) {
		this.commande_id_commande = commande_id_commande;
	}


	/**
	 * @param produit_id_produit the produit_id_produit to set
	 */
	public void setProduit_id_produit(int produit_id_produit) {
		this.produit_id_produit = produit_id_produit;
	}


	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	

}
