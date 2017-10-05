/**
 * 
 */
package entities;

import java.io.Serializable;

/**
 * @author Been WhereU
 *
 */
public class Magasin implements Serializable{
	
	/*** attributs*/
	private int id_magasin;
	String nom_magasin;
	String adresse_magasin;
	private int type_magasin;
	
	/*** Constructor*/
	public Magasin() {
		super();
	}

	
	/*** Methods*/
	
	/*** @return the id_magasin*/
	public int getId_magasin() {
		return id_magasin;
	}

	/** @return the nom_magasin*/
	public String getNom_magasin() {
		return nom_magasin;
	}

	/*** @return the adresse_magasin*/
	public String getAdresse_magasin() {
		return adresse_magasin;
	}

	/*** @return the type_magasin*/
	public int getType_magasin() {
		return type_magasin;
	}

	/*** @param id_magasin the id_magasin to set*/
	public void setId_magasin(int id_magasin) {
		this.id_magasin = id_magasin;
	}

	/*** @param nom_magasin the nom_magasin to set*/
	public void setNom_magasin(String nom_magasin) {
		this.nom_magasin = nom_magasin;
	}

	/*** @param adresse_magasin the adresse_magasin to set*/
	public void setAdresse_magasin(String adresse_magasin) {
		this.adresse_magasin = adresse_magasin;
	}

	/*** @param type_magasin the type_magasin to set*/
	public void setType_magasin(int type_magasin) {
		this.type_magasin = type_magasin;
	}

}
