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
public class Vente implements Serializable{
	
	
	/*** attributs*/
	private int commande_id_commande;
	private int commande_magasin_id_magasin;
	private int user_id_user;
	private Date date;
	private double quantite;
	
	
	/*** Constructor**/
	public Vente() {
		super();
	}
	
	
	/*** Methods*/
	/*** @return the commande_id_commande*/
	public int getCommande_id_commande() {
		return commande_id_commande;
	}
	
	/*** @return the commande_magasin_id_magasin*/
	public int getCommande_magasin_id_magasin() {
		return commande_magasin_id_magasin;
	}
	
	/*** @return the user_id_user*/
	public int getUser_id_user() {
		return user_id_user;
	}
	
	/*** @return the date*/
	public Date getDate() {
		return date;
	}
	
	/*** @return the quantite*/
	public double getQuantite() {
		return quantite;
	}
	
	/*** @param commande_id_commande the commande_id_commande to set*/
	public void setCommande_id_commande(int commande_id_commande) {
		this.commande_id_commande = commande_id_commande;
	}
	
	/*** @param commande_magasin_id_magasin the commande_magasin_id_magasin to set*/
	public void setCommande_magasin_id_magasin(int commande_magasin_id_magasin) {
		this.commande_magasin_id_magasin = commande_magasin_id_magasin;
	}
	
	/*** @param user_id_user the user_id_user to set*/
	public void setUser_id_user(int user_id_user) {
		this.user_id_user = user_id_user;
	}
	
	/*** @param date the date to set*/
	public void setDate(Date date) {
		this.date = date;
	}
	
	/*** @param quantite the quantite to set*/
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
}
