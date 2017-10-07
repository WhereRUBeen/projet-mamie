/**
 * 
 */
package entities;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Been WhereU
 *
 */
public class Commande implements Serializable{
	
	
	/***attributs of commande*/
	private int id_commande;
	private int id_produit;
	private double prix_total;
	private Date date;
	
	
	/** Constructor Commande**/
	public Commande() {
		super();
	}

	/*** Methods*/
	
	/*** @return the id_commande*/
	public int getId_commande() {
		return id_commande;
	}


	/*** @return the id_produit*/
	public int getId_produit() {
		return id_produit;
	}

	/*** @return the prix_total*/
	public double getPrix_total() {
		return prix_total;
	}

	/*** @return the date*/
	public Date getDate() {
		return date;
	}
	
	/*** @param id_commande the id_commande to set*/
	public void setId_commande(int id_commande) {
		this.id_commande = id_commande;
	}


	/*** @param id_produit the id_produit to set*/
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	/*** @param prix_total the prix_total to s*/
	public void setPrix_total(double prix_total) {
		this.prix_total = prix_total;
	}

	/*** @param date the date to set*/
	public void setDate(Date date) {
		this.date = date;
	}

}
